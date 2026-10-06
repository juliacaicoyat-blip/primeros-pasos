import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner log=new Scanner(System.in);
        String contraseña="1wcf";
        String cU;
        int max=3;
        int cI=0;
        do {
            if (contraseña.equals("1wcf")){
                System.out.println("accesso permitido eres la persona");
            } else if (contraseña!=contraseña) {
                System.out.println("acceso denegado, igual te has equivocado, vuelve a intentarlo");

            }
        }while (contraseña.equals(""));

    }
}
