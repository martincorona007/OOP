import java.util.Scanner;

/**
 * Created by Genoveva on 16/02/2017.
 */
public class Main {


    public static void main(String[] args) {
        Operaciones operaciones=new Operaciones();   //instancia
        Scanner entrada=new Scanner(System.in);

        int num1, num2,op;

        //ctrl +alt +L
        System.out.println("MENU");
        System.out.println("1. numero primo");
        System.out.println("2. numero perfecto");
        System.out.println("3. Salir");
        op=entrada.nextInt();
        do {

            switch (op){

                case 1:
                    System.out.println("numero primo");
                    num1=entrada.nextInt();
                    System.out.println("number 2 primo");
                    num2=entrada.nextInt();
                    if (operaciones.CalcularAmigos(num1,num2)){
                        //letras gris ederadas clase object
                        System.out.println("soon numeros amigos");
                    }else{
                        System.out.println("no son amigos");
                    }
                case 2:
                    System.out.println("numeros perfectos");
                    System.out.println("escribe un numero: ");
                    num1=entrada.nextInt();
                    if (operaciones.calcularPerfecto(num1)){
                        System.out.println("es numero perfecto");
                    }else {
                        System.out.println("no es numero perfecto");
                    }
                case 3:
                default:
                    System.out.println("he salido");
            }

        }while (op!=3);


    }


}
