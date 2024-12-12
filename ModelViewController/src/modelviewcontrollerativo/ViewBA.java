
package modelviewcontrollerativo;

public class ViewBA {
    ControllerBA controller;
    String dados="";
    
    public void setController(ControllerBA cont) {
        this.controller = cont;
    }
    
    public void update(String dados) {
        this.dados=dados;
        mostrar();
    }
    
    public void mostrar() {
        System.out.println(dados);
    }
    
    public void insertData(String dados) {
        controller.sendMessageToModel(dados);
        
    }
}
