package modelviewcontrollerativo;

public class ControllerBA {
    ViewBA view;
    ModelBA model;
    
    public void liga(ViewBA view, ModelBA model) {
        this.view = view;
        this.model = model;
        view.setController(this);
        model.setController(this);
    }
    
    public void sendMessageToModel(String data) {
        model.update(data);
    }
    
    public void sendMessageToView(String data) {
        view.update(data);
    }
}
