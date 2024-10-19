package sample.cafekiosk.unit;

import sample.cafekiosk.unit.beverage.Beverage;

import java.util.ArrayList;
import java.util.List;

public class CafeKiosk {

    private final List<Beverage> beverages = new ArrayList<>();
    public void add(Beverage beverage) {
        beverages.add(beverage);
    }

    public void remove(Beverage beverage){
        beverages.remove(beverage);
    }

    public void clear(){
        beverages.clear();
    }
    public int calculateTotalPrice() {
        int totalPrice = 0;
//        for(Beverage beverage : beverages){
//            totalPrice += beverage.getPrice();
//        }

        int len = beverages.size();

        for (int i=0; i<len; i++){
            totalPrice += beverages.get(i).getPrice();
        }
        return totalPrice;
    }

}
