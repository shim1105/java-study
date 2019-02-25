package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam03 {
	public static void main(String[] args) {
		List<String> al= new ArrayList<>();		//3개다 List을 인터페이스를 받고 있음
		List<String> ll= new LinkedList<>(); 	//
		List<String> v= new Vector<>();			//
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		al.add("1");
		ll.add("1");
		v.add("1");
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
	}
}
