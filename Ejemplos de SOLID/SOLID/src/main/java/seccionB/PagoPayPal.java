package seccionB;

public class PagoPayPal implements Pagar{
    private boolean loggedIn;//validacion de conexion a cuenta paypal
    
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn){
            /*
            TurnLogAccount();
            /*something*/
        }
        //cargar el monto de compra al medio de pago
    }
}
