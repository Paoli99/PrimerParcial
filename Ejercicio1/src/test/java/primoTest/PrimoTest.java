package primoTest;

import ejercicio2.Primos;
import  ejercicio2.Generador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PrimoTest {
    Primos primoMock = Mockito.mock(Primos.class);
    @Test
   public void exceptionForNumberValuesTest(){
        Generador generador = new Generador();
        Assertions.assertThrows(Exception.class, () -> {generador.getNumberValues(-1);
        });
    }

    @Test
    public void generateNotPrimeTEst() throws Exception{
        Mockito.when(primoMock.esPrimo(14)).thenReturn(false);
        Generador generador = new Generador(primoMock);
        String actualResult = generador.getNumberValues(14);
        String expectedResult = "1 3 5 7 9 11 13";
        Assertions.assertEquals(actualResult, expectedResult, "Error");
        Mockito.verify(primoMock).esPrimo(14);
    }

    @Test
    public void generatePrimeTest() throws Exception{
        Mockito.when(primoMock.esPrimo(17)).thenReturn(true);
        Generador generador = new Generador(primoMock);
        String actualResult = generador.getNumberValues(17);
        String expectedResult = "2 4 6 8 10 12 14 16";
        //String expectedResult = "1 3 5 7 9 11 13";
        Assertions.assertEquals(actualResult, expectedResult, "Error");
        Mockito.verify(primoMock).esPrimo(17);
    }
    /*@Test
    public void testPrimo(){
        Primos primos = new Primos();

        boolean expectedResults = true;
        boolean actualResults = Primos.esPrimo(11);
        Assertions.assertEquals(expectedResults, actualResults, "error");
    }*/

}
