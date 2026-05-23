package unit3_recursion;

public class u3p15_generatesubsets {
    
    // Recursive Solution
    // T.C. = O(2^n)
    // A.S. = O(n)

    public static void generateSubsets(String str, String curr, int i) {

        // Base Case:
        // If index reaches end of string,
        // print the current subset
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }

        // Case 1:
        // Do not include current character
        generateSubsets(str, curr, i + 1);

        // Case 2:
        // Include current character
        generateSubsets(str, curr + str.charAt(i), i + 1);
    }

    public static void main(String[] args) {

        String str = "ABC";

        generateSubsets(str, "", 0);
    }
}