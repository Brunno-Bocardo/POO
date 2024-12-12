package modelviewcontroller;

public class Controller {
    public void rotear(View view, Model model) {
        view.setModel(model);
        model.setView(view);
    }
}
