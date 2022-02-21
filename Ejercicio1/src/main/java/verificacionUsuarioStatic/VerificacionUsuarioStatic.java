package verificacionUsuarioStatic;
import java.util.HashMap;
import java.util.Map;

public class VerificacionUsuarioStatic {

    public String userStatico(String user){
        Map<String, String> permisos = new HashMap<>();
        permisos.put("admin","PERMISSION ROLE: CRUD - 22 02 2022 22 22 22");
        permisos.put("tester","PERMISSION ROLE: CD - 22 02 2022 22 22 22");
        permisos.put("user","PERMISSION ROLE: R - 22 02 2022 22 22 22");
        permisos.put("manager","PERMISSION ROLE: CUD - 22 02 2022 22 22 22");
        permisos.put("random","Incorrect USER and PWD");

        String username = VerificacionUsuarioUtilStatic.getUser(user);

        return permisos.get(username);
    }

}
