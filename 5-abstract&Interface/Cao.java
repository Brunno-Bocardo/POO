package principal;

public class Cao extends Animal {
    @Override
    public void emitirRuido() {
        ruidos = "auau";
        System.out.println(ruidos);
    }
}
