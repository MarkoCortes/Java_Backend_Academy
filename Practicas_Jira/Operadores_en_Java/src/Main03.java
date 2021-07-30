public class Main03 {
    public static void main(String[] args) {
        int dividendo = 15;
        int divisor = 2;
        int resto = dividendo % divisor;
        System.out.println("Resto: " + resto);
        System.out.println("--------------------------");
        int a = 10;
        int b = 10;
        System.out.println("a++: " + a++); //1º Evalua con a y luego la incrementa.
        System.out.println("++b: " + ++b); //1º Incrementa y luego evalua con el nuevo valor.

        System.out.println(a); //Comprobamos que el valor se ha incrementado.
        System.out.println(b); //Comprobamos que el valor se ha incrementado.
        System.out.println("---------------------------------");
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
        System.out.println("_-------------------------------------");
        a = 0; //Valores para operadores &, |
        b = 5;
        int c = 0; //Valores para operadores perezosos &&, ||
        int d = 5;

        if ( a == 0 | b++ > 2) //Evalúa las dos condiciones y b se incrementa.
        {    System.out.println("Cierto (a==0 |  b++ > 2)-> a: " + a + " b: " + b);  }

        if (c == 0 || d++ > 2) //Evalúa solo la 1ª condición al ser cierta (c==0), b no incrementa.
        {    System.out.println("Cierto (c==0 || d++ > 2)-> c: " + c + " d: " + d);  }

        System.out.println();

        if (a > 0 & b++ < 5) //Evalúa las dos condiciones, b se incrementa de nuevo.
        {  }
        else
        {    System.out.println("Falso (a>0 &  b++  a: " + a + " b: " + b);  }

        if (c > 0 && d++ < 5) //Evalúa solo la 1ª condición por ser falsa (c > 0), d no incrementa.
        {    }
        else
        {    System.out.println("Falso (c>0 && d++ <5) -> c: " + c + " d: " + d);  }
        System.out.println("----------------------------------");
        metodoNuevo();
    }
    static void metodoNuevo(){
        int a = 10;
        int b = 10;
        System.out.println("a++: " + a++); //1º Evalua con a y luego la incrementa.
        System.out.println("++b: " + ++b); //1º Incrementa y luego evalua con el nuevo valor.

        System.out.println(a); //Comprobamos que el valor se ha incrementado.
        System.out.println(b); //Comprobamos que el valor se ha incrementado.

        int v1 = 2;
        int v2 = 3;
        int v3 = 0;
        //         2 +  3  * 2  / 2 % 5;
        //         2 +  6  / 2 % 5;
        //         2 + 3 % 5;
        //         2 + 3
        // 5

        int res = v1 + v2 * v1 / 2 % 5;
        System.out.println("resultado: " + res);
        System.out.println(1 + "4");
    }
}
