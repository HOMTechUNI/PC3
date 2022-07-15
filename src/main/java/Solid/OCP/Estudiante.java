package Solid.OCP;

abstract class Estudiante {
    String name;
    String regNumber;
    double score;
    String department;

    public Estudiante(String name, String regNumber, double score, String dept) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
        this.department = dept;
    }

    public String toString() {
        return ("Nombre:\t\t" + name + "\nNumero Reg:\t" + regNumber + "\nDept:\t\t" + department + "\nMarks:\t\t"+ score + "\n");
    }
}