package Solid.OCP;

public class CienciaEstudiante extends Estudiante {
    //completa
    public CienciaEstudiante(String name, String regNumber, double score, String dept) {
        super(name, regNumber, score);
        this.department = dept;
    }
}

