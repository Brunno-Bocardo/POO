package programamenu;
import java.util.Scanner;

public class ProgramaMenu {

    public static void main(String[] args) {
        int opcao = 1;
        int[][] matriz = null;
        int valor; 
        int escolha;
       
        while(opcao != 5) {
           menu();
           Scanner leitor = new Scanner (System.in);
           opcao = leitor.nextInt();
           
           switch(opcao) {
                case 1:
                    matriz = criarMatriz();
                    break;
                case 2:
                    if (matriz == null)
                        print("Matriz ainda nao existe");
                    else
                        matriz = preencherMatriz(matriz);
                    break;
                case 3:
                    if (matriz == null)
                        print("Matriz ainda nao existe");
                    else
                        mostrarMatriz(matriz);
                    break;
                case 4:
                    if (matriz == null)
                        print("Matriz ainda nao existe");
                    else{
                        print("Escolha um valor que vai multiplicar a matriz");
                        Scanner leitorValor = new Scanner (System.in);
                        valor = leitorValor.nextInt();
                        matriz = multiplicarMatrizPorEscalar(matriz, valor);
                    }
                    break;
                default:
                    print("\nSaindo\n");
                    break;
                     
           }
        }
    }
    
    public static void menu() {
        print("\n\nOpcao 1 - criar matriz");
        print("Opcao 2 - preencher matriz");
        print("Opcao 3 - mostrar matriz");
        print("Opcao 4 - Valor escalar! ");
        print("Opcao 5 - sair");
    }
    
    public static int[][] criarMatriz() {
        print("Numero de linhas:");
        Scanner leitor1 = new Scanner (System.in);
        int valor1 = leitor1.nextInt();
    
        print("Numero de colunas");
        Scanner leitor2 = new Scanner (System.in);
        int valor2 = leitor2.nextInt();
    
        int[][] matriz = new int[valor1][valor2];
        System.out.printf("Foi criada uma matriz de %d por %d%n", valor1, valor2);
        return matriz;
    }
    
    public static int[][] preencherMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        Scanner leitor = new Scanner(System.in);
    
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Valor da posição [%d][%d]: ", i+1, j+1);
                int valor = leitor.nextInt();
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
    
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Valor da posição [%d][%d]: %d\n", i+1, j+1, matriz[i][j]);
            }
        }
    }
    
    public static int[][] multiplicarMatrizPorEscalar(int[][] matriz, int valor) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] *= valor;
            }
        }
        
        return matriz;
    }

    public static void print(String texto) {
        System.out.println(texto);
    }
}

