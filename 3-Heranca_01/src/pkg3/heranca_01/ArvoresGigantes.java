package pkg3.heranca_01;

public class ArvoresGigantes extends Arvore {
    private int idade;
    
    public ArvoresGigantes(String especie, double altura, int idade) {
        super(especie, altura);
        setEspecie(especie);
        setAltura(altura);
        this.idade = idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
