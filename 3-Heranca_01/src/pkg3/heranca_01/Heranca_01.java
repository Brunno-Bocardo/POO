
package pkg3.heranca_01;

public class Heranca_01 {

    public static void main(String[] args) {
        Arvore arvore = new Arvore("Jacaranda", 30);
        Arbusto arbusto = new Arbusto("Arbusto voante do velho oeste", 0.3, "vertical");
        MiniArbusto mini = new MiniArbusto("Relva", 0.1, "Horizontal;");
        
        // polimorfirmo dinamico aq tbm
        Arvore ar = new Arbusto("aa", 0, "oblongo");
        
        imprime(mini);
        
        imprimeTodos(mini);
        imprimeTodos(arvore);
        imprimeTodos(arbusto);
        
        imprimeTodos(arvore, arbusto);
    }
    
    public static void imprime(MiniArbusto m) {
        System.out.println("\n");
        System.out.println(m);
    }
    
    // polimorfismo dinâmico
    public static void imprimeTodos(Arvore m) {
        // aqui a superclass e todos os que a herdam pode ser usados
        // mas as especialidades das sub-classes são ignoradas
        System.out.println("\n");
        System.out.println(m);
    }
    
    // polimorfismo estático - reescrita de um método
    public static void imprimeTodos(Arvore m, Arvore n) {
        System.out.println("\n");
        System.out.println(m);
        System.out.println(n);
    }
}
