package dsa.paylist;

import java.util.Scanner;
import static dsa.paylist.Array.Main.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true){
            out.println("\n /-/-/-/-/--Taking data from the user ' Main area ' --/-/-/-/-/ \n");
            out.println("Press 1 for array");
            out.println("Press -1 for exit from main");
            out.print("--> ");
            int choice = sc.nextInt();
            if(choice == 1){
             Array();
            }
            else if(choice == -1){
                break;
            }
        }
    }
}
