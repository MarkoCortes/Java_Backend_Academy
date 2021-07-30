public class Main {
    /*
    * Operadores
        * Los operadores son símbolos especiales que producen un nuevo valor a partir de uno o varios operandos.
        * Los valores producidos son, en la mayoría de los casos, booleanos o numéricos.

*/
    public static void main(String[] args) {
        //OPERADORES COMPUETOS
       int x1 = 10;
        /*
        int x = 0 , y = 0, z = 0;
        double w = 10 ;
        x += 10; //sería igual a  x = x + 10;
        y -= 50; //sería igual a  y = y - 50;
        z *= 7;  // equivale a  z = z * 7;
        w /= 100; // equivale a w = w/100;
        */

        x1 *= 3 + 5; //sería equilvalente a x *= (3+5), es decir x = x * (3 + 5)  y no x = (x * 3) + 5.
        System.out.println(x1);
        System.out.printf("--------------------");
        boolean resultado;
        int x = 200;
        if (x<=100)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        System.out.println("Resultado: " +resultado);

        System.out.println("------------------------");
        int a = 100;
        char b = 'b';
        boolean res = true;

        char[] letras1 = {'a','b','c','d'};
        char[] letras2 = {'a','b','c','d'};

        if (a == 100L)
        { System.out.println("100 y 100L, Iguales");}

        if (res != (b<a))
        { System.out.println("res distinto a (b>;a)");}

        if (letras1 == letras2) //Imprime distinto aunque ambos tengan el mismo contenido.
        { System.out.println("Iguales");} //porque cada referencia apunta a un obj distinto.
        else
        { System.out.println("Distintos");}

        letras2 = letras1; //hacemos que letras2 apunte a letras1

        if (letras1 == letras2) //Imprimirá iguales porque ahora
        { System.out.println("Iguales");} //apuntan al mismo objeto.
        else
        { System.out.println("Distintos");}
    }
}

