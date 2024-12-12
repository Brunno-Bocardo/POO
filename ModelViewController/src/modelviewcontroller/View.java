
package modelviewcontroller;

public class View {
    String dados="";
    Model model;
    
    public void setModel(Model model) {
        this.model = model;
    }
    
    public void mostrarDados() {
        System.out.println("0 - " + dados);
    }
    
    public void update() {
        dados = model.getDados();
        mostrarDados();
    }
    
    public void atualizaDados(String dados) {
        model.atualizaDados(dados);
    }
}
