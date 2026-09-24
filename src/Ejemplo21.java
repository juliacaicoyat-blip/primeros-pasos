import java.util.Scanner;

public class Ejemplo21 {
    public static void main(String[] args) {
        Scanner B= new Scanner(System.in);
        int año;
        System.out.println("inserte año");
        año= B.nextInt();
        if(año>3){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }


    }
}
