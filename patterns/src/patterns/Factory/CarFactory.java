/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.Factory;

import patterns.Factory.Cars.LuxuryCar;
import patterns.Factory.Cars.SedanCar;
import patterns.Factory.Cars.SmallCar;

/**
 *
 * @author serge
 */
public class CarFactory {

    public static Car buildCar(CarType model) {
        Car ret = null;
        switch (model) {
            case LUXURY:
                ret = new LuxuryCar(model);
                break;
            case SEDAN:
                ret = new SedanCar(model);
                break;
            case SMALL:
                ret = new SmallCar(model);
                break;
        }
        return ret;
    }
}
