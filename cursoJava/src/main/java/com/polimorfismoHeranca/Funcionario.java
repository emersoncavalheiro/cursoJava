package com.polimorfismoHeranca;

import java.util.Date;

public class Funcionario extends Pessoa {
    protected float salario;
    private float VALOR_HORA = 15f;
    private String cargo;
    private Funcionario gerente;

    public Funcionario(Funcionario gerente, String cargo, final float VALOR_HORA, float salario, long codigo, String nome, Date dataCadastro, Date dataNascimento) {
        super(codigo, nome, dataCadastro, dataNascimento);
        this.salario = salario;
        this.VALOR_HORA = VALOR_HORA;
        this.cargo = cargo;
        this.gerente = gerente;

    }

    public float getSalario() {
        return salario;
    }

    public float getValor_hora() {
        return VALOR_HORA;
    }

    public String getCargo() {
        return cargo;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public float calcularSalario(){
        return  this.salario * VALOR_HORA;
    }

    public float calcularSalario(float valorHora){
        return  this.salario * valorHora;
    }

}
