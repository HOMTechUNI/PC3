package Solid.LSP;

public class RegisteredUserPayment implements NewPayment, PreviousPayment {
    String name;
    public RegisteredUserPayment(String userName) {
        this.name = userName;
    }
    @Override
    public void previousPaymentInfo(){
        System.out.println("Recuperando los ultimos detalles de pago del cliente: "+ name);
    }
    @Override
    public void newPayment(){
        System.out.println("Procesando el pago del cliente: "+name);
    }
}

