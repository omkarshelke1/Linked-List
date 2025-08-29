class DoublyLL{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    static int size;
    public void add(int data)
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

    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int remove()
    {
        if(head == null)
        {
            System.out.println("DLL is already empty !!!");
            return 0;
        }
        if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static void main(String args[])
    {
        DoublyLL dll = new DoublyLL();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.print();
        dll.remove();
        dll.print();
        dll.remove();
        dll.print();
        dll.remove();
        dll.print();
        dll.remove();
    }
}
