
package seccionB;


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
