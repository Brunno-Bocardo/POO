
package execucaoparalela;

public class ExecucaoParalela {

    // THREDS
    // multiplas linhas de processamento - paralelo
    // várias linhas de execução
    public static void main(String[] args) {
        Trabalhador flavia = new Trabalhador();
        Trabalhador brunno = new Trabalhador();
        
        brunno.setNome("Brunno");
        flavia.setNome("Flavia");
        
        flavia.start();
        brunno.start();
        
        brunno.setPriority(9); // pode ser de 0 - 10
        
        Thread thread = new Thread(){
            public void run() {
                while(true) {
                    System.out.println("Anonima");
                }
            }
        };
        thread.start();
        
        
        Corredor corredor = new Corredor();
        Thread thread_corredor = new Thread(corredor);
        thread_corredor.start();
        
        Runnable runnable_thread = new Runnable(){
            public void run() {
                while(true) {
                    System.out.println("AAAAA");
                }
            }
        };
        Thread tt = new Thread(runnable_thread);
        tt.start();
        
        
        
        // =====
        Runnable correlambda=()->{
            while(true) {
                System.out.println("Lambda");
            }
        };
        Thread ttt = new Thread(correlambda);
        ttt.start();
    }
    
    
}
