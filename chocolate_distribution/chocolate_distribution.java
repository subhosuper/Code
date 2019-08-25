package chocolate_distribution;
import java.io.*;
public class chocolate_distribution{
    static int max = 0;
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, M;
        int chocolates[];
        System.out.println("Enter N:");
        N = Integer.parseInt(br.readLine());
        System.out.println("Enter M:");
        M = Integer.parseInt(br.readLine());
        chocolates = new int[N];
        System.out.println("Enter chocolate distribution:\n");
        for(int i=0; i<N; i++){
            chocolates[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(distribution(chocolates, N, M));
    }

static int distribution(int chocolates[], int N, int M){
    int i = 0;
    while(i <= N-1){
        forward_check(chocolates, i, M);
        i++;
    }
    i = N-1;
    int k = 0;
    while(k <= i-1){
        backward_check(chocolates, i , k, M);
        k++;
    }
    return max;
}

static void forward_check(int chocloates[], int i, int M){
    int j = 0; int sum=0;
    for(j=0; j<=i; j++){
        sum = sum+chocloates[j];
    }
    if(sum%4 == 0){
        if((sum/M)>max){
            max = (sum/M);
        }
    }
}

static void backward_check(int chocolates[], int i, int k, int M){
    int j=0; int sum=0;
    for(j=i; j>=k; j--){
        sum = sum+chocolates[j];
    }
    // System.out.println(sum);
    if(sum%4 == 0){
        if((sum/M)>max){
            max = (sum/M);
        }
    }
}
}