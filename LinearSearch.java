import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search:");
        int num = sc.nextInt();
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " is present in the array at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No, the number is not present in the array");
        }
        
        sc.close();
    }
}
