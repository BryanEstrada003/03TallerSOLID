/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccionB;

import java.util.List;

/**
 *
 * @author sam sung
 */
public class Compra {
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private List articulos;
    
    public Compra(Pago pago){
        //constructor
    }
    public Compra(PagoPayPal pagoPayPal){
        //constructor
    }
    
    public void agregarArticulo(Articulo articulo){
        //agg articulo a la compra
    }
    public void removerArticulo(Articulo articulo){
        //rmv articulo a la compra
    }
}

