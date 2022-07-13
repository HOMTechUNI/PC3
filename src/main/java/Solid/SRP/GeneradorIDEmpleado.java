package Solid.SRP;

import java.util.Random;

public class GeneradorIDEmpleado {
    //completar
    public static String generateEmpId(String empFirstName){
        int random = new Random().nextInt(1000);
        return empFirstName.substring(0,1)+random;
    }
}
