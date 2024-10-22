

/** given a matrix nxn find the sum of both diagonal element*/


public class Question2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result = diagonalSum(matrix);
        System.out.println("The diagonal sum is: " + result);
    }

    public static int diagonalSum(int [][] matrix){

        int n =  matrix.length;
        int sum = 0;

        for( int i = 0; i < n ; i++ ){
           // primary diagonal
            sum+= matrix[i][i];

            //secondary diagonal
            sum += matrix[i][n-1-i];
        }

        // If n is odd, subtract the center element (since it's counted twice)
        if(n % 2 != 0){
            sum -=matrix[n/2][n/2];
        }

        return sum;
    }
}


//output should be 25 for the array