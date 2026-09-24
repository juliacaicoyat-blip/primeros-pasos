import java.util.Scanner;

public class EjemploEDD1 {
    public static void main(String[] args) {
        double peso;
        double altura;
        double IMC;

        Scanner gk= new Scanner(System.in);
        System.out.println("introduce peso y altura: ");
        peso=gk.nextDouble();
        altura=gk.nextDouble();
        IMC=peso/altura*altura;
        if(IMC<18.5){
            System.out.println("Infrapeso");
        } else if (IMC<25) {
            System.out.println("Normal");
            
        } else if (IMC<30) {
            System.out.println("Sobrepeso");
            
        }else{
            System.out.println("Obesidad");
        }
    }
}
