package olamundo;

public class OlaMundo {

    public static void main(String[] args) {
        System.out.println("Ola mundo! o mundo eh foda");
        int a = 1;
        int b = 2;
        System.out.println(a+b); // saiu como a soma (3)
        System.out.println(""+a+b); // saiu tudo como string (12)
        
        double valorPI = 3.1415;
        
        boolean confia = true;
        
        char letra = 'B';
        
        int[] mat = new int[3];
        int[] mat1 = {1,2,3,4};
        
        for(int i=0; i<3; i++) {
            mat[i]=0;
            System.out.println(mat[i]);
        }
        
        double[][] matriz = new double[2][2];
        char[][] matriz2 = {{'a','b'}, {'c','d'}};
        System.out.println(matriz2);
        
        matriz[0][0] = 10;
        for(int i=0; i<2; i++) {  // matriz.length = numero de linhas
            for(int j=0; j<2; j++) {
                matriz[i][j] = 2.1;
            }
        }
        
        int testeSoma = soma(10, 10);
        System.out.println(testeSoma);
        
        int testeSubtracao = subtracao(10, 10);
        System.out.println(testeSubtracao);
        
        int testeMultiplicacao = multiplicacao(10, 10);
        System.out.println(testeMultiplicacao);
        
        int testeDivisao = divisao(10, 10);
        System.out.println(testeDivisao);
    }
    
    // MÉTODOS ========================================================================
    
    public static int soma(int a, int b) {
        return a + b;
    }
    
    public static int subtracao(int a, int b) {
        return a - b;
    }
    
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    
    public static int divisao(int a, int b) {
        return a / b;
    }
    
}
