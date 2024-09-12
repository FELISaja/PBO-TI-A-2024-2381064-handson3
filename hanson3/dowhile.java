package hanson3;

public class dowhile {
    public static void main(String[] args) {
        int counter = 1;
        do {

            if (counter % 3 == 0) {
                counter++;
                continue;
            }

            if (counter > 15) {
                break;
            }

            System.out.println("Angka: " + counter);
            counter++;
        } while (counter <= 20);
    }
}