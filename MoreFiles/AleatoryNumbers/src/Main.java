
import java.util.Scanner;

/**
 * Created by Martincorona007 on 13/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Tell me a rank");
        int n=entrada.nextInt();
        System.out.println("tell me a colum");
        int m=entrada.nextInt();
        int mat[][]=new int[n][m];
        int nro;
        for (int i=0;i<n;i++){
            for (int j=0; j<m;j++){
                nro=(int)(Math.random()*1000);
                mat[i][j]=nro;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0; j<m;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
