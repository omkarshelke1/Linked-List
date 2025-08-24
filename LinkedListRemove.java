class LinkedListRemove
{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    static int size;
    
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
        head = newNode;
    }
    
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
        tail = newNode;
    }
    
    public void add(int index,int data)
    {
        Node newNode = new Node(data);
        size++;
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i=0;
        while(i < index-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty.");
            return 0;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
        
    }
    
    public int removeLast()
    {
        if(size == 0){
            System.out.println("LL is empty.");
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int i = 0;
        Node temp = head;
        while(i < size-2)
        {
            temp = temp.next;
            i++;
        }
        int val = tail.data;     //temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    
    public int search(int key)
    {
        Node temp = head;
        int i = 0;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public int delete(int index)
    {
        if(index == 0)
        {
            removeFirst();
            return 0;
        }
        Node temp = head;
        int i = 0;
        while(i < index-1)
        {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }
    
    public int deleteFromEnd(int index)
    {
        if(index > size)
        {
            System.out.println("Index is greater than size of the linkedlist.");
            return 0;
        }
        if(index == size)
        {
            removeFirst();
            return 0;
        }
        Node temp = head;
        int i = 1;
        while(i < size - index)
        {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }
    public static void main(String args[])
    {
        LinkedListRemove ll = new LinkedListRemove();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(30);
        ll.addLast(50);
        ll.add(3,40);
        //ll.add(0,70);
        //ll.removeFirst();
        //System.out.println(ll.removeLast());
        ll.print();
        //System.out.println(ll.search(80));
        //ll.reverse();
        ll.deleteFromEnd(100);
        ll.print();
        System.out.println(ll.size);
    }
}