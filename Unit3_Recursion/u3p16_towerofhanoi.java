package unit3_recursion;

public class u3p16_towerofhanoi {
    
    // Recursive Solution
    // T.C. = O(2^n - 1)
    // A.S. = O(n)

    public static void TOH(int n, char A, char B, char C) {
        // Base Case:
        // If only 1 disk is present,
        // directly move it from source to destination
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }

        // Step 1:
        // Move top (n-1) disks from A to B using C
        TOH(n - 1, A, C, B);

        // Step 2:
        // Move nth disk from A to C
        System.out.println("Move " + n + " from " + A + " to " + C);
        
        // Step 3:
        // Move (n-1) disks from B to C using A
        TOH(n - 1, B, A, C);
    }

    public static void main(String[] args) {
        int n = 3;
        TOH(n, 'A', 'B', 'C');
    }
}