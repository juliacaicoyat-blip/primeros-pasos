 import java.sql.SQLOutput;
 import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args) {
        int num1,num2;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Dame num1");
        num1 = sc.nextInt();
        System.out.println("dame num2");
        num2 = sc.nextInt();

        int suma = num1+num2;
        int resta =num1-num2;
        int multiplicacion=num1*num2;
        int division= num1/num2;

        System.out.println("el resultado de la suma");
        System.out.println("el resultado de la resta");
        System.out.println("el resultado de la multiplicacion" );
        System.out.println();


    }
}


