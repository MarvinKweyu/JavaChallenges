public class gurthieSequenceCheck {
    public static void main(String args[]) {
        int[] myArray = { 8, 4, 2, 1 };

        System.out.println("iS my array a gurthie sequence: " + isGuthrieSequence(myArray));

    }

    public static int isGuthrieSequence(int[] a) {
        // Start with a positive number n
        // if n is even then divide by 2
        // if n is odd then multiply by 3 and add 1
        // continue this until n becomes 1
        int isGurthie = 1;

        // check last item in array
        // if this item is not 1, the array is not a gurthie, so return
        if (a[a.length - 1] != 1) {
            return 0;

        }

        for (int i = 0; i < a.length - 1; i++) {
            int nextNumber = a[i + 1];

            if (a[i] % 2 == 0) {

                if (a[i] / 2 != nextNumber) {

                    return 0;
                }
            } else {
                if (a[i] * 3 + 1 != nextNumber) {
                    return 0;
                }
            }

        }

        return isGurthie;
    }
}
