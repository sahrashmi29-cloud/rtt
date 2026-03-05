package week12; 

import java.util.ArrayList;
import java.util.Iterator;

public class Array
{
    public static void main (String[] args)
    {
        ArrayList<Integer>  arrlist= new ArrayList<>();
        
        arrlist.add(90);
        arrlist.add(85);
        arrlist.add(40);
        
        System.out.println(arrlist);
        arrlist.add(1,100);
        System.out.println(arrlist);
        
        System.out.println(arrlist.isEmpty());
        
        System.out.println(arrlist.size());
        
        
        arrlist.remove(0);
        
        System.out.println(arrlist);
        
        System.out.println(arrlist.get(0));
    
        arrlist.set(0,87);
        
        System.out.println(arrlist);
        
        
        
        System.out.println(arrlist.contains(87)); 
        
        System.out.println(arrlist.indexOf(20)); 
        
        arrlist.clear();
        
        System.out.println(arrlist);
        
        
        
        for(int arr: arrlist)
        {
            System.out.println(arr);
        }
        
        
        //Interator interface
        
        Iterator<Integer> itr=arrlist.iterator();
        
        while(itr.hasNext())
        {
            int marks= itr.next();
            System.out.println(marks);
        }
    }
}