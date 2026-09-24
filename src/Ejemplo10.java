import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        double num;
        Scanner x = new Scanner(System.in);
        System.out.println("pon tu numero");
        num= x.nextDouble();
        if(num>=0){
            System.out.println("tu numero es positivo");

        }
        else{
            System.out.println("tu numero es negativo");
        }
    }

}
