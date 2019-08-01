package b09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;





public class Tabella {
	
       private ArrayList<Integer> tab = new ArrayList<Integer>();
       
       public  void add(Integer x) {
    	   tab.add(x);
       }

       public boolean check (Integer x) {
    	   boolean checked = tab.contains(x);
    	   return checked;   
       }
       
      public Collection <Integer> getData(){
    	  List<Integer>Tabsorted = new ArrayList<Integer>(tab);
    	  Tabsorted.sort(null);
		  return Tabsorted;
    	  
    	  
    	  
      }
}

