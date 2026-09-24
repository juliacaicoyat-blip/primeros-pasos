import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        int horas;
        double precioHora;
        double SalarioBruto;
        double impuestos;
        System.out.println("ingrese horas y precio: ");
        Scanner ph= new Scanner(System.in);
        horas= ph.nextInt();
        precioHora=ph.nextDouble();
        SalarioBruto=ph.nextDouble();
        impuestos=ph.nextDouble();
        if(horas<=35){
            SalarioBruto= precioHora*horas;
        }else{
            SalarioBruto= precioHora*35;
            SalarioBruto=SalarioBruto + (horas -35)*precioHora *1.5;

        if(SalarioBruto<=500){
            impuestos=0;

        }else if(SalarioBruto<900){
            impuestos=precioHora*0.25;
        }else{
            impuestos=(SalarioBruto-500)*0.45;
        }
        }

    }


}
