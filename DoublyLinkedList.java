class DoublyLinkedList
{
    class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size = 0;
    
    /*-----------1.Add at Beginning---------*/
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    /*-----------2.Add at End---------*/
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /*-----------3.Add at Any Index---------*/
    public void addAtIndex(int index,int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        if(index == size)
        {
            addLast(data);
            return;
        }
        
        if(index > size)
        {
            System.out.println("Invalid index!!!");
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++)
        {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        size++;
        Node forward = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = forward;
        forward.prev = newNode;
    }

    /*-----------4.Remove From Beginning---------*/
    public void removeFirst()
    {
        if(head == null)
        {
            System.out.println("Linked List is already empty!!!");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        size--;
    }

    /*-----------5.Remove From End---------*/
    public void removeLast()
    {
        if(head == null)
        {
            System.out.println("Linked List is already empty!!!");
            return;
        }
        Node temp = tail.prev;
        temp.next = null;
        tail.prev = null;
        tail = temp;
        size--;
    }

    /*-----------6.Remove at any Index---------*/
    public void removeAtIndex(int index)
    {
        if(index == 0)
        {
            removeFirst();
            return;
        }
        
        if(size == 1)
        {
            head = tail = null;
            return;
        }
        
        if(index == size-1)
        {
            removeLast();
            return;
        }
        
        if(index >= size)
        {
            System.out.println("Invalid index!!!");
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++)
        {
            temp = temp.next;
        }
        Node nodeToBeDeleted = temp.next;
        temp.next = nodeToBeDeleted.next;
        nodeToBeDeleted.next.prev = temp;
        nodeToBeDeleted.next = null;
        nodeToBeDeleted.prev = null;
        size--;
    }

    /*-----------7.Search By Element---------*/
    public int search(int element)
    {
        Node temp = head;
        int i = 0;
        while(temp != null)
        {
            if(temp.data == element)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    /*-----------8.Display---------*/
    public void display()
    {
        System.out.print("null<->");
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /*-----------9.Reverse---------*/
    public void reverse() {
    Node current = head;
    Node temp = null;

    while (current != null) {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;

        current = current.prev;
    }

    if (temp != null) {
        head = temp.prev;
    }
}

    public static void main(String args[])
    {
        System.out.println("***********Doubly Linked List********");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(50);
        dll.addFirst(40);
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addLast(60);
        dll.addLast(70);
        dll.addFirst(10);
        dll.addAtIndex(4,45);
        //dll.removeFirst();
        //dll.removeLast();
        dll.removeAtIndex(4);
        dll.reverse();
        dll.display();
        //System.out.println(dll.search(90));
        System.out.println(size);
    }
}