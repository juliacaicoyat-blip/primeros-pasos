import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        int segundos, minutos,horas;

        Scanner r = new Scanner(System.in);
        System.out.println("Inserte segundos:");
        segundos = r.nextInt();
        System.out.println("inserte minutos:");
        minutos = r.nextInt();
        System.out.println("inserte horas:");
        horas=r.nextInt();
        segundos++;
        if(segundos==60){
            segundos=minutos+1;
                    if(minutos==60){
                        minutos=0;
                        horas++;
                    }
        }
    }


}
