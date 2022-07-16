package Solid.LSP;
import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {
    //Se crea la lista correspondiente a los pagos previos
    List <PreviousPayment> previousPayments = new ArrayList<PreviousPayment>();
    //Se crea la lista correspondiente a los nuevos pagos
    List <NewPayment> newPayments = new ArrayList<NewPayment>();
    //Metodo para agregar pagos previos a clientes registrados
    public void addPreviousPayment(PreviousPayment previousPayment){
        previousPayments.add(previousPayment);
    }
    //metodo para añadir pagos nuevos a clientes registrados y no registrados
    public void addNewPayment(NewPayment newPayment){
        newPayments.add(newPayment);
    }
    //metodo que accede a la lista previousPayment para mostrar los pagos de clientes registrados
    public void showPreviousPayments() {
        for (PreviousPayment previousPayment: previousPayments){
            previousPayment.previousPaymentInfo();
        }
        System.out.println("--------------------");
    }
    //metodo que accede a la lista newPayment para mostrar que se están procesando los nuevos pagos
    public void processNewPayments(){
        for(NewPayment newPayment: newPayments){
            newPayment.newPayment();
        }
        System.out.println("--------------------");
    }
    public static void showAllOperations(PaymentHelper showOperations){
        showOperations.showPreviousPayments();
        showOperations.processNewPayments();
    }
}