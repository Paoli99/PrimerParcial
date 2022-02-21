package descuentoSalario;

public class DescuentoSalario {
    public DescuentoSalario() {}

    public String devolverDescuento(int a){
        String msg = "";
        int salarioBasico = 2000;

        if( a > 0){
            if (a <= salarioBasico){
                msg = "No se aplican descuentos";
            }
            else if (a > salarioBasico && a < 4000){
                double descuento = a * 0.05;
                double resultado = a - descuento;
                msg = "Total despues de descuento: " + resultado;
            }
            else if( a >= 4000){
                double descuento = a * 0.15;
                double resultado = a - descuento;
                msg = "Total despues de descuento: " + resultado;
            }
        }
        else{
            msg="salario invalido";
        }
        return msg;
    }
}
