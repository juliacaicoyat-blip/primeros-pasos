import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        double precio =12;
        double rebajada=8;
        Scanner sc = new Scanner(System.in);
        System.out.println("precio real");
        precio = sc.nextDouble();
        System.out.println("Rebaja");
        rebajada= sc.nextDouble();
        double enporcentaje= (precio-rebajada)/precio*100;
        System.out.println("precio en porcentaje" + enporcentaje);

    }



}
