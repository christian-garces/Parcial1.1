/**
 * Clase que representa el menú principal del programa.
 */

class Menu {
    private Scanner scanner;
    /**
     * Constructor de la clase Menu.
     */
    public Menu() {
        scanner = new Scanner(System.in);
    }
    /**
     * Método para mostrar el menú y gestionar las opciones del usuario.
     */
    public void mostrar() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            switch (opcion) {
                case 1 -> new Ordenamiento().ejecutarOrdenamientoEnteros();
                case 2 -> new Ordenamiento().ejecutarOrdenamientoStrings();
                case 3 -> new Primo().ejecutarVerificarPrimo(scanner);
                case 4 -> new Calculadora().ejecutarCalcularResultado(scanner);
                case 5 -> System.out.println("¡Gracias por usar el programa!");
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 5);
        scanner.close();
    }
    /**
     * Método para mostrar las opciones del menú.
     */
    private void mostrarOpciones() {
        System.out.println("----- Menú -----");
        System.out.println("1. Ordenar arreglo de enteros");
        System.out.println("2. Ordenar arreglo de strings");
        System.out.println("3. Verificar si un número es primo");
        System.out.println("4. Calcular resultado");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
    /**
     * Método para obtener la opción seleccionada por el usuario.
     *
     * @return La opción seleccionada por el usuario.
     */
    private int obtenerOpcion() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.next();
            return -1;
        }
    }
}
