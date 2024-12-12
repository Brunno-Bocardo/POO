package modelviewcontrollerativo;

public class Principal {
   
    public static void main(String[] args) {
        ModelBA model = new ModelBA();
        ViewBA view = new ViewBA();
        ControllerBA controller = new ControllerBA();
        
        controller.liga(view, model);
        
        model.update("Ai qui dilissa");
    }
}
