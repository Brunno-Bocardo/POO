package pizzaria;

public class SaborQueijo extends Pizzas {
    static int lastId = 0;
    
    public SaborQueijo(String tamanho) {
        super(tamanho);
        this.id = lastId;
        lastId++;
        
        this.sabor = "Queijo";
        
        if(tamanho == "P") {
            this.preco = 17;
        }
        else if (tamanho == "M") {
            this.preco = 28;
        }
        else {
            this.preco = 33;
        }
    }
}
