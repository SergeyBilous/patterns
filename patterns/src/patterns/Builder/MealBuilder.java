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
public abstract class MealBuilder {

    protected Meal meal;

    public abstract void buildDrink();

    public abstract void buildMain();

    public abstract void buildDessert();

    public Meal getMeal() {
        return meal;
    }

    public MealBuilder() {
        meal = new Meal();
    }
}
