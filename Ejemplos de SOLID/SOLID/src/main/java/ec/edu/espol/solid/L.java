
package ec.edu.espol.solid;

public class L {
    
    interface Cocina {
        
        void encenderHornilla();
        void apagarHornilla();
    }
    
    class CocinaGas implements Cocina {
        boolean gasAbierto;
                
        void hacerChispa(){ }
        
        public void encenderHornilla(){
            if (!gasAbierto) gasAbierto=true;
            hacerChispa();     
        }
        
        public void apagarHornilla(){
            gasAbierto=false;
        }
    }
    
    class CocinaElectrica implements Cocina {
        boolean encendido;
        
        void seleccionarYencenderHornilla(){}
        void seleccionarYapagarHornilla(){}
        
        public void encenderHornilla(){
            if (!encendido) encendido=true;
            seleccionarYencenderHornilla();
        }
        
        public void apagarHornilla(){
            seleccionarYapagarHornilla();
        }
        
    }
    
}
