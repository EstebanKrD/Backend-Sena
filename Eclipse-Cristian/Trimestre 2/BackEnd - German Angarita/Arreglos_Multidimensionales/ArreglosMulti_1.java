public class ArreglosMulti_1 {
    public static void main(String[] args) {
        char[][] puertoMatriz = new char[5][5];

        for (int i = 0; i < puertoMatriz.length; i++) {
            for (int j = 0; j < puertoMatriz[i].length; j++) {
                puertoMatriz[i][j] = '#';
            }
        }
        
        System.out.println("\n El puerto matriz es ");
         for (int i = 0; i < puertoMatriz.length; i++) {
            for (int j = 0; j < puertoMatriz[i].length; j++) {
                System.out.print(puertoMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
