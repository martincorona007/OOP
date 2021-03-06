public class Helicoptero extends Motorizado implements Volador {
    public float distancia;
    public float tiempo;
    public float mrkilometrosRecorridos;
    // public float m1dineroGastado;
    public float m2dineroGastado;
    public int mvkilometrosRecorridos;
    public int mvminutosRecorrido;
    public Helicoptero(int capacidadPersonas, String tamanio, float capacidadPeso, int numeroMotores, int caballosPoder, float kilometrosRecorridos, int minutosRecorrido, float m1dineroGastado) {
        super(capacidadPersonas, tamanio, capacidadPeso, numeroMotores, caballosPoder, kilometrosRecorridos, minutosRecorrido, m1dineroGastado);
    }
    //metodos de volador
    @Override
    public String despegar() {
        return "Despegando";
    }

    @Override
    public String aterrizar() {
        return"Aterrizando";
    }
    //metodo abstracto de motorizado
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
    //metodos de helicoptero
    public String iniciarRotorPrincipal() {
        return "Inicidando Rotor Principal";
    }
    public String iniciarRotorTrasero() {
        return "Iniciando Rotor Trasero";
    }
    public String detenerRotorPrincipal() {
        return "Apagando Rotor Principal";
    }
    public String detenerRotorTrasero() {
        return "Apagando Rotor Trasero\n";
    }

    //imprime
    @Override
    public String toString() {
        return "\tHelicoptero\nVehiculo: \n Capacidad de Personas: " + capacidadPersonas + "\n Tamanio: " + tamanio + "\n Capacidad de Peso: " + capacidadPeso +
                "\nMotorizado: \n Numero de Motores: " + numeroMotores + "\n Caballos Poder: " + caballosPoder + "\n Kilometros Recorridos: " + kilometrosRecorridos +
                " km\n Minutos Recorridos: " + minutosRecorrido + "\n Dinero Gastado: " + m1dineroGastado + "\nVelocidad1 \n Distancia: " + distancia + "\n Tiempo: " + tiempo +
                "\nRendimiento\n Kilometros Recorridos: " + mrkilometrosRecorridos + " " +
                "." +
                "km\n Dinero Gastado: " + m2dineroGastado + "\nVelocidad: \n Kilometros Recorridos: " + mvkilometrosRecorridos +
                " km\n Minutos Recorrido: " + mvminutosRecorrido+"\n";
    }
}
