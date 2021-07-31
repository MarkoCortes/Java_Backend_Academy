public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10); //se declara con este tamaño incial pero puede aumentar

        StringBuilder sba = new StringBuilder("Hola");
        StringBuilder sbb = new StringBuilder("Hola");

        System.out.println( sba == sbb);
        System.out.println( sba.equals(sbb));
        System.out.println( sba.toString().equals(sbb.toString()));

        StringBuilder sbc = new StringBuilder("Hola ");
        sbc.append("Mundo");
        System.out.println(sbc);
        sbc.insert(4,"-");
        System.out.println(sbc);
        sbc.deleteCharAt(5);
        System.out.println(sbc);
        sbc.delete(0,4);
        System.out.println(sbc);


    }
}
