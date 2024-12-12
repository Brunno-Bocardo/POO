
package modelviewcontroller;

public class ModelViewController {

    public static void main(String[] args) {
        Model model=new Model();
        View view = new View();
        Controller controller=new Controller();
        
        controller.rotear(view, model);
        model.atualizaDados("Ola mundo :D  -  você está agora, lutando pela sobrevivência");
    }
    
}
