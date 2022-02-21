package verficicacionUsuarioTestStatic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import verificacionUsuario.VerificacionUsuario;
import verificacionUsuarioStatic.VerificacionUsuarioStatic;
import verificacionUsuarioStatic.VerificacionUsuarioUtilStatic;

public class VerificacionUsuariosTestStatic {
    @BeforeAll
    public static void before(){
        MockedStatic<VerificacionUsuarioUtilStatic> mocked = Mockito.mockStatic(VerificacionUsuarioUtilStatic.class);
        mocked.when(()-> VerificacionUsuarioUtilStatic.getUser("admin")).thenReturn("T");
        mocked.when(()-> VerificacionUsuarioUtilStatic.getUser("tester")).thenReturn("T");
        mocked.when(()-> VerificacionUsuarioUtilStatic.getUser("user")).thenReturn("T");
        mocked.when(()-> VerificacionUsuarioUtilStatic.getUser("manager")).thenReturn("T");
        mocked.when(()-> VerificacionUsuarioUtilStatic.getUser("random")).thenReturn("F");
    }
   @Test
   public void VerifyUserB(){
       VerificacionUsuarioStatic verificacionUsuarioStatic = new VerificacionUsuarioStatic();
       Assertions.assertEquals("PERMISSION ROLE: CRUD - 22 02 2022 22 22 22", verificacionUsuarioStatic.userStatico("admin"), "Error");
   }

    @Test
    public void VerifyUserC(){
        VerificacionUsuarioStatic verificacionUsuarioStatic = new VerificacionUsuarioStatic();
        Assertions.assertEquals("PERMISSION ROLE: CD - 22 02 2022 22 22 22", verificacionUsuarioStatic.userStatico("tester"), "Error");
    }

    @Test
    public void VerifyUserD(){
        VerificacionUsuarioStatic verificacionUsuarioStatic = new VerificacionUsuarioStatic();
        Assertions.assertEquals("PERMISSION ROLE: R - 22 02 2022 22 22 22", verificacionUsuarioStatic.userStatico("user"), "Error");
    }

    @Test
    public void VerifyUserR(){
        VerificacionUsuarioStatic verificacionUsuarioStatic = new VerificacionUsuarioStatic();
        Assertions.assertEquals("PERMISSION ROLE: CUD - 22 02 2022 22 22 22", verificacionUsuarioStatic.userStatico("manager"), "Error");
    }
    @Test
    public void VerifyUserWrong(){
        VerificacionUsuarioStatic verificacionUsuarioStatic = new VerificacionUsuarioStatic();
        Assertions.assertEquals("Incorrect USER and PWD", verificacionUsuarioStatic.userStatico("random"), "Error");
    }


}
