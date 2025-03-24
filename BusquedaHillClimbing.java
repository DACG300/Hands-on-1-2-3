import java.util.List;
import java.util.ArrayList;


public class BusquedaHillClimbing {

    public List<String> buscar(Problema problema) {
        Estado estadoActual = problema.inicial;
        List<String> recorrido = new ArrayList<>();

        while (true) {
            recorrido.add("(" + estadoActual.x + ", " + estadoActual.y + ")");
            List<Estado> sucesores = problema.sucesores(estadoActual);
            if (sucesores.isEmpty()) {
                return null;
            }

            Estado mejorSucesor = null;
            int mejorHeuristica = Integer.MAX_VALUE;

            for (Estado sucesor : sucesores) {
                int heuristica = calcularHeuristica(sucesor, problema.meta);

                if (heuristica < mejorHeuristica) {
                    mejorHeuristica = heuristica;
                    mejorSucesor = sucesor;
                }
            }

            if (calcularHeuristica(mejorSucesor, problema.meta) >= calcularHeuristica(estadoActual, problema.meta)) {
                return recorrido;
            }

            estadoActual = mejorSucesor;

            if (estadoActual.esIgual(problema.meta)) {
                recorrido.add("(" + estadoActual.x + ", " + estadoActual.y + ")");
                return recorrido;
            }
        }
    }

    private int calcularHeuristica(Estado estado, Estado meta) {
        return Math.abs(estado.x - meta.x) + Math.abs(estado.y - meta.y);
    }
}
