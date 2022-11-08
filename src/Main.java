public class Main {
    public static void main(String[] args) {
        String characterSet = "Я родился в 1670 году";
        String[] symbols = characterSet.split(" ");
        for (String symbol : symbols) {
            System.out.println(symbol);
        }
    }
}