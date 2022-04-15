import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<String> input = new Stack<>();
    private Stack<String> output = new Stack<>();
    public static void main(String[] args) {
        QueueWithTwoStacks q = new QueueWithTwoStacks();
        q.enQueue("1");
        q.enQueue("2");
        q.enQueue("3");

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

        q.enQueue("11");
        q.enQueue("22");
        System.out.println(q.deQueue());
        q.enQueue("33");
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }

    private void enQueue(String s) {
        input.push(s);
    }

    private String deQueue() {
        if(!output.isEmpty()) return output.pop();
        while (!input.isEmpty()) output.push(input.pop());
        return output.pop();
    }
}
