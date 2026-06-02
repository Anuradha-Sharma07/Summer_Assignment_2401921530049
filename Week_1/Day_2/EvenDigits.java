//Find the total number of numbers in an array with even number of digits within constraint 1 to 10^5
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={234,23445,4567,8906};
        int result=evenNumdigit(arr);
        System.out.println(result);
    }
    public static int evenNumdigit(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]>=10 && arr[i]<=99) || (arr[i]>=1000 && arr[i]<=9999) || (arr[i]==100000)){
                count+=1;
            }
        }
        return count;
    }
    
}