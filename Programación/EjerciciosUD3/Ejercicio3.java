public class Ejercicio3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        double res = 0;

        res = (double) a / b;

        System.out.printf("división = %f \n", res);
        System.out.printf("division entre %d y %d es = a %f \n", a, b, res);

        System.out.printf("%.2f %n", res);
        System.out.printf("%5.2f %n", res);
        System.out.printf("%7.3f %n", res);
        System.out.printf("%07.3f %n", res);
        System.out.printf("%10.4f %n", res);
        System.out.printf("%5.3f %n", res);
        System.out.printf("%10.5f %n", res);
        System.out.printf("%10.0f %n", res);


    }
}
