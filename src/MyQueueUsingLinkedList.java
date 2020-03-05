public class MyQueueUsingLinkedList implements ADT {
    Node front;
    Node end;

    // constructor Non parametrised..........
    MyQueueUsingLinkedList(){
        front=null;
        end=null;
    }

    //method to insert new node
    public void insert(int data){
        Node newNode= new Node(data);
        if(front==null){
            front = newNode;
            end = newNode;
        }
        else{
            end.setNext(newNode);
            end = end.getNext();
        }

    }

    //methode to delete node from front ......
    public void dequeue(){
        if(front==null){
            System.out.println("under flow");
        }
        else{
            front=front.getNext();
        }
    }

    //method to print element of queue............
    public void print(){
        Node temp=front;
        if(front==null){
            System.out.println("no element found");
        }
        else{
            while(temp!=null){
                System.out.println(temp.getData());
                temp=temp.getNext();
            }

        }
    }
}
