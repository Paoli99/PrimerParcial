package numerosPoder;

public class NumerosPoder {
    MultiplicacionService multiplicacionService = new MultiplicacionService();

    public NumerosPoder(){
        multiplicacionService = new MultiplicacionService();
    }

    public NumerosPoder(MultiplicacionService servicioMock){}

    public int getPoder(int number, int exponent) throws Exception{
        int poder = 1;

        if(exponent <= 0){
            throw new Exception("dato incorrecto");
        }
        else{
            for(int i=1; i<= exponent; i++){
                poder = multiplicacionService.multiplicacion(poder,number);
            }
        }
        return poder;
    }
}
