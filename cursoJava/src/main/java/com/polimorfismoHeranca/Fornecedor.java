package com.polimorfismoHeranca;

import java.util.Date;

public class Fornecedor extends Pessoa {
    private boolean ativo;
    private String material;

    public boolean isAtivo() {
        return ativo;
    }

    public String getMaterial() {
        return material;
    }

    public Fornecedor(String material, boolean ativo, long codigo, String nome, Date dataCadastro, Date dataNascimento) {
        super(codigo, nome, dataCadastro, dataNascimento);
        this.material = material;
        this.ativo = ativo;



    }
}
