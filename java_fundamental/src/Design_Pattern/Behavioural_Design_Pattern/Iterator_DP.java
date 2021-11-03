package Design_Pattern.Behavioural_Design_Pattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//This design pattern means that iterate collection object using iterator

public class Iterator_DP {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("rishabh");
		list.add("rishu");
		list.add("vikash");
		
		Iterator<String> listItr = list.iterator();
		while(listItr.hasNext())
		{
			System.out.println("Name : "+listItr.next());
		}
		
		System.out.println("List object : "+list);
		System.out.println("---------------------");
		
		Set<String> set = new HashSet<String>();
		set.add("rishabh");
		set.add("rishu");
		
		Iterator<String> setItr = set.iterator();
		while(setItr.hasNext())
		{
			System.out.println("Name : "+setItr.next());
		}
		
		System.out.println("Set object : "+set);

	}

}
