package isp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface FastFood{
    void orderPizza(int qty);

    void orderDrinks(int drinks);

    void orderCombo(int qty, int drinks);
}


class PizzaHut implements FastFood {

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

class PizzaBurg implements FastFood {

    public String getName(){
        return "PizzaBurg";
    }

    @Override
    public void orderPizza(int qty) {
        System.out.println(qty + " pizza ordered successfully.");
    }

    @Override
    public void orderDrinks(int drinks) {
       throw new UnsupportedOperationException();
    }

    @Override
    public void orderCombo(int qty, int drinks) {
        throw new UnsupportedOperationException();
    }
}

class RunPromotion {
    public void freeDrinksPromotion(FastFood fastFood){
        fastFood.orderDrinks(1);
    }
}

class FastFoodRepository {

    private List<FastFood> fastFoodList = new ArrayList<>();

    public void add(FastFood fastFood){
        fastFoodList.add(fastFood);
    }

    public List<FastFood> getAll(){
        return Collections.unmodifiableList(fastFoodList);
    }
}

public class IspViolationExample {
    public static void main(String[] args){
        FastFoodRepository fastFoodRepository = new FastFoodRepository();

        FastFood pizzaHut = new PizzaHut();
        fastFoodRepository.add(pizzaHut);

        FastFood pizzaBurg = new PizzaBurg();
        fastFoodRepository.add(pizzaBurg);

        RunPromotion runPromotion = new RunPromotion();
        fastFoodRepository.getAll().forEach(runPromotion::freeDrinksPromotion);
    }
}
