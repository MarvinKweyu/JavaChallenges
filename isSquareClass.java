/*
*Write a function named isSquare that returns 1 if its integer argument is a square of some integer,otherwise it returns 0. 
* Your function must not use any function or method(e.g.sqrt)that comes with a runtime library or // class library!
* The signature of the function is

* int isSquare(int n)
* Example: n = 4, return 1 
* Example: n = 0, return 1, n = 8, return 0
*/
public class isSquareClass {
    public static void main(String args[]) {

        System.out.println("Return value: " + isSquare(8));

    }

    public static int isSquare(int n) {
        // Thought process: check if the number is prime

        if (n == 1) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
