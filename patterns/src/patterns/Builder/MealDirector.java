/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.Builder;

/**
 *
 * @author serge
 */
public class MealDirector {

    public Meal createMeal(MealBuilder builder) {
    builder.buildDessert();
    builder.buildDrink();
    builder.buildMain();
    return builder.getMeal();
    }
}
