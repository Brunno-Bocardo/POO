package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class DAOPedidos {
    private List<Pedidos> databasePedidos = new ArrayList();
    
    public void create(Pedidos pedido) {
        databasePedidos.add(pedido);
    }
    
    public Pedidos read(int id) {
        for(Pedidos p:databasePedidos) {
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    
        public boolean update(Pedidos pedido) {
        Pedidos pedidoExiste = read(pedido.getId());
        if(pedidoExiste != null) {
            pedidoExiste.setCliente(pedido.getCliente());
            return true;
        }
        return false;
    }
    
    public boolean delete(Pedidos pedido) {
        Pedidos pedidoExiste = read(pedido.getId());
        if(pedidoExiste != null) {
            databasePedidos.remove(pedido);
            return true;
        }
        return false;
    }
    
    public String listAll() {
        String report = "";
        for(Pedidos p: databasePedidos) {
            String pizzas = "";
            for(int i=0; i<p.pizzasPorPedidos.size(); i++) {
                pizzas += p.pizzasPorPedidos.get(i).sabor + "(" + p.pizzasPorPedidos.get(i).tamanho + ")" + "  ";
            }
            report += ("N" + p.getId() + " | Cliente: " + p.getCliente() + " \nTotal: R$" + p.getTotalPedido() + " \nPizzas: " + pizzas + "\n\n");
        }
        return report;
    }
}
