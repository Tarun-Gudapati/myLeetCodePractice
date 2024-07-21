import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * UnderstandingQueue
 */
public class UnderstandingQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("10");
        queue.add("20");
        queue.add("30");
        int len = queue.size();

        System.out.println(reversedQue(queue));

    }

    public static Queue<String> reversedQue(Queue<String> queue) {
        int len = queue.size();
        Stack<String> st = new Stack<>();

        while (len > 0) {

            String e = queue.poll();
            st.push(e);
            len--;
        }
        len = st.size();
        while (len > 0) {

            String m = st.pop();
            queue.add(m);
            len--;
        }
        return queue;
    }
}
