/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccionB;

/**
 *
 * @author sam sung
 */
public class PagoPayPal extends Pago {
    private boolean loggedIn;//validacion de conexion a cuenta paypal
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn){/*something*/}
        //cargar el monto de compra al medio de pago
    }
}
