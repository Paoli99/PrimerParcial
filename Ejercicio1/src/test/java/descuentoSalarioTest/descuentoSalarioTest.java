package descuentoSalarioTest;

import descuentoSalario.DescuentoSalario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class descuentoSalarioTest {
    @ParameterizedTest
    @CsvSource({
    // Sin descuento
    "2000, No se aplican descuentos",
    "1990, No se aplican descuentos",
    "1957, No se aplican descuentos",

    // Con descuento 5%
    "2010, Total despues de descuento: 1909.5",
    "3600, Total despues de descuento: 3420.0",
    "2840, Total despues de descuento: 2698.0",

    // Con descuento 15%
    "4000, Total despues de descuento: 3400.0",
    "5000, Total despues de descuento: 4250.0",
    "10000, Total despues de descuento: 8500.0",
    // Datos invalidos
    "-10, salario invalido",
    "0, salario invalido",
    "-1000, salario invalido",
    })

    public void verifyDescuento(int a, String expectedResults){
        DescuentoSalario descuentoSalario = new DescuentoSalario();
        String actualResult = descuentoSalario.devolverDescuento(a);
        Assertions.assertEquals(expectedResults, actualResult, "Error");
    }
}
