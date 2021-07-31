/*
* Tipo primitivo	Clase envoltorio
boolean	Boolean
byte	Byte
char	Character
short	Short
int	Integer
long	Long
float	Float
double	Double*/
public class Primitivos {
    public static void main(String[] args) {
       // Los objetos se construyen pasando el valor al constructor correspondiente.

        int entero = 500;
        Integer Entero = new Integer(entero);       //de primitivo a objeto se llama boxing.
        int aEntero = Entero.intValue();            //de objeto a primitivo se llama unboxing.
        System.out.println(aEntero);
        System.out.println("-------------------");

        //Muchas veces es útil convertir a estas clases ya que tienen muchos métodos interesantes.
        String str = "1000";
        int x = Integer.parseInt(str);
        System.out.println(x);

        //Constructores:
        //Cada clase envoltorio (menos Character) tienen dos constructores: uno que admite el tipo primitivo como parámetro y otro que admite un String.
        Integer a = new Integer(500);
        Integer b = new Integer("500");

        Float c = new Float(7.5f);
        Float d = new Float("7.5f");

        Character e = new Character('t');

        //Para el constructor Boolean cuando el String es true (sin importar mayúsculas o minúsculas) será true, cualquier otro valor será falso.
        Boolean f = new Boolean(false);
        Boolean g = new Boolean("TrUe"); //g será true.

        Boolean h = new Boolean ("NO"); //h será false.
        System.out.println(g);
        System.out.println("---------------------------");



        //ValueOf:
        //Otra forma de construir un objeto de una clase envoltorio es mediante este método estático, valueOf.
        // Este método puede aceptar un String, o un String y un parámetro que indique la base numérica.
        //Integer nuevo = new Integer.valueOf("150");
        //Integer binario = new Integer.valueOf("1010", 2);
        //Autoboxing y unboxing:
        //Para pasar de un tipo primitivo a su objeto equivalente se necesita utilizar las clases envoltorio (boxing).
        //Para obtener de la referencia del objeto su tipo primitivo (unboxing) se necesitan usar los métodos de las clases envoltorio.

        int enteroPrimitivo = 420;
        Integer EnteroWrapper = enteroPrimitivo;  //Se permite la asignación directa. Se llama autoboxing.
        int otroEnteroPrimitivo = EnteroWrapper;  //Se asigna directamente. Se llama autounboxing.
    }
}
