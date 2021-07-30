/*
    Reglas de Declaración en el fichero fuente
        Solo puede existir una clase pública en un fichero .java
        El nombre del fichero debe coincidir con el de la clase pública.
        La sentencia package (si existe) debe ser la primera sentencia del fichero.
        Las sentencias import (si existen) deben seguir a la sentencia package y preceder a las declaraciones de clases.
        Pueden existir más clases en el fichero pero no pueden ser públicas.
        Las sentencias package e import afectarán a todas las clases declaradas en el fichero.
        El nombre de los ficheros que solo tengan declaraciones de clase no públicas no tiene que coincidir con ninguna de las clases.
 */

/*
* Modificadores de acceso

    * Existen tres modificadores de acceso: public, protected y private.
    * Sin embargo, existen cuatro niveles de acceso. Cuando no se especifica ninguno de los tres modificadores anteriores se tiene el nivel de acceso por defecto, que es el nivel de paquete.
    * Para las clases de primer nivel solo se permite:
        * public
        * nivel de paquete
    * Para atributos, métodos, clases anidadas, se permiten todos.

    * Los explicamos un poco más, desde el más restrictivo al menos restrictivo:
        * private: solo es accesible dentro de su clase.
        * no se especifica (nivel de paquete): es accesible dentro de su clase y por todas las clases de su paquete.
        * protected: es accesible dentro de su clase, por todas las clases de su paquete y por las clases hijas que estén en otro paquete diferente.
        * public: es accesible para cualquier clase Java.
*/
import java.lang.Math;
public final class ModficadoresDeAcceso {
    private ModficadoresDeAcceso(){ }
    private static int id = 10;
    public static int id2 = 10;
    public static String nombre = "marko";
    protected static int edad = 23;
}

class ModificadoresPrueba{
    public void getDatos(){
        System.out.println(ModficadoresDeAcceso.nombre);
        //no podemos acceder por que es privado y solo es accesible en la clase donde se crea
        //System.out.println(ModficadoresDeAcceso.id);
        System.out.println(ModficadoresDeAcceso.id2);
        System.out.println(ModficadoresDeAcceso.edad);
    }

}
