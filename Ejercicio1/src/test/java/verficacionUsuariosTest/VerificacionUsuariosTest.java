package verficacionUsuariosTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import verificacionUsuario.VerificacionUsuario;
import verificacionUsuario.VerificacionUsuariosPermisos;
import verificacionUsuario.VerificacionUsuariosUtil;

public class VerificacionUsuariosTest {

    VerificacionUsuariosUtil verificacionUsuariosUtil = Mockito.mock(VerificacionUsuariosUtil.class);

    @Test
    public void verifyPermisosCRUD(){
        Mockito.when(verificacionUsuariosUtil.verificacionUsuarios("admin")).thenReturn("T");
        VerificacionUsuario verificacionUsuario = new VerificacionUsuario(verificacionUsuariosUtil);
        String expectedResult = "PERMISSION ROLE: CRUD - 22 02 2022 22 22 22";
        String actualResult = verificacionUsuario.getUser("admin");
        Assertions.assertEquals(expectedResult, actualResult, "Error");
    }

    @Test
    public void verifyPermisosCD(){
        Mockito.when(verificacionUsuariosUtil.verificacionUsuarios("tester")).thenReturn("T");
        VerificacionUsuario verificacionUsuario = new VerificacionUsuario(verificacionUsuariosUtil);
        String expectedResult = "PERMISSION ROLE: CD - 22 02 2022 22 22 22";
        String actualResult = verificacionUsuario.getUser("admin");
        Assertions.assertEquals(expectedResult, actualResult, "Error");
    }

    @Test
    public void verifyPermisosR(){
        Mockito.when(verificacionUsuariosUtil.verificacionUsuarios("user")).thenReturn("T");
        VerificacionUsuario verificacionUsuario = new VerificacionUsuario(verificacionUsuariosUtil);
        String expectedResult = "PERMISSION ROLE: R - 22 02 2022 22 22 22";
        String actualResult = verificacionUsuario.getUser("admin");
        Assertions.assertEquals(expectedResult, actualResult, "Error");
    }

    @Test
    public void verifyPermisosCUD(){
        Mockito.when(verificacionUsuariosUtil.verificacionUsuarios("manager")).thenReturn("T");
        VerificacionUsuario verificacionUsuario = new VerificacionUsuario(verificacionUsuariosUtil);
        String expectedResult = "PERMISSION ROLE: CUD - 22 02 2022 22 22 22";
        String actualResult = verificacionUsuario.getUser("admin");
        Assertions.assertEquals(expectedResult, actualResult, "Error");
    }

    @Test
    public void verifyPermisosFalse(){
        Mockito.when(verificacionUsuariosUtil.verificacionUsuarios("random")).thenReturn("F");
        VerificacionUsuario verificacionUsuario = new VerificacionUsuario(verificacionUsuariosUtil);
        String expectedResult = "Incorrect USER and PWD";
        String actualResult = verificacionUsuario.getUser("random");
        Assertions.assertEquals(expectedResult, actualResult, "Error");
    }
}
