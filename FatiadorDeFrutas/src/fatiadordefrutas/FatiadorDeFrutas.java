
package fatiadordefrutas;


public class FatiadorDeFrutas {

    public static void main(String[] args) {
        impMorango morango = new impMorango();
        impMelancia melancia = new impMelancia();
        
        Fatiador fatiador = new Fatiador(morango);
        System.out.println(fatiador.efetuarCorte(20));
        
        Fatiador fatiador2 = new Fatiador(melancia);
        System.out.println(fatiador2.efetuarCorte(20));
    }
    
}
