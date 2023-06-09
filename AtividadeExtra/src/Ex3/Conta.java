package Ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Conta {
    private static double saldo = 850.00;
    private static int limite;
    private static String conta, agencia;
    public static Map<String, String> user = new HashMap<>();
    public static Scanner scan = new Scanner(System.in);
    public Conta()  {
        this.conta = conta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.limite = limite;
        user.put("123", "456789");
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public static double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(int valor) {

        System.out.println("Informe sua agência: ");
        String agencia = scan.next();

        System.out.println("Informe sua conta: ");
        String conta = scan.next();

        if (user.containsKey(agencia) || user.containsValue(conta)) {
            if (!(valor < 1)) {
                System.out.println("Depósito Efetuado");
                setSaldo(saldo += valor);
            }
        }


    }

    public void saca(double valor) throws ContaExcecao {
        try {
            System.out.println("Informe sua agência: ");
            String agencia = scan.next();

            System.out.println("Informe sua conta: ");
            String conta = scan.next();

            if (user.containsKey(agencia) || user.containsValue(conta)) {
                if (valor > saldo) {
                    throw new ContaExcecao("Não foi possível sacar o valor solicitado, insira um valor menor ou igual o saldo já existente");
                } else {
                    System.out.println("Saque efetuado! ");
                   setSaldo(saldo -= valor);
                    System.out.println("Saldo atual: "+ getSaldo());
                }

            }
            else {
                System.err.println("Conta ou Agencia não existem");
                System.exit(0);
            }
        }catch (ContaExcecao e){
            System.err.println(e);
            System.out.println("Saldo R$" + getSaldo()); //Exercicio 4
        }


    }
}