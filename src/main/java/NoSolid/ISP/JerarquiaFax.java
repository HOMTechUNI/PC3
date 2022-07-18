package NoSolid.ISP;

interface  Fax {
    public void sendFax();
}
class LanFax implements  Fax{
    @Override
    public void sendFax(){
        System.out.println("La impresora basica imprime un documento.");
    }
}
