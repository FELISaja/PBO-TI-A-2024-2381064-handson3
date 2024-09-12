package hanson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] KumpulanBuah = new String[] {"appel", "mangga", "pisang", "jeruk"};
        int  counter = 0;
        while (counter < KumpulanBuah.length ){
            System.out.println("elemen ke - " + (counter + 1)+ ":" + KumpulanBuah[counter]);
            counter++;
        }
    }
}
