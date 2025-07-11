class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        
        public void addFirst(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            
        }
        
        public void addLast(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            
        }
        
        public void printLL()
        {
            Node temp = head;
            if(head == null)
            {
                System.out.println("Linked List is empty !!!");
            }
            while(temp != null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.printLL();
        
        ll.addFirst(1);
        ll.printLL();
        
        ll.addFirst(2);
        ll.printLL();
        
        ll.addLast(3);
        ll.printLL();
        
        ll.addLast(4);
        ll.printLL();
        
        ll.printLL();
        
    }
}

//Output:
//Linked List is empty !!!
//null
//1->null
//2->1->null
//2->1->3->null
//2->1->3->4->null
//2->1->3->4->null


