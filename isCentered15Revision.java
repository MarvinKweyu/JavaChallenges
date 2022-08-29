public class isCentered15Revision {

    public static void main(String args[]) {
        // int[] myArray = { 2, 10, 4, 1, 6, 9 };
        int[] mySecondArray = { 0, 10, 9, 8, 1, 15, 14, 1, 7, 10 };
        System.out.println("the array is centered: " + isCentered15(mySecondArray));

    }

    public static int isCentered15(int[] a) {
        int startIndex = 1;

        while (startIndex != a.length - 2) {// in our case a.length == 7

            int sum = 0;

            for (int i = startIndex; i < a.length - 1; i++) {

                sum = sum + a[i];

                if (sum == 15) {
                    System.out.println("i value: " + i + " When startIndex is: " + startIndex);

                    if (a.length - i - 1 == startIndex) {// checking whether the sequence is preceded by same number of
                                                         // elements

                        return 1;

                    }
                }
            }

            startIndex++;

        }
        return 0;
    }
}
