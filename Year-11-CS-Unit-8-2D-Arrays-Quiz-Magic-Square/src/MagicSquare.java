public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int i = 0; i < array2d[0].length; i++){
            sum = sum + array2d[0][i];
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        for(int i = 1; i < array2d.length; i++){
            int sum = 0;
            for(int a = 0; a < array2d.length; a++){
                sum = sum + array2d[i][a];
            }
            if(sum == checkSum){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum){
        for (int i = 0; i < array2d[0].length; i++){
            int sum = 0;
            for (int a = 0; a < array2d.length; a++){
                sum = sum + array2d[a][i];
            }
            if (sum == checkSum){
                return true;
            }
        }
        return false;
    }


    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {

    }

}
