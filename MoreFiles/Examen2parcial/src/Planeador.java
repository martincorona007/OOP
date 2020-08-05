public class Planeador extends NoMotorizado implements Volador {
    //constructor
    public Planeador(int capacidadPersonas, String tamanio, float capacidadPeso, int peso, int alto, int ancho) {
        super(capacidadPersonas, tamanio, capacidadPeso, peso, alto, ancho);
    }
    //metodos
    public String planear(){
        return "Planeador";
    }
    //toString
    public String toString(){
        return "\n\tPlaneador: \n Capacidad de personas: "+capacidadPersonas+"\n Tamanio: "+tamanio+"\n Capacidad de peso: "+capacidadPeso+
                "\n Peso: "+peso+"\n Alto: "+alto+"\n Ancho: "+ancho+"\n ";
    }

    //metodos de volador
    @Override
    public String despegar() {
        return "Despegando";
    }

    @Override
    public String aterrizar() {
        return "Aterrizando";
    }

}