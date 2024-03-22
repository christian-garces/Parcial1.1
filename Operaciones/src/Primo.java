/**
 * Clase que contiene métodos para verificar si un número es primo.
 */
class Primo {
    /**
     * Método para verificar si un número es primo.
     *
     * @param scanner Scanner utilizado para obtener la entrada del usuario.
     */
    public void ejecutarVerificarPrimo(Scanner scanner) {
        System.out.println("Ingrese un número para verificar si es primo:");
        int numero = scanner.nextInt();
        boolean esPrimo = verificarPrimo(numero);
        System.out.println("El número " + numero + " es primo: " + esPrimo);
    }

    /**
     * Método para verificar si un número es primo.
     *
     * @param numero Número a verificar.
     * @return true si el número es primo, false de lo contrario.
     */
    private boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}



