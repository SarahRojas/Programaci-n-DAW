import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        double n3;

        System.out.println("nota primer examen ");
        n1 = sc.nextDouble();

        System.out.print("nota que hay que sacar ");
        n2 = sc.nextDouble();

        n3 = (n2-(0.4*n1))/0.6;

        if(n3 > 10 || n3 < 0){
            System.out.println("¿Puede sacar esa nota? ");
        }else{
            System.out.println("para tener un " + n2 + "tienes que sacar ");
        }
        
    }
}
