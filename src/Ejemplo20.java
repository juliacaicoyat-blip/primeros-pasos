import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        double precio;
        double descuento;
        Scanner d = new Scanner(System.in);
        System.out.println("inserte precio:");
        precio= d.nextDouble();
        descuento=d.nextDouble();
        if(precio<6){
            System.out.println("no tienes descuento");

        }else if(precio<60){
            System.out.println("Tu precio es: "+ precio*5/100);

        }else{
            System.out.println("Tu precio es: "+ precio*10/100);
        }

    }
}
