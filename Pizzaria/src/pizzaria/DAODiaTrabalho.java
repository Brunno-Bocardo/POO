
package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class DAODiaTrabalho {
    private List<DiaTrabalho> databaseDiaTrabalho = new ArrayList();
    
    public void create(DiaTrabalho diaTrabalho) {
        databaseDiaTrabalho.add(diaTrabalho);
    }
    
    public DiaTrabalho read(int id) {
        for(DiaTrabalho p:databaseDiaTrabalho) {
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    
//    public boolean update(DiaTrabalho diaTrabalho) {
//        Pedidos pedidoExiste = read(diaTrabalho.getId());
//        if(pedidoExiste != null) {
//            pedidoExiste.setCliente(diaTrabalho.getCliente());
//            return true;
//        }
//        return false;
//    }
//    
//    public boolean delete(Pedidos pedido) {
//        Pedidos pedidoExiste = read(pedido.getId());
//        if(pedidoExiste != null) {
//            databasePedidos.remove(pedido);
//            return true;
//        }
//        return false;
//    }
//    
//    public String listAll() {
//        String report = "";
//        for(Pedidos p: databasePedidos) {
//            String pizzas = "";
//            for(int i=0; i<p.pizzasPorPedidos.size(); i++) {
//                pizzas += p.pizzasPorPedidos.get(i).sabor + "(" + p.pizzasPorPedidos.get(i).tamanho + ")" + "  ";
//            }
//            report += ("N" + p.getId() + " | Cliente: " + p.getCliente() + " \nTotal: R$" + p.getTotalPedido() + " \nPizzas: " + pizzas + "\n\n");
//        }
//        return report;
//    }
}
