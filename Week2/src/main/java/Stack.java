public class Stack<E> {
    private Node<E> lastNode;
    private int elementCount = 0;
    static class Node<E> {
        E value;
        Node<E> prev;
    }

    public void push(E item) {
        Node<E> node = new Node<>();
        node.value =item;
        if(lastNode != null) node.prev = lastNode;
        lastNode = node;
        elementCount++;
    }

    public E pop() {
        if (lastNode == null) throw new IndexOutOfBoundsException("Cannot pop from an empty stack");
        E value = lastNode.value;
        lastNode = lastNode.prev;
        elementCount--;
        return value;
    }

    public int maximumInteger() {
        if (elementCount == 0) throw new IndexOutOfBoundsException("Nothing to return from an empty stack");
        int max = 0;
        while (elementCount!=0) {
            int value = (Integer) lastNode.value;
            max = Math.max(max, value);
            pop();
        }
        return max;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(1);
        stack.push(30);
        stack.push(20);
        stack.pop();
        stack.push(100);
        stack.push(9);
        stack.push(560);
        stack.pop();
        stack.push(90);
        System.out.println(stack.maximumInteger());
    }

}
