/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.Factory.Cars;

import patterns.Factory.Car;
import patterns.Factory.CarType;

/**
 *
 * @author serge
 */
public class SmallCar extends Car {

    public SmallCar(CarType model) {
        super(model);
        construct();
    }

    @Override
    protected void construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
