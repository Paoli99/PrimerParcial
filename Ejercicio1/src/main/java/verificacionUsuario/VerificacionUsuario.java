package verificacionUsuario;
import java.util.Map;
import java.util.HashMap;

public class VerificacionUsuario {

    VerificacionUsuariosUtil verificacionUsuariosUtil;

    public VerificacionUsuario(){ verificacionUsuariosUtil = new VerificacionUsuariosUtil();}

    public VerificacionUsuario(VerificacionUsuariosUtil objetoMockeado){
        verificacionUsuariosUtil = objetoMockeado;
    }

    public String getUser(String user){

        Map<String, String> permisos = new HashMap<>();
        permisos.put("admin","PERMISSION ROLE: CRUD - 22 02 2022 22 22 22");
        permisos.put("tester","PERMISSION ROLE: CD - 22 02 2022 22 22 22");
        permisos.put("user","PERMISSION ROLE: R - 22 02 2022 22 22 22");
        permisos.put("manager","PERMISSION ROLE: CUD - 22 02 2022 22 22 22");
        permisos.put("random","Incorrect USER and PWD");

        String username = verificacionUsuariosUtil.verificacionUsuarios(user);

        return permisos.get(username);
    }

}
