public class Entrenador extends SeleccionFutbol {


    private String idFederacion;


    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;

    }

    public void dirijirPartido() {
        System.out.println("Dirije partido ");
    }

    public void dirijirEntrenamiento() {
        System.out.println("Dirije un entrenamiento ");
    }
}
