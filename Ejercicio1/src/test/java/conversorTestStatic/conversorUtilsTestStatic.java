package conversorTestStatic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import ejercicio3Static.ConversorUtilStatic;
import ejercicio3Static.ConversorStatic;

public class conversorUtilsTestStatic {
    @BeforeAll
    public static void before(){
        MockedStatic<ConversorUtilStatic> mocked = Mockito.mockStatic(ConversorUtilStatic.class);
        mocked.when(()->ConversorUtilStatic.convert("Euros", "Bolivianos")).thenReturn(10);
        mocked.when(()->ConversorUtilStatic.convert("Dolares", "Bolivianos")).thenReturn(7);
    }

    @Test
    public void verifyConversorEuros(){
        ConversorStatic conversorStatic = new ConversorStatic();
        Assertions.assertEquals("cantidad convertida: 1000.0 Bolivianos",
                conversorStatic.conversorMoney(100.0, "Euros", "Bolivianos"),
                "Error");

    }

    @Test
    public void verifyConversorDolares(){
        ConversorStatic conversorStatic = new ConversorStatic();
        Assertions.assertEquals("cantidad convertida: 700.0 Bolivianos",
                conversorStatic.conversorMoney(100.0, "Dolares", "Bolivianos"),
                "Error");

    }

    @Test
    public void verifyConversorErrorEuros(){
        ConversorStatic conversorStatic = new ConversorStatic();
        Assertions.assertEquals("cantidad invalida",
                conversorStatic.conversorMoney(-100.0, "Euros", "Bolivianos"),
                "Error");

    }

    @Test
    public void verifyConversorErrorDolares(){
        ConversorStatic conversorStatic = new ConversorStatic();
        Assertions.assertEquals("cantidad invalida",
                conversorStatic.conversorMoney(-100.0, "Dolares", "Bolivianos"),
                "Error");

    }
}
