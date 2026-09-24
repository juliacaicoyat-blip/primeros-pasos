import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner z = new Scanner(System.in);
        System.out.println("inserte numero 1");
        num1= z.nextInt();
        System.out.println("inserte numero 2");
        num2= z.nextInt();
        if(num1<num2){
            System.out.println("va en orden ascendente");
        }else{
            System.out.println("no va en orden ascendente");
        }
    }
}
