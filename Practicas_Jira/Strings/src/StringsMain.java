public class StringsMain {
    public static void main(String[] args) {
        //Utu¿ilizar + para concatenar
        System.out.println(1 + 2); //3
        System.out.println("a"+"b"); //ab
        System.out.println("a"+"b"+3); //ab3
        System.out.println(1+2+"c");

        String s = "1";
        s += 2;
        s += 3;
        s += 4;

        System.out.println(s); //1234

        String a = null;
        System.out.println(a+3);
        //Se alamcena en el stream pool
        String name ="fuffly";
        String name2 = "fuffly";
        //Es ejecuta en el tiempo de de ejecucion, no se alamacena en el stream pool
        String name1 = new String("fuffly");
        System.out.println("name == name 2: " + name == name2); // Si ya que comparten la misma literal y viven en el Stringpool

        //INMUTABILIDAD
        //concat regresa la referencia de una variable String nueva
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3"); // al momento de no asignar la referencia a s2, es como si no pasara nada
        System.out.println(s2);
        System.out.println("charAt ---------------");
        String test = "asda2";
        System.out.println(test.charAt(4));
        System.out.println("equals -------------");
        System.out.println(("marko").equals("marko"));
        System.out.println(("marko").equals("MARKO"));
        System.out.println(("marko").equalsIgnoreCase("MArko"));

        System.out.println("replace-----------------");
        System.out.println("abcabc".replace("a","A")); // AbcAbc
        System.out.println("abcabc".replace("a","4")); // 4bc4bc



    }
}
