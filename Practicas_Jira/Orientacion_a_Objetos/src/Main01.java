class ClaseContenedora {
    class ClaseInterna {
        public String toString() {
            return "ClaseContenedora.ClaseInterna";
        }
    }
    public String toString() {
        return "ClaseContenedora";
    }
}

public class Main01 {
    public static void main(String[] args) {
        //ClaseContenedora.ClaseInterna ci = new ClaseContenedora.ClaseInterna();
    /*
    Main01.java:14: an enclosing instance that contains ClaseContenedora.ClaseInterna is required
    ClaseContenedora.ClaseInterna ci = new ClaseContenedora.ClaseInterna();
    1 error
    */

        ClaseContenedora cc = new ClaseContenedora();
        ClaseContenedora.ClaseInterna ci = cc.new ClaseInterna();
        System.out.println(cc);
        System.out.println(ci);
    }
}
/*
SALIDA:
ClaseContenedora
ClaseContenedora.ClaseInterna
*/
