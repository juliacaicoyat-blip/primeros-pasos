import java.util.Scanner;

public class CalificadorNotas {
    public static void main(String[] args) {
        int nota;
        Scanner v=new Scanner(System.in);
        System.out.println("ingrese la nota");
        nota=v.nextInt();
        System.out.println("¿Entregaste todo?(si/no)");
        String entrega= v.next();
        if(entrega.equals("si")){
            if(nota<5){
                System.out.println("Estás suspendido");
            } else if (nota<7) {
                System.out.println("Estás aprobado");
                
            } else if (nota<9) {
                System.out.println("Tienes un notable");
                
            }else {
                System.out.println("Tienes un sobresaliente(!Enhorabuena)");

            }
        }else{
            System.out.println("Suspendido por practicas pendientes");
        }
    }
}
