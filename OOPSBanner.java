public class OOPSBanner {

    public static void printBanner() {

        String[] banner = {
            "**********",
            "*  OOPS BANNER APP  *",
            "*  UC4 - ARRAY LOOP *",
            "**********"
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner();
    }
}
