package Solid.DIP;

class InterfazUsuario {
  private BaseDatos baseDatos ;

  public InterfazUsuario(BaseDatos baseDatos) {
      this.baseDatos= baseDatos;
  }
  public void saveEmployeeId(String empId) {
      baseDatos.saveEmpIdInDatabase(empId);
  }
}
