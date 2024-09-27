package PacoteBasico;

public class JavaoPrimeiro {
    private String nome; // atributos normalmente são privados
    
    // --- CONSTRUTORES
    // dizem os parametros bases na hora de instanciar
    public JavaoPrimeiro(){} // pode ser vazio (padrão)
    
    public JavaoPrimeiro(String nome) {
       this.nome = nome;
    }
    
    // --- FUNÇÕES ACESSORAS
    // Set e Get são funções acessoras para acessar o atributo
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    
}
