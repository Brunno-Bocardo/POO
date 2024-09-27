
package PacoteBasico;

public class ClasseBase {

    public static void main(String[] args) {
        // EXEMPLO 1
        JavaoPrimeiro jp ;
        jp = new JavaoPrimeiro(); // instanciação
        
        jp.setNome("Brunno");
        System.out.println(jp.getNome());
        System.out.println(jp); //Ponteiro
        
        
        // EXEMPLO 2
        JavaoPrimeiro jc = new JavaoPrimeiro("Brunnito");
        System.out.println(jc.getNome());
        
        jc=jp; // jc recebe ponteiro de jp
               // jc vira um ponteiro órfão
               // Garbage Collector vem e coleta jc
        System.out.println(jc.getNome());
    }
    
}
