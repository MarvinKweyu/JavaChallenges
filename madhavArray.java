public class madhavArray {
    public static void main(String[] args) {
        int[] myArray = { -6, -3, -3, 8, -5, -4 };
        System.out.println("Check if madhav: " + isMadhavArray(myArray));
    }

    private static int isMadhavArray(int[] a) {
        for (int number : a) {

            int calc = number * (number + 1) / 2;
            if (calc != a.length) {

                return 0;
            }

            return 1;
        }
        return 1;
    }
}
