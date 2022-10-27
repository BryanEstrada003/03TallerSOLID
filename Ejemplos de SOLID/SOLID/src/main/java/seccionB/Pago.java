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
public class Pago implements Pagar{

    //atrb
    // LSP - Liskov Substitution Principle: ya que tanto Pago y PagoPayPal comparten la misma funcion, la mejor solcuion es crear una interfaz y que esta interfaz con esta misma funcion implemente a estas clases, y tambien que se ejecute sin ninguna variación en las dos clases. 
    // SRP- Simple Responsibility Principle: la clase pago tiene varias responsabilidades
    /**
     * public void realizarCobro(double monto){ //cargar el monto de compra al
     * medio de pago } public void calcularImpuestoFactura(){ //calcula iva }
     * public void generarFactura(){ //genera nueva factura }
     */

    @Override
    public void realizarCobro(double monto) {
        //cargar el monto de compra al  medio de pago
    }
}
