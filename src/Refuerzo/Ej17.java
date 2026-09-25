package Refuerzo;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int n,m;
        Scanner e17= new Scanner(System.in);
        System.out.println("introduce el numero 1");
        n= e17.nextInt();
        System.out.println("introduce el numero 2");
        m= e17.nextInt();
        if (n==m){
            System.out.println("Son el mismo numero");

        }else if(n>m){
            System.out.println("el numero 1 es mayor que el numero 2");

        }else{
            System.out.println("el numero 2 es mayor que el numero 1");

        }
    }

}
