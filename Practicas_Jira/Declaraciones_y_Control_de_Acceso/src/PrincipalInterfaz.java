
/*
* Interfaz
    * La interfaz pública de una clase es un “contrato” entre el código cliente y la clase que proporciona el servicio.
    * Decimos que una clase implementa una interfaz cuando implementa todos los métodos declarados en ella.
    * Varias clases pueden implementar la misma interfaz. Una sola clase puede implementar varias interfaces.

    * Todos los métodos declarados en una interfaz son public y abstract, aunque no se especifique.
    * Todos los atributos en una interfaz son public, static y final, aunque no se especifique. Es decir, constantes.
    * Los métodos no pueden ser static ni final, strictfp, o native.


    * Una interfaz puede extender solo otras interfaces.
        * Las interfaces se usan para:
        * declarar métodos que serán implementados por una o varias clases.
        * dar a conocer la interfaz de programación sin revelar la implementación
        * identificar similitudes entre clases no relacionadas
        * simular la herencia múltiple declarando una clase que implemente varias interfaces
    * */
interface InterfazUno{
    public static final int EDAD = 23;
    String  NOMBRE = "marko";
    public abstract String getNombre();
    int getEdad();
}

 class InterfazPrueba implements InterfazUno{
    //Constructor Vacio
    InterfazPrueba(){}

    @Override
    public String getNombre() {
        return InterfazUno.NOMBRE;
    }

    @Override
    public int getEdad() {
        return InterfazUno.EDAD;
    }
}
public class PrincipalInterfaz{
    public static void main(String[] args) {
        InterfazPrueba pruebaInter = new InterfazPrueba();
        System.out.println("La edad desde la interfaz: "+ pruebaInter.getEdad());
        System.out.println("EL nombre desde la interfaz: "+ pruebaInter.getNombre());

    }
}
