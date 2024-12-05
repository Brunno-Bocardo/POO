package quebracabeca;

/**
 *
 * @author Brunno Perez Bocardo
 */
public class Borda {
    private boolean esq;
    private boolean dir;

    public Borda(boolean esq, boolean dir) {
        this.esq = esq;
        this.dir = dir;
    }

    public boolean getEsq() {
        return esq;
    }

    public boolean getDir() {
        return dir;
    }

    public void setEsq(boolean esq) {
        this.esq = esq;
    }

    public void setDir(boolean dir) {
        this.dir = dir;
    }
    
    public boolean verificaBorda() {
        if(dir == true && esq == true) {
            return true;
        } else {
            return false;
        }
    }
}
