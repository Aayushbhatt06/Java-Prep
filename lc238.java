// Leet code 
// 238. Product of array except itself 

import java.util.Arrays;

public class lc238 {
    
    static int[] sol(int[] a){
        int n = a.length;
        int product = 1;
        int[] ans = new int[n];
        for(int i= 0;i<n;i++){
            for(int j=0 ; j<n ; j++){
                if(i != j){
                    product = product*a[j] ;
                }
        }
        ans[i] = product;
        product = 1;
        
    }
    return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(sol(a)));
    }
}
