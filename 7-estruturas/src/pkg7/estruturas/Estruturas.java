package pkg7.estruturas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class Estruturas {

    public static void main(String[] args) {
        // ARRAY LIST
        ArrayList<String> times = new ArrayList<>();
        times.add("Baia");
        times.add("Parmera");
        times.add("Chapecocorico");
        
        for(int i=0; i<times.size(); i++)
            System.out.println(times.get(i));
        for(String t:times)
            System.out.println(t);
        
        System.out.println(times.get(2));
        System.out.println(times.size());
        
        
        // MAP
        HashMap<String, String> pessoa=new HashMap();
        pessoa.put("nome1", "Yohanssen");
        pessoa.put("nome2", "Rurre");
        
        System.out.println(pessoa.get("nome2"));
        
        Set<String> chaves=pessoa.keySet();
        for(String pe:pessoa.keySet()) {
            System.out.println(pe);
            System.out.println(pessoa.get(pe));
        }
        
    }
    
}
