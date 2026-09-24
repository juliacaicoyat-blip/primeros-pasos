import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("pon los dos numeritos");
        Scanner w = new Scanner(System.in);
        num1= w.nextInt();
        num2= w.nextInt();
        if(num1>num2){
            System.out.println("El numero 1 "+num1+ " es mas grande que el numero 2 "+num2);
        }else{
            System.out.println("El numero 2 "+num2+" es mas grande que el numero 1 "+num1);
        }
    }
}
