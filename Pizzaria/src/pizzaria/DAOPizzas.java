package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class DAOPizzas {
    private List<Pizzas> databasePizzas = new ArrayList();
    
    public void create(Pizzas pizza) {
        databasePizzas.add(pizza);
    }
    
    public Pizzas read(int id) {
        for(Pizzas p:databasePizzas) {
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    
    public boolean update(Pizzas pizza) {
        Pizzas pizzaExiste = read(pizza.getId());
        if(pizzaExiste != null) {
            pizzaExiste.setPreco(pizza.getPreco());
            pizzaExiste.setSabor(pizza.getSabor());
            pizzaExiste.setTamanho(pizza.getTamanho());
            return true;
        }
        return false;
    }
    
    public boolean delete(int id) {
        Pizzas pizzaExiste = read(id);
        if(pizzaExiste != null) {
            databasePizzas.remove(pizzaExiste);
            return true;
        }
        return false;
    }
    
    public String listAll() {
        String report = "";
        for(Pizzas p: databasePizzas) {
            report += (p.getId() + " | " + p.getTamanho() + " | " + p.getPreco() + " | " + p.getSabor() + "\n");
        }
        return report;
    }
}
