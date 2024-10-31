package cadastropessoax;


public class Pessoa {
    private int id;
    private String cpf;
    private String nome;

    public Pessoa(int id, String cpf, String nome ) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public Pessoa(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
