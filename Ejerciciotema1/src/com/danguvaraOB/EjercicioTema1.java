package com.danguvaraOB;

public class EjercicioTema1 {
    public static void main(String[] args) {
        //Tipos de datos:

        //Primitivos, no pueden ser null.
        //Números enteros
        byte number1 = 1;  //1byte
        short number2 = 2; //2byte
        int number3 = 3;   // 3byte
        long number4= 4;   // 4byte
        // int y long son los mas utilizados
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        //punto flotante o decimales:
        float decimal1= 4.9f; // la letra al final se utiliza para indicar que esu un float ao un dobule
        double decimal2 = 9.99d; //double tiene mas capacidad de decimales que float
        System.out.println(decimal1);
        System.out.println(decimal2);
        //caracter
        char caracter1 = 'a';
        System.out.println(caracter1);
        //booleanos
        boolean verdadero= true;
        boolean falso = false;
        System.out.println(verdadero);
        System.out.println(falso);

        //cadenas de texto
        String nombre = "Daniel";
        String apellido = "Guevara";
        System.out.println(nombre);
        System.out.println(apellido);
        //tipos envoltorio, empiezan por mayuscula son clases.
        // los nulos son útiles en bases de datos cuando no se tiene el dato como tal

        Integer numero = null;
        Long numero2 = 2L;
        System.out.println(numero);
        System.out.println(numero2);
    }
}
