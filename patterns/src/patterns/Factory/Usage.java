/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.Factory;

/**
 *
 * @author serge
 */
public class Usage {
    public void run(){
    CarFactory.buildCar(CarType.SMALL);
    CarFactory.buildCar(CarType.SEDAN);
    CarFactory.buildCar(CarType.LUXURY);}
}
