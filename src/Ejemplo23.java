import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        int n ;
        int positivos = 0;
        Scanner e23 = new Scanner(System.in);
        do {
            n = e23.nextInt();
            if (n >= 0) {
               positivos= positivos++;

            }


        } while (n != 0);
        System.out.println("");

    }
}

