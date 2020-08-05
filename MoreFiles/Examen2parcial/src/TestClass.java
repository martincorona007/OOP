public class TestClass {
    public static void main(String[] args) {

        //creando autobot
        Camion c = new Camion(44, "Grande", 39683, 1, 6, 100, 30, 1899000, 4, 9);
        c.velocidad1(20, 40);
        c.rendimiento(100, 19142);
        c.velocidad(1, 20);

        System.out.println(c.toString());
        System.out.println(c.encenderMotor());
        System.out.println(c.subirPasaje());
        System.out.println(c.avanzar());
        System.out.println(c.acelerar());
        System.out.println(c.detener());
        System.out.println(c.subirPasaje());
        System.out.println(c.avanzar());
        System.out.println(c.acelerar());
        System.out.println(c.detener());
        System.out.println(c.bajarPasaje());
        System.out.println(c.apagarMotor());

        //creando helicopter
        Helicoptero h=new Helicoptero(1,"Grande",417,1,3,661,30,1000000);
        h.velocidad1(180,40);
        h.rendimiento(386,1000);
        h.velocidad(177,110);
        System.out.println(h.toString());
        System.out.println(h.iniciarRotorPrincipal());
        System.out.println(h.iniciarRotorTrasero());
        System.out.println(h.despegar());
        System.out.println(h.despegar());
        System.out.println(h.aterrizar());
        System.out.println(h.detenerRotorPrincipal());
        System.out.println(h.detenerRotorTrasero());
        //
        //creando planeador
        Planeador p=new Planeador(2,"Grande",75,75,7,61);
        System.out.println(p.toString());
        System.out.println(p.planear());
        System.out.println(p.despegar());
        System.out.println(p.despegar());
        System.out.println(p.aterrizar());
        System.out.println(p.aterrizar());

        //crenado bicicleta
        Bicicleta b=new Bicicleta(1,"Grande",120,10300,181,1,30,"Terreno",26);
        System.out.println(b.toString());
        System.out.println(b.avanzar());
        b.cambiarSprocket();
        b.cambiarSprock();
        System.out.println(b.avanzar());
        b.cambiarSprocket();
        b.cambiarSprock();
        System.out.println(b.detener());

    }
}

