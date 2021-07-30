public class Main04 {
    public static void main(String[] args) {
        Integer i = 42;
        //boolean bool = i<42;
        //System.out.println(bool);
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
        System.out.println("-----------------------------");
        //x = (expresion logica) ? valorSiVerdadero : valorSiFalso
        int nota = 80;
        String resultado = (nota >= 65)? "Aprobado!!!" : "Suspenso";
        System.out.println(resultado);

    }
}
