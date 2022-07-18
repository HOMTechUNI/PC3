package Solid.ISP;
class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con ISP");
        Impresora impresora = new ImpresoraBasica();
        impresora.printDocument();
        Impresora impresoraAvanzada = new ImpresoraAvanzada();
        impresoraAvanzada.printDocument();
        Fax dispositivoFax = new ImpresoraAvanzada();
        dispositivoFax.sendFax();
    }
}