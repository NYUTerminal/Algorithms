package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyHashMap<K, V> {

	
	private List<MyEntry<K,V>> hashMapList = new ArrayList<MyEntry<K,V>>(20);
	private MyEntry<K, V>[] hashMap;
	private int size;
	private int START_SIZE = 16;

	public static void main(String[] args) {
			HashMap<Integer,Student> hash = new HashMap<Integer,Student>();
			Student s = new Student(1,"pra","new york");
			hash.put(1,s);
			hash.put(1, new Student(1,"pra1","new york1"));
			System.out.println(hash);
			
			HashMap<CustInteger,Student> hash2 = new HashMap<CustInteger,Student>();
			Student s1 = new Student(1,"pra","new york");
			hash2.put(new CustInteger(1, "P"),s1);
			hash2.put(new CustInteger(1, "Q"), new Student(1,"pra1","new york1"));
			System.out.println(hash2);
	}

	public MyHashMap() {
		hashMap = new MyEntry[START_SIZE];
		size = 0;
	}

	public void put(K key, V value) {
		int hashKey = hash(key);
		if (hashMap[hashKey] != null) {
			hashMap[hashKey] = new MyEntry(key, value, null);
		} else {
			hashMap[hashKey] = new MyEntry(key, value, null);
		}

	}
	
	public V get(K key,V value){
		int hashKey = hash(key);
		//	lookup in the linkedList and get the element .
		return null;
	}

	private int hash(K key) {
		if (key != null) {
			return Math.abs(key.hashCode()) % START_SIZE;
		} else {
			return 0;
		}
	}

}

class MyEntry<K, V> {
	K key;
	V value;
	MyEntry<K, V> next;

	public MyEntry(K key, V value, MyEntry<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
}

class Student{
	
	public int id ;
	public String name;
	public String address;
	public Student(int id,String name,String address){
		this.address = address;
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		
		return 1;
	}
	
	@Override 
	public boolean equals(Object o){
		if(o == null || !(o instanceof Person)){
			return false;
		}
		return false;
	}
	
	
}

class CustInteger{
	
	public int id ;
	public String name;
	
	public EnumTest enumTest;
	public CustInteger(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		this.enumTest = EnumTest.UP;
		return 1;
	}
	
	@Override 
	public boolean equals(Object o){
		if(o == null || !(o instanceof CustInteger)){
			return false;
		}
		return true;
	}
	
	
}

enum EnumTest{
	UP,DOWN,GROUND;
}