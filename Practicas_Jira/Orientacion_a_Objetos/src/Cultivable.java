public interface Cultivable {
    //Por defecto los metodos de una interfaz son publicos y abstractos
    // La variables son static public y final (Constantes)
    public abstract void plantar();
    public void regar();
    public int cosechar();
}

 class cultivoFresas implements Cultivable {

    public void plantar() {}
    public void regar(){}
    public int cosechar(){
        return 0;
    }
}

 abstract class Cultivos implements Cultivable {
    public void plantar() { } //Ejemplo de clase abstracta
    public void regar() {  } // que define algunos métodos

}

class Maiz extends Cultivos {
    public int cosechar() {return  0;} //Y el que falta en la concreta.

}
