package Ex3;

import java.util.HashMap;
import java.util.Map;


public class meuMap {
      public  Map<String, String> dicionario = new HashMap<>();

      public void inserirDados(){
          dicionario.put("bola", "azul");
          dicionario.put("boneca", "amarelo");
          dicionario.put("dado", "rosa");
      }
      public void mostrarDados(){
          for (Map.Entry<String, String> dados : dicionario.entrySet()) {
              System.out.println("Chave: " + dados.getKey() + ", Valor: " + dados.getValue());
          }

      }

}
