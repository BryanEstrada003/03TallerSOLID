
package seccionB;

import java.util.List;

public class Compra {
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private List articulos;
    
    //OCP - Open-Closed Principle: ya que es la misma estructura de código el 
    //método comprar, la solcuion mas optima es que tenga como parámetro una 
    //interfaz que esté implementada tanto en Pago como en PagoPayPal
    
    /**
    public Compra(Pago pago){
        //constructor
    }
    public Compra(PagoPayPal pagoPayPal){
        //constructor
    }
    */
    
    public Compra(Pagar pagar){
        //constructor
    }
    public void agregarArticulo(Articulo articulo){
        //agg articulo a la compra
    }
    public void removerArticulo(Articulo articulo){
        //rmv articulo a la compra
    }
}

