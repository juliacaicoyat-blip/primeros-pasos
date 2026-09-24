import java.util.Scanner;

public class Trianguloedd {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        System.out.println("Introduce 3 lados: ");
        Scanner t =new Scanner(System.in);
        lado1= t.nextInt();
        lado2= t.nextInt();
        lado3= t.nextInt();
        if(lado1+lado2>lado3 && lado2+lado3>lado1 && lado3+lado1>lado2){
            System.out.println("Triangulo");
            if (lado1==lado2 && lado2==lado3){
                System.out.println("Equilatero");
            }else if(lado1==lado2 || lado2==lado3 ||lado1==lado3){
                System.out.println("isosceles");

            }else {
                System.out.println("escaleno");
            }

        }else{
            System.out.println("Imposible");
        }
    }
}
