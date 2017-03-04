/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.AbstractFactory;

/**
 *
 * @author serge
 */
public class GUIBuilder {

    public Window buildWindow(AbstractWindowFactory factory) {
        return factory.createWindow();
    }
}
