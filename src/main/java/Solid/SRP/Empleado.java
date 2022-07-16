package Solid.SRP;

public class Empleado {
    public String firstName, lastName;
    public double experienceInYears;

    public Empleado(String firstName, String lastName, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experience;
    }

    public void displayEmpDetail() {
        System.out.println("Nombre del empleado:\t" + firstName + ", " + lastName);
        System.out.println("Este empleado tiene:\t" + experienceInYears + " años de experiencia" );
    }
}
