package maze;
import java.io.IOException;
import java.util.ArrayList;
class maze{
    static ArrayList<String> trace = new ArrayList<String>();
    public static void main(String args[])throws IOException{
        int maze_route[][] = {{0,  0, 0, 0},{0, 0, 0, -1},{-1, 0, 0, 0},{0,  0, 0, 0}};
        int register[][] = new int[2][2];
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(maze_route[i][j]+" ");
            }
            System.out.println();
        }
        i = 0; j = 0;
        traverse(maze_route,i,j,register);
    }
    static void traverse(int maze_route[][], int row, int column, int register[][]){
        if(column <= 2 && maze_route[row][column+1] != -1){  
            if(row<=2 && maze_route[row+1][column] != -1){
                register[0][0] = row;
                register[0][1] = column;
            }
            column++;
            register[1][0] = row;
            register[1][1] = column;
            trace.add((row+1)+","+(column+1));
            if(row==3 && column==3){
                System.out.println("\n"+trace);
                System.exit(0);
            }
            traverse(maze_route, row, column, register);
        }
    
        else if(row <=2 && maze_route[row+1][column] != -1){
            row++;
            register[1][0] = row;
            register[1][1] = column;
            trace.add((row+1)+","+(column+1));
            if(row == 3 && column == 3){
                System.out.println("\n"+trace);
                System.exit(0);
            }
            traverse(maze_route, row, column, register);
        }
        else{
            // if(maze_route[row+1][column] == -1 && maze_route[row][column+1] == -1){
            //     System.out.println("To reach destination is not possible");
            //     System.exit(0);
            // }
            row = register[0][0];
            column = register[0][1];
            maze_route[register[1][0]][register[1][1]] = -1;
            String remove = (register[1][0]+1)+","+(register[1][1]+1);
            trace.remove(remove);
            trace.remove(remove);
            traverse(maze_route, row, column, register);
        }
    }
}