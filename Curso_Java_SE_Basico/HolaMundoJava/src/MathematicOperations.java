public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        // DEVUELVE UN NUMERO REDONDEADO HACIA ARRIBA
        System.out.println(Math.ceil(x));
        // DEVUELVE UN ENTERO REDONDEADO HACIA ABAJO
        System.out.println(Math.floor(x));

        //DEVUELVE un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //DEVUELVE EL NUMERO MAX
        System.out.println(Math.max(x,y));
        //RAIZ CUADRADA
        System.out.println(Math.sqrt(y));

        //AREA DE UN CIRUCLO
        System.out.println(Math.PI * Math.pow(y,2));
        //AREA DE  UNA ESFERA
        System.out.println(4 * Math.PI * Math.pow(y,2));
        //VVOLUMENDE UNA ESFERA
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
