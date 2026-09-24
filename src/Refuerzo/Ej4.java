package Refuerzo;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner a4=new Scanner(System.in);
        int num1;
        System.out.println("Inserte numero");
        num1= a4.nextInt();

        if(num1%10==0){
            System.out.println("es multiplo");
        }
    }
}
