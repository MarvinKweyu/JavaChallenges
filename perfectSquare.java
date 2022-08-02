
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
        System.out.println("This returns the perfect squaere");
        nextPerfectSquare value = new nextPerfectSquare();
        System.out.println("The next perfect square: " + value.isPerfectSquare(-5));
    }
}