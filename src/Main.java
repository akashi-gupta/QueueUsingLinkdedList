public class Main {
    public static void main(String[] args) {
        MyQueueUsingLinkedList obj = new MyQueueUsingLinkedList();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.dequeue();
        obj.print();
    }
}