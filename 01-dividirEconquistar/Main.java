public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int alvo = 11; //número a ser buscado no array

        // Teste da busca binária iterativa
        if (binarySearch(array, alvo)) {
            System.out.println("Elemento " + alvo + " encontrado!");
        } else {
            System.out.println("Elemento " + alvo + " não encontrado.");
        }

        // Teste da busca binária recursiva
        if (binarySearch(array, alvo, 0, array.length - 1)) {
            System.out.println("Elemento " + alvo + " encontrado!");
        } else {
            System.out.println("Elemento " + alvo + " não encontrado.");
        }
    }

    // Busca binária iterativa com laço for
    public static boolean binarySearch(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;

        for (int i = low; i <= high; i++) {
            int mid = (low + high) / 2;

            if (array[mid] == num) {
                return true; // Elemento encontrado
            } else if (array[mid] < num) {
                low = mid + 1; // Busca na metade superior
            } else {
                high = mid - 1; // Busca na metade inferior
            }
        }

        return false; // Elemento não encontrado
    }

    // Busca binária recursiva
    public static boolean binarySearch(int[] array, int num, int indiceInicio, int indiceFim) {
        if (indiceInicio > indiceFim) {
            return false; // Elemento não encontrado
        }

        int mid = (indiceInicio + indiceFim) / 2;

        if (array[mid] == num) {
            return true; // Elemento encontrado
        } else if (array[mid] < num) {
            return binarySearch(array, num, mid + 1, indiceFim); // Busca na metade superior
        } else {
            return binarySearch(array, num, indiceInicio, mid - 1); // Busca na metade inferior
        }
    }
}

