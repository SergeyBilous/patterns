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
public class  XWindow implements Window{
      @Override
    public void setTitle(String title) {
       System.out.println("XW: title is "+title);
    }

    @Override
    public void repaint() {
        System.out.println("XW: repainted");
    }
}
