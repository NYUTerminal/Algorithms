package leetcode;
import java.util.List;
import java.util.*;

public class FlattenList {

	private Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) {
			List<Nested> nest = new ArrayList<Nested>();
			List<Nested> temp = new ArrayList<Nested>();
			temp.add(new Nested(1));
			temp.add(new Nested(1));
			nest.add(new Nested(temp));
			FlattenList fl = new FlattenList();
			fl.FillStack(new Nested(nest));
	}

	private void FillStack(Nested nested) {
		 if(nested.isInteger()){
             stack.push(nested.integer);
             // System.out.println(stack.peek());
         }
         System.out.println(nested.getList().size());
         for(Nested obj : nested.getList()){
             FillStack(obj);
         } 
	}
}

class Nested{
	int integer;
	List<Nested> list;
	public List<Nested> getList(){
		return list;
	}
	
	public boolean isInteger(){
		if(integer!=0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Nested(List<Nested> temp){
		this.list = temp;
	}
	
	public Nested(Integer temp){
		this.integer = temp;
	}
	
}
