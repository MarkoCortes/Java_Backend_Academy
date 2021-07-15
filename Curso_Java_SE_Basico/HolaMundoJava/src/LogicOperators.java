public class LogicOperators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

         //Operadores de asignación
            System.out.println("a es igual a b "+ (a == b));
            System.out.println("a es diferente a b "+ (a != b));

            //RElacionales
        System.out.println("a es mayor a b "+(a > b));
        System.out.println("a es menor a b "+(a < b));
        System.out.println("a es mayor o igual a b "+(a >= b));
        System.out.println("a es menor o igual  a b "+(a <= b));

        boolean condicionA = true; // verdadero
        boolean condicionB = false; // falso

        boolean condicionC = 2 + 2 == 4; // verdadero
        boolean condicionD = 2 + 2 == 5; // falso

        boolean condicionE = "Pepito" == "Pepito"; // verdadero
        boolean condicionF = "Pepito" == "Pepe"; // falso

        boolean noHayInternet = false;
        boolean hayInternetPeroMuyPoquito = false;
        boolean hayBuenInternetPeroNoEsSuficiente = false;

        if (noHayInternet) {
            System.out.println("No hay Internet");
        } else if (hayInternetPeroMuyPoquito) {
            System.out.println("Tienes muy poquito Internet");
        } else if (hayBuenInternetPeroNoEsSuficiente) {
            System.out.println("Casi casi, falta solo un poquito más");
        } else {
            System.out.println("¡Tienes suficiente Internet!");
        }
    }
}
