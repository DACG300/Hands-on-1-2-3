import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class BusquedaBFS {
    public List<String> buscar(Problema problema) {
        Queue<Nodo> frontera = new LinkedList<>();
        Set<Integer> explorados = new HashSet<>();
        frontera.add(new Nodo(problema.inicial, null, 0));

        while (!frontera.isEmpty()) {
            Nodo nodo = frontera.poll();
            if (nodo.estado.esIgual(problema.meta)) return reconstruirSolucion(nodo);
            explorados.add(nodo.estado.hashCode());
            for (Estado sucesor : problema.sucesores(nodo.estado)) {
                if (!explorados.contains(sucesor.hashCode())) {
                    frontera.add(new Nodo(sucesor, nodo, nodo.costo + 1));
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
