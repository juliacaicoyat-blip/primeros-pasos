package Refuerzo;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner e6= new Scanner(System.in);
        int num1,num2;
        System.out.println("inserte numero 1 ");
        num1= e6.nextInt();
        System.out.println("inserte numero 2 ");
        num2= e6.nextInt();
        if(num2==0){
            System.out.println("ERROR");
        }else{
            System.out.println("la division es" + num1/num2);
        }
    }
}
