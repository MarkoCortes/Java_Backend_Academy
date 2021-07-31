import java.util.Scanner;

public class Bucles {
    /*
    * En Java 6 tenemos tres opciones distintas a la hora de realizar iteraciones:
        while,
        do while,
        for (normal y mejorado)*/

    public static void main(String[] args) {
        int numero = 0;
        //inicialización de variables
        while (numero <= 100) {   //La condicion debe evaluarse a boolean
            //codigo         //Puede no ejecutarse ninguna vez
            System.out.println(numero);
            numero += 10;
        }
        System.out.println("Fuera del bucle: " + numero);
        int intArray[] = {1,2,3,4,5,6,7,8,9};
        for (int valor: intArray) {
            System.out.println("Valor" + valor);
        }
     //Descomentar para mostrar el do while
        //   metodo01();

    }

    /*
     * Do While
     * En estos bucles primero se ejecuta el código y luego se comprueba la condición,
     * por lo que tenemos asegurado que el código se ejecuta al menos una vez.*/
    static  public void metodo01(){
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{

            System.out.println("");
            System.out.println("***********************************");
            System.out.println("**    Aplicacion de Saludos:     **");
            System.out.println("** 1. Enviar  Saludo             **");
            System.out.println("** 2. Mostrar un Saludo          **");
            System.out.println("** 5. SALIR                      **");
            System.out.println("***********************************");
            System.out.println("Ingrese opcion: ");
            try {
                opc = sc.nextInt();
                sc.nextLine();

            } catch (Exception e) {
                //opc = 0;
                System.err.println("Dato ingresado no valido");
            }
            switch(opc){
                case 1:
                    System.out.println("Ingrese su mensaje: ");
                    String saludo = sc.nextLine();

                    System.out.println("Este es su saludo:  " +saludo);
                    break;
                case 2 :
                    System.out.println("Hola, te saluda este programa, como estas?  ");
                    break;
                default:
                    break;

            }

        }while(opc != 5 );
    }
}

