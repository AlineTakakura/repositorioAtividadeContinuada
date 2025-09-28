package br.edu.cs.poo.ac.ordem.entidades;


import lombok.Getter;
import lombok.Setter;

public class Notebook extends Equipamento {
    @Getter @Setter
    private boolean carregaDadosSensiveis;

    public Notebook(String codigo, String descricao, boolean carregaDadosSensiveis) {
        super(codigo, descricao);
        this.carregaDadosSensiveis = carregaDadosSensiveis;
    }

    public String getIdTipo() {
        return "NO";
    }
}

