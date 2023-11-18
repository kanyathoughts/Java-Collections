package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		arraysDemo();
		

	}

	private static void arraysDemo() {
		String[] a1 = {"Kanya","kumari"};
		List<String> list = Arrays.asList(a1); //It will convert an array to an arraylist.
		System.out.println("list: "+list); //fixed size arraylist we can not add or remove elements from this.
		//list.remove(0);
		//list.add("a");
		list.set(0, "jashu");    //we can set the value as it is not affecting the size of the arraylist.
		System.out.println("list: "+list); 
		
		//creating modifiable arraylist from an array.
		List<String> list1 = new ArrayList<>(Arrays.asList(a1));
		System.out.println("list1: "+list1);
		list1.add("kanya");
		System.out.println("list1: "+list1);
		list1.remove(1);
		System.out.println("list1: "+list1);
		
		//If no array is there we can create arraylist by giving elements directly.
		List<String> list2 = Arrays.asList("100","1000");
		System.out.println("list2: " + list2);
		
		List<String> list3 = new ArrayList<>(Arrays.asList(new String[3])); //creating fixed size arraylist and 
		//it can be fixed with null values then we have to set the values into them.We can extend list as well.
		list3.set(0, "a");
		list3.set(1, "b");
		list3.set(2, "c");
		list3.add("a");
		list3.add("a");
		list3.add("a");
		list3.add("a");
		System.out.println("list3: " + list3);
		
		Integer[] array = {4,2,3};
		Arrays.sort(array);
		System.out.println("sorted array: " + Arrays.toString(array)); //print array directly. no need to use for loop
		for(Integer i:array) {
			System.out.println(" "+ i + " ");
		}
		
		
		//searching element in array using binary search.
		System.out.println("index= " + Arrays.binarySearch(array, 4)); 
		System.out.println("index = "+ Arrays.binarySearch(new Integer[] {2,3,4}, 2)); //we can directly give array.
		//here array should be sorted otherwise different results will come.
		System.out.println("index = "+ Arrays.binarySearch(array, 5)); //this element is not there so sorted 
		//array is [2,3,4] it should placed in 3rd index so formula is -(placing index)-1 so -(3)-1=-4.
		Integer[] array2 = Arrays.copyOf(array, 6);
		System.out.println("new array: "+ Arrays.toString(array2)); //we have only 3 values 
		//remaining places will be null as we are converting them into strings.
		
		Arrays.fill(array2, 27);//fill all the elements with the given value.
		System.out.println("new array: "+ Arrays.toString(array2)); 
		
		System.out.println("Equal ? :"+ Arrays.equals(array, array2)); //compare arrays.
		
		//deep equals
		int[][][] b1 = {{{1,2,3},{4,5,6}}}; //3 Dimensional array
		int[][][] b2 = {{{1,2,3},{4,5,6}}};
		System.out.println("Deep Equals ? :"+ Arrays.deepEquals(b1, b2));
		
		int[][] c1 = {{1,2,3},
					  {4,5,6}
					 }; //2 Dimensional array
		int[][] c2 = {{1,2,3},
				  {4,5,6}
				 };
		System.out.println("Deep Equals ? :"+ Arrays.deepEquals(c1, c2));
		
		Object[] d1 = new int[][][] {
									{
										{1,2,3}
									}
									};
									
		int[][] d2 = (int[][]) d1[0];	
		System.out.println(d2[0][0]);//getting inside values
		
		List<String> l1 = new ArrayList<>();
		l1.add("jashu");
		l1.add("buddi");
		l1.add("kanya");
		System.out.println("list: " + l1);
		String[] arr = {"kumari"};
		Collections.addAll(l1, arr); //it will add an array to a list.
		System.out.println("list: " + l1);
		Collections.sort(l1);
		System.out.println("list: " + l1); //sort the list
		System.out.println("is kanya there? :"+ Collections.binarySearch(l1, "kanya")); //return index value and list should be sorted before.
		Collections.reverse(l1);
		System.out.println("reversed list: "+ l1);
		Collections.swap(l1, 0, 2);
		System.out.println("swapped list: "+ l1);
		l1.add("kanya");
		System.out.println(Collections.frequency(l1, "kanya")); //frequency of object //how many times object comes.
		System.out.println(Collections.max(l1));
		System.out.println(Collections.min(l1));
		Collections.shuffle(l1);
		System.out.println("suffeled list: "+ l1); //suffle the list
		
		l1.removeAll(Collections.singleton("kanya"));
		System.out.println("list: " + l1);
		
		//unmodifiable list.
		Collection<String> unmodifiable = Collections.unmodifiableList(l1);
		System.out.println(unmodifiable);
		//unmodifiable.add("a"); //we can not add to this collection but we can add to the list.
		l1.add("kanya");
		System.out.println(unmodifiable); //kanya added.
		
		
		
		
 		
		
		
		
		
		
		
		
		
	}
}
