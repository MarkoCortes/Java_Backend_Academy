public class Hexy {
    public static void main(String[] args) {
        Integer i = 42;
        //boolean bool = i<42;
        //System.out.println(bool);
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}
