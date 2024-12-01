
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
    
    public boolean update(DiaTrabalho diaTrabalho) {
        DiaTrabalho diaTrabalhoExiste = read(diaTrabalho.getId());
        if(diaTrabalhoExiste != null) {
            diaTrabalhoExiste.setPedidosDoDia(diaTrabalho.getPedidosDoDia());
            return true;
        }
        return false;
    }

    public boolean delete(DiaTrabalho diaTrabalho) {
        DiaTrabalho diaTrabalhoExiste = read(diaTrabalho.getId());
        if(diaTrabalhoExiste != null) {
            databaseDiaTrabalho.remove(diaTrabalho);
            return true;
        }
        return false;
    }
    
    public String listAll() {
        StringBuilder report = new StringBuilder();
        for (DiaTrabalho dia : databaseDiaTrabalho) {
            float totalDia = 0;
            int numeroPedidos = dia.getPedidosDoDia().size();

            for (Pedidos pedido : dia.getPedidosDoDia()) {
                totalDia += pedido.getTotalPedido();
            }

            report.append("===== DIA ").append(dia.getId()).append(" =====\n");
            report.append("Total do Dia: R$ ").append(String.format("%.2f", totalDia)).append("\n");
            report.append("Numero de Pedidos: ").append(numeroPedidos).append("\n");
            report.append("------------------------\n");
        }
        return report.toString();
    }

}
