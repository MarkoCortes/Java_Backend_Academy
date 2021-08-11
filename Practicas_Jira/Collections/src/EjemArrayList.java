import java.util.*;
public class EjemArrayList{
    // SE IMPLEMENTA DE LA INTERFAZ LIST
    //EN LIST LOS ELEMENTOS ESTAN REFERIDOS A UN INDICE
    //SE PERMITEN DUPLICADOS

    // ARRAYLIST ES DINAMICO Y CRECE CUANDO LO NECESTIA
    // RAPIDA ITERACION Y ACCESO
    public static void main (String[] args){
        ArrayList nombres = new ArrayList();
        System.out.println("Elementos al inicio: " + nombres.size());
        nombres.add("Ana");
        nombres.add("Bea");
        nombres.add("Dalia");
        nombres.add("Pedro");
        nombres.add("Bea");  //comprobar que admite duplicados

        System.out.println("Contenido: " + nombres);
        System.out.println("Elementos: " + nombres.size());
        System.out.println(nombres.contains("Ana"));

        nombres.remove("Ana"); //eliminamos un elemento

        System.out.println("Contenido: " + nombres);
        System.out.println("Elementos: " + nombres.size());
        System.out.println(nombres.contains("Ana"));

        nombres.add(3, "Ana"); //Añadir en posicion x
        System.out.println("Contenido: " + nombres);

        System.out.println("SubLista(1,4):" + nombres.subList(1,4));
    }
}