public abstract class Motorizado extends Vehiculo {
    public int numeroMotores;
    public int caballosPoder;
    public float kilometrosRecorridos;
    public int minutosRecorrido;
    public float m1dineroGastado;

    public Motorizado(int capacidadPersonas, String tamanio, float capacidad, int numeroMotores, int caballosPoder, float kilometrosRecorridos, int minutosRecorrido, float m1dineroGastado) {
        super(capacidadPersonas, tamanio, capacidad);
        this.numeroMotores = numeroMotores;
        this.caballosPoder = caballosPoder;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.minutosRecorrido = minutosRecorrido;
        this.m1dineroGastado = m1dineroGastado;
    }

    public String encenderMotor(){
        return "Encender Motor";
    }
    public String acelerar(){
        return "Acelerar";
    }
    public String apagarMotor(){
        return "Apagar motor\n";
    }
    //metodos abstractos
    public abstract float velocidad1(float distancia, float tiempo);
    public abstract float rendimiento(float kilometrosRecorridos,int dineroGastado);
    public abstract float velocidad(int kilometrosRecorridos, int minutosRecorrido);


}