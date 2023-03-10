package dz4;
import java.util.LinkedList;
import java.util.Queue;


public class z2 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        enqueue(q,"вася");
        enqueue(q,"петя");
        enqueue(q,"маша");
        enqueue(q,"катя");
        enqueue(q,"ваня");
        enqueue(q,"жора");

        System.out.println(q);

        System.out.println(first(q));
        System.out.println(dequeue(q));
        System.out.println(dequeue(q));
        System.out.println(dequeue(q));
        System.out.println(dequeue(q));
        System.out.println(q);
    }

    public static void enqueue(Queue<String> q, String text) {
        q.add(text);
    }

    public static String first(Queue<String> q) {
        return q.element().toString();
    }

    public static String dequeue(Queue<String> q) {
        String tmp = first(q);
        enqueue(q, tmp);
        q.remove();
        return tmp;
    }

}
