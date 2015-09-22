
package basic.util;

public class Main {

    public static void main (String args []){
        List<String> lista = new ArrayList();
        
        System.out.println(lista.size());
        
        lista.add("Hola mundo1");
        lista.add("Hola mundo2");
        lista.add("Hola mundo3");
        lista.add("Hola mundo4");
        lista.add("Hola mundo5");
        lista.add("Hola mundo6");
        lista.add("Hola mundo7");
        lista.add("Hola mundo8");
        lista.add("Hola mundo9");
        lista.add("Hola mundo10");
        System.out.println(lista.size());
        System.out.println(lista.toString());

        lista.add("Hola mundo11");
        System.out.println(lista.size());
        System.out.println(lista.toString());
        
        lista.remove(0);
        System.out.println(lista.size());
        System.out.println(lista.toString());
        
        
        
        System.out.println(lista.getIndexOf("Hola mundo2"));
        System.out.println(lista.getIndexOf("Hola mundo1"));
        System.out.println(lista.getIndexOf(null));
        
        List<Numero> lista2 = new OrderedArrayList();
        
        System.out.println(lista2.size());
        lista2.add(new Numero(0));
        lista2.add(new Numero(3));
        lista2.add(new Numero(6));
        lista2.add(new Numero(5));
        lista2.add(new Numero(4));
        lista2.add(new Numero(2));
        lista2.add(new Numero(7));
        lista2.add(new Numero(8));
        lista2.add(new Numero(10));
        lista2.add(new Numero(9));
        lista2.add(new Numero(11));
        lista2.add(new Numero(12));
        lista2.add(new Numero(1));

        lista2.add(new Numero(1));
        System.out.println(lista2.size());
        System.out.println(lista2.toString());
        
    }
    
    
}