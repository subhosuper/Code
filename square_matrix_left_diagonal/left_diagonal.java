package square_matrix_left_diagonal;
import java.io.Console;
import java.io.IOException;

public class left_diagonal{
    public static void main(String args[])throws IOException{
        Console c = System.console();
        int row = Integer.parseInt(c.readLine());
        int column = Integer.parseInt(c.readLine());
        int array[][] = new int[row][column];
        int sum=0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                array[i][j] = Integer.parseInt(c.readLine());
            }
        }
        if(row != column)
            sum = make_square(row, column, array);
        else{
            sum = sum(row, column, array);
        }
        System.out.println(sum);
    }
    public static int make_square(int row, int column, int array[][]){
        int sum = 0;
        if(row < column){
            int difference = column - row;
            int array_final[][] = new int [row+difference][column];
            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    array_final[i][j] = array[i][j];
                }
            }
            while(difference != 0){
                for(int i = 0; i < column; i++){
                    array_final[column-difference][i] = 1;
                }
                difference--;
            }
            sum = sum(row, column, array_final);
        }
        else if(column < row){
            int difference = row - column;
            int array_final[][] = new int [row][column+difference];
            while(difference != 0){
                for(int i = 0; i < row; i++){
                   array_final[row][column-difference] = 1;
                }
                difference--;
            }
            sum = sum(row, column, array_final);
        }
        return sum;
    }
    public static int sum(int row, int column, int array[][]){
        int sum = 0;
        for(int i = 0;i < row; i++){
            for(int j = 0;j < column; j++){
                if(i == j)
                    sum = sum + array[i][j];
            }
        }
        return sum;
    }
}