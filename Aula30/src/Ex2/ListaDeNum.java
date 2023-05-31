package Ex2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListaDeNum {

    public static Set<Integer> num= new HashSet<>();
    public Scanner scan = new Scanner(System.in);

    public void receberInformacoes(){
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número");
            num.add(scan.nextInt());
        }

    }
    public static Set<Integer> getNum() {
        return num;
    }

}
