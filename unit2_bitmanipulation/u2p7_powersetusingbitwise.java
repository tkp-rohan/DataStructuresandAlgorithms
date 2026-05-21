package unit2_bitmanipulation;

public class u2p7_powersetusingbitwise {
    
    // =========================================================
    // POWER SET USING BITWISE OPERATORS
    // =========================================================
    //
    // POWER SET:
    // Collection of all possible subsets.
    //
    // Example:
    // s = "ab"
    //
    // Power Set:
    // ""
    // "a"
    // "b"
    // "ab"
    //
    // Number of subsets of a set having n elements:
    //
    // 2^n
    //
    // WHY?
    // Because every character has 2 choices:
    //
    // 1) Include
    // 2) Exclude
    //
    // So total combinations:
    //
    // 2 × 2 × 2 ... n times
    // = 2^n
    // =========================================================



    // =========================================================
    // OPTIMIZED BITWISE SOLUTION
    //
    // T.C. = O(n * 2^n)
    // A.S. = O(1)
    // =========================================================

    public static void printPowerSet(String s){

        // Length of string
        int n = s.length();



        // =====================================================
        // Total subsets = 2^n
        //
        // (1 << n) means:
        //
        // 1 shifted left by n positions
        //
        // Example:
        //
        // n = 3
        //
        // 1 << 3
        // = 1000(binary)
        // = 8
        //
        // So:
        // pSize = 8
        // =====================================================

        int pSize = (1 << n);



        // =====================================================
        // Outer loop:
        //
        // i represents every subset
        //
        // Example:
        //
        // For n = 3:
        //
        // i values:
        //
        // 0 -> 000
        // 1 -> 001
        // 2 -> 010
        // 3 -> 011
        // 4 -> 100
        // 5 -> 101
        // 6 -> 110
        // 7 -> 111
        //
        // Every binary number represents one subset.
        // =====================================================

        for(int i = 0; i < pSize; i++){



            // =================================================
            // Inner loop checks every bit of i
            //
            // j represents character position
            //
            // If bit is SET:
            // include character
            //
            // If bit is NOT SET:
            // do not include character
            // =================================================

            for(int j = 0; j < n; j++){



                // =============================================
                // CHECKING jth BIT
                //
                // (1 << j)
                //
                // creates a number with only jth bit set.
                //
                // Example:
                //
                // j = 0 -> 0001
                // j = 1 -> 0010
                // j = 2 -> 0100
                //
                // i & (1 << j)
                //
                // If result != 0
                // => bit is set
                // =============================================

                if((i & (1 << j)) != 0){

                    // Print character at position j
                    System.out.print(s.charAt(j));
                }
            }



            // Move to next subset
            System.out.println();
        }
    }



    // =========================================================
    // DETAILED EXAMPLE
    // =========================================================
    //
    // s = "ab"
    //
    // n = 2
    //
    // pSize = 2^2 = 4
    //
    // So:
    //
    // i goes from 0 to 3
    //
    //
    // ---------------------------------------------------------
    // i = 0
    // ---------------------------------------------------------
    //
    // Binary:
    // 00
    //
    // j = 0
    //
    // (1 << 0)
    // = 01
    //
    // 00 & 01
    // = 00
    //
    // Not set
    // Do not print 'a'
    //
    //
    // j = 1
    //
    // (1 << 1)
    // = 10
    //
    // 00 & 10
    // = 00
    //
    // Not set
    // Do not print 'b'
    //
    // Output:
    // ""
    //
    //
    // ---------------------------------------------------------
    // i = 1
    // ---------------------------------------------------------
    //
    // Binary:
    // 01
    //
    // j = 0
    //
    // 01 & 01
    // = 01
    //
    // Set
    // Print 'a'
    //
    //
    // j = 1
    //
    // 01 & 10
    // = 00
    //
    // Not set
    //
    // Output:
    // "a"
    //
    //
    // ---------------------------------------------------------
    // i = 2
    // ---------------------------------------------------------
    //
    // Binary:
    // 10
    //
    // j = 0
    //
    // 10 & 01
    // = 00
    //
    // Not set
    //
    // j = 1
    //
    // 10 & 10
    // = 10
    //
    // Set
    // Print 'b'
    //
    // Output:
    // "b"
    //
    //
    // ---------------------------------------------------------
    // i = 3
    // ---------------------------------------------------------
    //
    // Binary:
    // 11
    //
    // j = 0
    //
    // 11 & 01
    // = 01
    //
    // Set
    // Print 'a'
    //
    //
    // j = 1
    //
    // 11 & 10
    // = 10
    //
    // Set
    // Print 'b'
    //
    // Output:
    // "ab"
    // =========================================================



    // =========================================================
    // DRIVER CODE
    // =========================================================

    public static void main(String[] args) {

        String s = "abc";

        printPowerSet(s);
    }
}