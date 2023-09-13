package com.example.all_in_one;

public class paper {

    int day = 4;

   /* ************************** switch *******************************
switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
              default:
            System.out.println("not a day");
    }
 Outputs "Thursday" (day 4)
*/

//    ********************* Loops ***************************/**/

 /*
while (condition) {
        // code block to be executed



        Example
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
    }*/



/*   Do while
    Syntax
do {
        // code block to be executed
    }
while (condition);
    The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:

    Example
    int i = 0;
do {
        System.out.println(i);
        i++;
    }
while (i < 5);*/





/*
 SyntaxGet your own Java Server
for (statement 1; statement 2; statement 3) {
        // code block to be executed
    }
    Statement 1 is executed (one time) before the execution of the code block.

    Statement 2 defines the condition for executing the code block.

    Statement 3 is executed (every time) after the code block has been executed.

    The example below will print the numbers 0 to 4:

    Example
for (int i = 0; i < 5; i++) {
        System.out.println(i);

    }
    // Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times

  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
}
    */

/*

Bubble Sort************************************************************************

import java.util.*;


    class Sorting {
        public static void printArray(int arr[]) {
            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


        public static void main(String args[]) {
            int arr[] = {7, 8, 1, 3, 2};


            //bubble sort
            for(int i=0; i<arr.length-1; i++) {
                for(int j=0; j<arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }


            printArray(arr);
        }

*/


//    Selection Sort ***************************************************************


/*
    import java.util.*;


    class Sorting {
        public static void printArray(int arr[]) {
            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


        public static void main(String args[]) {
            int arr[] = {7, 8, 1, 3, 2};


            //selection sort
            for(int i=0; i<arr.length-1; i++) {
                int smallest = i;
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[j] < arr[smallest]) {
                        smallest = j;
                    }
                }
                //swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }


            printArray(arr);
        }
*/




//    Insertion Sort*****************************************************************************

/*
    import java.util.*;


    class Sorting {
//        public static void printArray(int arr[]) {
            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


//        public static void main(String args[]) {
            int arr[] = {7, 8, 1, 3, 2};


            //insertion sort
            for(int i=1; i<arr.length; i++) {
                int current = arr[i];
                int j = i - 1;
                while(j >= 0 && arr[j] > current) {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }
            printArray(arr);
        }
    }
*/




}
