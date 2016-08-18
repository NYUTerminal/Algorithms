package leetcode;

public class OSMemomryNextDoor {
	import java.io.*;
	import java.util.*;

	/*
	 * To execute Java, please define "static void main" on a class
	 * named Solution.
	 *
	 * If you need more classes, simply define them inline.
	 */

	int allocate(int size);
	void free(int index);

	memory = [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	                 ^  ^  ^  ^  ^  ^

	0 , 10
	0 1 
	  
	  
	(2 , 10)
	(5, 10)

	Free 
	(0,1)       (1 , 0)
	 //(2,4)     
	(5,10)      ()
	(0, 10)
	  
	  
	memory = [ ]  
	  
	  
	allocate(2) = return 0
	  
	allocate(3) = return 2
	  
	free(0)
	free(3)  
	  
	  
	// HashMap 0 , 2 ;  
	  //remove 0,2 
	  // alocate = 
	  // 
	  
	//allocate(2) = return 0;
	  
	  
	public class MemoryAllocation{
	  
	  
	  private int MAX_MEMORY = 100;
	  private int[] memory;
	  private Map<Integer,Integer> allocated;
	  private Map<Integer,Integer> availableStart;
	  private Map<Integer,Integer> availableEnd;
	  //private int memAvail;
	  
	  
	  
	  public MemoryAllocation(){
	    
	    
	    
	    //  100 1 100 
	    // 95 5 100
	    //85 15 100

	    //    logN 
	    // 5  10 45 34   
	    
	    
	    // 5 
	    // 85
	    
	    
	    //
	    // 100 GB Integer 
	    memory = new int[100];
	    allocated = new HashMap<Integer,Integer>();

	    
	    //  100 Integers
	    //  1 GB 2GB 
	    // 
	    availableStart = new HashMap<Integer,Integer>();
	    availableEnd = new HashMap<Integer,Integer>();
	    //memoryAvail = 100;
	    availableStart.put(0,99);
	    availableEnd.put(99,0);
	  }
	  
	  public static void main(String[] args){
	    
	  }
	  
	  public int allocate(int size){
	    if(size==0 || size<0){
	      return -1;
	    }
	    int goingToBeStart = -1;
	    int tempStart = -1;
	    int tempEnd = -1;
	    for(Integer start:availableStart.key()){
	      int end = availableStart.get(start);
	      if(end-start+1>=size){
	        tempStart = start;
	        tempEnd = end;
//	        goingToBeStart = start;
	        break;
	      }
	    }
	    
	    // 
	    if(tempStart!=-1 && tempEnd !=-1){
	      if(tempEnd-tempStart+1==size){
	        availableStart.remove(tempStart);
	        availableEnd.remove(tempEnd);
	        allocated.add(tempStart,size);
	      }else if(tempEnd-tempStart+1>size){
	        availableStart.remove(tempStart);
	        availableStart.put(tempStart+size+1,tempEnd);
	        availableEnd.remove(tempEnd);
	        availableEnd.put(tempEnd,tempStart+size+1);
	        allocated.add(tempStart,size);
	      }
	      return tempStart;
	    }
	    
	    return -1;
	    // 0 , 10 (11 , 99 )
	    //  0 - 11 size = 10 
//	    0 + 15 - 10
	    // 0 - 9     end+1 to end    
	    
	  }
	  
	  
	  public void free(int index){
	    
	    
	    
	  }
	  
	  
	  
	}  
	  
	  
}
