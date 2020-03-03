package com.epam_task6.Custom_list;

public class main {
	public static void main(String[] args) 
    {
        custom_list<Integer> list = new custom_list<>();
 
        //Add elements
        list.add(10);
        list.add(20);
        list.add(30);
       
         
        //Remove elements from index
        list.remove(2);
       
         
        //Get element with index
        System.out.println( list.Get_element(0) );
        System.out.println( list.Get_element(1) );
        
        //List Size
        System.out.println("list size is:"+list.get_size());
    }
}
