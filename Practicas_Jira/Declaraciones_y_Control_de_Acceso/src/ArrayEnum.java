public class ArrayEnum {
    public static void main(String[] args) {
        int[] arregloInt = new int [10];

        arregloInt[0] = 1;
        arregloInt[1] = 2;
        arregloInt[2] = 3;
        arregloInt[3] = 4;
        arregloInt[4] = 5;
        arregloInt[5] = 6;
        arregloInt[6] = 7;
        arregloInt[7] = 8;
        arregloInt[8] = 9;
        arregloInt[9] = 10;

        // error: array se excede del su limite de elementos
        // arregloInt[10] = 11;

        char[] elArreglo = {'C','O','M','P','I','L','A'};
        Dias diaLunes = Dias.LUNES;
        System.out.println(diaLunes.getdIngles());
        System.out.println(diaLunes.getdRuso());
    }
}
enum Dias{
    LUNES("Monday","Lunosky"), MARTES("Tuesday","Martosky"), MIERCOLES("Wendsday","Miercolosky");
    private String dIngles, dRuso;
    Dias(){
    }
    Dias(String ingles, String ruso){
        this.dIngles = ingles;
        this.dRuso = ruso;
    }

    public String getdIngles() {
        return dIngles;
    }
    public String getdRuso(){
        return dRuso;
    }
}
/*
* Los identificadores COCHE, CAMION, etc. se denominan constantes de enumeración.
* Cada uno se declara implícitamente como un miembro público (public) y estático (static) de Transporte.
* Además, el tipo de constantes de enumeración es el tipo de enumeración en el que se declaran las constantes,
* que es Transporte en este caso. Por lo tanto, en el lenguaje de Java, estas constantes se llaman auto-tipado.*/
enum Transporte{
    COCHE, CAMIÓN, AVION, TREN, BARCO;

}