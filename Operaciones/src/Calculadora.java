/**
 * Clase que contiene métodos para realizar operaciones matemáticas.
 */
class Calculadora {
    /**
     * Método para ejecutar el cálculo de un resultado.
     *
     * @param scanner Scanner utilizado para obtener la entrada del usuario.
     */
    
        public void ejecutarCalcularResultado(Scanner scanner) {
            System.out.println("Ingrese cuatro números para la operación:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            double resultado = ((a + b) * (c - d)) / (a * d);
            System.out.println("El resultado de la operación es: " + resultado);
        }
    
}