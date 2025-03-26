import java.util.*;

public class Principal {

    public static void main(String[] args) {
        
        List listaCompras;
        listaCompras = new ArrayList();
        listaCompras.add("Laranja(List)");
        listaCompras.add("Água(List)");
        listaCompras.add("Alface(List)");
        listaCompras.add("Ovo(List)");
        listaCompras.add("Carne(List)");
        listaCompras.add("Frango(List)");
        listaCompras.add("Arroz(List)");
        listaCompras.add("Feijão(List)");
        
        System.out.println(listaCompras);
                 
        Set listaCompras2;
                    
        listaCompras2 = new HashSet();
        listaCompras2.add("Carne(HashSet)");
        listaCompras2.add("Arroz(HashSet)");
        listaCompras2.add("Feijão(HashSet)");
        listaCompras2.add("Frango(HashSet)");
        listaCompras2.add("Alface(HashSet)");
        listaCompras2.add("Laranja(HashSet)");
        listaCompras2.add("Ovo(HashSet)");
        listaCompras2.add("Tomate(HashSet)");
        listaCompras2.add("Batata(HashSet)");
          
        System.out.println(listaCompras2);
            
        Map<String,String> listaCompras3;
        
        listaCompras3 = new HashMap<String,String>();
        listaCompras3.put("carboidrato1","Arroz");
        listaCompras3.put("carboidrato2","Feijão");
        listaCompras3.put("carboidrato3","Batata");
        listaCompras3.put("proteina1","Carne");
        listaCompras3.put("proteina2","Ovo");
        
        System.out.println(listaCompras3);
        
        System.out.println(listaCompras3.get("proteina2"));
        System.out.println(listaCompras3.get("proteina1"));
        System.out.println(listaCompras3.get("carboidrato3"));
        System.out.println(listaCompras3.get("carboidrato2"));
        System.out.println(listaCompras3.get("carboidrato1"));
        
        System.out.println(listaCompras3.containsValue("carboidrato1"));
        System.out.println(listaCompras3.keySet());
        System.out.println(listaCompras3);
        System.out.println(listaCompras3.values());
        
        
        
        

    }
    
}
