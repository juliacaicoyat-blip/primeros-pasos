package Refuerzo;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner e8=new Scanner(System.in);
        int n;
        System.out.println("Inserte el numero ");
        n= e8.nextInt();
        if (n%2==0 && n%3==0){
            System.out.println("El numero "+n+" es multiplo por 2 y 3 ");

        }else{
            System.out.println("no lo es");
        }

    }
}
