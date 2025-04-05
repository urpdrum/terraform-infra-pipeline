package br.com.hackathon.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {

    private String nome;
    private String endereco;
    private Integer n_leitos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getN_leitos() {
        return n_leitos;
    }

    public void setN_leitos(Integer n_leitos) {
        this.n_leitos = n_leitos;
    }


}