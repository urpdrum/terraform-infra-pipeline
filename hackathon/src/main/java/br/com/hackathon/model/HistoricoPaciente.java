//package br.com.hackathon.model;
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//import java.time.LocalDateTime;
//
//
//@Entity
//@Table(name = "historico_paciente")
//public class HistoricoPaciente {
//
//    @Id
//    private LocalDateTime dataEntradaHospital;
//    private LocalDateTime dataSaidaHospital;
//    private String leito;
//    private Long hospital;
//
//    @ManyToOne
//     private Paciente paciente;
//
//
//    public LocalDateTime getDataEntradaHospital() {
//        return dataEntradaHospital;
//    }
//
//    public void setDataEntradaHospital(LocalDateTime dataEntradaHospital) {
//        this.dataEntradaHospital = dataEntradaHospital;
//    }
//
//    public LocalDateTime getDataSaidaHospital() {
//        return dataSaidaHospital;
//    }
//
//    public void setDataSaidaHospital(LocalDateTime dataSaidaHospital) {
//        this.dataSaidaHospital = dataSaidaHospital;
//    }
//
//    public String getLeito() {
//        return leito;
//    }
//
//    public void setLeito(String leito) {
//        this.leito = leito;
//    }
//
//    public Long getHospital() {
//        return hospital;
//    }
//
//    public void setHospital(Long hospital) {
//        this.hospital = hospital;
//    }
//
//   public Paciente getPaciente() {
//        return paciente;
//    }
//
//    public void setPaciente(Paciente paciente) {
//        this.paciente = paciente;
//    }
//
//}
