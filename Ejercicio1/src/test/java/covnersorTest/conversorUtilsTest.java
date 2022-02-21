package covnersorTest;

import ejercicio3.ConversorUtil;
import  ejercicio3.Conversor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class conversorUtilsTest {

    ConversorUtil  servicioMock = Mockito.mock(ConversorUtil.class);

    @Test
    public void verifyConversorEuros(){
        Mockito.when(servicioMock.convert("Euros", "Bolivianos")).thenReturn(10);
        Conversor conversor = new Conversor(servicioMock);
        String expectedResult = "cantidad convertida: 1000.0 Bolivianos";
        String actualRestul = conversor.conversorMoney(100.00, "Euros", "Bolivianos");
        Assertions.assertEquals(expectedResult, actualRestul, "Error");
        Mockito.verify(servicioMock).convert("Euros", "Bolivianos");

    }

    @Test
    public void verifyConversorDolares(){
        Mockito.when(servicioMock.convert("Dolares", "Bolivianos")).thenReturn(7);
        Conversor conversor = new Conversor(servicioMock);
        String expectedResult = "cantidad convertida: 700.0 Bolivianos";
        String actualRestul = conversor.conversorMoney(100.00, "Dolares", "Bolivianos");
        Assertions.assertEquals(expectedResult, actualRestul, "Error");
        Mockito.verify(servicioMock).convert("Dolares", "Bolivianos");

    }

    @Test
    public  void verifyErrorEuros(){
        Mockito.when(servicioMock.convert("Euros", "Bolivianos")).thenReturn(10);
        Conversor conversor = new Conversor(servicioMock);
        String expectedResult = "cantidad invalida";
        String actualRestul = conversor.conversorMoney(-100.00, "Euros", "Bolivianos");
        Assertions.assertEquals(expectedResult, actualRestul, "Error");
    }

    @Test
    public  void verifyErrorDolares(){
        Mockito.when(servicioMock.convert("Dolares", "Bolivianos")).thenReturn(10);
        Conversor conversor = new Conversor(servicioMock);
        String expectedResult = "cantidad invalida";
        String actualRestul = conversor.conversorMoney(-100.00, "Dolares", "Bolivianos");
        Assertions.assertEquals(expectedResult, actualRestul, "Error");
    }
}
