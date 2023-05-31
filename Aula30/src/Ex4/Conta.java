package Ex4;

import java.util.*;

public class Conta {
    protected double saldo;
    public Map<String, String> cadUser = new HashMap<>();

   // public List<String> cadUser = new ArrayList<>();
    public Scanner scan = new Scanner(System.in);

    public Conta() {
        this.saldo = 1000;
    }

    public double getSaldo() {
        return saldo;
    }

    public void decisao() {

        System.out.println("Seu saldo atual: " + getSaldo() + "\n");
        System.out.println("Você deseja: \n1- Conta Poupança \n2- Conta Corrente \n3- Seguro de Vida");
        switch (scan.nextInt()) {
            case 1:
                ContaPP accP = new ContaPP();
                break;
            case 2:
                ContaCC accC = new ContaCC();
                break;
            case 3:
                SeguroDeVida seguro = new SeguroDeVida();
                break;
            default:
                System.out.println("Inválido");
                System.exit(0);
        }

    }


}
