import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        int num;
        int positivos = 0;
        Scanner e22 =new Scanner(System.in);
        System.out.println("introduce 10 numeros");
        for(int i=0; i<10;i++){
            num= e22.nextInt();
            if(num>=0){
                positivos++;

            }

        }
        System.out.println("los positivos son"+positivos);
    }


}
