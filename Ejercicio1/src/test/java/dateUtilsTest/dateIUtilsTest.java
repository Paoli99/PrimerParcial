package dateUtilsTest;

import ejercicio1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class dateIUtilsTest {

    @ParameterizedTest
    @CsvSource({
    //Datos correctos
    "5,mayo,2020, 6 mayo 2020",
    "28,febrero,2020, 29 febrero 2020",
    "28,febrero,2021, 1 marzo 2021",

    //Dias incorrectos
    "-5,  mayo,  2020, dia incorrecto",
    "0, febrero,  2021, dia incorrecto",

    //Meses incorrectos
    "5,  pasto,  2020, mes incorrecto",
    "28, febreroro,  2020, mes incorrecto",
    "28, fierro,  2021, mes incorrecto",


    // Año incorrecto
    "5,  mayo,  -2020, gestion incorrecto",
    "28, febrero,  -1, gestion incorrecto",
    "28, febrero,  -2021, gestion incorrecto",

    // mas de un incorrecto
    "-5,  mayo,  -2020, ingresar nuevos datos",
    "-28, febreroro,  -1, ingresar nuevos datos",
    "0, febrero,  -2021, ingresar nuevos datos",

    })


    public void verifyTheMessageNota(int day , String month, int year, String expectedResult) {
        DateUtils date = new DateUtils();
        String actualResult = date.nextDate(day,month,year);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR, el mensaje retornado es incorrecto!!");
    }
}
