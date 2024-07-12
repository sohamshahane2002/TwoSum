package TwoSum;
//brute force : to find the index summing up to the target
public class TwoSum_1 {
    public static int[] twoSum(int[]arr ,int n ,int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
            }
        }
    }return ans;
}   
    public static void main(String[]args){
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(arr, n, target);
        System.out.println("This is the answer for : [" + ans[0] + ", "+ ans[1] + "]");
                           

}
}
