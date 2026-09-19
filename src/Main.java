public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print("Valor de i: " + i);

            if (i == 5) {
                System.out.println("Parando loop");
                break;
            }
        }
    }
}