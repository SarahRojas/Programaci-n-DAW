public class Ejercicio7 {
    public static void main(String[] args){

        double x = 8.0;
        double y = 5.0;
        double z = 0.0;

        z = (1 + ((x * x) / y)) / ((x * x * x) / (1 + y));

        System.out.println("El valor de z es " + z);
    }
}
