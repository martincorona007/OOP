/**
 * Created by Administrador on 16/02/2017.
 */
public class numeroPerfecto {

    public int sumarDivisor(int n) {
        int suma = 0;
        for (int divisor = 1; divisor < n; divisor++) {
            if (n % divisor == 0) {
                suma += divisor;
            }
        }
        return suma;
    }

    public boolean calcularPerfecto(int num) {
        if (sumarDivisor(num) == num) {
            return true;
        } else {
            return false;
        }
    }

    public boolean calcularAmigos(int n1, int n2) {

        if (sumarDivisor(n1) == n2) {
            return true;
        } else {
            return false;
        }

    }

    public int calcular(int x, int y) {
        return x + y;
    }

    public float calcular(int x, int y) {
        return x / y;
    }

    public double calcular(int x) {
        double factorial;
        int aux;
        double facaux = 0;

        for (x; x > 0; x--) {
            for (aux = x - 1; aux > 0; aux--) {

                factorial = x * aux;
                if (facaux == 0) {
                    facaux = factorial;
                }
                if (facaux != 0) {
                    facaux = factorial * facaux;
                }
            }
        }
        return facaux;
    }
    public boolean calcular(int x, int y){
        if
    }
}

