package ejercicio3;

public class Conversor {

     ConversorUtil conversorUtil = new ConversorUtil();

     public Conversor(ConversorUtil servicioMock){ conversorUtil = servicioMock;}

    public Conversor(){}

    public String conversorMoney(double monmeyInput, String monedaA, String monedaB){
        String msg = "";

        if(monmeyInput >= 1){
            msg = "cantidad convertida: " + (monmeyInput*conversorUtil.convert(monedaA,monedaB) + " " + monedaB);

        }
        else{
            msg = "cantidad invalida";
        }

        return  msg;
    }
}
