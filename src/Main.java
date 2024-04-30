//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creating instance of the class
//            Pizza basePizza = new Pizza(true);
//            basePizza.addExtraToppings() ;
//            basePizza.addExtraCheese();
//            basePizza.takeAway();
//            basePizza.getBill();
        DeluxePizza dp = new DeluxePizza(true);
        dp.takeAway();
        dp.getBill();
    }
    }
