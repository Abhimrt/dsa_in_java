package dsa.paylist.Array;

import java.util.Scanner;
import static dsa.paylist.searching.Searching.searching;
import static java.lang.System.*;

public class Main {
    public static void Array(){
        Scanner sc = new Scanner(in);
        out.print("\nEnter the length of the array = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        enterdata(array , n);
        while(true){
            out.println("\n /-/-/-/-/--Taking data from the user ' Array area ' --/-/-/-/-/ \n");
            out.println("Press 1 for Searching");
            out.println("Press 2 for Sorting");
            out.println("Press -1 for exit from array");
            out.println("Press -2 to exit the program");
            out.print("--> ");
            int choice = sc.nextInt();
            if(choice ==1){
                searching(array);
            }
            else if(choice == -2){
                exit(-1);
            }else if(choice == -1){
                return;
            }
        }
    }
    static void enterdata(int[] array, int n){
        Scanner sc = new Scanner(in);
        for (int i = 0; i < n; i++) {
            out.printf("Enter the %d element = ",i+1);
            array[i] = sc.nextInt();
        }
    }
}
