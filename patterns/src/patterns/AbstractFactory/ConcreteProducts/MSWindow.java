/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.AbstractFactory.ConcreteProducts;

import patterns.AbstractFactory.Window;

/**
 *
 * @author serge
 */
public class MSWindow implements Window{

    @Override
    public void setTitle(String title) {
       System.out.println("MS: title is "+title);
    }

    @Override
    public void repaint() {
        System.out.println("MS: repainted");
    }
    
}
