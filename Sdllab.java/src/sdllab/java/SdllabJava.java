

package sdllab.java;

import java.util.ArrayList;
import java.util.Iterator;


public class SdllabJava {

  
    public static void main(String[] args) {
     
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("def");
        list1.add("ghi");
        list1.add("jkl");
        list1.add("mno");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
            
            
        }
        System.out.println(list1);  //Another way
        list1.set(1,"ajk");
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        Iterator<String>itr1 = list1.iterator();
        itr1.remove();
        System.out.println(list1);
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
          // itr1.remove();
           //System.out.println(list1);
        }
        
        itr1.remove();
        System.out.println(list1);
    }

}

//Some common methods