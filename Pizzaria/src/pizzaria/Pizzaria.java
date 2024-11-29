package pizzaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzaria {

    public static void main(String[] args) {
        DAOPizzas daoPizzas = new DAOPizzas();
        DAOPedidos daoPedidos = new DAOPedidos();
        DAODiaTrabalho daoDiaTrabalho = new DAODiaTrabalho();
        
        SaborFrango pizza1 = new SaborFrango("P");
        SaborQueijo pizza3 = new SaborQueijo("M");
        SaborFrango pizza2 = new SaborFrango("G");
        daoPizzas.create(pizza1);
        daoPizzas.create(pizza3);
        daoPizzas.create(pizza2);
        System.out.println(daoPizzas.listAll());
        
        
        
//        CRIAR PEDIDO NOVO
        Pedidos pedido1 = new Pedidos("Bob o construtor");
        pedido1.addPizza(pizza2);
        daoPedidos.create(pedido1);
                
        Pedidos pedido2 = new Pedidos("Bob Esponja"); 
        pedido2.addPizza(pizza1);
        daoPedidos.create(pedido2);
        
        System.out.println(daoPedidos.listAll());
        
        DiaTrabalho dia1 = new DiaTrabalho();
        dia1.addPedido(pedido1);
        dia1.addPedido(pedido2);
        
        daoDiaTrabalho.create(dia1);
        System.out.println(daoDiaTrabalho.listAll());
        
        Scanner ler = new Scanner(System.in);
        int op=1;
        
        do {
            
        } while (op!=0);
        
    }
    
}
