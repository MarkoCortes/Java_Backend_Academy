public class UpdatingVariables
{
    public static void main(String[] args) {
        int Salary=1000;
        //bono 200
        Salary += 200;
        System.out.println(Salary);

        // Pension de descuento
        Salary -= 50;
        System.out.println(Salary);

        //2 horas extras $30  c/u
        //comida: $45

        Salary = Salary + (30*2) - 45;
        System.out.println(Salary);

        // Actulizando nombre empleado
        String employeeName = "Marko";
        employeeName = employeeName + " Alan";
        System.out.println("Tu nombre es "+employeeName);
    }
}
