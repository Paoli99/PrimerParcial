package numerosPoderStatic;

public class NumerosPoderStatic {

    public  NumerosPoderStatic(){}

    public int getPoderStatic(int number, int exponent) throws  Exception{
        int poder = 1;

        if(exponent <= 0){
            throw new Exception("dato incorrecto");
        }
        else{
            for(int i=1; i<= exponent; i++){
                poder = MultiplicacionServiceStatic.multiplicacionStatic(poder,number);
            }
        }
        return poder;
    }
}
