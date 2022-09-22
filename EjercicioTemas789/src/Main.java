import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //parte 1 reversador de cadenas
        System.out.println("Reversador de cadenas");
        String cadena = reverse("hola mundo");
        System.out.println(cadena);
        System.out.println("****************************");
        //1. Crea un array unidimensional de Strings y recórrelo, mostrando
        //únicamente sus valores
        System.out.println("1. Creando array y mostrando sus valores");
        String array1[] = {"Hola", "me", "llamo", "pepe"};
        for (String cad: array1){
            System.out.println(cad);
        }
        System.out.println("****************************");
        /*2.Crea un array bidimensional de enteros y recoórrelo
            mostrando la posicíón y el valor de cada elemento en ambas
            dimensiones
         */
        System.out.println("2. Arreglo bidimensional de enteros");
        int arraybidi[][] = new int[3][3];
        arraybidi[0][0] = 9;
        arraybidi[0][1] = 8;
        arraybidi[0][2] = 7;
        arraybidi[1][0] = 6;
        arraybidi[1][1] = 5;
        arraybidi[1][2] = 4;
        arraybidi[2][0] = 3;
        arraybidi[2][1] = 2;
        arraybidi[2][2] = 1;
        for (int i=0; i<arraybidi.length; i++){
            for(int j=0; j<arraybidi[0].length;j++){
                System.out.println("Posicion ["+i+", "+j+"] valor: "+arraybidi[i][j]);
            }
        }
        System.out.println("****************************");
        /*3.Crea un Vector del tipo de dato que prefieras y añadele 5
            Elementos. Elimina el 2do y 3er elemento y muestra el resultado
            final
         */
        System.out.println("3. Crear Vector");
        Vector<String> vector1 = new Vector<>();
        vector1.add("Saludos");
        vector1.add("para");
        vector1.add("OpenBootCamp");
        vector1.add("La mejor");
        vector1.add("Plataforma de educacion online");
        System.out.println(vector1);
        vector1.remove(1);
        vector1.remove(2);
        System.out.println(vector1);
        System.out.println("****************************");
        /*4. Indica cual es el problema de utilizar un vector
             con la capacidad por defecto si tuviesemos 1000 elementos
             para ser añadidos al mismo
         */
        /*Alto consumo de recursos porque cada que sobrepase el limite
        se necesita hacer operacion de copia por debajo.

         */
        Vector<Integer> vector2 = new Vector<>();
        for (int i=0; i<1000; i++){
            vector2.add(i+1);
        }
        System.out.println(vector2);
        System.out.println("****************************");
        /* 5.Crea un ArrayList de tipo String, con 4 elementos. Cópialo
               en una LinkedList. Recorre ambos mostrando únicamente el valor
               de cada elemnto

         */
        System.out.println("4. ArrayLisy y LinkedList");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Buenas");
        arrayList1.add("Tardes");
        arrayList1.add("Cómo");
        arrayList1.add("Estás");
        LinkedList<String> linkedList1 = new LinkedList<>(arrayList1);
        System.out.println("ArrayList: "+arrayList1);
        System.out.println("LinkedList: "+linkedList1);
        System.out.println("****************************");
        /* 6.Crea un ArrayList de tipo int, y utilizando un bulce
             rellénalo con elementos del 1 al 10. A continuación, con otro
             bucle, recórrelo y elimina los números pares. Por último
             vuelve a recorrerlo y muestra el ArrayList final. Si te
             atreves puedes hacerlo en menos pasos, siempre y cuando cumplas
             el primer "for" de relleno
         */
        System.out.println("5. ArrayList parte 2");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(int i=1; i<=10; i++){
            arrayList2.add(i);
        }
        System.out.println("ArrayList llenado: "+arrayList2);
        int contador = 0;
        while(contador<arrayList2.size()){
            if(arrayList2.get(contador) % 2 == 0){
                arrayList2.remove(contador);
                continue;
            }
            contador++;

        }
        System.out.println("ArrayList sin pares: "+arrayList2);
        System.out.println("****************************");
        /* 7. Crea una función DividePorCero, Esta, debe generar una
        Excepcion("throws") a su llamante del tipo ArithmeticException
        que será capturada por su llamante desde "main". Si se dispara la
        excepcion, mostraremos el mensaje "Esto no puede hacerse".
        Finalmente, mostraremos en cualquier caso: "Demo de código"
         */
        System.out.println("7. Generando Excepcion");
        try{
            DividePorCero(4,0);
        }catch(ArithmeticException e){
            System.out.println("Se ha generado una excepcion de tipo: "+ e.getClass());
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
        System.out.println("****************************");
        /*8.Utilizando InputStream y PrintStream, crea una función que reciba dos
        parametros: "fileIn" y "fielOut". La tarea de la función será realizar la
        copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
         */
        System.out.println("8. Copiando fichero a otro fichero");
        CopiarFichero("misdatos.txt","datossalida.txt");




    }
    //reversador de cadenas
    public static String reverse(String texto) {
        String reversada = "";
        for(int i=0; i<texto.length(); i++){
            reversada += (texto.charAt(texto.length()-1-i));
        }
        return reversada;
    }
    public static int DividePorCero(int a, int b) throws ArithmeticException{
        int resultado;
        try{
            resultado = a / b;
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
    public static void CopiarFichero(String fileIn, String fileOut){
        try{
            InputStream in = new FileInputStream(fileIn);
            byte[]datos = in.readAllBytes();
            in.close();//cerrando los ficheros
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();//cerrar ficheros, buenas prácticas
        }catch(Exception e){
            System.out.println("Excepcion: "+ e.getMessage());
        }
    }
}