public class DataTypes {
    public static void main(String[] args) {
        int  n = 1234567890;
        //SE AGREGA L AL FINAL DE LA VARIABLE DECIR QU E NO CONFUNDA CON UN ENTERO
        long nL = 123485969349L;
        double nD = 123.34545;
        float nF = 123.453F;

        // VAR
        var salary = 1000;
        // pemsion
        var pension = salary*0.03;
        var totalSalary =  salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Marko";
        System.out.println("Empleado "+ employeeName +" con salario "+ totalSalary);
    }
}
