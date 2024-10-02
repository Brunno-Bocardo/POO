package pkg3.heranca_01;

public class Arvore {
    private String especie;
    private double altura;
    
    
    public Arvore(String especie, double altura) {
        setEspecie(especie);
        setAltura(altura);
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override // substitui o toString original do java pelo meu
    public String toString() {
        return especie + ", " + altura;
    }
    
    public void showCircunferencia(){
        
    }
}
