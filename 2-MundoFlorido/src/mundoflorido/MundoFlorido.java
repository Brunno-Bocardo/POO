package mundoflorido;

public class MundoFlorido {

    
    public static void main(String[] args) {
//        Petala p1 = new Petala();
//        p1.setCor("vermelho");
//        
//        Petala p2 = new Petala();
//        p2.setCor("amarelo");
//        
//        Flor girassol = new Flor();
//        girassol.setP1(p1);
//        girassol.setP2(p2);
//        girassol.mostrarPetala();
        
        
        
        Flor tulipa = new Flor(new Petala("Azul"),
                               new Petala("Roxo"));
        tulipa.mostrarPetala();
        
        Flor f1 = new Flor();
        f1.adicionarPetala(new Petala("Preto"));
        f1.adicionarPetala(new Petala("Branco"));
        f1.mostrarPetala();
        
    }
    
}
