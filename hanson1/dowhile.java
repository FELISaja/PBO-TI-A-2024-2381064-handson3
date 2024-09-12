package hanson1;

public class dowhile {
    public static void main(String[] args) {
        String[] KumpulanBuah = new String[]{"appel", "mangga", "pisang", "jeruk"};
        int counter = 0;
        do{
            System.out.println("elemen ke - " + (counter + 1)+ ":" + KumpulanBuah[counter]);
            counter++;
        } while (counter < KumpulanBuah.length);
    }
}
