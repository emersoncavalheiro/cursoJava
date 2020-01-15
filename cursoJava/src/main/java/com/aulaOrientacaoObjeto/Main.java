package com.aulaOrientacaoObjeto;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setNomeTitular("Emerson");
        conta1.setNumeroConta(1234);
        conta1.setAgenciaBancaria("45678-9");


        conta1.setDataAberturaConta(02,05, 2019);

        conta1.depositarValor(1500.23);

        conta1.sacarValor(0.23);

        System.out.println(conta1.recuperaDadosParaImpressao());

    }


}
