package NoSolid.ISP;


interface  Fax {
    public void faxType();
}
class LanFax implements Fax {
    @Override
    public void faxType() {
        System.out.println("Usando lan fax para mandar un fax.");
    }
}
class EFax implements Fax {
    @Override
    public void faxType() {
        System.out.println("Usando internet fax para mandar un fax.");
    }
}
class AnalogFax implements Fax {
    @Override
    public void faxType() {
        System.out.println("Usando Analog fax para mandar un fax.");
    }
}