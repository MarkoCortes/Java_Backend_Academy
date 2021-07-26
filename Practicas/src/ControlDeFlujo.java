public class ControlDeFlujo {
    public static void main(String[] args) {
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
}


