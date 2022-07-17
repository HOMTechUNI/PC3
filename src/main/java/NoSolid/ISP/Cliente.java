package NoSolid.ISP;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin ISP");

        Impresora impresora = new ImpresoraBasica();
        impresora.printDocument();

        ImpresoraAvanzada impresoraAvanzada = new ImpresoraAvanzada();
        impresoraAvanzada.printDocument();
        impresoraAvanzada.sendFax();

        /*
        List <Impresora> impresoraList = new ArrayList<Impresora>();

        impresoraList.add(new ImpresoraBasica());
        impresoraList.add(new ImpresoraAvanzada());

        impresoraList.forEach(impresora -> impresora.printDocument());
         */

    }

}
