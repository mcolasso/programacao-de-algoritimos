public class numerospares0a50 {
    public static void main(String[] args) {

        int pares = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares entre 1 e 50: " + pares);

    }
}
