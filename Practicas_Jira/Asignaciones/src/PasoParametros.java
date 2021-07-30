
public class PasoParametros
{
    public static void main(String[] args) {
        int [] array = {100};
        //Se envia el valor de memoria
        //cambiarValor(array);

        cambiarValorNuevo(array);
        System.out.println(array[0]);
    }

    static public void cambiarValor(int aN[]){
        aN[0] = 300;
    }
    static public void cambiarValorNuevo(int aN[]){
        //Se cambia el valor
        aN[0] = 300;
        //Se crea otro arreglo
        int [] arreglo;
        //Arrgelo ahora apuntoa a aN que apun a array
        // arreglo = aN = array
        arreglo = aN;
        //sumamos 100, como valen lo mismo debe ser 400
        arreglo[0] += 100;
    }
}
