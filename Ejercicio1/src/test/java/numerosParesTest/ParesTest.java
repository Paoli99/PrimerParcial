package numerosParesTest;

import ejercicio2.Primos;
import numeroPares.Pares;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParesTest {

    @Test
    public void testNumeroPar(){
        Pares pares = new Pares();

        boolean expectedResults = true;
        boolean actualResults = Pares.esPar(22);
        Assertions.assertEquals(expectedResults, actualResults, "Error");
    }
}
