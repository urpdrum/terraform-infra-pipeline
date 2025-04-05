package br.com.hackathon.controller;



import br.com.hackathon.dto.Hospital;
import br.com.hackathon.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    HospitalService hospitalService;

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Hospital> addHospital(@RequestBody Hospital hospital) {
        hospitalService.addHospital(hospital);
        return new ResponseEntity<>(hospital, HttpStatus.CREATED);
    }
    //================================================================


    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Hospital>> getAllHospital() {
        List<Hospital> hospital = hospitalService.getAllHospital();
        return new ResponseEntity<>(hospital, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Hospital> getCourseById(@PathVariable int id) {
        Optional<Hospital> hospital = hospitalService.getHospitalById(id);
        return hospital.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping(value = "/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Hospital> updateHospital(@PathVariable int id, @RequestBody Hospital newHospital) {
        //boolean updated = HospitalService.updateHospital(id, newHospital);
        boolean updated = hospitalService.updateHospital(id, newHospital);
        if (updated) {
            return new ResponseEntity<>(newHospital, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteHospital(@PathVariable int id) {
        boolean deleted = hospitalService.deleteHospital(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
    //================================================================


//        @GetMapping("/{id}")
//        public Long show(@PathVariable(value = "id") Long id) {
//            return id;
//        }
//
//        @PostMapping
//        public void store(Hospital hospital) {
//            this.hospitalService.create(hospital);
//        }
//
//
//        @PutMapping("/{id}")
//        public ResponseEntity<String> update(@PathVariable(value = "id") Long id, Hospital hospital) {
//            if (this.hospitalService.update(id, hospital)) {
//                return ResponseEntity.ok().body("Hospital atualizado");
//            }
//            return ResponseEntity.badRequest().body(null);
//        }
//
//        @DeleteMapping("/{id}")
//        public ResponseEntity<String>  delete(@PathVariable(value = "id") Long id) {
//            this.hospitalService.delete(id);
//            return ResponseEntity.ok().body("Hospital deletado");
//        }
//}

