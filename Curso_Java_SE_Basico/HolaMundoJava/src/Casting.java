public class Casting {
    public static void main(String[] args) {
        // 30 perritos en un año ubicados
        //cuantos perritos en un mes

        double  monthlyDogs =  30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACION
        int estimacion = (int) monthlyDogs;
        System.out.println(estimacion);

        // EXACTITUD
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);


    }
}
