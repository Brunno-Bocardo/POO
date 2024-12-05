package quebracabeca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brunno Perez Bocardo
 */
public class Peca {
    private Borda bordaCima;
    private Borda bordaBaixo;
    private Borda bordaEsquerda;
    private Borda bordaDireita;

    public Peca(Borda bordaCima, Borda bordaBaixo, Borda bordaEsquerda, Borda bordaDireita) {
        this.bordaCima = bordaCima;
        this.bordaBaixo = bordaBaixo;
        this.bordaEsquerda = bordaEsquerda;
        this.bordaDireita = bordaDireita;
    }

    public Borda getBordaCima() {
        return bordaCima;
    }

    public Borda getBordaBaixo() {
        return bordaBaixo;
    }

    public Borda getBordaEsquerda() {
        return bordaEsquerda;
    }

    public Borda getBordaDireita() {
        return bordaDireita;
    }

    public void setBordaCima(Borda bordaCima) {
        if (this.bordaCima != null) {
            System.out.println("Voce nao pode alterar a borda de uma peca uma vez definida");
            return;
        }
        this.bordaCima = bordaCima;
    }

    public void setBordaBaixo(Borda bordaBaixo) {
        if (this.bordaBaixo != null) {
            System.out.println("Voce nao pode alterar a borda de uma peca uma vez definida");
            return;
        }
        this.bordaBaixo = bordaBaixo;
    }

    public void setBordaEsquerda(Borda bordaEsquerda) {
        if (this.bordaEsquerda != null) {
            System.out.println("Voce nao pode alterar a borda de uma peca uma vez definida");
            return;
        }
        this.bordaEsquerda = bordaEsquerda;
    }

    public void setBordaDireita(Borda bordaDireita) {
        if (this.bordaDireita != null) {
            System.out.println("Voce nao pode alterar a borda de uma peca uma vez definida");
            return;
        }
        this.bordaDireita = bordaDireita;
    }
    
    public boolean encaixar(int p1, int p2, int numPeca) {
        if (p1 == 0 && p2 == 0) {
            if(bordaCima.verificaBorda() && bordaEsquerda.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 1");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 1");
            return false;
        }
        
        else if (p1 == 0 && p2 == 1) {
            if(bordaCima.verificaBorda() && !bordaEsquerda.verificaBorda() && !bordaDireita.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 2");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 2");
            return false;
        }
        
        else if (p1 == 0 && p2 == 2) {
            if(bordaCima.verificaBorda() && bordaDireita.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 3");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 3");
            return false;
        }
        
        else if (p1 == 1 && p2 == 0) {
            if(bordaEsquerda.verificaBorda() && !bordaCima.verificaBorda() && !bordaBaixo.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 4");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 4");
            return false;
        }
        
        else if (p1 == 1 && p2 == 1) {
            if(!bordaEsquerda.verificaBorda() && !bordaCima.verificaBorda() && !bordaBaixo.verificaBorda() && !bordaDireita.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 5");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 5");
            return false;
        }
        
        else if (p1 == 1 && p2 == 2) {
            if(bordaDireita.verificaBorda() && !bordaCima.verificaBorda() && !bordaBaixo.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 6");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 6");
            return false;
        }
        
        else if (p1 == 2 && p2 == 0) {
            if(bordaEsquerda.verificaBorda() && bordaBaixo.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 7");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 7");
            return false;
        }
        
        else if (p1 == 2 && p2 == 1) {
            if(bordaBaixo.verificaBorda() && !bordaDireita.verificaBorda() && !bordaEsquerda.verificaBorda()) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 8");
                return true;
            }
            System.out.println("Peca " + numPeca + " nao pertence na posicao 8");
            return false;
        }
        
        else {
            if(numPeca==9) {
                System.out.println("Peca " + numPeca + " adicionada com sucesso na posicao 9");
                return true;
            } else {
                return false;
            }
            
        }
        
        
    }
}
