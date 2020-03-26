package myPackage;
import java.util.ArrayList;
import java.util.List;


public class CollectionDemo {
public static void main(String args[]){
	List list=new ArrayList();
	list.add(23);
	list.add("sai");
	list.add(34.66f);
	
	System.out.println(list);
	for(Object o:list)
	{
		System.out.println(o);
	}
	List<String> list2=new ArrayList<String>();
	list2.add("shankar");
	list2.add("rohit");
	list2.add("virat");
	list2.add(0,"kholi");
	
	List<String> list3=new ArrayList<String>();
	list3.add("Dhoni");
	list3.add("Sakshi");
	list3.add("Raina");
	list3.add("Priyanka");
	
	list2.addAll(list3);
	
	
	
	for(String s:list2)
	{
		System.out.println(s);
	}
}
}
