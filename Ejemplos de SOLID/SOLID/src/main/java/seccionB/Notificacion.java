
package seccionB;



public interface Notificacion{
    public void notificar(Pagar pago);
}

class NotiEmail implements Notificacion{
   public void notificar(Pagar pago){
       //enviaremail
   }
}

class NotiSMS implements Notificacion{
    public void notificar (Pagar pago){
        //enviarSMS
    }
}