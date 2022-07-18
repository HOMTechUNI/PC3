package Solid.DIP;


import NoSolid.DIP.InterfazUsuario;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con DIP");
        BaseDatos dataBaseOracle=new OracleDatabase();
        BaseDatos dataBaseMySQL=new MySQLDatabase();
        // Usando Oracle
        InterfazUsuario usuario = new InterfazUsuario();
        usuario.saveEmployeeId("E001");

        // Usando Mysql


        // Cambiando la base de datos objetivo
        //usuario = new InterfazUsuario(new OracleDatabase());



    }
}