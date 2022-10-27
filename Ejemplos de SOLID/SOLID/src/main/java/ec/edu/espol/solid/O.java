/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    //Se puede seguir añadiendo más clases que implementen la misma interfaz,
    //pero queda cerrado a modificaciones posteriores tanto a cada clase como a la interfaz.
}
