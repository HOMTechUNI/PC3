package Solid.OCP;

public class ArteEstudiante extends Estudiante {
    public ArteEstudiante(String name, String regNumber, double score, String dept) {
        //completar
        //El constructor de la clase padre se ejecuta antes que el constructor de la clase hija
        super(name, regNumber, score);
        this.department = dept;
    }
}
