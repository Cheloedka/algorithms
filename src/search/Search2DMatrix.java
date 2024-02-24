package search;

public class Search2DMatrix {

    public static boolean search(int[][] matrix, int target) {

        int line = 0;

        while (line < matrix.length) {

            int lastNumb =  matrix[line].length - 1;

            if (matrix[line][lastNumb] >= target) {
                return searchLine(matrix[line], target);
            }
            else {
                line++;
            }
        }

        return false;
    }

    public static boolean searchLine(int[] matrix, int target) {
        int end = matrix.length - 1;
        int start = 0;

        while (start <= end) {
            int position = start + (end - start) / 2;
            if (matrix[position] == target) {
                return true;
            }
            else if (matrix[position] > target) {
                end = position - 1;
            }
            else {
                start = position + 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7},{10, 11, 16, 20},{23, 30, 34, 60}};

        System.out.println(search(matrix, 12));

        System.out.println(search(matrix, 7));

    }
}
