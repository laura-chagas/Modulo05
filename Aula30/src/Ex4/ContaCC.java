package Ex4;

import java.util.Map;

public class ContaCC extends Conta implements CalculoTributos{

    public ContaCC(){
        System.out.println("Informe seu nome e CPF");
        cadUser.put(scan.next(), scan.next());
        mostrarDados();
        System.out.println(calcularTributo());
    }
    public void mostrarDados(){
        for (Map.Entry<String, String> dados : cadUser.entrySet()) {
            System.out.println("Nome: " + dados.getKey() + "\nCPF: " + dados.getValue() + "\nSaldo: " + getSaldo());
        }
    }
    @Override
    public double calcularTributo() {

        System.out.println("O valor do tributo é: R$" + (saldo * 0.01));

        System.out.println("Seu saldo ficará:");
        return saldo - (saldo * 0.01);

    }




}
