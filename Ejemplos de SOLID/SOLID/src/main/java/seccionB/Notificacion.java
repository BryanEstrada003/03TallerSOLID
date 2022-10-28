
package seccionB;

//OPEN-CLOSED PRINCIPLE: se viola el principio en el código
//original ya que se debía agregar varios if cada que se quiera
//agregar más opciones de notificaciones.

//Se procedió a que los tipos de emails sean clases independientes
//que implementen la interfaz Notificacion (el nombre se dejó por
//legibilidad a comparación del código original, pero el nombre
//correcto debe ser "Notificable".

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