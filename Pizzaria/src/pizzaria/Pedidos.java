package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private int id;
    static int lastId = 0;
    List<Pizzas> pizzasPorPedidos = new ArrayList();
    private String cliente;
    private float totalPedido;

    public Pedidos(String cliente) {
        this.id = lastId;
        lastId++;
        this.cliente = cliente;
//        this.pizzasPorPedidos = listaPizzas;
        this.totalPedido = 0;
        
//        for(int i=0; i<listaPizzas.size(); i++) {;
//            this.totalPedido += listaPizzas.get(i).preco;
//        }
    }
    
    public void addPizza(Pizzas pizza) {
        this.pizzasPorPedidos.add(pizza);
        this.totalPedido += pizza.preco;
    }

    public List<Pizzas> getPizzasPorPedidos() {
        return pizzasPorPedidos;
    }

    public void setPizzasPorPedidos(List<Pizzas> pizzasPorPedidos) {
        this.pizzasPorPedidos = pizzasPorPedidos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
