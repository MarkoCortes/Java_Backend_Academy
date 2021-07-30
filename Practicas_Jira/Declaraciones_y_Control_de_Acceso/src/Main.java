public class Main {
    /*
    * Palabras clave en Java
    * Son palabras reservadas aquellas que tienen un significado especial para el compilador de Java.
    * Se suelen mostrar en un cuadro alfabéticamente pero creo que es más fácil recordarlas agrupandolas por categorías.

        * Tipos de datos (10) : byte, short, int, long, float, double, boolean, char, enum, void
        * Flujo de datos (11)  : if, else, for, do, while, switch, case, break, default, continue, return
        * Excepciones(6) : try, catch, finally, throw, throws, assert
        * Operador(1) : instanceof
        * NoUso(2) : const, goto
        * Objetos(9) : package, import, class, interface,extends, implements, new, this, super
        * Modificadores(11)   : abstract, final, static, private, protected, public, strictfp, synchronized, transient, volatile, native
        *
        *
    * */

    /*
        * Paquetes: en minúsculas (transporte.objetos, utiles.factura)

        * Clases e Interfaces: la primera letra en Mayúscula (FacturaElectronica, Facturable)

        * Métodos: combinaciones verbo-nombre en camelCase. (getCliente, setAltura, sumarAsientos)

        * Variables: nombres en camelCase. (nuevoCliente, saldoMedioInteranual)

        * Constantes: en Mayúsculas y si hay que separar usar el subrayado “_” (IPC, TOTAL_NOMINA)

        * Estructuras de control: cuando las sentencias forman parte de una estructura de control de flujo,
          escribirlas entre llaves, aunque sean sentencias sencillas.

        * Espacios: solo debe colocarse una sentencia por línea y utilizar sangrías de dos o cuatro espacios para facilitar la lectura.

        * Comentarios: utilizar comentarios para explicar segmentos de código no obvios.
        *
        * JavaBeans: son clases de Java que tienen sus atributos privados.
        Los métodos para obtener estos atributos se denominan getters y los métodos para establecer estos atributos setters.
        (getLongitud(), getFechaNacimiento(), isEncendido(), setLongitud(l), setFechaNacimiento(fecha), setEncendido(true))*/

    static int x;
    int b;
    public static void main(String[] args) {
        // EJEMPLOS VALIDOS
        String nombreUsuario  = "Marko";
        String codInterno = "102030";
        String _talla = "XLL";
        int $sumaNumeros = 100;
        int $105 = 105;
        int thisvar = 10;
        String miVariable = "compila";

        // EJEMPLOS NO VALIDOS

        /*

        String 20Codigo = "Carlos";
        String #clienteNuevo = "1391923";
        String _talla-max = "XXL";
        int this = 10;
        String mi.Variable = "compila";

        */


        int x = 30;
        int i = 0;
        int reps = x + x;
        System.out.println(reps);
    }
}
