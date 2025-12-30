
public class SinglyLinkedList
{
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size = 0;
    
    
    /*-------------1.Insert at Beginning------------*/
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
    
    /*-------------2.Insert at End------------*/
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
        }
        
        tail.next = newNode;
        tail = newNode;
    }
    
    
    /*-------------3.Insert at Any index------------*/
    public void insertAtIndex(int index,int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        
        if(index > size)
        {
            System.out.println("Invalid index !!!");
            return;
        }
        int i = 0;
        Node temp = head;
        while(i < index-1)
        {
            temp = temp.next;
            i++;
        }
        
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    /*-------------4.Remove First------------*/
    public int removeFirst()
    {
        if(head == null)
        {
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        }
        int data = head.data;
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return data;
    }
    
    /*-------------5.Remove Last------------*/
    public int removeLast()
    {
        if(head == null)
        {
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        }
        
        Node temp = head;
        for(int i=0;i<size-2;i++)
        {
            temp = temp.next;
        }
        int data = tail.data;
        tail = temp;
        temp.next = null;
        size--;
        return data;
        
    }
    
    /*-------------6.Remove at any index------------*/
    public void removeAtIndex(int index)
    {
        if(index > size-1)
        {
            System.out.println("Invalid index!!!");
            return;
        }
        
        if(index == 1)
        {
            removeFirst();
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++)
        {
            temp = temp.next;
        }
        
        Node nodeToRemove = temp.next;
        temp.next = nodeToRemove.next;
        nodeToRemove.next = null;
        size--;
    }

    /*-------------7.Reverse LL---------------*/
    public void reverse()
    {
        Node curr = tail = head;
        Node prev = null;
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
    
    /*-------------8.Display------------*/
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    /*-------------9.Search By Element---------------*/
    public int search(int element)
    {
        int i = 0;
        Node temp = head;
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
    
    
	public static void main(String[] args) {
		System.out.println("-----------------Singly Linked List--------------");
		SinglyLinkedList ll = new SinglyLinkedList();
		//ll.removeFirst();
		//ll.removeLast();
		ll.addLast(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addLast(60);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addLast(70);
		ll.insertAtIndex(4,45);
		//ll.removeFirst();
		//ll.removeLast();
		ll.removeAtIndex(4);
		//ll.reverse();
		ll.display();
		//System.out.println(ll.search(90));
		System.out.println(size);
	}
}