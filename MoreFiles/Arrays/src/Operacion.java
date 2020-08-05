import java.util.Scanner;


public class Operacion {

    public int[] a;
    public int[][] b;
    public int[][][] c;

    // instancia             entrada de datos
    public Scanner entrada = new Scanner(System.in);


    public int[] CrearArreglo(int col) {
        a = new int[col];//inicializasion
        return a;
    }

    public int[][] CrearArreglo(int ren, int col) {
        b = new int[ren][col];
        return b;
    }

    public int[][][] CrearArreglo(int ren, int col, int z) {
        c = new int[ren][col][z];
        return c;
    }

    //areglo de anteros
    public int[] llenarArreglo(int[] a1) {
        for (int pos = 0; pos < a1.length; pos++) {
            System.out.println("Valor: [" + pos + "]:");
            // ----{leer y la mandamos al areglos
            a1[pos] = entrada.nextInt();

        }
        return a1;
    }

    public int[][] llenarArreglo(int[][] a2) {
        for (int s = 0; s < a2.length; s++) {
            for (int x = 0; x < a2[0].length; x++) {
                // ----{leer y la mandamos al areglos
                System.out.println("Valor: [" + s + "]+[" + x + "]");

                a2[s][x] = entrada.nextInt();

            }

        }
        return a2;

    }

    public int[][][] llenarArreglo(int[][][] a3) {
        for (int yo = 0; yo < a3.length; yo++) {
            for (int te = 0; te < a3[1].length; te++) {
                for (int bo = 0; bo < a3[0][0].length; bo++) {
                    System.out.println("Valor: [" + yo + "]+[" + te + "]+[" + bo + "]");
                    a3[yo][te][bo] = entrada.nextInt();
                }
            }
        }
        return a3;
    }

    public int sumarArreglo(int[] a1) {
        int suma = 0;
        for (int xs = 0; xs < a1.length; xs++) {
            suma += a1[xs];
        }
        return suma;
    }

    public int sumarArreglo(int[][] a2) {
        int suma = 0;
        for (int sk = 0; sk < a2.length; sk++) {
            for (int qw = 0; qw < a2[0].length; qw++) {
                suma += a2[sk][qw];
            }
        }
        return suma;
    }

    public int sumarArreglo(int[][][] a3) {
        int suma = 0;
        for (int su = 0; su < a3.length; su++) {
            for (int go = 0; go < a3[1].length; go++) {
                for (int duu = 0; duu < a3[0][0].length; duu++) {
                    suma += a3[su][go][duu];
                }
            }
        }
        return suma;

    }

    public int[] SumarMatriz(int[] sum1, int[] sum2) {
        a = new int[sum1.length];
        for (int i = 0; i < sum1.length; i++) {
            a[i] = sum1[i] + sum2[i];
        }
        return a;

    }

    public int[][] SumarMatriz(int[][] suum1, int[][] suum2) {
        b = new int[suum1.length][suum1[0].length];
        for (int d = 0; d < suum1.length; d++) {
            for (int s = 0; s < suum1.length; s++) {
                b[d][s] = suum1[d][s] + suum2[d][s];
            }
        }
        return b;
    }

    public int[][][] SumarMatriz(int[][][] suuum1, int[][][] suuum2) {
        c = new int[suuum1.length][suuum1[0].length][suuum1[0][0].length];
        for (int mi = 0; mi < suuum1.length; mi++) {
            for (int e = 0; e < suuum1[mi].length; e++) {
                for (int x = 0; x < suuum1[mi][e].length; x++) {
                    c[mi][e][x] = suuum1[mi][e][x] + suuum2[mi][e][x];
                }
            }
        }
        return c;
    }

    public int[] MultiplicarrMatriz(int[] mu1, int[] mu2) {
        a = new int[mu1.length];
        for (int i = 0; i < mu1.length; i++) {
            a[i] = mu1[i] * mu2[i];
        }
        return a;

    }

    public int[][] MultiplicarrMatriz(int[][] muu1, int[][] muu2) {
        b = new int[muu1.length][muu1[0].length];
        for (int d = 0; d < muu1.length; d++) {
            for (int s = 0; s < muu1.length; s++) {
                b[d][s] = muu1[d][s] * muu2[d][s];
            }
        }
        return b;
    }

    public int[][][] MultipliacarrMatriz(int[][][] muuu1, int[][][] muuu2) {
        c = new int[muuu1.length][muuu1[0].length][muuu1[0][0].length];
        for (int mi = 0; mi < muuu1.length; mi++) {
            for (int e = 0; e < muuu1[mi].length; e++) {
                for (int x = 0; x < muuu1[mi][e].length; x++) {
                    c[mi][e][x] = muuu1[mi][e][x] * muuu2[mi][e][x];
                }
            }
        }
        return c;
    }

    public void imprimir(int[] uno) {
        for (int x = 0; x < a.length; x++) {
            System.out.print(uno[x] + "");
        }
    }

    public void imprimir(int[][] dos) {
        for (int aw = 0; aw < dos.length; aw++) {
            for (int qw = 0; qw < dos[aw].length; qw++) {
                System.out.print(dos[aw][qw] + " ");
            }
            System.out.println("");
        }
    }

    public void imprimir(int[][][] tres) {
        for (int w=0;w<tres.length;w++){
            System.out.println();
            for (int e=0;e<tres[w].length;e++){
                for (int r=0;r<tres[w][e].length;r++){
                    System.out.print(tres[w][e][r]+"");
                }
                System.out.println("\t");
            }
        }
    }

}



