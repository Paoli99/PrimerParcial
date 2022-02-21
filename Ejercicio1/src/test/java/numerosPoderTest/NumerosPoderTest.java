package numerosPoderTest;

import numerosPoder.MultiplicacionService;
import numerosPoder.NumerosPoder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class NumerosPoderTest {
    MultiplicacionService servicioMock = Mockito.mock(MultiplicacionService.class);

    @Test
    public void exceptionForNegativeNumbers(){
        NumerosPoder numerosPoder = new NumerosPoder();
        Assertions.assertThrows(Exception.class, () -> {numerosPoder.getPoder(2,-1);});
    }

    @Test
    public void verifyPoder() throws Exception{
        Mockito.when(servicioMock.multiplicacion(3,3)).thenReturn(9);
        Mockito.when(servicioMock.multiplicacion(9,3)).thenReturn(27);

        NumerosPoder numerosPoder = new NumerosPoder(servicioMock);

        int expectedResult = 27;
        int actualResult = numerosPoder.getPoder(3,3);

        Assertions.assertEquals(expectedResult, actualResult, "Error");

        //Mockito.verify(servicioMock).multiplicacion(3,3);
        //Mockito.verify(servicioMock).multiplicacion(9,3);

    }
}
