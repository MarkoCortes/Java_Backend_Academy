/*
* La operación de asignación nos sirve para dar valor a una variable.
* La forma genérica de una asignación es la siguiente:
    * variable = valor;
* Donde valor puede ser un literal, otra variable o una expresión.
* Enteros
    Se pueden representar utilizando una notación decimal, octal o hexadecimal.
    15        formato decimal.
    017      formato octal, el prefijo 0 indica un valor octal.
    0xF     formato hexadecimal, el prefijo 0x indica un valor hexadecimal.

    Un literal entero se considera por defecto de tipo int. Para indicar que queremos que sea de tipo long debemos acompañarlo de ‘l’ o ‘L’. Algunos literales enteros: 15, 320, 29999, 130000, 250L.

    Reales
    Un literal real se considera por defecto de tipo double. Para indicar que queremos que sea de tipo float debemos acompañarlo de ‘f’ o ‘F’. Algunos literales reales en coma flotante: 3.4, 1293.239, 150.23F.

    Carácter
    Un literal char se escribe entre comillas simples. Como son carácteres Unicode también se puede especificar el carácter en concreto por sus dígitos hexadecimales.
    Algunos literales char: ‘b’, ‘z’, ‘\n’, ‘\t’, ‘\u003B’
*
* */
public class Main {

    public static void main(String[] args) {
        //Conversión Implícita (Widening)
        //Grande = Pequeño; //OK
        long l = 100;  //100 al ser un literal entero, es de tipo int.

        //Conversión Explícita (Cast)
        //Pequeño = Grande; //ERROR
        // int a = 100L; //ERROR 100L es un literal de tipo long y se quiere asignar a una variable int.
        int a = (int) 100L; // OK
        metodo01();
        metodo02();
        byte primero = 5;
        byte segundo = 20;
        byte suma = (byte) (primero + segundo); //La suma de dos bytes es un int, por lo tanto necesita
//un casting a byte.

    }
    static void metodo01(){
        //grande = pequeño;  //OK
        int a = 150;  //Declaramos un entero
        long var = a; //La variable a se puede asignar al long var, ya que vamos de pequeño a grande.
        double b = 15.3f * var;
    }
    static void metodo02(){
        //pequeño = grande; //ERROR
        //pequeño = (pequeño) grande; //OK
        long grande = 5500L;
        int pequeño = (int) grande; //Es necesario hacer un casting a int.

    }
}
