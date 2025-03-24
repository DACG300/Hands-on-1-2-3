public class Laberinto extends Problema {

    public Laberinto() {
        char[][] mundo = {
                //0    1    2    3    -columnas
                {'G', 'E', 'E', 'E'}, // fila 0
                {'E', 'E', 'P', 'W'}, // fila 1
                {'E', 'E', 'E', 'E'}, // fila 2
                {'W', 'E', 'E', 'I'}  // fila 3
        };

        // Definimos el estado inicial y la meta
        Estado inicio = new Estado(3, 3, 'I');  // Inicio en (3,3)
        Estado meta = new Estado(0, 0, 'G');    // Meta en (0,0)

        // Llamamos al constructor de Problema correctamente
        super(inicio, meta, mundo);
    }
}


/*
        //0    1    2    3    -columnas
        {'P', 'E', 'E', 'I'}, // fila 0
        {'E', 'E', 'P', 'W'}, // fila 1       **Solucion no encontrada
        {'E', 'P', 'E', 'E'}, // fila 2
        {'W', 'G', 'E', 'E'}  // fila 3
        };

        // Definimos el estado inicial y la meta
        Estado inicio = new Estado(0, 3, 'I');  // Inicio en (0,3)
        Estado meta = new Estado(3, 1, 'G');    // Meta en (3,1)



        //0    1    2    3    -columnas
        {'E', 'P', 'E', 'E'}, // fila 0
        {'E', 'E', 'P', 'I'}, // fila 1
        {'G', 'E', 'P', 'E'}, // fila 2
        {'W', 'E', 'E', 'E'}  // fila 3
        };

        // Definimos el estado inicial y la meta
        Estado inicio = new Estado(1, 3, 'I');  // Inicio en (1, 3)
        Estado meta = new Estado(2, 0, 'G');    // Meta en (2,0)


        //0    1    2    3    -columnas
        {'I', 'E', 'E', 'E'}, // fila 0
        {'E', 'E', 'E', 'E'}, // fila 1
        {'W', 'P', 'E', 'E'}, // fila 2
        {'G', 'E', 'E', 'E'}  // fila 3
        };

        // Definimos el estado inicial y la meta
        Estado inicio = new Estado(0, 0, 'I');  // Inicio en (0, 0)
        Estado meta = new Estado(3, 0, 'G');    // Meta en (3, 0)

 */