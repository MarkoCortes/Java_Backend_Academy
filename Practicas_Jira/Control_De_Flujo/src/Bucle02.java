public class Bucle02 {
    public static void main(String[] args) {
        System.out.println("Imprime las tablas del 1 - 10");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("\t%d   ",i*j);
            }
            System.out.println();
        }
    }
}
