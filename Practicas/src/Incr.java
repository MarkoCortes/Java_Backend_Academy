public class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;

        x *= x; // x = 49
        y *= y; // y = 4
        y *= y; // y = 16
        x -= y; // x = 49 - 16

        System.out.println(x);
    }
}
