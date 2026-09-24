import java.util.Scanner;

public class ejmplo6 {
    public static void main(String[] args) {
        int radio= 10;
        Scanner sc =new  Scanner(System.in);
        System.out.println("Pon el radio");
        radio = sc.nextInt();
        double area=Math.PI*radio*radio;
        double longitud= 2*Math.PI*radio;
        System.out.println("El area es"+area);
        System.out.println("la longitud es "+longitud);
    }
}
