package ejercicio3Static;


public class ConversorStatic {

    public String conversorMoney(double monmeyInput, String monedaA, String monedaB){
        String msg = "";
        if(monmeyInput >= 1){
           double convert = ConversorUtilStatic.convert(monedaA, monedaB);
           msg = "cantidad convertida: " + (monmeyInput*convert) + " " + monedaB;

        }
        else{
            msg = "cantidad invalida";
        }

        return  msg;
    }

}
