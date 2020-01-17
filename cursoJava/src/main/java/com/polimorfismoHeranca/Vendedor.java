package com.polimorfismoHeranca;

import java.util.Date;

public class Vendedor extends Funcionario {
    private float comissao;

    public float getComissao() {
        return comissao;
    }

    public Vendedor(float comissao, Funcionario gerente, String cargo, float valor_hora, float salario, long codigo, String nome, Date dataCadastro, Date dataNascimento) {
        super(gerente, cargo, valor_hora, salario, codigo, nome, dataCadastro, dataNascimento);
        this.comissao = comissao;
    }
}
