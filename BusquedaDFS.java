import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class BusquedaDFS {
    public List<String> buscar(Problema problema) {
        Stack<Nodo> frontera = new Stack<>();
        Set<Integer> explorados = new HashSet<>();
        frontera.push(new Nodo(problema.inicial, null, 0));

        while (!frontera.isEmpty()) {
            Nodo nodo = frontera.pop();
            if (nodo.estado.esIgual(problema.meta)) return reconstruirSolucion(nodo);
            explorados.add(nodo.estado.hashCode());
            for (Estado sucesor : problema.sucesores(nodo.estado)) {
                if (!explorados.contains(sucesor.hashCode())) {
                    frontera.push(new Nodo(sucesor, nodo, nodo.costo + 1));
                }
            }
        }
        return null;
    }

    private List<String> reconstruirSolucion(Nodo nodo) {
        List<String> solucion = new ArrayList<>();
        while (nodo != null) {
            solucion.add("(" + nodo.estado.x + ", " + nodo.estado.y + ")");
            nodo = nodo.padre;
        }
        Collections.reverse(solucion);
        return solucion;
    }
}
