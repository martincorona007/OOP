import java.util.Scanner;


public class TestOperaciones {
    public static void main(String[] args) {
        Operaciones secta = new Operaciones();
        Scanner miex = new Scanner(System.in);
        int opcion, n2, n1;

        do {
            System.out.println("         MENU          ");
            System.out.println("1- Numeros amigos ");
            System.out.println("2- Numero perfecto ");
            System.out.println("3- Salir");
            opcion = miex.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Numeros Amigos ");
                    System.out.println("Ingrese un numero");
                    n1 = miex.nextInt();
                    System.out.println("Ingrese otro numero");
                    n2 = miex.nextInt();
                    if (secta.CalcularAmigos(n1, n2)) {
                        System.out.println("Son numeros amigos");
                    } else {
                        System.out.println("No son amigos");
                    }


                    break;

                case 2:
                    System.out.printf("Numero Perfecto ");
                    System.out.println("Ingrese un numero ");
                    n1 = miex.nextInt();
                    if (secta.CalcularPerfecto(n1)) {
                        System.out.println("El numero es perfecto");
                    } else {
                        System.out.printf("El numero no es perfecto");
                    }

                    break;


                case 3:
                    System.out.print("He salido");
                    break;


            }
        } while (opcion != 3);


    }
}