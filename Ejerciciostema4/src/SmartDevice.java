public class SmartDevice {
    String marca;
    String versionAndroid;
    String modelo;
    public SmartDevice(){}
    public SmartDevice(String marca, String versionAndroid, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.versionAndroid=versionAndroid;

    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", versionAndroid='" + versionAndroid + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
