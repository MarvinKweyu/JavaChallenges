public class isLegalNumberClass {
    public static void main(String[] args) {

    }

    public static int power(int number, int power) {
        var total = 1;
        for (int i = 0; i < number; i++) {
            total *= power;
        }
        return total;
    }

}
