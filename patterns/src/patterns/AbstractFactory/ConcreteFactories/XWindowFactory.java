/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.AbstractFactory.ConcreteFactories;

import patterns.AbstractFactory.AbstractWindowFactory;
import patterns.AbstractFactory.ConcreteProducts.XWindow;
import patterns.AbstractFactory.Window;

/**
 *
 * @author serge
 */
public class XWindowFactory implements AbstractWindowFactory{

    @Override
    public Window createWindow() {
        return new XWindow();
    }
    
}
