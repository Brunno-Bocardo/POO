package pizzaria;

public class SaborFrango extends Pizzas {
    static int lastId = 0;
    
    public SaborFrango(String tamanho) {
        super(tamanho);
        this.id = lastId;
        lastId++;
        
        this.sabor = "Frango";
        
        if(tamanho == "P") {
            this.preco = 24;
        }
        else if (tamanho == "M") {
            this.preco = 35;
        }
        else {
            this.preco = 40;
        }
    }
}
