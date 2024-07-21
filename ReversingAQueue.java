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
        queue.add("40");
        queue.add("50");
        queue.add("60");

        int target = 4;
        System.out.println(reverseTargetedAreaInAQueue(queue, target));

        // System.out.println(reversedQue(queue));

    }

    public static Queue<String> reverseTargetedAreaInAQueue(Queue<String> queue, int target) {
        int len = target;
        Stack<String> stack = new Stack<>();
        while (len > 0) {
            String e = queue.poll();
            stack.push(e);
            len--;

        }
        len = stack.size();
        while (len > 0) {

            String m = stack.pop();
            queue.add(m);
            len--;
        }
        int repeatTimes = queue.size() - target;
        while (repeatTimes > 0) {

            String x = queue.poll();
            queue.add(x);
            repeatTimes--;

        }

        return queue;
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
