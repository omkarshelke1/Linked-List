//Omkar Shelke
import java.util.LinkedList;
public class LLCollection
{
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addLast(0);      //adds element to the last  0
		ll.addLast(1);          //0->1
		ll.addFirst(6);             //6->0->1    adds elements to the first
		System.out.println(ll);     //6->0->1       print LinkedList
		ll.removeFirst();           //0->1      removes first element
		ll.removeLast();            //0         removes last element
		ll.add(10);                 //0->10          adds element to the end by default
		ll.add(1,5);                //0->5->10      add element to the specified index
		
		System.out.println(ll.get(2));      //returns element at specified index
		ll.set(2,20);               //0->5->20      replaces element at specifies index
		ll.remove(2);               //removes element at specified index
		//ll.clear();                 //clears linkedlist
		System.out.println(ll.contains(5));     //check whether ll contains that object/value or not
		System.out.println(ll.indexOf(5));     //returns index of object
		System.out.println(ll.lastIndexOf(0));  //returns last index of object
		System.out.println(ll.size());      //returns ll size
		System.out.println(ll.isEmpty());       //check if ll is empty or not
		//ll.toArray();
		System.out.println(ll);
	}
}


/*
🔹 Commonly Used LinkedList Methods
-------------------1. From Collection and List interface----------------------------------

add(E e) – Adds element to the list (end by default).

add(int index, E element) – Inserts element at specific index.

addAll(Collection<? extends E> c) – Adds all elements from another collection.

addAll(int index, Collection<? extends E> c) – Inserts all elements at specific index.

get(int index) – Returns element at index.

set(int index, E element) – Replaces element at index.

remove(int index) – Removes element at index.

remove(Object o) – Removes first occurrence of element.

clear() – Removes all elements.

contains(Object o) – Checks if element exists.

indexOf(Object o) – Returns first index of element.

lastIndexOf(Object o) – Returns last index of element.

size() – Returns number of elements.

isEmpty() – Checks if list is empty.

toArray() – Converts list to array.

iterator() – Returns iterator.

listIterator() – Returns list iterator.

---------------2. From Deque interface----------------

addFirst(E e) – Inserts element at beginning.

addLast(E e) – Inserts element at end.

offer(E e) – Adds element at end (returns true/false).

offerFirst(E e) – Adds element at beginning.

offerLast(E e) – Adds element at end.

peek() – Retrieves head (first element) without removing.

peekFirst() – Same as peek().

peekLast() – Gets last element without removing.

poll() – Retrieves and removes head.

pollFirst() – Retrieves and removes first element.

pollLast() – Retrieves and removes last element.

remove() – Removes head.

removeFirst() – Removes first element.

removeLast() – Removes last element.

getFirst() – Returns first element.

getLast() – Returns last element.

push(E e) – Pushes element onto stack (at front).

pop() – Pops element from stack (removes first).

-------------------------------3. From Queue interface------------------------------

element() – Retrieves head, throws exception if empty.

offer(E e) – Adds element (same as in Deque).

peek() – Retrieves head, returns null if empty.

poll() – Retrieves and removes head, returns null if empty.
*/