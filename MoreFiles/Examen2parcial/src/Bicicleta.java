public class Bicicleta extends NoMotorizado {
    public int numeroCambio;
    public String tipoBicicleta;
    public int rodado;

    //metodo
    public void cambiarSprocket() {
        System.out.println("Cambiando Sproket");
    }

    //metodo
    public void cambiarSprock() {
        System.out.println("Cambiando Sprock");
    }

    //contructor
    public Bicicleta(int capacidadPersonas, String tamanio, float capacidadPeso, int peso, int alto, int ancho, int numeroCambio, String tipoBicicleta, int rodado) {
        super(capacidadPersonas, tamanio, capacidadPeso, peso, alto, ancho);
        this.numeroCambio = numeroCambio;
        this.tipoBicicleta = tipoBicicleta;
        this.rodado = rodado;
    }

    @Override
    public String toString() {
        return "\n\tBicicleta: \n Capacidad De Personas: " + capacidadPersonas + "\n Tamanio: " + tamanio + "\n Capacidad de Peso: " + capacidadPeso +
                "\n Peso: " + peso + "\n Alto: " + alto + "\n Ancho: " + ancho + "\n Numero de Cambio: " + numeroCambio + "\n Tipo de Bicicleta: " + tipoBicicleta + "\n Rodado: " + rodado + "\n";

    }
}
