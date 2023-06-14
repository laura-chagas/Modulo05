package Ex4;

public class ContaCorrente {
    int numeroConta;
    String nomeCorrentista;
    double saldoCorrentista;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoCorrentista = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldoCorrentista;
    }

    public void setSaldo(double saldo) {
        this.saldoCorrentista = saldo;
    }

    public void depositoConta(double val){
        setSaldo(getSaldo() + val);
        System.out.println("Deposito Efetuado  \nSeu saldo atual é: " + getSaldo());;
    }
    public void saqueConta(double val){
        if (getSaldo() < 5) {
            System.out.println("Não foi possível efetuar o saque");
        }else {
            setSaldo(getSaldo() - val);
            System.out.println("Saque efetuado" + "\nSeu saldo atual é: " + getSaldo());
        }
    }


}
