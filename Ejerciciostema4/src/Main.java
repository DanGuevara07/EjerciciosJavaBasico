public class Main {
    public static void main(String[] args) {

        SmartDevice dispinteligente = new SmartDevice();
        SmartDevice dispinteligente2 = new SmartDevice("Huawei", "9.0","P20");
        System.out.println(dispinteligente);
        System.out.println(dispinteligente2);
        SmartPhone celular = new SmartPhone("3 inches", "8GB","64GB","Sony","10","XA1" );
        SmartWatch reloj = new SmartWatch("5cm","2 inches","rojo","apple","no aplica","watch");
        System.out.println(celular);
        System.out.println(reloj);
    }
}