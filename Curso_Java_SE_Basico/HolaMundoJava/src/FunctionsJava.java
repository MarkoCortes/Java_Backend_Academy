public class FunctionsJava {
    public static void main(String[] args) {
        double  y = 3;


        //AREA DE UN CIRUCLO
        double cArea = circleArea(y);
        System.out.println(circleArea(y));
        System.out.println(areaEsfera(y));
        System.out.println(volEsfera(y));


        //AREA DE  UNA ESFERA
        //System.out.println(4 * Math.PI * Math.pow(y,2));
        //VVOLUMENDE UNA ESFERA
        //System.out.println((4/3) * Math.PI * Math.pow(y,3));

        System.out.println("Pesos a dolares " + convertToDollar(1000,"COP"));
        System.out.println("Pesos a dolares " + convertToDollar(1000,"MXN"));

    }
    public static  double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double areaEsfera(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public  static double volEsfera(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Funcion que especificada su moneda convierte una cantidad  de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: SOLO MXN o COP
     * @return quantity  Devuelve la cantidad  actualizada a Dolares
     */
    public static double convertToDollar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity*0.52;
                break;
            case "COP":
                quantity = quantity*0.00031;
                break;
        }
        return quantity;
    }

}
