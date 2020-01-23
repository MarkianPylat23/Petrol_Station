package Lesson3;

import java.util.List;

public class Shop {
    private List<String> food;
    private List<String> drinks;
    private List<String> electronics;

    public Shop(List<String> food, List<String> drinks, List<String> electronics) {
        this.food = food;
        this.drinks = drinks;
        this.electronics = electronics;
    }

    public List<String> getFood() {
        return food;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<String> drinks) {
        this.drinks = drinks;
    }

    public List<String> getElectronics() {
        return electronics;
    }

    public void setElectronics(List<String> electronics) {
        this.electronics = electronics;
    }
}