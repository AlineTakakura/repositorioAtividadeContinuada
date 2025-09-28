package br.edu.cs.poo.ac.ordem.entidades;


import lombok.Getter;
import lombok.Setter;

public class Desktop extends Equipamento {
    @Getter @Setter
    private boolean ehServidor;

    public Desktop(String codigo, String descricao, boolean ehServidor) {
        super(codigo, descricao);  
        this.ehServidor = ehServidor;
    }

    public String getIdTipo() {
        return "DE";
    }
}
