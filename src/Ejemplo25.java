import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        int numero;
        long factorial=1;

        Scanner e25=new Scanner(System.in);
        numero=e25.nextInt();
        for (int i=1;i<=numero;i++){
           factorial=factorial*i;
        }
        System.out.println("el facorial es"+factorial);
    }
}
