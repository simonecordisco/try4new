public class Main {

    public static void main(String[] args) {
        int[] array = {10, 5, 0};

        eseguiOperazioni(array);
        System.out.println("Blocco di codice eseguito");
    }

    public static void eseguiOperazioni(int[] array) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        for (int i = 0; i <= array.length; i++) {
            int risultato = array[i] / 0;
            System.out.println("Risultato: " + risultato);

            System.out.println(" blocco nel ciclo.");
        }
    }
}