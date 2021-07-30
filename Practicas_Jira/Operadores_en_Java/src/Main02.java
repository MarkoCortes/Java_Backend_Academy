class Persona{}
class Empleado extends Persona {}
class Tecnico extends Persona {}
class Modales{}

public class Main02 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Empleado();
        Empleado e1 = new Empleado();
        Tecnico t1 = new Tecnico();
        Boolean b;

        b = p1  instanceof Persona;
        System.out.println(b);
        //b = p1  instanceof Modales;
        b = false;
        System.out.println(b);
        b = p1  instanceof Object;
        System.out.println(b);
        b = p1  instanceof Empleado;
        System.out.println(b);
        b = p1  instanceof Tecnico;
        System.out.println(b);

        b = p2  instanceof Persona;
        System.out.println(b);
        b = p2  instanceof Empleado;
        System.out.println(b);
        //b = p2  instanceof Modales;
        b = false;
        System.out.println(b);
        b = p2  instanceof Tecnico;
        System.out.println(b);

        b = e1  instanceof Empleado;
        System.out.println(b);
        //b = e1  instanceof Modales;
        b = false;
        System.out.println(b);
        b = e1  instanceof Persona;
        System.out.println(b);
        //b = e1  instanceof Tecnico;
        b = false;
        System.out.println(b);

        b = t1  instanceof Persona;
        System.out.println(b);
        //b = t1  instanceof Modales;
        b = false;
        System.out.println(b);
        //b = t1  instanceof Empleado;
        b = false;
        System.out.println(b);
        b = t1  instanceof Tecnico;
        System.out.println(b);

        b = null instanceof Persona;
        System.out.println(b);
        //b = e1 instanceof String;
        //System.out.println(b);

    }
}
