public class Printing1toNUsingRecursion {
    public static void main(String[] args) {
        int n = 5;

        // printUpto(n);
        System.out.println(powerUp(2, 3));
    }

    public static void printUpto(int n) {

        if (n == 0) {
            return;
        }

        printUpto(n - 1);
        System.out.println(n);
    }

    public static int powerUp(int base, int exp) {
        if (exp < 1)
            return 1;
        return base * powerUp(base, exp - 1);
    }
}
