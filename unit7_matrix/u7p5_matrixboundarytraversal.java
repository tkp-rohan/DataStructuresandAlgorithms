package unit7_matrix;

public class u7p5_matrixboundarytraversal{

    public static void bTraversal(int[][] mat, int R, int C){

        // If only one row
        if (R == 1){
            for (int i = 0; i < C; i++){
                System.out.print(mat[0][i] + " ");
            }
        }

        // If only one column
        else if(C == 1){
            for (int i = 0; i < R; i++){
                System.out.print(mat[i][0] + " ");
            }
        }

        // General case
        else{

            // Top row
            for(int i = 0; i < C; i++){
                System.out.print(mat[0][i] + " ");
            }

            // Right column
            for (int i = 1; i < R; i++) {
                System.out.print(mat[i][C - 1] + " ");
            }

            // Bottom row
            for (int i = C - 2; i >= 0; i--) {
                System.out.print(mat[R - 1][i] + " ");
            }

            // Left column
            for (int i = R - 2; i >= 1; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int R = mat.length;
        int C = mat[0].length;

        bTraversal(mat, R, C);
    }
}