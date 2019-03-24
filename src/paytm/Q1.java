package paytm;

/**
 * package paytm;
 * @author Prakhar Rajput
 *
 *Count frequencies of all elements in array in O(1) extra space and O(n) time
Given an unsorted array of n integers which can contain integers from 1 to n. Some elements can be repeated multiple times and some other elements can be absent from the array. Count frequency of all elements that are present and print the missing elements.

Examples:

Input: arr[] = {2, 3, 3, 2, 5}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 2
        3 -> 2
        4 -> 0
        5 -> 1

Input: arr[] = {4, 4, 4, 4}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 0
        3 -> 0
        4 -> 4
Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
A Simple Solution is to create a count array of size n as the elements are in range from 1 to n. This solution works in O(n) time, but requires O(n) extra space.

How to do it in O(1) extra space and O(n) time?

Below are two methods to solve this in O(n) time and O(1) extra space. Both method modify given array to achieve O(1) extra space.



 

Method 1 (By making elements negative)
The idea is to traverse the given array, use elements as index and store their counts at the index. For example, when we see element 7, 
we go to index 6 and store the count. There are few problems to handle, one is the counts can get mixed with the elements, 
this is handled by storing the counts as negative. Other problem is loosing the element which is replaced by count, 
this is handled by first storing the element to be replaced at current index.
 *
 *ddd
 *
 */

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
