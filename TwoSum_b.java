
//Optimal solution : finding if the target is fulfilled using sum of any two elements in the array
package TwoSum;
import java.util.*;
public class TwoSum_b {
    public static String twosum(int arr[],int n,int target){
        Arrays.sort(arr);
        int left =0; int  right =n-1;
        while(left < right){
            int sum = arr[left]+arr[right];
             
            if (sum==target) return "present";

            else if(sum < target){
                left ++;
            }
            else{
                right--;
            }

        }return "absent";
    }
    public static void main(String[] args) {
        int numarr[] = {1,2,3,4,7,6,5,9};
        int target = 11;
        String istwosum = twosum(numarr,8 , 11);
        System.out.println(" The value " + target + " is " + istwosum);
    }

}


