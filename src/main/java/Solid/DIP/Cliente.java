package Solid.DIP;


public class Cliente {
    public static void main(String[] args) {

        // Usando Oracle
        BaseDatos database = new OracleDatabase();
        InterfazUsuario userInterface = new InterfazUsuario(database);
        userInterface.saveEmployeeId("E001");


        // Usando Mysql
        database = new MySQLDatabase();
        userInterface = new InterfazUsuario(database);
        userInterface.saveEmployeeId("E001");

        // Cambiando la base de datos objetivo
        //usuario = new InterfazUsuario(new OracleDatabase());



    }
}