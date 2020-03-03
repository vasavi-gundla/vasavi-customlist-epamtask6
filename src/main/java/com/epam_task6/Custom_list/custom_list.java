package com.epam_task6.Custom_list;
import java.util.Arrays;

public class custom_list <T>{
	private int array_size=0;
	private Object array[];
	private static final int default_array_size=10;
	   
	 public custom_list(){
	        array = new Object[default_array_size];
	    }
	 public int get_size(){
	     return array_size;
	  }
	 private void increase_capacity()
	{
	    int new_size=array.length*2;
	    array=Arrays.copyOf(array, new_size);
	    
	} 
	 
	 public void add(T t){
	       if(array.length==array_size)
	           increase_capacity();
	        array[array_size++]=t;
	 }
	 
	 public T remove(int i){
	     if(i>=array_size || i<0)
	         throw new ArrayIndexOutOfBoundsException("Invalid index");
	     Object item=array[i];
	     System.arraycopy(array, i+1, array, i, array.length-(i+1));
	     return  (T)item;
	 }
	 public T Get_element(int i)
	 {
	     if(i>=array_size || i<0)
	         throw new ArrayIndexOutOfBoundsException("Invalid index");
	     return (T)array[i];
	 }
	 
	 public void print_array(){
	       for(int i=0;i<array_size;i++)
	           System.out.print(array[i]+" ");
	       System.out.print("\n");
	    }

}
