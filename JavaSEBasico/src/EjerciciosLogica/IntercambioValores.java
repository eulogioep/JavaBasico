package EjerciciosLogica;

// Ejercicio que permite el intercambio de valores entre dos variables.


public class IntercambioValores {
    public static void main(String[] args){

        int n = 35;
        int n2 = 20;
        int aux = 0;

        System.out.println("n: "+ n + ", n2: " + n2 + ", aux: " + aux);

        aux = n;
        n = n2;
        n2 = aux;

        System.out.println("n: "+ n + ", n2: " + n2 + ", aux: " + aux);


    }
}
