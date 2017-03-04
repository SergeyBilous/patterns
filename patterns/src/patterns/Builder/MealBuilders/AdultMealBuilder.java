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
public class AdultMealBuilder extends MealBuilder{

    @Override
    public void buildDrink() {
       super.meal.setDrink("Whiskey");
    }

    @Override
    public void buildMain() {
        super.meal.setMain("Fish and cheaps");
    }

    @Override
    public void buildDessert() {
        super.meal.setDessert("Liquor");
    }
    
}
