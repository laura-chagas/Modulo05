package Ex2;
public class ExeDois {
    public static void main(String[] args) {

        ListaDeNum newLista = new ListaDeNum();

        newLista.receberInformacoes();
        System.out.println(newLista.getNum());

        //A diferença ocorre pelo fato do HashSet tratar cada item de determinado conjunto como único, logo, não é possível repetir.

    }

}
