package Ex1;
public class TesteException {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    static void metodo2() {
        try {
            System.out.println("Inicio do metodo2");
            int[] array = new int[15];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("O limite de indices do vetor foi atingido e não pode ser ultrapassado");
        }finally {
            System.out.println("Fim do método 2");
        }

    }
}
