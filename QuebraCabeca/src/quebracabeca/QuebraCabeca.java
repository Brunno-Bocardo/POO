package quebracabeca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brunno Perez Bocardo
 */
public class QuebraCabeca {

    public static void main(String[] args) {
        List<Peca> pecas = new ArrayList();  
             
        Peca [][]tabuleiro = new Peca[3][3]; 
        
        Borda cima_1 = new Borda(true, true);
        Borda esquerda_1 = new Borda(true, true);
        Borda baixo_1 = new Borda(true, false);
        Borda direita_1 = new Borda(true, false);
        Peca peca1=new Peca(cima_1, baixo_1, esquerda_1,  direita_1);
        
        Borda cima_2 = new Borda(false, true);
        Borda esquerda_2 = new Borda(true, true);
        Borda baixo_2 = new Borda(true, false);
        Borda direita_2 = new Borda(true, false);
        Peca peca2 = new Peca(cima_2, baixo_2, esquerda_2,  direita_2);
        
        Borda cima_3 = new Borda(false, true);
        Borda esquerda_3 = new Borda(true, true);
        Borda baixo_3 = new Borda(true, true);
        Borda direita_3 = new Borda(true, false);
        Peca peca3 = new Peca(cima_3, baixo_3, esquerda_3,  direita_3);
        
        Borda cima_4 = new Borda(true, true);
        Borda esquerda_4 = new Borda(false, true);
        Borda baixo_4 = new Borda(true, false);
        Borda direita_4 = new Borda(true, false);
        Peca peca4 = new Peca(cima_4, baixo_4, esquerda_4,  direita_4);
        
        Borda cima_5 = new Borda(false, true);
        Borda esquerda_5 = new Borda(false, true);
        Borda baixo_5 = new Borda(true, false);
        Borda direita_5 = new Borda(true, false);
        Peca peca5 = new Peca(cima_5, baixo_5, esquerda_5, direita_5);
        
        Borda cima_6 = new Borda(true, false);
        Borda esquerda_6 = new Borda(false, true);
        Borda baixo_6 = new Borda(true, true);
        Borda direita_6 = new Borda(true, false);
        Peca peca6 = new Peca(cima_6, baixo_6, esquerda_6, direita_6);
        
        Borda cima_7 = new Borda(true, true);
        Borda esquerda_7 = new Borda(false, true);
        Borda baixo_7 = new Borda(false, true);
        Borda direita_7 = new Borda(true, true);
        Peca peca7 = new Peca(cima_7, baixo_7, esquerda_7, direita_7);
        
        Borda cima_8 = new Borda(true, false);
        Borda esquerda_8 = new Borda(false, true);
        Borda baixo_8 = new Borda(false, true);
        Borda direita_8 = new Borda(true, true);
        Peca peca8 = new Peca(cima_8,  baixo_8, esquerda_8, direita_8);
        
        Borda cima_9 = new Borda(true, false);
        Borda esquerda_9 = new Borda(false, true);
        Borda baixo_9 = new Borda(true, true);
        Borda direita_9 = new Borda(true, true);
        Peca peca9 = new Peca(cima_9, baixo_9, esquerda_9, direita_9);
        
        pecas.add(peca1);
        pecas.add(peca2);
        pecas.add(peca3);
        pecas.add(peca4);
        pecas.add(peca5);
        pecas.add(peca6);
        pecas.add(peca7);
        pecas.add(peca8);
        pecas.add(peca9);
        
        
        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro.length; j++){
                System.out.print("\n\n===== Analisando posicao: " + i + " - " + j + " =====\n");
                for(int y=0; y<9; y++) {
                    Peca peca = pecas.get(y);
                    boolean pecaAdicionada = peca.encaixar(i, j, y + 1);
                    if(pecaAdicionada) {
                        break;
                    }
                }
            }
        }
    }
    
}
