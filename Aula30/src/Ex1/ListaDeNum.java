package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaDeNum{

    public static List<Integer> num = new ArrayList<>();
    public Scanner scan = new Scanner(System.in);

    public void receberInformacoes(){
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número");
            num.add(scan.nextInt());
        }


    }
    public static List<Integer> getNum() {
        return num;
    }
}
