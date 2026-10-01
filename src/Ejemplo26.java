import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner e26= new Scanner(System.in);
        int n= e26.nextInt();
        for (int i = 1; i <=10; i++) {
            if (n>= 0) {
                System.out.printf("%d*%d==%d",n,i,n*i);
            }
        }


    }
}
