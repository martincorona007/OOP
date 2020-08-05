public class body_lavadora {

    String marca;
    String color;
    int precio;
    int kilos;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        System.out.println("The mark is:  "+marca);
        this.marca = marca;
    }

    public String getColor(String rojo) {
        return color;
    }

    public void setColor(String color) {
        System.out.println("The color is: "+color);
        this.color = color;
    }

    public int getPrecio() {

        return precio;
    }

    public void setPrecio(int precio) {
        System.out.println("The price is: "+precio);
        this.precio = precio;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        System.out.println("The kilos are:"+kilos);
        this.kilos = kilos;
    }

}
