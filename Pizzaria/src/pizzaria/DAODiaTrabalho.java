
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
    
//    MELHORAR ESSE PRINT Q TA TOSCO DEMAIS
    public String listAll() {
        String report = "";
        int cont = 0;
        for(DiaTrabalho dia: databaseDiaTrabalho) {
//            String diaText = "";
//            for(int i=0; i<dia.pedidosDoDia.size(); i++) {
//                diaText += dia.pedidosDoDia.get(i).getTotalPedido() + "(" + p.pizzasPorPedidos.get(i).tamanho + ")" + "  ";
//            }
            report += ("DIA-" + dia.getId() + " \n" );
//                    + "Pedidos: \n" + dia.pedidosDoDia.get(cont).+ " \nPizzas: " + pizzas + "\n\n");
        }
        return report;
    }
}
