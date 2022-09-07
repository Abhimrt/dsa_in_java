package dsa.paylist.Linked_list;

public class SLL {

     class Linkedlist{
        int data;
        Linkedlist next = null;

        public Linkedlist(int data) {
            this.data = data;
        }
    }

    Linkedlist head = null;
    Linkedlist tail = null;

    void nextNode(int data){
       Linkedlist next = new Linkedlist(data);
       if(head==null){
           head = next;
           tail = next;
       }else {
           tail.next = next;
           tail = next;
       }
    }

    void display(){
        if(head == null) {
            System.out.println("Linked list is not null");
        }else{
            Linkedlist current = head;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }


    public static void main(String[] args) {
        SLL newNode = new SLL();

        newNode.nextNode(2);
        newNode.nextNode(3);
        newNode.nextNode(4);
        newNode.nextNode(5);

        newNode.display();
    }
}
