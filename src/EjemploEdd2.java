import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploEdd2 {
    public static void main(String[] args) {
        int ConsumoHoras;
        double precio;
        Scanner w=new Scanner(System.in);
        System.out.println("inserte tu consumo: ");
        ConsumoHoras= w.nextInt();
        precio= w.nextDouble();
        if(ConsumoHoras<=100){
           precio=ConsumoHoras*0.10;
        } else if (ConsumoHoras<=300) {
            precio=ConsumoHoras*0.15;
            
        }else {
            precio=ConsumoHoras*0.20;
        }
    }
}
