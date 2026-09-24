package Refuerzo;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner a5=new Scanner(System.in);
        int num1,num2;
        System.out.println("dame numero 1");
        num1= a5.nextInt();
        System.out.println("dame numero 2");
        num2= a5.nextInt();
        if(num1==0){
            System.out.println("El producto de qualquier numero por 0 es 0");
        }else{
            System.out.println("El resultado de la multiplicacion" + num1*num2);

        }
    }
}
