package com.targetBank;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private BancoDeDados(){ }
    private static BancoDeDados bancoDeDados;
    private static List<Correntista> correntistas;

    public static BancoDeDados build(){
        if(bancoDeDados == null) {
            bancoDeDados = new BancoDeDados();
            correntistas = new ArrayList<>();
            cargaInicial();
            return bancoDeDados;
        }

        return bancoDeDados;
    }

    public static BancoDeDados getBancoDeDados() {
        return bancoDeDados;
    }

    private static void cargaInicial(){
        Correntista correntista = new Correntista();
        correntista.setNome("Correntista");
        correntista.getConta().setAgencia(123);
        correntista.getConta().setNumero(456);
        correntista.setSenha(123456);
        correntistas.add(correntista);
    }

}