import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner caj = new Scanner(System.in);
        int saldo = caj.nextInt();
        System.out.println("inserte el saldo: ");
        int precioingresar = caj.nextInt();
        System.out.println("ingresa saldo");
        int precioretirar = caj.nextInt();
        System.out.println("retirar el saldo");
        int ingreso = 1;
        int retirar = 2;
        int salir = 0;
        int opcion;

        do {

            System.out.println("1. ingresar, 2. retirar, 0. salir");
            opcion = caj.nextInt();
            ingreso = 1;
            retirar = 2;
            salir = 0;
            if (opcion == 1) {
                ingreso = saldo + precioingresar;
                System.out.println("ingresa tu precio");
            } else if (opcion == 2) {
                retirar = saldo - precioretirar;
                System.out.println("retira tu precio");

            }
        } while (opcion == 0);

    }






}

