class Solution {
    public void rotate(int[][] matrix) {
       int temp =0;
       for(int i=0; i<matrix.length; i++){
        for(int j=i+1; j<matrix.length; j++){
            temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
       } 
       for(int i=0; i<matrix.length; i++){
        for(int j=0; j< matrix.length/2; j++){
            temp = matrix[i][j];
            matrix[i][j] = matrix[i][matrix.length-1-j];
            matrix[i][matrix.length-1-j] = temp;
        }
       }
    }
}