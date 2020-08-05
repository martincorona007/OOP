import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("tell me a number to know if is cousin or not");
        System.out.println("Number: ");
        int n1=entrada.nextInt();
        System.out.println("Number: ");
        int n2=entrada.nextInt();
        if (n1%2==0 && n2%2==0){
            System.out.println("Both are cousin");
        }else {
            System.out.println("The numbers arent cousin ");
        }


    }
}
