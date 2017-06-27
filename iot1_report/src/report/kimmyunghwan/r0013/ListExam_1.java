package report.kimmyunghwan.r0013;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
//ListExam 말고 전에 쓰던 방식대로 한다면
public class ListExam_1 implements List{		
	
	
//	
//	public Plus getPlus(){
//		return p;
//	}
//	
//	public Plus getMinus(){
//		return p;
//	}
//	
//	public Plus getMultiple(){
//		return p;
//	}
//	
//	public Plus getDivision(){
//		return p;
//	}
//	
	
	
	public static void main(String[] args){
		List list = new ListExam_1();
		list.add("abcd");
		System.out.println(list.size());		//list.size()는 list.add("abcd"); 갯수
		System.out.println(list.get(0));		//null 나오는 이유는 구현하지 않았기 때문에 // ArrayList는 구현이 되어있음
		ListExam_1 le = new ListExam_1();
		
	}




	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
//	public LinkedHashMap getMap1(){
//		return new LinkedHashMap();
//	}
//	
//	public LinkedHashMap getMap2(){
//		return new LinkedHashMap();
//	}
//	
//	public static void main(String[] args) {
//
//		ListExam ie = new ListExam();
//		
//		Map map = ie.getMap1();
//		map = ie.getMap2();
//		map.put("abcd","abcd" );  
//		
		
		
//	public static void main(String[] args) {
//		
//		List<String> list = new ArrayList<String>(); 	//c+s+o
//		list.add("abcd");
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("abcd","abcd");
//		
//	}// main End

}// Class End
