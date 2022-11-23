public class sol {
    public static void main(String[] args) {
        {
            int[][] matrix = new int[0][];
            int i = 0;
            for (int j = i; j < matrix.length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                {
                    for (i = 0; i < matrix.length; i++) {
                    }
                }
                for (i = 0; i < matrix.length; i++) {
                    int low = 0;
                    int high = matrix[0].length - 1;
                    while (low < high) {
                        temp = matrix[i][low];
                        matrix[i][low] = matrix[i][high];
                        matrix[i][high] = temp;
                        low++;
                        high--;
                    }
                }
            }
        }
    }
}

