/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.AbstractFactory;

import patterns.AbstractFactory.ConcreteFactories.MSWindowFactory;
import patterns.AbstractFactory.ConcreteFactories.XWindowFactory;

/**
 *
 * @author serge
 */
public class UsageExample {

    public void run(String OSType) {
        GUIBuilder builder = new GUIBuilder();
        AbstractWindowFactory factory = null;
        if (OSType.toUpperCase().contains("WIN")) {
            factory = new MSWindowFactory();
        } else {
            factory = new XWindowFactory();
        }
        builder.buildWindow(factory);
    }
}
