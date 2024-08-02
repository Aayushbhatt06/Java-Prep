
public class minimum {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,6, 8};
        int len = arr.length;
        int minNum = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(arr[i] < minNum ){
                minNum = arr[i];
            }
        }
        System.out.println("The minimum number in an array is  " + minNum);
    }
}
