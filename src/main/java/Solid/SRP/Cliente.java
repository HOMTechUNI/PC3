package Solid.SRP;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion de SRP");

        Empleado jessica = new Empleado("Jessica", "Abejita", 7.5);
        showEmpDetail(jessica);

        System.out.println("\n*******\n");

        Empleado chalo = new Empleado("Chalito", "Smart", 3.2);
        showEmpDetail(chalo);
    }

    private static void showEmpDetail(Empleado emp) {
        // Muestra detalles del empleado
        emp.displayEmpDetail();

        //Genera el ID
        System.out.println("El ID del empleado es: " + GeneradorIDEmpleado.generateEmpId(emp.firstName));

        // Verifica el nivel laboral
        System.out.println("Este empleado es un" + " empleado " + SeniorityChecker.checkSeniority(emp.experienceInYears));
    }
}
