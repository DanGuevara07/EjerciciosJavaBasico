public class SmartPhone extends SmartDevice{
    String tamano;
    String memoriaRam;
    String almacenamiento;

    public SmartPhone(){}
    public SmartPhone(String tamano, String memoriaRam,
                      String almacenamiento, String marca,
                      String versionAndroid, String modelo){
        super(marca, versionAndroid, modelo);
        this.tamano = tamano;
        this.memoriaRam =memoriaRam;
        this.almacenamiento=almacenamiento;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tamano='" + tamano + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", marca='" + marca + '\'' +
                ", versionAndroid='" + versionAndroid + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
