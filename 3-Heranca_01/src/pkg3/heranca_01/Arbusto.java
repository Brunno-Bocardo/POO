package pkg3.heranca_01;

// arbusto nesse caso é uma especialização da superclasse (Arvore)
public class Arbusto extends Arvore {
    String formato;
    
    public Arbusto(String especie, double altura, String formato) {
        // o super instancia a classe arvore
        // só depois eu posso instanciar Arbusto
        super(especie, altura);
        
        setEspecie(especie);
        setAltura(altura);
        this.formato = formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
        
        super.showCircunferencia();
        // mesmo que tenha reescrito o método
        // usando o super. eu acesso o original
    }
    
    // reescrever o método da superclasse
    @Override
    public void showCircunferencia(){
        
    }
}
