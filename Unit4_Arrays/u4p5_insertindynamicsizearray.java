

// In Java, dynamic arrays are implemented using ArrayList.

// Example of insertion using ArrayList:

package Unit4_Arrays;

import java.util.ArrayList;

public class u4p5_insertindynamicsizearray {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        // adding elements
        arr.add(5);
        arr.add(10);
        arr.add(20);

        // insert 7 at index 1
        arr.add(1, 7);

        System.out.println(arr);
    }
}

// Output:

// [5, 7, 10, 20]

// Explanation:

// add(value) → inserts at end
// add(index, value) → inserts at specific position
// Size increases automatically, so no need for cap or shiftin

// Average T.C. or Ammortize T.C. = O(1)