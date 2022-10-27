package ec.edu.espol.solid;

/**
 *
 * @author sam sung
 */
public class O {

    interface enjoyable {

        void fun();
    }

    class Ride implements enjoyable {

        @Override
        public void fun() {
            System.out.println("I love car rides!");
        }
    }

    class Walk implements enjoyable {

        @Override
        public void fun() {
            System.out.println("Walking is my favorite hobby!");
        }
    }
    //Se puede seguir añadiendo más clases que implementen la misma 
    //interfaz,
    //pero queda cerrado a modificaciones posteriores tanto a cada 
    //clase como a la interfaz.
}





