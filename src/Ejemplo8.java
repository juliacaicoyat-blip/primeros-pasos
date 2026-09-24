import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("pon tu edad");
        edad= sc.nextInt();
        if(edad>=18){
            System.out.println("tienes edad suficiente");
        }
        else{
            System.out.println("no tienes edad suficiente ");
        }
    }
}
