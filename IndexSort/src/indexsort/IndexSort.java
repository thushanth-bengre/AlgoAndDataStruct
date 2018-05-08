/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexsort;

/**
 *
 * @author Bengre
 */
public class IndexSort {
    
    private char[] sort(char a[]){
        int n = a.length;
        
        char res[] = new char[n];
        int count[] = new int[256];
        for(int i=0; i<256; i++){
            count[i] = 0;           
        }
        
        for(int i=0;i<n;i++){
            ++count[a[i]];
        }
        
        for(int i=1; i<=255; i++){
            count[i] += count[i-1];
        }
        
        for (int i=0; i<n; i++){
            res[count[a[i]]-1] = a[i];
            --count[a[i]];
        }
        
        for(int i=0;i<n;i++){
            a[i]=res[i];
        }
        return a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IndexSort is = new IndexSort();
        String s = "abdceddfcabbeeccefddaaf";
        char[] c = s.toCharArray();
        char [] a=is.sort(c);
        
        System.out.println("Sorted Array is");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    
}
