import java.util.ArrayList;
class LinkedListPalindrome
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
    
    public void isPalindrome()
    {
        ArrayList<Integer> arraylist = new ArrayList<>();
        Node temp = head;
        while(temp != null)
        {
            arraylist.add(temp.data);
            temp = temp.next;
        }
        int k = arraylist.size()-1;
        for(int i=0;i<arraylist.size()/2;i++)
        {
            if(arraylist.get(i) != arraylist.get(k))
            {
                System.out.println("Not palindrome !!!");
                return;
            }
            k--;
        }
        System.out.println("Palindrome !!!");
    }
    
    
    public static void main(String args[])
    {
        LinkedListPalindrome ll = new LinkedListPalindrome();
        ll.addLast(10);
        ll.add(1,20);
        ll.add(2,30);
        ll.add(3,10);
        ll.add(4,10);
        ll.print();
        System.out.println(ll.size);
        ll.isPalindrome();
    }
}