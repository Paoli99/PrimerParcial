package numeroPares;

public class Pares {
    public Pares() {}

    public static boolean esPar(int numero){
        if(numero >= 1) {
            if (numero % 2 == 0) {
                return true;
            }
            else{
                return false;
            }
        }

        else{
            return false;
        }
    }

}
