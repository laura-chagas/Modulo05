package Ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcularDiaSemanaTest {

    @Test
    public void verificarSeDomingoEOMelhorDia() {
        CalcularDiaSemana day = new CalcularDiaSemana();
        String dia = day.calcularDia("Quarta");
        Assertions.assertEquals("Domingo",dia);
    }
}
