import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean boo=true;

        do {
            try {
                System.out.println("-----MENU-----");
                System.out.println("Opcion 1");
                System.out.println("Opcion 2");
                System.out.println("Opcion 3(salir)");
                int num=sc.nextInt();

                switch (num){
                    case 1:
                        System.out.println("Opcion valida");
                        break;
                    case 2:
                        System.out.println("Opcion valida tambien");
                        break;
                    case 3:
                        System.out.println("Hasta luego");
                        boo=false;
                        break;
                    default:
                        System.out.println("Opcion no valida, por favor introduzca los valores adecuados:1");
                }

            }catch (InputMismatchException e){
                System.out.println("Solo se permiten numeros");
                sc.nextLine();
            }
        }while (boo);
    }
}
