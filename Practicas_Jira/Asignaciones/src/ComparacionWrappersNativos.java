public class ComparacionWrappersNativos {
    public static void main(String[] args) {
        Integer i = 11;
        Integer j  = new Integer("11");
        int h = 1;

        //System.out.println(j.equals(i));
        //j++ ;
        //System.out.println(j.equals(i));

        Integer m =  new Integer(1);
        Integer n =  new Integer(1);

        String nombre = "marko";
        String nombre2 = "marko";

        System.out.println("nombre es equals a nombre2: "+ nombre.equals(nombre2));
        System.out.println("nombre es ==  a nombre2: "+ nombre == nombre2);
        System.out.println("M es equals a N: "+ m.equals(n));
        System.out.println("M es equals a H: "+ m.equals(h));
        if(m == n){
            System.out.println("igual");
        }

    }
}
