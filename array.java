//merging of two arrays
import java.util.Arrays;
import java.util.Scanner;   

class array
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n; i++) 
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < m; i++) 
        {
            arr2[i] = sc.nextInt();
        }
        int[] mergedArray = new int[n + m];
        System.arraycopy(arr1, 0, mergedArray, 0, n);
        System.arraycopy(arr2, 0, mergedArray, n, m);
        Arrays.sort(mergedArray);
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }   
}
