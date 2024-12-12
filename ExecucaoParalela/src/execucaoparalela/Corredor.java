package execucaoparalela;

public class Corredor implements Runnable {
    
    // usar o "extends Thread" é ruim, pois limita a classe em sua unica herança
    // a interface Runnable foi criada para ser uma forma de contornar isso
    // já que uma classe pode implementr varias interfaces
    
    @Override
    public void run() {
        while(true) {
            System.out.println("Corredor");
        }
    }
}
