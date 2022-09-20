public class SmartWatch extends SmartDevice{
    String ancho;
    String tamanopantalla;
    String color;

    public SmartWatch(){}
    public SmartWatch(String ancho, String tamanopantalla,
                      String color, String marca,
                      String versionAndroid, String modelo){
        super(marca, versionAndroid, modelo);
        this.ancho = ancho;
        this.tamanopantalla =tamanopantalla;
        this.color=color;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ancho='" + ancho + '\'' +
                ", tamanopantalla='" + tamanopantalla + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", versionAndroid='" + versionAndroid + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
