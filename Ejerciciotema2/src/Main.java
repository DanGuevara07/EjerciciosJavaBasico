import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduzca un precio");
        double precio = scanner.nextDouble();
        System.out.println("Introduzca el valor del iva");
        double iva = scanner.nextDouble();
        System.out.println("El precio del producto con iva es de: " +precioConIva(precio,iva) );



    }
    static double precioConIva(double precio, double iva){
        return precio*(1+iva);
    }
}