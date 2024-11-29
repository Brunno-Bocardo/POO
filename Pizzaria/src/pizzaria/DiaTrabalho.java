package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class DiaTrabalho {
    private int id;
    static int lastId = 0;
    List<Pedidos> pedidosDoDia = new ArrayList();
    
    public DiaTrabalho() {
        this.id = lastId;
        lastId++;
    }
    
    // no menu, chamar quando concluir um pedido
    public void addPedido(Pedidos pedido) {
        this.pedidosDoDia.add(pedido);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<Pedidos> getPedidosDoDia() {
        return pedidosDoDia;
    }

    public void setPedidosDoDia(List<Pedidos> pedidosDoDia) {
        this.pedidosDoDia = pedidosDoDia;
    }
}
