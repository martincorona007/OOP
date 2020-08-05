public class Camion extends Motorizado {
    public int numeroEjes;
    public int numeroVentanas;
    public float distancia;
    public float tiempo;
    public float mrkilometrosRecorridos;
    // public float m1dineroGastado;
    public float m2dineroGastado;
    public int mvkilometrosRecorridos;
    public int mvminutosRecorrido;

    //metodos
    public String subirPasaje() {
        return "Subir pasaje";
    }

    public String bajarPasaje() {
        return "bajarPasaje";
    }
    //constructor

    public Camion(int capacidadPersonas, String tamanio, float capacidadPeso, int numeroMotores, int caballosPoder, float kilometrosRecorridos, int minutosRecorrido, float m1dineroGastado, int numeroEjes, int numeroVentanas) {
        super(capacidadPersonas, tamanio, capacidadPeso, numeroMotores, caballosPoder, kilometrosRecorridos, minutosRecorrido, m1dineroGastado);
        this.numeroEjes = numeroEjes;
        this.numeroVentanas = numeroVentanas;
    }


    public float velocidad1(float distancia, float tiempo) {
        this.distancia = distancia;
        this.tiempo = tiempo;
        return 0;
    }

    @Override
    public float rendimiento(float kilometrosRecorridos, int dineroGastado) {
        this.mrkilometrosRecorridos = kilometrosRecorridos;
        this.m2dineroGastado = dineroGastado;
        return 0;
    }

    @Override
    public float velocidad(int kilometrosRecorridos, int minutosRecorrido) {
        this.mvkilometrosRecorridos = kilometrosRecorridos;
        this.mvminutosRecorrido = minutosRecorrido;
        return 0;
    }


    //imprime
    @Override
    public String toString() {
        return "\tCamion\nVehiculo: \n Capacidad de Personas: " + capacidadPersonas + "\n Tamanio: " + tamanio + "\n Capacidad de Peso: " + capacidadPeso +
                "\nMotorizado: \n Numero de Motores: " + numeroMotores + "\n Caballos Poder: " + caballosPoder + "\n Kilometros Recorridos: " + kilometrosRecorridos +
                " km\n Minutos Recorridos: " + minutosRecorrido + "\n Dinero Gastado: " + m1dineroGastado + "\nVelocidad1 \n Distancia: " + distancia + "\n Tiempo: " + tiempo +
                "\nRendimiento\n Kilometros Recorridos: " + mrkilometrosRecorridos + " km\n Dinero Gastado: " + m2dineroGastado + "\nVelocidad: \n Kilometros Recorridos: " + mvkilometrosRecorridos +
                " km\n Minutos Recorrido: " + mvminutosRecorrido + "\n Numero Ejes: " + numeroEjes + "\n Numero Ventanas: " + numeroVentanas+"\n";
    }
}
