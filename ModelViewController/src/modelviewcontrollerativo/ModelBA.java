
package modelviewcontrollerativo;

public class ModelBA {
    ControllerBA controller;
    String dados="";
    
    public void setController(ControllerBA cont) {
        this.controller = cont;
    }
    
    public void update(String dados) {
        this.dados=dados;
        controller.sendMessageToView(dados);
    }
}
