package pizzaria;

public abstract class Pizzas {
    protected int id;
    protected String sabor;
    protected String tamanho;
    protected float preco;

//    public Pizzas() {}
//
    public Pizzas(String tamanho) {
//        this.id = id;
//        this.sabor = sabor;
        this.tamanho = tamanho;
//        this.preco = preco;
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
