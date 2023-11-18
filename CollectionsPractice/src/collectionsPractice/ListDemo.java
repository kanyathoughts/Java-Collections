package collectionsPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	private void arrayListDemo() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3); //duplicates allowed in arrayList
		list1.add(null); // null values allowed in arrayList
		System.out.println(list1);
		list1.remove(2); //In collection it will remove the exact element in the arrayList but we want to remove the element by giving index 
		//we have to use List interface instead of collection interface.
		//In the collection interface we have remove method by giving element but in List we can give index of the element.
		System.out.println(list1);
		list1.add(0, 33);
		System.out.println(list1);
		list1.set(3, 20);
		System.out.println(list1);
		int fisrtValue = list1.get(0);
		System.out.println("fisrtValue = " + fisrtValue);
		System.out.println("list size = " + list1.size());
		
		//bulk operations
		Collection<Integer> list2 = new ArrayList<>();
		list2.addAll(list1);
		System.out.println("list2 : " + list2);
		list2.remove(null);
		list2.remove(33);
		System.out.println("list2 : " + list2);
		list1.removeAll(list2);
		System.out.println("list1 : " + list1);
		list2.add(33);
		System.out.println("list2 : " + list2);
		list1.retainAll(list2);
		System.out.println("list1 : " + list1);
		list1.addAll(list2);
		System.out.println("list1 : " + list1);
		list1.set(2, 3);
		System.out.println("list1 : " + list1);
		
		//search operations
		System.out.println(list1.contains(3));
		System.out.println(list1.indexOf(33));
		System.out.println(list1.lastIndexOf(33));
		
		//Range-view operations
		List<Integer> list3 = list1.subList(2, 3); //sublist changes will reflect in the parent list.
		System.out.println("list3 : " + list3);
		list3.add(0, 5); 						   //Will add element at the 2nd index of parent list bcoz the 2nd index value is the 0'th value of sublist.
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
		list3.set(0, 9);							//will set in both lists.
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
		list1.set(3, 10);							//will set in both lists. (non-structural change in parent list will not effect sub list)
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
		list1.add(0, 25);							// Structural change in parent list will not allow print the sub list.
		//System.out.println("list3 : " + list3); //ConcurrentModificationexception
		
		//for each
		for (Integer element:list1) {
			System.out.println("element : " + element);
			/*if (element == 10) {
				list1.remove(element); 
			}                                  //we can not add or remove elements to the lists in the for each loop for this we have to use iterator.
			if (element == 10) {
				list1.add(20);
			}*/
		}
		
		//for loop
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("element" + i + " = " + list1.get(i));
			if (list1.get(i) == 10) {
				list1.remove(i);
			}
		}
		System.out.println("list1= " + list1);
		
		Iterator<Integer> iterator = list2.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println("element = " + element);
			if (element == 20) {
				iterator.remove();
			}
			
		}
		System.out.println("list2 : " + list2);
		
	}
	
	private static void listIteratorDemo() {
		List<String> list = new LinkedList<>();
		list.add("kanya");
		list.add("Jashu");
		list.add("buddi");
		for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
			System.out.println("next index: " + iterator.nextIndex() + ", next element: " + iterator.next());
			if (iterator.nextIndex() == 1) {
				iterator.add("kumari");
				iterator.add("daddy");
				iterator.previous();
				System.out.println("iterator.nextIndex(): " + iterator.nextIndex());
				iterator.remove();
				iterator.previous();
				System.out.println("iterator.nextIndex(): " + iterator.nextIndex());
				iterator.remove();
			}
			if (iterator.nextIndex() == 2) {
				iterator.set("mummy");
			}
		}
		
		for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
	}
	
	private static void dequeDemo() {
		Deque<String> deque = new LinkedList();
		
		//Deque acts as queue
		deque.add("kanya");
		deque.add("jashu");    //same order follows as it is queue.
		deque.add("buddi");
		System.out.println(deque);
		
		//Deque acts as stack
		deque.push("daddy");
		deque.push("Mummy");   //reverse order follows as it is stack.
		System.out.println("stack deque = " + deque);
		deque.pop();
		System.out.println("stack deque = " + deque);
		deque.remove();    //removes last element as queue
		System.out.println("deque = " + deque);
		deque.add("pinni");
		System.out.println("deque = " + deque);
		//deque.remove("pinni");
		deque.removeFirst();
		System.out.println("deque = " + deque);
		deque.removeLast();
		System.out.println("deque = " + deque);
		deque.push("daddy");
		deque.push("Mummy");   //reverse order follows as it is stack.
		deque.push("dolly");
		deque.addFirst("buddi"); //queue so first element only added.
		System.out.println("deque = " + deque);
		deque.addLast("jashu");  //queue so last element only added.
		System.out.println("deque = " + deque);
		//iterate through deque.
		for (Iterator<String> iterator = deque.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------------------------------------------");
		//iterate through while loop
		Iterator<String> iterator1 = deque.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		ListDemo obj1 = new ListDemo();
		//obj1.arrayListDemo();
		//listIteratorDemo();
		dequeDemo();
		
	}

}
