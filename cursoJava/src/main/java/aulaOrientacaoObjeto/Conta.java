package aulaOrientacaoObjeto;

public class Conta {

    private String nomeTitular;
    private int numeroConta;
    private String agenciaBancaria;
    private double saldoConta;
    private Data dataAberturaConta;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgenciaBancaria() {
        return agenciaBancaria;
    }

    public void setAgenciaBancaria(String agenciaBancaria) {
        this.agenciaBancaria = agenciaBancaria;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void sacarValor(double valorSaque) {
        this.saldoConta = saldoConta - valorSaque;
    }

    public void depositarValor(double valorDeposito){
        this.saldoConta = saldoConta + valorDeposito;
    }

    public double calculaRendimento(){
        double valorRendimento;
        valorRendimento = this.saldoConta * 0.1;
        return valorRendimento;

    }
    public void setDataAberturaConta(int dia, int mes, int ano){
        Data data = new Data();
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        this.dataAberturaConta = data;

    }
    public String recuperaDadosParaImpressao() {

        String dados = "Titular da conta: " + this.nomeTitular;
        dados += "\nNumero da conta: " + this.numeroConta;
        dados += "\nAgencia: " + this.agenciaBancaria;
        dados += "\nSaldo atual: " + this.saldoConta;
        dados += "\nDia: " + this.dataAberturaConta.getDia();
        dados += "\nMes: " + this.dataAberturaConta.getMes();
        dados += "\nAno: " + this.dataAberturaConta.getAno();
        return dados;
    }
}
