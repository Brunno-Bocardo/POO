
package cadastropessoax;

import java.util.ArrayList;
import java.util.List;

public class DAOproduto {
    private List<Produto> databaseProduto=new ArrayList();
    
    public void create(Produto p) {
        databaseProduto.add(p);
    }
    
    public Produto read(int id) {
        for(Produto p:databaseProduto) {
            if(p.getId()==id)
                return p;
        }
        return null;    
    }
    
    public boolean update(Produto p) {
        Produto pExiste= read(p.getId());
        if(pExiste!=null) {
            pExiste.setNome(p.getNome());
            return true;
        }
        return false;
    }
    
    public boolean delete(Produto p) {
        Produto pExiste=read(p.getId());
        if(pExiste!=null) {
            databaseProduto.remove(p);
            return true;
        }
        return false;
    }
    
    public String listAll() {
        String report = "";
        for(Produto p: databaseProduto) {
            report+=p.getId()+"\n";
            report+=p.getNome()+"\n";
        }
    return report;
    }
}
