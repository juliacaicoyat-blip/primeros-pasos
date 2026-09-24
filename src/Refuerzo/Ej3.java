package Refuerzo;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner a3= new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese dos numeros");
        num1= a3.nextInt();
        num2= a3.nextInt();
        if (num1%num2==0){
            System.out.println("Es multiplo");

        }else{
            System.out.println("no es multiplo");

        }
    }
}
