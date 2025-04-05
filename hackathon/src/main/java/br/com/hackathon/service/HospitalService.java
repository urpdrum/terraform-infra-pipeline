package br.com.hackathon.service;

import br.com.hackathon.dto.Hospital;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class HospitalService {

    private final List<Hospital> hospitais = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1); // Para gerar IDs únicos

    public Hospital addHospital(Hospital hospital) {
        hospital.setId(idGenerator.getAndIncrement()); // Atribui um ID único
        hospital.setId(idGenerator.getAndIncrement()); // Atribui um ID único
        hospitais.add(hospital);
        return hospital; // Retorna o hospital adicionado com o ID
    }

    public List<Hospital> getAllHospital() {
        return hospitais;
    }

    public Optional<Hospital> getHospitalById(int id) {
        return hospitais.stream()
//                .filter(hospital -> hospital.getString() != null && hospital.getId().equals(id)) // Verifica se o ID não é nulo e compara corretamente
//                .findFirst();

    }

    public boolean updateHospital(int id, Hospital newHospital) {
        Optional<Hospital> existingHospitalOptional = getHospitalById(id);

        if (existingHospitalOptional.isPresent()) {
            Hospital existingHospital = existingHospitalOptional.get();

            // Atualiza os campos do hospital existente com os valores do novo hospital
            existingHospital.setNome(newHospital.getNome());
            existingHospital.setEndereco(newHospital.getEndereco());
            existingHospital.setN_leitos(newHospital.getN_leitos());

            return true; // Indica que a atualização foi bem-sucedida
        }

        return false; // Indica que o hospital com o ID especificado não foi encontrado
    }

    public boolean deleteHospital(int id) {
        return hospitais.removeIf(hospital -> hospital.getId() != null && hospital.getId().equals(id)); //Verifica se o ID não é nulo e compara corretamente
    }
}