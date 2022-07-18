package Solid.DIP;


public class Cliente {
    public static void main(String[] args) {

        // Usando Oracle
        BaseDatos baseDatos = new OracleDatabase();
        InterfazUsuario interfazUsuario = new InterfazUsuario(baseDatos);
        interfazUsuario.saveEmployeeId("E001");


        // Usando Mysql
        baseDatos = new MySQLDatabase();
        interfazUsuario = new InterfazUsuario(baseDatos);
        interfazUsuario.saveEmployeeId("E002");


    }
}