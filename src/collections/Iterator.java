package collections;

import java.util.*;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		java.util.Iterator iter = a.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

	}

}
