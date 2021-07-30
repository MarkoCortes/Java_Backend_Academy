public class Principal {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Marko",1);
        empleados[1] = new Tecnico("Merengano",2,1);
        empleados[2] = new Secretario("Juano",3,1);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].getNombre());
            empleados[i].saludoMetodo();
        }
        System.out.println();
        System.out.println("Usando Static ... ");
        Equipo[] equipos = new Equipo[3];
        equipos[0] = new Equipo(3,"Lenovo");
        equipos[1] = new Equipo(5,"Dell");
        equipos[2] = new Equipo(10,"HP");
        System.out.println("ID del ultimo equipo agregado: " + Equipo.id);
    }
}
class Equipo{
    public static int id;
    private int cantidad;
    private String marca;

    Equipo(int cantidad, String marca){
        this.cantidad = cantidad;
        this.marca = marca;
        this.id ++;
    }

}

 class Empleado{
    private int id = 0;
    private String nombre;
    private String apellido;

    Empleado(){}
    Empleado(String nombre, int id){
        this.nombre = nombre;
        this.id  = id;
    }
    public int getId() {
        return this.id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void saludoMetodo(){
        System.out.println("Hola Saludo del Empleado " +getNombre());
    }
}
class Tecnico extends Empleado{
    private int idTecnico;
    private String area;

    Tecnico(String nombre, int id, int idTecnico){
        super(nombre,id);
        this.idTecnico = idTecnico;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void saludoMetodo() {
        System.out.println("Hola Saludo del Tecnico " +getNombre());
    }
}
class Secretario extends  Empleado{
    private int idSecretario;
    private String equipo;

    Secretario(String nombre, int id, int idSecretario){
        super(nombre,id);
        this.idSecretario = idSecretario;
    }

    public int getIdSecretario() {
        return idSecretario;
    }

    public void setIdSecretario(int idSecretario) {
        this.idSecretario = idSecretario;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    @Override
    public void saludoMetodo() {
        System.out.println("Hola Saludo del secretario " +getNombre());
    }
}
