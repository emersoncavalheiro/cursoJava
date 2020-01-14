package aulaOrientacaoObjeto;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setNomeTitular("Emerson");
        conta1.setNumeroConta(1234);
        conta1.setAgenciaBancaria("45678-9");
        conta1.setSaldoConta(500);

        conta1.setDataAberturaConta(02,05, 2019);

        System.out.println(conta1.recuperaDadosParaImpressao());

        /* Conta conta2 = new Conta();
        conta2.setNomeTitular("Emerson");
        conta2.setSaldoConta(500);

        if(conta1 == conta2){
            System.out.println("iguais");
        } else{
            System.out.println("diferentes");
        }

         */



    }


}
