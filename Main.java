import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problema laberinto = new Laberinto();

        BusquedaDFS dfs = new BusquedaDFS();
        List<String> solucionDFS = dfs.buscar(laberinto);
        System.out.println("Solución DFS: " + (solucionDFS != null ? solucionDFS : "No encontrada"));

        BusquedaBFS bfs = new BusquedaBFS();
        List<String> solucionBFS = bfs.buscar(laberinto);
        System.out.println("Solución BFS: " + (solucionBFS != null ? solucionBFS : "No encontrada"));

        BusquedaHillClimbing hillClimbing = new BusquedaHillClimbing();
        List<String> solucionHillClimbing = hillClimbing.buscar(laberinto);
        System.out.println("Solución Hill Climbing: " + (solucionHillClimbing != null ? solucionHillClimbing : "No encontrada"));
    }
}
