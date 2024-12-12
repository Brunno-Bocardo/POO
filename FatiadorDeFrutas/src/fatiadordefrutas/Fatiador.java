
package fatiadordefrutas;

public class Fatiador {
    IObjetoCortante objCortante;
    
    // injeção de dependencia - passar um objeto como parâmetro (objeto dependente)
    public Fatiador(IObjetoCortante objCortante) {
        this.objCortante = objCortante;
    }
    
    // inversão de controle - o controle real está no objeto dependente (metodo do obj)
    public double efetuarCorte(double a) {
        return objCortante.fatiar(a);
    }
}
