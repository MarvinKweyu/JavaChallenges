public class stantonMeasureCheck {
    public static void main(String args[]) {
        int[] myArray = { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 };

        System.out.println("the statnton measure is: " + stantonMeasure(myArray));

    }

    public static int stantonMeasure(int[] a) {
        int result = 0;

        int numberOf1 = 0;
        for (int num : a) {
            if (num == 1) {
                numberOf1 += 1;
            }
        }

        // count
        for (int num : a) {
            if (num == numberOf1) {
                result += 1;
            }
        }
        return result;
    }
}
