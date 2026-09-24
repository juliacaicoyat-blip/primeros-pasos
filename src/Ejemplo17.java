import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        int mes;
        Scanner f= new Scanner(System.in);
        System.out.println("Inserte mes ");
        mes= f.nextInt();
        switch(mes){
            case 1:
                System.out.println("El mes que es enero tiene 31");
                break;
            case 2:
                System.out.println("El mes que es febrero tiene 28");
                break;
            case 3:
                System.out.println("El mes que es marzo tiene 31");
                break;
            case 4:
                System.out.println("El mes que es abril tiene 30");
                break;
            case 5:
                System.out.println("El mes que es mayo tiene 31");
                break;
            case 6:
                System.out.println("El mes que es junio tiene 30");
                break;
            case 7:
                System.out.println("El mes que es julio tiene 31");
                break;
            case 8:
                System.out.println("El mes que es agosto tiene 31");
                break;
            case 9:
                System.out.println("El mes que es septiembre tiene 30");
                break;
            case 10:
                System.out.println("El mes que es octubre tiene 31");
                break;
            case 11:
                System.out.println("El mes que es noviembre tiene 30");
                break;
            case 12:
                System.out.println("El mes que es diciembre tiene 31");
                break;
        }
    }
}
