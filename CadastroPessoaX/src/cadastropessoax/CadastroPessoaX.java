
package cadastropessoax;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoaX {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas=new ArrayList();
        
        Pessoa p1=new Pessoa();
        p1.setCpf("1234");
        p1.setNome("Jesse");
        
        Pessoa p2=new Pessoa();
        p2.setCpf("5675");
        p2.setNome("James");
        
        Pessoa p3=new Pessoa();
        p3.setCpf("5555");
        p3.setNome("Meow");
        
        listaPessoas.add(p1);
        listaPessoas.add(p3);
        listaPessoas.add(p2);
        
        for(Pessoa p:listaPessoas) {
            System.out.println(p.getCpf() + " " + p.getNome());
        }
        
        Pessoa xp = listaPessoas.get(0);
        listaPessoas.remove(p3);
        
        for(Pessoa p:listaPessoas) {
            System.out.println(p.getCpf() + " " + p.getNome());
        }
        
        boolean contemObjeto = listaPessoas.contains(p1);
        if (contemObjeto) {
            System.out.println("Contem");
        }
        
        
        // =====================================================
        
        // DAO: data access object
        
        DAOPessoa daoPessoa=new DAOPessoa();
        
        // inserção
        daoPessoa.create(new Pessoa(1, "111", "Jao"));
        daoPessoa.create(new Pessoa(2, "222", "Miranda"));
        
        System.out.println(daoPessoa.listAll());
        
        // exclusão
        Pessoa pessoaSD=daoPessoa.read(1);
        daoPessoa.delete(pessoaSD);
        
        // update
        Pessoa pessoaUP = new Pessoa(2, "444", "Miranda");
        daoPessoa.update(pessoaUP);
        
        System.out.println(daoPessoa.listAll());
        
        
        // ========================================================
        
        DAOproduto daoProduto = new DAOproduto();
        
        daoProduto.create(new Produto(1, "PS5"));
        System.out.println(daoProduto.listAll());
    }
    
}
