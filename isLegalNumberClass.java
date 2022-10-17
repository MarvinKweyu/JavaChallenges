/*
A number with a base other than 10 can be written using its base as a subscript. 
For example, 10112 represents the binary number
1011 which can be converted to a base 10 number as follows:
(1 * 20) + (1 * 21) + (0 * 22) + (1 * 23) = 1 + 2 + 0 + 8 = 1110


Write a method named isLegalNumber that takes two arguments.
The first argument is an array whose elements are the digits of the number to test.
The second argument is the base of the number represented by the first argument.
The method returns 1 if the number represented by the array is a legal number in the given base,otherwise it returns 0. 
For example the number 321 4 can be passed to the method as follows:isLegalNumber(new int[]{3,2,1},4)
This call will return 1 because 3214 is a legal base 4 number.
However,since all digits of a base n number must be less than n,
the following call will return 0 because 3716 is not a legal base 6 number(the digit 7 is not allowed)isLegalNumber(new int[]{3,7,1},6)
 */

public class isLegalNumberClass {
    public static void main(String[] args) {
        int myArray[] = { 3, 7, 1 };
        int base = 6;
        System.out.println(islegalNumber(myArray, base));

        int[] array = { 3, 2, 5 }; // should return 213
        base = 8;
        System.out.println(convertToBase10(array, base));

    }

    public static int islegalNumber(int[] a, int base) {
        // return 1 if legal
        for (int number : a) {
            if (number > base) {
                return 0;
            }
        }
        return 1;

    }

    /*
     * Using the <array, base> representation for a number described in the second
     * question write a method named convertToBase10 that
     * converts its <array, base> arguments to a base 10 number if the input is
     * legal for the specified base. If it is not, it returns -1
     */
    public static int convertToBase10(int[] a, int base) {
        if (islegalNumber(a, base) == 0) {
            return -1;
        }

        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            result = result + (number * power(base, i));
        }

        return result;
    }

    public static int power(int number, int power) {
        // Time complexity: O(n)
        var result = 1;
        while (power != 0) {
            result *= number;
            power--;
        }
        return result;
    }

    public static int powerOptimal(int x, int y) {
        // time complexity: O(log n) space complexity: O(1)
        // Todo: come back and understand logic
        int temp;
        if (y == 0)
            return 1;
        temp = powerOptimal(x, y / 2);

        if (y % 2 == 0)
            return temp * temp;
        else {
            if (y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

}
