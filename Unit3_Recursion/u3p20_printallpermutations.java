package unit3_recursion;

/*
 * =========================================================
 * Program: Print All Permutations of a String using Recursion
 * =========================================================
 * 
 * Concept Used:
 * - Recursion
 * - Backtracking
 * - Swapping
 * 
 * Description:
 * This program prints all possible permutations of a given
 * string using recursion and backtracking.
 * 
 * Example:
 * Input  : "ABC"
 * Output :
 * ABC
 * ACB
 * BAC
 * BCA
 * CBA
 * CAB
 * 
 * ---------------------------------------------------------
 * HOW THE ALGORITHM WORKS
 * ---------------------------------------------------------
 * 
 * We fix one character at a time and recursively generate
 * permutations for the remaining characters.
 * 
 * Steps:
 * 1. Fix a character at current index.
 * 2. Recursively permute remaining characters.
 * 3. Backtrack by restoring original arrangement.
 * 
 * ---------------------------------------------------------
 * RECURSION TREE FOR "ABC"
 * ---------------------------------------------------------
 * 
 *                         ABC
 *                  /        |        \
 *               ABC       BAC       CBA
 *              /   \      /   \     /   \
 *           ABC   ACB   BAC  BCA  CBA  CAB
 * 
 * ---------------------------------------------------------
 * TIME COMPLEXITY
 * ---------------------------------------------------------
 * 
 * Total permutations = n!
 * Each permutation takes O(n) to create/print.
 * 
 * Therefore:
 * Time Complexity = O(n × n!)
 * 
 * ---------------------------------------------------------
 * AUXILIARY SPACE COMPLEXITY
 * ---------------------------------------------------------
 * 
 * Recursion stack depth = O(n)
 * 
 * =========================================================
 */

public class u3p20_printallpermutations {

    /*
     * =====================================================
     * Function: permute()
     * =====================================================
     * 
     * Purpose:
     * Generates and prints all permutations of a string.
     * 
     * Parameters:
     * str -> Current string arrangement
     * i   -> Current index to fix
     * 
     * Working:
     * - Fix one character at index i
     * - Recursively generate permutations for remaining part
     * - Use backtracking to restore original arrangement
     * 
     * =====================================================
     */
    public static void permute(String str, int i){

        /*
         * -------------------------------------------------
         * BASE CASE
         * -------------------------------------------------
         * If current index reaches last character,
         * one complete permutation is formed.
         */
        if(i == str.length() - 1){

            // Print the generated permutation
            System.out.println(str);

            // Return to previous recursive call
            return;
        }

        /*
         * -------------------------------------------------
         * LOOP FOR GENERATING PERMUTATIONS
         * -------------------------------------------------
         * 
         * We swap each character from index i to end
         * with the current index i.
         * 
         * Example:
         * For "ABC" and i = 0
         * 
         * j = 0 -> ABC
         * j = 1 -> BAC
         * j = 2 -> CBA
         */
        for(int j = i; j < str.length(); j++){

            /*
             * Swap current index character with jth character
             * to place a new character at current position.
             */
            str = swap(str, i, j);

            /*
             * Recursive call:
             * Fix next index and generate remaining permutations.
             */
            permute(str, i + 1);

            /*
             * -------------------------------------------------
             * BACKTRACKING STEP
             * -------------------------------------------------
             * Restore original string arrangement after recursion.
             * 
             * Why?
             * Because next iteration should start with original
             * arrangement before trying another swap.
             */
            str = swap(str, i, j);
        }
    }

    /*
     * =====================================================
     * Function: swap()
     * =====================================================
     * 
     * Purpose:
     * Swaps characters at two indices in a string.
     * 
     * Parameters:
     * str -> Input string
     * i   -> First index
     * j   -> Second index
     * 
     * Returns:
     * New string after swapping characters.
     * 
     * =====================================================
     */
    public static String swap(String str, int i, int j){

        /*
         * Strings are immutable in Java,
         * so convert string into character array.
         */
        char[] arr = str.toCharArray();

        // Store first character temporarily
        char temp = arr[i];

        // Swap characters
        arr[i] = arr[j];
        arr[j] = temp;

        // Convert character array back to string
        return new String(arr);
    }

    /*
     * =====================================================
     * MAIN METHOD
     * =====================================================
     */
    public static void main(String[] args) {

        // Input string
        String str = "ABC";

        /*
         * Function call:
         * Start permutation generation from index 0
         */
        permute(str, 0);
    }
}