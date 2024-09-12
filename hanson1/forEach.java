package hanson1;

public class forEach {
    public static void main(String[] args) {
        String [] KumpulanBuah = new String[] {"appel", "mangga","pisang", "jeruk"};
        for (String namaBuah : KumpulanBuah ){
            if (namaBuah.equals("mangga") || namaBuah.equals("pisang")) {
                continue;
            }
            System.out.println(namaBuah);
        }
    }
}
