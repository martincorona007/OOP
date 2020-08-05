public class Vehiculo  {
    public int capacidadPersonas;
    public String tamanio;
    public float capacidadPeso;


    public  String avanzar(){
        return "Vehiculo avanzando";
    }
    public String detener(){
        return "Vehiculo detenido";
    }

    public Vehiculo(int capacidadPersonas, String tamanio, float capacidad) {
        this.capacidadPersonas = capacidadPersonas;
        this.tamanio = tamanio;
        this.capacidadPeso = capacidad;
    }

}
