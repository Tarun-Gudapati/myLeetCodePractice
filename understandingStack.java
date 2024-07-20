import java.util.Scanner;
import java.util.Stack;

public class UnderstandingStackDs {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            st.push(getInput(sc));
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

    }

    public static String getInput(Scanner sc) {
        String s = sc.next();
        return s;
        st.close;
    }
}
