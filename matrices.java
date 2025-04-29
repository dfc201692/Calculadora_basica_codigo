public class Matrices {

    public static void main(String[] args) {

        // Declaración correcta de la matriz con diferentes tamaños por fila
        int matriz[][] = { {1, 2}, {3, 4, 5} };

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

        // Ejercicio de calificaciones
        int calificaciones[][] = {
            {80, 60, 85},
            {55, 90, 78},
            {60, 100, 56}
        };

        // Rutina para obtener la baja calificación
        int bajaCalificacion = 100;

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                if (calificaciones[i][j] < bajaCalificacion) {
                    bajaCalificacion = calificaciones[i][j];
                }
            }
        }

        // Imprimir la baja calificación
        System.out.println("Baja Calificación = " + bajaCalificacion);
    }
}
