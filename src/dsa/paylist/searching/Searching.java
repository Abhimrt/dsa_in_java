// in this file you find all the searching
package dsa.paylist.searching;
import java.util.*;

import static java.lang.System.exit;
import static java.lang.System.out;

public class Searching {
    public static void searching(int arr[]) {
        Scanner sc = new Scanner(System.in);
        while(true){
            out.println("\n /-/-/-/-/--Taking data from the user ' Searching area ' --/-/-/-/-/ \n");
            out.println("Press 1 for Linear Search");
            out.println("Press 2 for Binary Search");
            out.println("Press -1 for exit from array");
            out.println("Press -2 to exit the program");
            out.print("--> ");
            int choice = sc.nextInt();
            if(choice == -1){
                return;
            }else if(choice == -2){
                exit(-1);
            }
            out.println("Enter the element you want to search");
            out.print("--> ");
            int target = sc.nextInt();
            if(choice == 1){
                out.println("====  "+target+" found at "+linarsearch(arr ,target)+" position  ====");
            }else if(choice == 2){
                out.println("===  WARNING: Array was to be sorted ===\n");
                out.println("====  "+target+" found at "+binaryserach(arr ,target)+" position  ====");
            }
        }
    }
    static int linarsearch(int[] arr, int target){
        for (int i =0;i<arr.length;i++) {
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }

    static int binaryserach(int[] arr,int target){
        int s = 0;
        int l = arr.length-1;
        while(s<l){
            int mid = s+(l-s)/2;
            if(arr[mid]<target){
                s = mid+1;
            }else if(arr[mid]>target){
                l=mid-1;
            }else{
                return mid+1;
            }
        }
        return -1;
    }
}
