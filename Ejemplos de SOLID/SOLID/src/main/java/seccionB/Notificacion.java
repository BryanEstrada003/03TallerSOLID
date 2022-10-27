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
public class Notificacion {
   private int tipoNotificacion;
   
   public void notificar(Pagar pago){
       if(tipoNotificacion==1){
           //enviarEmail
       }else{
           //enviarSMS();
       }
       //open - closed principle
   }
}
