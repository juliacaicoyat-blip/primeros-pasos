package Refuerzo;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner e7=new Scanner(System.in);
        int num;
        System.out.println("Inserte el numero ");
        num= e7.nextInt();
        if (num%2==0){
            System.out.println("Es multiplo de 2");

        } else if (num%3==0) {
            System.out.println("Es multiplo de 3");

        }else{

        }
    }
}
