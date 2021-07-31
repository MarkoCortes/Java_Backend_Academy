import java.awt.font.FontRenderContext;

public class AraysMain {
    String name;

    public static void main(String[] args) {
        //DECLARACIONES
        char[] arrayCaracteres;
        char arrayVocales [];        //posición de los corchetes legal pero menos legible.
        String[] arrayCadenas;
        int[] cuponOnce;
        int[][] matriz;

        //CREACION DE UN  ARRAY
        arrayCaracteres =  new char[20];
        arrayVocales = new char[5];
        arrayCadenas = new String[3];

        //OTRA FORMA
        char[] letras = {'a','b','c','d','e'};
        String[] nombres = {"Maria", "Jose", "Alberto"};
        int[] edades = {39,29,19};

        //Crea un array de tres elementos en los que cada uno de ellos es un array.
        int [][] bidimensional = new int [3][];

        //Ahora podemos dar a cada uno de estos tres arrays dimensiones diferentes si queremos:
        bidimensional[0] = new int[2];
        bidimensional[1] = new int[3];
        bidimensional[2] = new int[2];

        Persona[] personas = new Persona[3];
        personas[0] = new Persona(nombres[0], 39);
        personas[1] = new Persona(nombres[1], 29);
        personas[2] = new Persona(nombres[2], 19);

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre() + " " + personas[i].getEdad() );
        }
        System.out.println("-----------------------------");
        Persona[] personas2 = new Persona[3];

        for (int i = 0; i <personas2.length; i++) {
            personas2[i]  = new Persona(nombres[i], edades[i]);
        }
        for (int i = 0; i < personas2.length; i++) {
            System.out.println(personas2[i].getNombre() + " " + personas2[i].getEdad() );
        }



    }
}
class Persona{
    private String nombre;
    private int edad;

    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
