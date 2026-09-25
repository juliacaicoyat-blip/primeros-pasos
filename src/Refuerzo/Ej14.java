package Refuerzo;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int n,m;
        Scanner e14= new Scanner(System.in);
        System.out.println("dame numero 1");
        n= e14.nextInt();
        System.out.println("dame numero 2");
        m= e14.nextInt();
        if ((n>=0)&&(m>=0)){
            System.out.println("los dos numeros són positivos");

        }else if((n>=0)&&(m<=0)||(n<=0)&&(m>=0)){
            System.out.println("uno de los dos es positivo");

        }else{
            System.out.println("ninguno es positivo");
        }


    }
}
