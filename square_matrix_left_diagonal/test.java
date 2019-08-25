package square_matrix_left_diagonal;
// import java Resources and Information..IOException;
import java.io.IOException;
import java.util.Scanner;
 
public class test {
 
	public static void main(String args[]) throws IOException {
		Scanner br = new Scanner(System.in);
        int row = br.nextInt();
        int column = br.nextInt();
        int array[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
			    array[i][j] = br.nextInt();
                // System.out.println(i + " : " + input);
            }
        }
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
	}
}