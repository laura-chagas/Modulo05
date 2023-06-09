package Ex3;

public class Main {
    public static void main(String[] args) throws ContaExcecao {

        Conta cc = new Conta();

        cc.deposita(100);
        cc.setLimite(100);
        cc.saca(1000);


    }
}
