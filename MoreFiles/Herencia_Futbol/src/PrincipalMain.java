import java.util.ArrayList;

//extends Masajista
public class PrincipalMain {
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior derecho");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
        //concetrandose
        System.out.println("Todos los integrantes comianzan una concentracion.(Todos ejecutan el mismo metodo):");
        for (SeleccionFutbol integrante: integrantes){
            System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.Concentrarse();
        }
        //viajesillo
        System.out.println("\nTodos los integrantes viajan para jugar un partido.(Todos ejecutan el mismo metodo):");
        for (SeleccionFutbol integrante: integrantes){
            System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.Viajar();
        }
        //entrenamientillo
        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirijirEntrenamiento();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.entrenar();

        //masajillo
        System.out.println("\nMasaje: Solo el masajist tiene el metodo para dar un masaje:");
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");
        raulMartinez.darMasaje();

        //partidillo de futbol
        System.out.println("\nPartido de Futbol: Solamente el entrenador y el futbolista tiene metodos para el partido de futbol: ");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirijirPartido();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+"-> ");
        iniesta.jugarPartido();
    }
}
