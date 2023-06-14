package Ex3;

public class CalcularNumeros {

    public boolean verificarNumero(int num){
        if (num % 2 == 0){
            System.out.println("O número é par!");
            return true;
        }else{
            System.out.println("O número é ímpar!");
        }
        return false;
    }
}
