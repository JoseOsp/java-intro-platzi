public class DataTypes {
    public static void main(String[] args) {
        int cosa = 2025852555;
        // Poner L al final para identificar que es Long
        long nL = 645646546545L;

        double nD = 123.456;
        // Poner F al final para identificar que es float
        float nF = 123.456F;

        // Despues de Java 10
        var salary = 1000; // int
        // Pension 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension; // double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Jose Erney Ospina";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
