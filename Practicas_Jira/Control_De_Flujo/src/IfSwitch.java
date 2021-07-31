
public class IfSwitch {
    public static void main(String[] args) {

        int precio = 100;
        boolean tengoCredito = false;
        if (precio < 100){
            comprar();
        }
        else if (precio < 2000 && tengoCredito){
            comprarConTarjeta();
        }
        else{
            System.out.println("Yo no soy tonto.");
        }

        System.out.println("________________________________________");
        //int[] niveles = {1, 2, 3, 0};
        String[] saludo = {"Hola", "Hello", "Ohayo", "Blyat"};
        System.out.println("\nEjecucion Switch Tipico (breaks y default al final): ");
        for (String s : saludo) {
            System.out.println("Nivel: " + s);
            switch (s) {
                case "Hola":
                    System.out.println("\tNivel Basico.");
                    break;

                case "Hello":
                    System.out.println("\tNivel Intermedio.");
                    break;

                case "Ohayo":
                    System.out.println("\tNivel Avanzado.");
                    break;

                default:
                    System.out.println("\tNivel no informado.");
            }
        }
    }
    static void comprar(){}
    static void comprarConTarjeta(){}
    void switchContinue(){

    }
}
