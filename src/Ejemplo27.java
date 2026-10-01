import java.util.Scanner;
public class Ejemplo27 {
    public static void main(String[] args) {
        Scanner e27 = new Scanner(System.in);
        int n = 0;
        String res = "";
        System.out.println("inttroduce n");
        n = e27.nextInt();
        for (int i = 0; i < 10; i++) {
        res=res+" "+i;
            System.out.println(res);

        }
    }
}