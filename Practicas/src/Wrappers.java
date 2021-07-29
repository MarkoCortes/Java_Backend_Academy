public class Wrappers {
    public static void main(String[] args) {
        Integer i = 11;
        Integer j  = new Integer("11");


        //System.out.println(j.equals(i));
        //j++ ;
        //System.out.println(j.equals(i));

        Integer m =  new Integer(1);
        Integer n =  new Integer(1);



        if(m == n){
            System.out.println("igual");
        }

    }
}
