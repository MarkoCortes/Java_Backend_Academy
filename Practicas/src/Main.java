public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("a++: " + a++); //1º Evalua con a y luego la incrementa.
        System.out.println("++b: " + ++b); //1º Incrementa y luego evalua con el nuevo valor.

        System.out.println(a); //Comprobamos que el valor se ha incrementado.
        System.out.println(b); //Comprobamos que el valor se ha incrementado.

        //x = (expresion logica) ? valorSiVerdadero : valorSiFalso
        int nota = 80;
        String resultado = (nota >= 65)? "Aprobado!!!" : "Suspenso";
        System.out.println(resultado);

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

