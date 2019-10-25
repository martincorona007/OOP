import java.io.*;
import java.util.Scanner;
public class Ejemplos {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////");
        try {
            FileInputStream f = new FileInputStream("data.bin");
            // Lectura de los datos
        } catch (FileNotFoundException e) {
            System.out.println("No es posible abrir el fichero "+e+"\n");
        }
            System.out.println("/////////////////////////////////////////");
            double n1,n2,res;
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escribe un numero");
                n1 = teclado.nextDouble();
            System.out.println("Escribe un numero");
                n2 = teclado.nextDouble();
            
                res = n1 / n2;
            System.out.println("el resultado es: " + res);
        }catch(Exception em){
            System.out.println("Ocurrio un error "+em);
        }
            System.out.println("////////////////////////////////////////");
            int numerador=10;
            Integer denominador=0;
            float division;
        try{
            division=numerador/denominador;
        }catch (ArithmeticException ex){
            division=0;
            System.out.println("error: "+ex.getMessage());
        }
            System.out.println("///////////////////////////////////////");
            String str=" 12 ";
            int numero;
        try{
            numero=Integer.parseInt(str);
        }catch(NumberFormatException exs){
            System.out.println("No es un número");
        }
             System.out.println("///////////////////////////////////////");
        try {
            PrintWriter out=new PrintWriter(new FileWriter("helloWorld.txt"));
            out.println("hi.");
            out.close();
            BufferedReader in=new BufferedReader(new FileReader("dhdhdhdsks.txt"));
                System.out.println(in.readLine());
        }catch (IOException ses){
             System.out.println("Error: "+ses);
        }
            System.out.println("///////////////////////////////////////");
    }
 }
