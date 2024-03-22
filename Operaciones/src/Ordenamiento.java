/**
 * Clase que contiene métodos para realizar operaciones de ordenamiento.
 */
class Ordenamiento {
    /**
     * Método para ejecutar el ordenamiento de un arreglo de enteros.
     */
    class Ordenamiento {
        public void ejecutarOrdenamientoEnteros() {
            int[] arreglo = {1, 9, 23, 4, 55, 100, 1, 1, 23};
            System.out.println("Antes del ordenamiento: " + Arrays.toString(arreglo));
            Arrays.sort(arreglo);
            System.out.println("Después del ordenamiento: " + Arrays.toString(arreglo));
        }
    /**
     * Método para ejecutar el ordenamiento de un arreglo de strings.
     */
    public void ejecutarOrdenamientoStrings() {
        String[] nombres = {"Leon", "Chris", "Jill", "Wesker", "Ada"};
        System.out.println("Antes del ordenamiento: " + Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println("Después del ordenamiento: " + Arrays.toString(nombres));
    }
}