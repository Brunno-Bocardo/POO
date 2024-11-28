
package pizzaria;

public class SaborPortuguesa extends Pizzas {
    static int lastId = 0;
    
    public SaborPortuguesa(String tamanho) {
        super(tamanho);
        this.id = lastId;
        lastId++;
        
        this.sabor = "Portuguesa";
        
        if(tamanho == "P") {
            this.preco = 20;
        }
        else if (tamanho == "M") {
            this.preco = 30;
        }
        else {
            this.preco = 36;
        }
    }
}
