import java.util.Arrays;

public class ArreglosMulti_2 {
    public static void main(String[] args) {
        String[][] matriz = new String[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                matriz[i][k] = "-";
            }
        }

        matriz[1][1] = "X";
        matriz[0][0] = "0";

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.deepToString(matriz[i]));

        }

    }
}
