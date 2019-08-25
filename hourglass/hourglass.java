package hourglass;
import java.util.*;

class hourglass{
    public static void main(String args[]){
        int arr[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int top=0, mid=0, bottom=0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                top=0; mid=0; bottom=0;
                top = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                mid = arr[i+1][j+1];
                bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                sum = top+mid+bottom;
                list.add(sum);
                if(i==0 && j==0){
                    max = sum;
                }
                else if(sum > max){
                    max = sum;
            }
            }
        }
        System.out.println(list+"\n"+max);
        sc.close();
    }
}