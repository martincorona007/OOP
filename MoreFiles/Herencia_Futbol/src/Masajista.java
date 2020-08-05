public class Masajista extends SeleccionFutbol {

    private String Titulacion;
    private int aniosExperencia;



    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperencia) {
        super(id, nombre, apellidos, edad);
        this.Titulacion = titulacion;
        this.aniosExperencia = aniosExperencia;
    }

    public void darMasaje() {
        System.out.println("Da un masaje");
    }

}