/* Esta es la clase principal */
public class Main {
    public static void main(String[] args) {
        /* aquí se explica el tipo de dato INT entero */
        System.out.println("Hello world!");
        // así se comenta una linea sin que se ejecute
        // hay 4 tipos de datos: enteros, decimales, caracteres y boleanos
        // nomenclatura siempre empieza con minúscula BP (Best Practice)
        // mas de dos palabras primerApellido nombreDeLaMascota
        // Tipo de dato y nombre de la variable

        //Para ENTEROS
        int edad;
        edad = 20;
        System.out.println(edad + "años tengo.");

        int anioDeNacimiento = 1900;
        System.out.println("Mi anio de Nacimiento es "+ anioDeNacimiento);

        edad = 30;
        System.out.println("My edad es "+ edad);

        int mes, anio, dia;
        mes=1;
        anio=2024;
        dia=26;

        long enteroLargo = 1234564667;
        short mesShort = 12;
        byte bitDia = 12;

        // Caracteres, se ponen con comillas simples ' '
        char femenino = 'f';
        char masculino = 'm';
        System.out.println("Géneros " + femenino + masculino);

        //boolean: verdadero o falso
        boolean verdadero = true;
        boolean falso = false;

        //decimales
        double dinero = 123123123.123; // números grandes
        float estatura = 1.50f; // número decimal

    }
}