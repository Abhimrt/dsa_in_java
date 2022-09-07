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

    void newNode(int data){
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
        if(head == null){
            System.out.println("Linked list is not null");
        }

    }


    public static void main(String[] args) {

    }
}
