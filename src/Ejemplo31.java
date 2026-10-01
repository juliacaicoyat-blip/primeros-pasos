import java.util.Scanner;

public class Ejemplo31 {
    public static void main(String[] args) {
        Scanner e31=new Scanner(System.in);
        int n;
        System.out.println("introduce numero");
        n= e31.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
