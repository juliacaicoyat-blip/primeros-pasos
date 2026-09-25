package Refuerzo;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        int n,m,o;
        Scanner e16= new Scanner(System.in);
        System.out.println("numero 1");
        n= e16.nextInt();
        System.out.println("numero 2");
        m= e16.nextInt();
        System.out.println("numero 3");
        o= e16.nextInt();
        if(n>m&&n>o){
            System.out.println("el numero mayor es el 1");

        }else if (m>n&&m>o){
            System.out.println("el numero mayor es el 2");

        }else{
            System.out.println("el numero mayor es el 3");

        }
    }
}
