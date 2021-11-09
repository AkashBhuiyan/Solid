package isp.applied;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Pizza {
    void orderPizza(int qty);
}

interface Drinks {
    void orderDrinks(int drinks);
}

interface PizzaDrinksCombo extends Pizza, Drinks {
    void orderCombo(int qty, int drinks);
}

class RunFestivalPromotion {
    public void freeDrinksPromotion(Drinks drinks) {
        System.out.println("Festival promotions 1 drinks order successfully");
        drinks.orderDrinks(1);
    }
}

class PizzaHut implements PizzaDrinksCombo {

    public String getName(){
        return "PizzaHut";
    }

    @Override
    public void orderPizza(int qty) {
        System.out.println(qty + " pizza ordered successfully.");
    }

    @Override
    public void orderDrinks(int drinks) {
        System.out.println(drinks + " drinks ordered successfully.");
    }

    @Override
    public void orderCombo(int qty, int drinks) {
        System.out.println(String.format("%d pizza and %d drinks ordered successfully.", qty, drinks));
    }
}

class PizzaBurg implements Pizza {

    public String getName(){
        return "PizzaBurg";
    }

    @Override
    public void orderPizza(int qty) {
        System.out.println(qty + " pizza ordered successfully.");
    }
}

class PizzaDrinksComboRepository {

    private List<Pizza> pizzaList = new ArrayList<>();
    private List<Drinks> drinksList = new ArrayList<>();
    private List<PizzaDrinksCombo> pizzaDrinksComboList = new ArrayList<>();

    public void add(Pizza pizza){
        pizzaList.add(pizza);
    }

    public void add(Drinks drinks){
        drinksList.add(drinks);
    }

    public void add(PizzaDrinksCombo pizzaDrinksCombo){
        pizzaList.add(pizzaDrinksCombo);
        drinksList.add(pizzaDrinksCombo);
        pizzaDrinksComboList.add(pizzaDrinksCombo);
    }

    public List<Pizza> getAllPizza(){
        return Collections.unmodifiableList(pizzaList);
    }

    public List<Drinks> getAllDrinks(){
        return Collections.unmodifiableList(drinksList);
    }

    public List<PizzaDrinksCombo> getAllPizzaDrinksCombo(){
        return Collections.unmodifiableList(pizzaDrinksComboList);
    }
}


public class IspViolationSolution {
    public static void main(String[] args) {
        PizzaDrinksComboRepository pizzaDrinksComboRepository = new PizzaDrinksComboRepository();

        PizzaHut pizzaHut = new PizzaHut();
        pizzaDrinksComboRepository.add(pizzaHut);

        PizzaBurg pizzaBurg = new PizzaBurg();
        pizzaDrinksComboRepository.add(pizzaBurg);

        RunFestivalPromotion runFestivalPromotion = new RunFestivalPromotion();
        pizzaDrinksComboRepository.getAllPizzaDrinksCombo().forEach(runFestivalPromotion::freeDrinksPromotion);
    }
}
