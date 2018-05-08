/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageBuffer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bengre
 */
public class MergeSort {
    
    public void sort(List<Double> list, int l, int r){
        if(l<r){
            int m =(l+r)/2;
            
            sort(list,l,m);
            sort(list, m+1,r);
            
            merge(list, l, m, r);
            
        }
        System.out.println("by MergeSOrt");
         for(int i=0; i<list.size();++i){
             System.out.println(list.get(i));
         }
        
    }
    
    private void merge(List<Double> list, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        
        List<Double> left = new ArrayList<>();
        List<Double> right = new ArrayList<>();
        
        for(int i=0;i<n1;i++)
            left.set(i, list.get(l+i));
        for(int j=0;j<n2;j++)
            right.set(j, list.get(m+1+j));
        
        int i=0;int j=0;
        
        int k=l;
        
        while(i<n1 && j<n2){
            if(left.get(i) <= right.get(i)){
                list.set(k, left.get(i));
                i++;
            }else{
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }
        
        while(i<n2){
            list.set(k, left.get(i));
            i++;k++;                    
        }
        
        while(j<n2){
            list.set(k, right.get(j));
            j++;k++; 
        }
    }
    
}
