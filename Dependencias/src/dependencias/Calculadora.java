
package dependencias;


public class Calculadora {
    Calculo calculo;
    
    // injeção de dependencia - passar um objeto como parâmetro (objeto dependente)
    public Calculadora(Calculo calculo) {
        this.calculo = calculo;
    }
    
    // inversão de controle - o controle real está no objeto dependente (metodo do obj)
    public double efetuarCalculo(double a, double b) {
        return calculo.efetuar(a, b);
    }
}
