public class Main {
    public static void main(String[] args) {
        String [] cadenas = new String[]{"cadena1", "cadena2","cadena3"};
        String concatenada="";
        for(String cadena :cadenas){
            concatenada= concatenada.concat(cadena+" ");
        }
        System.out.println(concatenada);
    }
}