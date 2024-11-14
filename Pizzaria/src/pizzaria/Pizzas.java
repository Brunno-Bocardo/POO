package pizzaria;

public class Pizzas {
    private int id;
    private String sabor;
    private String tamanho;
    private float preco;

    public Pizzas() {}

    public Pizzas(int id, String sabor, String tamanho, float preco) {
        this.id = id;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    


    
    
}
