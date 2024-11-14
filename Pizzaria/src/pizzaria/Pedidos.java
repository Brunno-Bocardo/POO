package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    List<Pizzas> pizzasPorPedidos = new ArrayList();
    private int id;
    private String cliente;
    private float totalPedido;
    
    public Pedidos() {}

    public Pedidos(int id, String cliente, float totalPedido) {
        this.id = id;
        this.cliente = cliente;
        this.totalPedido = totalPedido;
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
