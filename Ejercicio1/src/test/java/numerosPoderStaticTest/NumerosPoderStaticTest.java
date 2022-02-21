package numerosPoderStaticTest;

import numerosPoderStatic.MultiplicacionServiceStatic;
import numerosPoderStatic.NumerosPoderStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class NumerosPoderStaticTest {

    @Test
    public void exceptionForNegativeNumbers(){
        NumerosPoderStatic numerosPoder = new NumerosPoderStatic();
        Assertions.assertThrows(Exception.class, () -> {numerosPoder.getPoderStatic(2,-1);});
    }

    /*@BeforeAll
    public static void before(){
        MockedStatic<MultiplicacionServiceStatic> objectMock = Mockito.mockStatic(MultiplicacionServiceStatic.class);
        objectMock.when(() -> MultiplicacionServiceStatic.multiplicacionStatic(3,3)).thenReturn(9);
        objectMock.when(() -> MultiplicacionServiceStatic.multiplicacionStatic(9,3)).thenReturn(27);
    }*/

    @Test
    public void verifyPoderStatic() throws Exception {
        //MockedStatic<MultiplicacionServiceStatic> objectMock = Mockito.mockStatic(MultiplicacionServiceStatic.class);

        //objectMock.when(() -> MultiplicacionServiceStatic.multiplicacionStatic(3,3)).thenReturn(9);
        //objectMock.when(() -> MultiplicacionServiceStatic.multiplicacionStatic(9,3)).thenReturn(27);

        NumerosPoderStatic numerosPoderStatic = new NumerosPoderStatic();

        //Assertions.assertEquals(27,numerosPoderStatic.getPoderStatic(3,3), "Error");
        int expectedResult = 27;
        int actualResult = numerosPoderStatic.getPoderStatic(3,3);
        Assertions.assertEquals(expectedResult, actualResult, "Error");
    }
}
