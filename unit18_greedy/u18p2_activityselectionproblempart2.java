package unit18_greedy;

/*

ACTIVITY SELECTION PROBLEM (Greedy Algorithm)

Problem:
We are given activities with:
1) Start Time
2) Finish Time

Goal:
Select the maximum number of activities
such that no activities overlap.


---------------------------------------------------
INPUT FORMAT USED HERE
---------------------------------------------------

Two different arrays are given as input.

start[i]  -> Starting time of activity i
finish[i] -> Finishing time of activity i

Both arrays use the SAME INDEX to represent
the SAME activity.


Example:

start[]  = {12, 10, 20}
finish[] = {25, 20, 30}

Represents:

Activity 0 -> (12, 25)
Activity 1 -> (10, 20)
Activity 2 -> (20, 30)


---------------------------------------------------
GREEDY IDEA
---------------------------------------------------

Always select the activity that finishes first.

Why?

Because it leaves maximum time for
future activities.


---------------------------------------------------
ALGORITHM
---------------------------------------------------

1) Create Activity objects using start[]
   and finish[] arrays.

2) Sort activities according to finish time.

3) Select first activity.

4) Traverse remaining activities:
      If current activity start time >=
      previously selected activity finish time,
      then select it.

5) Return count of selected activities.


---------------------------------------------------
TIME COMPLEXITY
---------------------------------------------------

Sorting  -> O(n log n)
Traversal -> O(n)

Overall -> O(n log n)


---------------------------------------------------
SPACE COMPLEXITY
---------------------------------------------------

O(n) for Activity array

*/

import java.util.*;


// Activity Class
// Stores start time and finish time
class Activity {

    int start;
    int finish;

    Activity(int s, int f) {
        start = s;
        finish = f;
    }
}


// Comparator Class
// Used for sorting activities according
// to their finish time
class MyCmp implements Comparator<Activity> {

    public int compare(Activity a1, Activity a2) {

        // Ascending order of finish time
        return a1.finish - a2.finish;
    }
}


public class u18p2_activityselectionproblempart2 {


    // Function to find maximum number
    // of non-overlapping activities
    public static int maxActivity(int[] start, int[] finish) {

        int n = start.length;


        // Creating Activity Object Array
        Activity arr[] = new Activity[n];


        // Converting two arrays into
        // Activity objects
        for (int i = 0; i < n; i++) {

            arr[i] = new Activity(start[i], finish[i]);
        }


        // Sorting according to finish time
        Arrays.sort(arr, new MyCmp());


        // First activity is always selected
        int res = 1;

        // Index of previously selected activity
        int prev = 0;


        // Checking remaining activities
        for (int curr = 1; curr < n; curr++) {


            // If current activity starts
            // after or exactly when previous
            // selected activity finishes
            if (arr[curr].start >= arr[prev].finish) {

                // Select current activity
                res++;

                // Update previously selected activity
                prev = curr;
            }
        }

        return res;
    }


    public static void main(String[] args) {


        // Scanner sc = new Scanner(System.in);

        // // Input number of activities
        // System.out.print("Enter number of activities: ");
        // int n = sc.nextInt();


        // // Creating start and finish arrays
        // int[] start = new int[n];
        // int[] finish = new int[n];


        // // Taking input
        // for (int i = 0; i < n; i++) {

        //     System.out.println("\nEnter details of Activity " + (i + 1));

        //     System.out.print("Start Time: ");
        //     start[i] = sc.nextInt();
        
        //     System.out.print("Finish Time: ");
        //     finish[i] = sc.nextInt();
        // }


        // Input Arrays
        int[] start = {12, 10, 20};
        int[] finish = {25, 20, 30};

        // Function Call
        System.out.println(maxActivity(start, finish));
    }
}