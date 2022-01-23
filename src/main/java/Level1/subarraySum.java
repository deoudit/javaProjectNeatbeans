/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

/**
 *
 * @author UDIT DEO
 */
public class subarraySum {
    private static String returnIndex(int array[], int target){
        int currSum=0;
        int left=0;
        int right=0;
        int size = array.length;
        
        while(left<size || right<size)
        {
            if (right==size-1 && currSum<target){
                return "Not Found";
            }
            
            if (currSum==target)
                return left+" "+right;
            
            else if (currSum<target){
                currSum = currSum + array[right];
                right++;
            }
                
            else{
                currSum = currSum - array[left];
                left++;
            }
                
        }
        return "Not Found";
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 20, 3, 10, 5};
        String x = returnIndex(arr, 37);
        System.out.println(x);
    }
    
}

