import java.util.Scanner;

/**
 * Created by Martincorona007 on 21/02/2017.
 */
public class AdivinaElNumero {
  private Scanner entrada=new Scanner(System.in);
  private boolean juegoActivo=true;

    public void jugar() {
        System.out.print("HI, whats your name?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Welcome %s, we going to start\n", nombreJugador);


        while (juegoActivo) {
            int intentos = 0;
            int min = 0;
            int max = 100;
            int numeroJuego = (int) (Math.random() * ((max - min) + 1));
            int numeroJugador;


//               System.out.println(numeroJuego);
                System.out.printf("%s,choose a number among %d and %d, and guess", nombreJugador, min, max);
            do {

                System.out.println("choose a number");
                numeroJugador = entrada.nextInt();
                if (numeroJuego < numeroJugador) {
                    System.out.println("Very high,guess again ");
                } else if (numeroJuego > numeroJugador) {
                    System.out.println("Very low, guess again");
                }

                intentos++;
            } while (numeroJuego!=numeroJugador);
            System.out.printf("YOU WIN, intentos%d",intentos);

            juegoActivo = false;


        }
    }


    }


