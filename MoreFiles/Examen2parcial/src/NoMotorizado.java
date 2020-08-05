public class NoMotorizado extends Vehiculo {
    public int peso;
    public int alto;
    public int ancho;

    public NoMotorizado(int capacidadPersonas, String tamanio, float capacidadPeso, int peso, int alto, int ancho) {
        super(capacidadPersonas, tamanio, capacidadPeso);
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
    }
}
