package collections;
import java.util.*;
public class IteratorMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> a= new LinkedHashMap<String,Integer>();
		a.put("sunny", 10);
		a.put("Deepak", 20);
		a.put("Pravenn", 30);
		a.put("manish", 40);
		System.out.println(a);
		Set<String> b=a.keySet();
		for(String i:b)
			System.out.println(i+"="+a.get(i));

	}

}
