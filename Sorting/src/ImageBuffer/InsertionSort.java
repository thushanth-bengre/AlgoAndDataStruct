/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageBuffer;

import java.util.List;

/**
 *
 * @author Bengre
 */
public class InsertionSort {
    
    public void sort(List<Double> list){
        int n = list.size();
        
         for (int i=1; i<n; ++i){
            double key = list.get(i);
            int j = i-1;
            
            while(j>=0 && list.get(j) > key){
                list.set(j+1,list.get(j));
                j=j-1;                
            }
            list.set(j+1, key);
         }
         
         System.out.println("by InsertionSort");
         for(int i=0; i<list.size();++i){
             System.out.println(list.get(i));
         }
    }
    
}
