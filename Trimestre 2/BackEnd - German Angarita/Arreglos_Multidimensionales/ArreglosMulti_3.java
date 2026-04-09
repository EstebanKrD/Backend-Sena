public class ArreglosMulti_3 {
    public static void main(String[] args) {
        int[][] caja = { { 5, 10 }, { 20, 50 } };

        int sumaTotal = 0;

        for (int i = 0; i < caja.length; i++) {
            for (int f = 0; f < caja[i].length; f++) {
                sumaTotal += caja[i][f];
            }
        }

        System.out.println("El total es " + sumaTotal);
    }
}
