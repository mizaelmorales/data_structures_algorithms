import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        
        //STACK
        //viene de la clase Vector que implementa la interfaz 
        //uses of stack
        //1.undo/redo features in text
        //moving back/forward in browser
        //backtracking algos maze file directories
        //callin functions
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
    }
}
