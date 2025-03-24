public class Estado {
    int x, y;
    char tipo;

    public Estado(int x, int y, char tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public boolean esIgual(Estado estado) {
        if (estado == null) return false;
        return this.x == estado.x && this.y == estado.y;
    }

    @Override
    public int hashCode() {
        return (x * 31) + y;
    }
}
