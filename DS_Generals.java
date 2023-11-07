
import java.util.*;
/*Listas:
Interfaz List:
ArrayList: Implementación de lista basada en un array dinámico.
LinkedList: Implementación de lista doblemente enlazada.
Vector: Implementación de lista basada en un array dinámico (similar a ArrayList pero sincronizada).
Stack: Implementación de una pila (hereda de Vector).
Mapas:
Interfaz Map:  
HashMap: Implementación de mapa basada en una tabla hash (no garantiza el orden de los elementos).
LinkedHashMap: Implementación de mapa que mantiene el orden de inserción.
TreeMap: Implementación de mapa basada en un árbol (ordena las claves).
Hashtable: Implementación de mapa (similar a HashMap pero sincronizada).
WeakHashMap: Implementación de mapa que utiliza referencias débiles.
IdentityHashMap: Implementación de mapa que compara las claves por identidad en lugar de igualdad.
Colecciones:
Interfaz Collection:
List: Implementaciones de listas como ArrayList, LinkedList, etc.
Set:
HashSet: Implementación de conjunto basada en una tabla hash.
LinkedHashSet: Implementación de conjunto que mantiene el orden de inserción.
TreeSet: Implementación de conjunto basada en un árbol (ordenada).
Queue:
LinkedList: Implementación de cola (puede utilizarse como una cola FIFO).
PriorityQueue: Implementación de cola de prioridad.
Deque:
ArrayDeque: Implementación de cola doble.
LinkedList: Implementación de cola doblemente enlazada.
 */
class ListNode {
    String player;
    ListNode next;

    public ListNode(String player, ListNode next){
        this.player =player;
        this.next = next;
    }

    public void setNext(ListNode node){
        this.next = node;
    }

    public String toString(){
        String result = "";
        ListNode temp =this;
        while(temp!=null){
            result += "["+temp.player+"]";
            temp=temp.next;
        }
        return result;
    }
}
        //TREE
        class Node {
            int value;
            Node left;
            Node right;
        
            public Node(int value) {
                this.value = value;
                left = null;
                right = null;
            }
        private Node addRecursive(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = addRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = addRecursive(node.right, value);
        }

        return node;
        }
        private boolean containsNodeRecursive(Node current,int value){
            if (current == null) {
                return false;
            }
            if (value == current.value) {
                return true;
            }
            return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
        }
        }


public class DS {
   public static void main(String[] args) {
    //ARRAY
    String[] groceries = {"Banana","carrot","apple"};
    System.out.println("Number of groceries" + groceries.length);
    
    for (String grocery : groceries) {
        System.out.println(grocery);
    }
    //ARRAY LIST
    List<String> goriceries2 = new ArrayList<String>();
    goriceries2.add("carrot");
    goriceries2.add("Banana");
    goriceries2.add(1, "dog");
    for (String grocery : goriceries2) {
        System.out.println(grocery);
    }
    System.out.println(goriceries2.size());
    goriceries2.remove(1);
    System.out.println(goriceries2.get(1));
    
    //LINKED LIST
    //LinkedList<String> listaEnlazada = new LinkedList<>();
    //listaEnlazada.add("Manzana");
    ListNode l4 = new ListNode("Messi",null);
    ListNode l3 = new ListNode("Steph",l4);
    ListNode l2 = new ListNode("Ronaldo",l3);
    ListNode l1 = new ListNode("Mizael",l2);
    ListNode temp = l1;
    ListNode l5 = new ListNode("Garnett", null);
    while(temp!=null){
        if(temp.next==null){
            temp.next=l5;
            break;
        }
        temp=temp.next;
    }
    System.out.println(l1.toString());

    //HASH MAP
    Map<String, Integer> mapaEdades = new HashMap<>();

    // Agregar elementos al HashMap
    mapaEdades.put("Juan", 30);
    mapaEdades.put("María", 25);
    mapaEdades.put("Pedro", 35);
    mapaEdades.put("Ana", 28);

    // Acceder a elementos
    int edadJuan = mapaEdades.get("Juan");
    System.out.println("La edad de Juan es " + edadJuan);

    // Verificar si un elemento existe
    boolean contieneMaria = mapaEdades.containsKey("María");
    System.out.println("¿El mapa contiene a María? " + contieneMaria);

    // Recorrer y mostrar todos los elementos del HashMap
    System.out.println("Recorriendo con un bucle 'for-each' a través de las entradas:");
    for (Map.Entry<String, Integer> entrada : mapaEdades.entrySet()) {
        String clave = entrada.getKey();
        Integer valor = entrada.getValue();
        System.out.println("Clave: " + clave + ", Valor: " + valor);
    }

    System.out.println("\nRecorriendo solo las claves con 'keySet()':");
    for (String clave : mapaEdades.keySet()) {
        System.out.println("Clave: " + clave);
    }

    System.out.println("\nRecorriendo solo los valores con 'values()':");
    for (Integer valor : mapaEdades.values()) {
        System.out.println("Valor: " + valor);
    }

    System.out.println("\nRecorriendo con un iterador:");
    Iterator<Map.Entry<String, Integer>> iterador = mapaEdades.entrySet().iterator();
    while (iterador.hasNext()) {
        Map.Entry<String, Integer> entrada = iterador.next();
        String clave = entrada.getKey();
        Integer valor = entrada.getValue();
        System.out.println("Clave: " + clave + ", Valor: " + valor);
    }

    System.out.println("\nRecorriendo con Java 8 Stream API:");
    mapaEdades.forEach((clave, valor) -> {
        System.out.println("Clave: " + clave + ", Valor: " + valor);
    });

    System.out.println(mapaEdades.keySet());
    System.out.println(mapaEdades.values());
    //STACK
    //viene de la clase Vector que implementa la interfaz list
    Stack<Integer> pila = new Stack<>();

        // Empujar elementos a la pila (push)
        pila.push(5);
        pila.push(10);
        pila.push(15);

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // Obtener el elemento en la cima de la pila sin eliminarlo (peek)
        int elementoEnCima = pila.peek();
        System.out.println("Elemento en la cima de la pila: " + elementoEnCima);

        // Sacar (pop) elementos de la pila
        int elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado de la pila: " + elementoEliminado);

        // Tamaño de la pila
        int tamañoPila = pila.size();
        System.out.println("Tamaño de la pila: " + tamañoPila);

        // Recorrer y mostrar la pila
        System.out.print("Elementos en la pila: ");
        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            System.out.print(elemento + " ");
        }


        //QUEUE
        /* Crear una cola utilizando LinkedList
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola (enqueue)
        cola.offer("Elemento 1");//add
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");

        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía? " + cola.isEmpty());

        // Obtener y eliminar el elemento al frente de la cola (dequeue)
        String elementoEnFrente = cola.poll();remove
        System.out.println("Elemento en frente de la cola: " + elementoEnFrente);

        // Tamaño de la cola
        int tamañoCola = cola.size();peek
        System.out.println("Tamaño de la cola: " + tamañoCola);

        // Recorrer y mostrar la cola
        System.out.print("Elementos en la cola: ");
        for (String elemento : cola) {
            System.out.print(elemento + " ");
        }
		
*/

   }
   
}

