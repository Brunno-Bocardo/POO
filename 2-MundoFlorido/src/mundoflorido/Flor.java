package mundoflorido;

public class Flor {
    // COMPOSIÇÃO

    private Petala[] petalas = new Petala[2]; // vetor de petalas
    private int index=0;
    
    public void adicionarPetala(Petala p) {
        petalas[index]=p;
        index++;
    }
    
    public Flor(){}
    
    public Flor(Petala a, Petala b) {
        petalas[0] = a;
        petalas[1] = b;
        index = 2;
    }
    
    public void mostrarPetala() {
        for(int i=0; i<index; i++) {
            System.out.println(petalas[i].getCor());
        }
    }
    
    
}
