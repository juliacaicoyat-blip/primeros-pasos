import java.util.Scanner;

public class CosteSocio {
    public static void main(String[] args) {
        Scanner d =new Scanner(System.in);
        double importe;
        System.out.println("Ingrese importe");
        importe=d.nextDouble();
        double descuento=0,Preciofinal;
        System.out.println("¿Eres socio? (si/no)");
        String socio= d.next();
        if (socio.equals("Si")){
            if(importe>=100){
                descuento= 0.15;
            } else if (importe>=50) {
                descuento=0.1;

            }
        }else{
            if(importe>=50){
                descuento=0.05;
            }
        }
        Preciofinal=importe-(importe*descuento);
        System.out.println("El precio final es "+Preciofinal);
    }
}
