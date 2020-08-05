public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demorcacion;



    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demorcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demorcacion = demorcacion;
    }

    public void jugarPartido() {
        System.out.println("juega partido");
    }

    public void entrenar() {
        System.out.println("Entrena");
    }


}