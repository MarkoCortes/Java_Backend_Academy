public class SwitchCase {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionamos Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionamos Blue Dark Mode");
                break;
            case"Dark":
                System.out.println("Selecionamos Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion correcta");
        }
    }
}
