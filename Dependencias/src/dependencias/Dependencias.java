
package dependencias;

public class Dependencias {

    public static void main(String[] args) {
        
        Soma soma = new Soma();
        Subtrair subtrair = new Subtrair();
        
        Calculadora calculadora = new Calculadora(soma);
        System.out.println(calculadora.efetuarCalculo(10, 8));
        
    }
    
}
