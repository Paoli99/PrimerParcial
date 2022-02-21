package ejercicio2;

public class Generador {
    Primos prime = new Primos();

    public  Generador(Primos servicioMock){
        prime = servicioMock;
    }
    public Generador(){}

    public String getNumberValues(int num) throws Exception {
        String msg = "";

        if(num <=0){
            throw new Exception("dato incorrecto");
        }
        else{
            if(prime.esPrimo(num)){
                for(int i =2; i < num; i+=2){
                    msg += i + " ";
                }
            }
            else{
                for(int i =1; i < num; i+=2){
                    msg += i + " ";
                }
            }
            return msg.trim();
        }
    }
}
