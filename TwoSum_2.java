package TwoSum;
import java.util.*;
public class TwoSum_2 {
    public static int[] twoSum(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];           
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // Return {-1, -1} if no pair is found
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,5,8};
        int target = 7;
        int[] indices = twoSum(n, arr, target);
         
        System.out.println("Indices of the two numbers: [" + indices[0] + ", " + indices[1] + "]");
        
    }
}