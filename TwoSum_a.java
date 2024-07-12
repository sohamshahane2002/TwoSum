//brute force : finding if the target is fulfilled using sum of any two elements in the array
package TwoSum;
public class TwoSum_a{
    public static String twosum(int arr[],int n ,int target){
        for (int i=0 ; i<n ;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target) return "Present";
                    
            }
        }
    return "Absent";
    }
    public static void main(String[]args){
        int numarr[]={2, 6, 5, 8, 11};
        int target = 14;
        String finalsum = twosum(numarr, 5, 14);
        System.out.println(" The value " + target + " is " + finalsum);
    }
}