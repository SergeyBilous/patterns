/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.Builder.MealBuilders;

import patterns.Builder.MealBuilder;

/**
 *
 * @author serge
 */
public class KidsMealBuilder extends MealBuilder {

    @Override
    public void buildDrink() {
        super.meal.setDrink("Cola");
    }

    @Override
    public void buildMain() {
        super.meal.setMain("Soup");
    }

    @Override
    public void buildDessert() {
        super.meal.setDessert("Tiramissou");
    }

    public KidsMealBuilder() {
        super();
    }
}
