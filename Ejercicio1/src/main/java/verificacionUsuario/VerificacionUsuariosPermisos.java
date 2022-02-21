package verificacionUsuario;

public class VerificacionUsuariosPermisos {

    VerificacionUsuariosUtil verificacionUsuariosUtil;

    public VerificacionUsuariosPermisos(){verificacionUsuariosUtil = new VerificacionUsuariosUtil();}

    public VerificacionUsuariosPermisos(VerificacionUsuariosUtil objetoMockeado) { verificacionUsuariosUtil = objetoMockeado;}

    public String getPermisos(String a, String b){
        String msg= "";
        if(verificacionUsuariosUtil.verificacionUsuarios(a,b)){
            msg="CRUD 02 02 2022 22 22 22";
        }
        else{
            msg = "no tiene permisos";
        }
        return msg;
    }
}
