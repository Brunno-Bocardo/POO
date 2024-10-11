package principal;

public class Principal {

    public static void main(String[] args) {
        Gato g = new Gato();
        Cao c = new Cao();
        
        darUmTapa(g);
        darUmTapa(c);
    }
    
    public static void darUmTapa(Animal ani) {
        ani.emitirRuido();
    }
    
    public static void darUmTapa(AnimalInterface ani) {
        ani.emitirRuido();
    }
}
