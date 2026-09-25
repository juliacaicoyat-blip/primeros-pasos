package Refuerzo;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner e9= new Scanner(System.in);
        int n;
        System.out.println("dame un numero");
        n= e9.nextInt();
        if((n%2==0)&&(n%3!=0)){
            System.out.println("el numero "+n+"es multiplo de 2 pero no de 3");

        }else{
            System.out.println("Es lo contrario");
        }


    }
}
