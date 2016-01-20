package collectionFramework;
import java.util.*;  
	public class ListIteratorEx 
	{
	public static void main(String args[]){  
	  
	ArrayList<String> al=new ArrayList<String>();  
	 al.add("Mouni");//adding object in arraylist  
	  al.add("chinni");  
	  al.add("bujji");  
	  al.add("boochi");   
	  
	System.out.println("element at 2nd position: "+al.get(2));  
	  
	ListIterator<String> itr=al.listIterator();  
	  
	System.out.println("traversing elements in forward direction...");  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }  
	    
	System.out.println("traversing elements in backward direction...");  
	while(itr.hasPrevious()){  
	System.out.println(itr.previous());  
	 }  
	}    
}
/*Output:
 * element at 2nd position: bujji
traversing elements in forward direction...
Mouni
chinni
bujji
boochi
traversing elements in backward direction...
boochi
bujji
chinni
Mouni
 */