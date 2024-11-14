package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Pizzaria {

    public static void main(String[] args) {
        DAOPizzas daoPizzas = new DAOPizzas();
        
        daoPizzas.create(new Pizzas(1, "Queijo", "M", 30));
        daoPizzas.create(new Pizzas(2, "Frango", "M", 34));
        daoPizzas.create(new Pizzas(1, "Abacaxi", "M", 31));
        System.out.println(daoPizzas.listAll());
        
        
    }
    
}
