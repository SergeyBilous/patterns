/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.Builder;

import patterns.Builder.MealBuilders.AdultMealBuilder;
import patterns.Builder.MealBuilders.KidsMealBuilder;

/**
 *
 * @author serge
 */
public class Usage {
    
    public void run() {
        MealDirector director = new MealDirector();
        Boolean isKid = true;
        MealBuilder builder = null;
        if (isKid) {
            builder = new KidsMealBuilder();
        } else {
            builder = new AdultMealBuilder();
        }
        Meal meal = director.createMeal(builder);
    }
}
