package Ex4;

import java.util.Map;

public class ContaPP extends Conta{

public ContaPP(){
    System.out.println("Informe seu nome e CPF");
    cadUser.put(scan.next(), scan.next());
    mostrarDados();

}
    public void mostrarDados(){
        for (Map.Entry<String, String> dados : cadUser.entrySet()) {
            System.out.println("Nome: " + dados.getKey() + "\nCPF: " + dados.getValue() + "\nSaldo: " + getSaldo());
        }
    }


}