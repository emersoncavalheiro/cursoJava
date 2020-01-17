package com.polimorfismoHeranca;

import java.util.Date;

public class Cliente extends Pessoa {

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public Cliente(Animal animal, long codigo, String nome, Date dataCadastro, Date dataNascimento) {
        super(codigo, nome, dataCadastro, dataNascimento);
        this.animal = animal;
    }
}
