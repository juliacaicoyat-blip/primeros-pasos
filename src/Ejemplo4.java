import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        float lado;
        float area;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el lado");
        lado = inputValue.nextFloat();
        area= lado*lado;
        System.out.println("el area és" + area);

    }
}
