import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        double nota;
        double sumanota=0;
        int contador=0;
        double media=0;

        Scanner e24 = new Scanner(System.in);

        do {
           nota=e24.nextDouble();
           if(nota!=-1){
               sumanota=sumanota+nota;
               contador++;
               if (nota==10){
                   System.out.println("tienes un 10");
               }
           }
        }while (nota!=-1);
        media= sumanota/contador;

        System.out.println("la nota es "+media);

    }
}
