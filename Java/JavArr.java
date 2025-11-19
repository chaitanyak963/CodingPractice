import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrJav {
    public static void main(String[] args) {
        System.out.println("Enter Array Size : ");
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter " + i + " element into arr : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is : " + Arrays.toString(arr));
        System.out.println("Select the option to perform : \n 1.Insert \n 2.Insert at Index \n 3.Update \n 4.Update a value \n 5.Sort with keywords \n 6.Sort Manually");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                /*Insert Elements into array at end.(Array will have fixed size, only by creating a new array we can perform insert)*/
                System.out.println("How many new elements you want to insert ?");
                int newarrsize = sc.nextInt();
                int[] newarr = new int[arrSize + newarrsize];
                for (int i = 0; i < arrSize; i++) {
                    newarr[i] = arr[i];
                }
                System.out.println("Enter " + newarrsize + " new elements:");
                for (int i = arrSize; i < arrSize + newarrsize; i++) {
                    newarr[i] = sc.nextInt();
                }
                System.out.println("The array is : " + Arrays.toString(newarr));
                break;
            case 2:
                /*Insert Elements into array at k index.*/
                System.out.println("Enter Element to insert : ");
                int ele = sc.nextInt();
                System.out.println("Enter the index from 0 to " + (arrSize - 1) + " :");
                int pos = sc.nextInt();
                int[] narr = new int[arrSize + 1];
                for (int i = 0; i < narr.length; i++) {
                    if (i < pos) {
                        narr[i] = arr[i];
                    } else if (i == pos) {
                        narr[i] = ele;
                    } else {
                        narr[i] = arr[i - 1];
                    }
                }
                System.out.println("The array is : " + Arrays.toString(narr));
            case 3:
                /*Update the Elements in the array .*/
                System.out.println("Enter the index where you want to insert from 0 to " + (arrSize - 1) + " :");
                int loc = sc.nextInt();
                System.out.println("Enter the element : ");
                int newele = sc.nextInt();
                arr[loc] = newele;
                System.out.println("The array is : " + Arrays.toString(arr));
                break;
            case 4:
                /*Update the Elements in the array at a particular value.*/
                boolean found = false;
                System.out.println("Enter the value to update :");
                int pval = sc.nextInt();
                System.out.println("Enter the element : ");
                int newval = sc.nextInt();
                for (int i=0;i<arrSize;i++){
                    if (arr[i]==pval){
                        arr[i] = newval;
                        found=true;
                        //break; //break will restrict the element to single update if there are multiple duplicates
                    }
                }
                if (found){
                    System.out.println("The array is : " + Arrays.toString(arr));
                }else{
                    System.out.println("The value is not found");
                }
                break;
            case 5:
                /*Sort array with keywords.*/
                Arrays.sort(arr);// Ascending order by default.
                Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
                Arrays.sort(a, Collections.reverseOrder()); // Descending order using Stream else by using for loop create a INTEGER array and swap individual element.
                System.out.println("The array is : " + Arrays.toString(a));
            case 6:
                /*Sort array manually.(Bubble Sort Quick)*/
                for (int i=0;i<arrSize-1;i++){
                    for(int j=0;j<arrSize-1-i;j++) {
                    if (arr[j]>arr[j+1]){ //Change the " > " to " < " for descending order
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    }
            }
                System.out.println("The array is : " + Arrays.toString(arr));
            default:
                break;
        }
    }
}
