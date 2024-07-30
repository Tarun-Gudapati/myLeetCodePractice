import java.util.Scanner;

class UsingMathMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findHypotenuseOfTriangle(a, b));
        sc.close();
    }

    public static int findHypotenuseOfTriangle(int a, int b) {

        return (int) (Math.sqrt(a * a + b * b));
    }

}
