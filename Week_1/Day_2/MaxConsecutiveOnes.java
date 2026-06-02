public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        int result=maxConseOne(arr);
        System.out.println(result);
        
    }
    public static int maxConseOne(int[] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
            }
            else{
                count=0;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
}