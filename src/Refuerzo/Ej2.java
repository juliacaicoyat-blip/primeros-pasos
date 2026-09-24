package Refuerzo;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner a2=new Scanner(System.in);
        int num;
        System.out.println("Inserte numero");
        num= a2.nextInt();
        if(num%2==0){
            System.out.println("Es par");

        }else{
            System.out.println("es impar");

        }
    }
}
