import java.util.Scanner;


public class MainPrincipal {

    public static void main(String[] args) {
        Operacion tipo = new Operacion();
        Scanner leer = new Scanner(System.in);

        int[] uni;
        int[][] bidi;
        int[][][] multi;
        int[] sumis1;
        int[][] sumis2;
        int[][][] sumis3;
        int[] m1;
        int[][] m2;
        int[][][] m3;
        int opcion, save, dell, merenges;
        int rm1, rm2, rm3, p;

        do {
            System.out.println("           MENU PRINCIPAL         ");
            System.out.println("1. sumar 1 areglo de una dimension");
            System.out.println("2. sumar 2 areglo de una dimension");
            System.out.println("3. sumar 3 areglo de una dimension");
            System.out.println("4. Multipliacion de arreglos      ");
            System.out.println("5. Suma de matrizes                ");
            System.out.println("6. Salir                          ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Arreglo de una dimencion");
                    System.out.println("1 numero de elementos?");
                    int tama = leer.nextInt();
                    uni = tipo.CrearArreglo(tama);
                    tipo.llenarArreglo(uni);
                    save = tipo.sumarArreglo(uni);
                    System.out.println("Su arreglo Unidimensonal es: " + save);
                    break;
                case 2:
                    System.out.println("Arreglo de dos dimenciones");
                    System.out.println("1 numero de filas?");
                    int tamas = leer.nextInt();
                    System.out.println("2 numero de columnas?");
                    int fog = leer.nextInt();
                    bidi = tipo.CrearArreglo(tamas, fog);
                    tipo.llenarArreglo(bidi);
                    dell = tipo.sumarArreglo(bidi);
                    System.out.println("Su arreglo Bidimensional es: " + dell);

                    break;

                case 3:
                    System.out.println("Arreglo multidimencional");
                    System.out.println("1 numero de profundiad? ");
                    int tamaw = leer.nextInt();
                    System.out.println("2 numero de filas? ");
                    int gigo = leer.nextInt();
                    System.out.println("3 numero de columnas? ");
                    int bno = leer.nextInt();
                    multi = tipo.CrearArreglo(tamaw, gigo, bno);
                    tipo.llenarArreglo(multi);
                    merenges = tipo.sumarArreglo(multi);
                    System.out.println("Su arreglo multidimencional es: " + merenges);

                    break;
                case 4:
                    System.out.println("              MENU            ");
                    System.out.println("1. Multiplicacion unidimencional");
                    System.out.println("2. Multiplicacion bidimencional");
                    System.out.println("3. Multiplicacion multidimencional");
                    int oti = leer.nextInt();

                    switch (oti) {
                        case 1:
                            System.out.println("1. Multiplicacion de arreglos de una dimencion");
                            System.out.println("Cuantos elementos?");
                            rm1 = leer.nextInt();
                            System.out.println("1er arreglo");
                            m1 = tipo.CrearArreglo(rm1);
                            m1 = tipo.llenarArreglo(m1);
                            System.out.println("2do arreglo ");
                            sumis1 = tipo.CrearArreglo(rm1);
                            sumis1 = tipo.llenarArreglo(sumis1);

                            tipo.imprimir(sumis1);
                            System.out.println("");
                            uni = tipo.MultiplicarrMatriz(m1, sumis1);
                            tipo.imprimir(uni);
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("2. Multiplicacion dos dimenciones ");
                            System.out.println("Numero de flas");
                            rm1 = leer.nextInt();
                            System.out.println("Numero de columnas");
                            rm2 = leer.nextInt();
                            System.out.println("1er arreglo");
                            bidi = tipo.CrearArreglo(rm1, rm2);
                            bidi = tipo.llenarArreglo(bidi);
                            tipo.imprimir(bidi);
                            System.out.println("2do arreglo");
                            sumis2 = tipo.CrearArreglo(rm1, rm2);
                            sumis2 = tipo.llenarArreglo(sumis2);
                            tipo.imprimir(sumis2);
                            System.out.println();
                            m2 = tipo.MultiplicarrMatriz(bidi, sumis2);
                            tipo.imprimir(m2);
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println(". Multiplicacion de tres dimenciones");
                            System.out.println("1 Numero de profundidad? ");
                            p = leer.nextInt();
                            System.out.println("2 Numero de filas? ");
                            rm1 = leer.nextInt();
                            System.out.println("3 Numero de columnas?");
                            rm3 = leer.nextInt();
                            System.out.println("1er arreglo");
                            multi = tipo.CrearArreglo(p, rm1, rm3);
                            multi = tipo.llenarArreglo(multi);
                            tipo.imprimir(multi);
                            System.out.println("2do areglo");
                            sumis3 = tipo.CrearArreglo(p, rm1, rm3);
                            sumis3 = tipo.llenarArreglo(sumis3);
                            tipo.imprimir(sumis3);
                            System.out.println();
                            m3 = tipo.MultipliacarrMatriz(multi, sumis3);
                            tipo.imprimir(m3);
                            System.out.println();

                            break;
                    }

                    break;
                case 5:
                    System.out.println("                     MENU                     ");
                    System.out.println("1.Sumar matriz de dos dimenciones unidimensional");
                    System.out.println("2.Sumar matriz de dos dimenciones bidimensional");
                    System.out.println("3.Sumar matriz de dos dimenciones multidimencional");
                    opcion = leer.nextInt();
                    switch (opcion) {

                        case 1:
                            System.out.println("Sumar Matriz de dos dimenciones unidimensional");
                            System.out.println("Numero de elementos");
                            rm1 = leer.nextInt();
                            System.out.println("1er areglo");
                            uni = tipo.CrearArreglo(rm1);
                            uni = tipo.llenarArreglo(uni);
                            tipo.imprimir(uni);

                            System.out.println("2do areglo");
                            sumis1 = tipo.CrearArreglo(rm1);
                            sumis1 = tipo.llenarArreglo(sumis1);
                            tipo.imprimir(sumis1);
                            System.out.println("");

                            m1 = tipo.SumarMatriz(uni, sumis1);
                            tipo.imprimir(m1);
                            System.out.println("");

                            break;

                        case 2:
                            System.out.println("Sumar matriz de dos dimenciones bidimensional");
                            System.out.println("Numero de Filas? ");
                            rm2 = leer.nextInt();
                            System.out.println("Numero de Columnas? ");
                            rm3 = leer.nextInt();

                            System.out.println("1er arreglo");
                            bidi = tipo.CrearArreglo(rm2, rm3);
                            bidi = tipo.llenarArreglo(bidi);
                            tipo.imprimir(bidi);

                            System.out.println("2do arreglo");
                            sumis2 = tipo.CrearArreglo(rm2, rm3);
                            sumis2 = tipo.llenarArreglo(sumis2);
                            tipo.imprimir(sumis2);
                            System.out.println();

                            m2 = tipo.SumarMatriz(bidi, sumis2);
                            tipo.imprimir(m2);
                            System.out.println();

                            break;


                        case 3:
                            System.out.println("Sumar matriz de dos dimenciones multidimencional");
                            System.out.println("1 Numero de profundidad? ");
                            rm1=leer.nextInt();
                            System.out.println("2 Numero de filas? ");
                            rm2=leer.nextInt();
                            System.out.println("3 Numero de Columnas? ");
                            rm3=leer.nextInt();

                            System.out.println("1er arreglo");
                            multi=tipo.CrearArreglo(rm1,rm2,rm3);
                            multi=tipo.llenarArreglo(multi);
                            tipo.imprimir(multi);

                            System.out.println("2do arreglo");
                            sumis3=tipo.CrearArreglo(rm1,rm2,rm3);
                            sumis3=tipo.llenarArreglo(sumis3);
                            tipo.imprimir(sumis3);


                            m3=tipo.SumarMatriz(multi,sumis3);
                            tipo.imprimir(m3);
                            System.out.println();

                            break;
                    }

                    break;
                case 6:
                    System.out.println("Has salido ");
                    break;

                default:
                    System.out.println("eleccion erronea");
            }
        } while (opcion != 6);
    }
}


