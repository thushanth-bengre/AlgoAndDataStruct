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
public class SelectionSort {
    
    public void sort(List<Double> list){
        int n= list.size();
        
        for(int i=0; i< n-1; ++i){
            int min_idx = i;
            
            for (int j = i+1; j < n; j++)
                if (list.get(i) < list.get(min_idx))
                    min_idx = j;
            
            double temp = list.get(min_idx);
            list.set(min_idx, list.get(i));
            list.set(i, temp);
        }
        
        System.out.println("by Selection Sort");
         for(int i=0; i<list.size();++i){
             System.out.println(list.get(i));
         }
    }
    
}
