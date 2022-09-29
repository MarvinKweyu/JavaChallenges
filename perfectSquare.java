
// We return 0 for all numbers in hte negative range
// we then get the square root of the number using the inbuilt fn and cast it to an integer, which converts the float to integer in the event it is one
// we then get the square of the number 

// ToDo: append the question as a comment 
class nextPerfectSquare {
    int isPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        } else {

            int rootOfN = (int) Math.sqrt(n);
            int nextNumber = rootOfN + 1;
            return (int) Math.pow(nextNumber, 2);
        }
    }
}

public class perfectSquare {

    public static void main(String[] args) {
        System.out.println("\nhis returns the perfect square\n");

        nextPerfectSquare value = new nextPerfectSquare();

        // test cases
        System.out.println("The next perfect square: " + value.isPerfectSquare(6));
        System.out.println("The next perfect square: " + value.isPerfectSquare(36));
        System.out.println("The next perfect square: " + value.isPerfectSquare(0));
        System.out.println("The next perfect square: " + value.isPerfectSquare(-5));
    }
}