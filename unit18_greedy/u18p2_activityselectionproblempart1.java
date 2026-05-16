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

This implementation takes input in the form
of an ARRAY OF OBJECTS.

Each object represents one activity.

Example:

Activity[] arr = {
    new Activity(12, 25),
    new Activity(10, 20),
    new Activity(20, 30)
};

Represents:

(12,25)
(10,20)
(20,30)


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

1) Sort all activities according to
   finish time.

2) Select the first activity.

3) Traverse remaining activities:
      If current activity start time >=
      previously selected activity finish time,
      then select it.

4) Return count of selected activities.


---------------------------------------------------
TIME COMPLEXITY
---------------------------------------------------

Sorting  -> O(n log n)
Traversal -> O(n)

Overall -> O(n log n)


---------------------------------------------------
SPACE COMPLEXITY
---------------------------------------------------

O(1) Extra Space
(ignoring sorting space)

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
// Used for sorting activities
// according to finish time
class MyCmp implements Comparator<Activity> {

    public int compare(Activity a1, Activity a2) {

        // Ascending order of finish time
        return a1.finish - a2.finish;
    }
}


public class u18p2_activityselectionproblempart1 {


    // Function to find maximum number
    // of non-overlapping activities
    public static int maxActivity(Activity[] arr) {


        // Sorting according to finish time
        Arrays.sort(arr, new MyCmp());


        // First activity is always selected
        int res = 1;

        // Index of previously selected activity
        int prev = 0;


        // Checking remaining activities
        for (int curr = 1; curr < arr.length; curr++) {


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


        // // Creating Activity Array
        // Activity[] arr = new Activity[n];


        // // Taking input for activities
        // for (int i = 0; i < n; i++) {

        //     System.out.print("Enter start time of activity " + (i + 1) + ": ");
        //     int s = sc.nextInt();

        //     System.out.print("Enter finish time of activity " + (i + 1) + ": ");
        //     int f = sc.nextInt();

        //     // Creating Activity Object
        //     arr[i] = new Activity(s, f);
        // }



        // Array of Activity Objects
        Activity[] arr = {

            new Activity(12, 25),
            new Activity(10, 20),
            new Activity(20, 30)
        };


        // Function Call
        System.out.println(maxActivity(arr));
    }
}