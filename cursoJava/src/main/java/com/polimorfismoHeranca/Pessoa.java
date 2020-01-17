package com.polimorfismoHeranca;

import java.util.Date;

public class Pessoa {
    private long codigo;
    private String nome;
    private Date dataCadastro;
    private Date dataNascimento;

    public Pessoa(long codigo, String nome, Date dataCadastro, Date dataNascimento){

        this.codigo = codigo;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;

    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

}

