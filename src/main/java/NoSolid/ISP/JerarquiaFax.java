package NoSolid.ISP;

interface  Fax {
    public void sendFax();
}
class LanFax implements  Fax{
    @Override
    public void sendFax(){
        System.out.println("Usando lan fax para mandar un fax");
    }
}
class EFax implements  Fax{
    @Override
    public void sendFax(){
        System.out.println("Usando internet fax para mandar un fax");
    }
}

class AnalgoFax implements  Fax{
    @Override
    public void sendFax(){
        System.out.println("Usando Analog fax para mandar un fax.");
    }
}
