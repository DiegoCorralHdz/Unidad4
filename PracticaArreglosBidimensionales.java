package practicaarreglosbidimensionales;

public class PracticaArreglosBidimensionales {

    public static void main(String[] args) {

        char[][] vocales = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'}
        };
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(vocales [i][j] + " ");
            }
            System.out.println();
        }
    }
}
