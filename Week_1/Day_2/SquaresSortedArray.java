// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int N=nums.length;
//         int[] result=new int[N];
//         for(int i=0;i<nums.length;i++){
//             result[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(result);
//         return result;
//     }
// }

//Two pointer approach
public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] nums={-3,-2,-1,0,4,5,6};
        int[] result=sortedsquare(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] +" ");
        }
    }
    public static int[] sortedsquare(int[] nums){
        int n=nums.length;
        int l=0;
        int r=n-1;
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            int val;

            if(Math.abs(nums[l])>Math.abs(nums[r])){
                val=nums[l];
                l++;
            }
            else{
                val=nums[r];
                r--;
            }
            result[i]=val*val;
        }
        return result;
    }
    
}
