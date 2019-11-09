package alphabet_pattern;
import java.util.*;
class alphabet_pattern {
    public static void solution(int N){
        List<String> li = new ArrayList<>();
        for(int i=65; i<(N+65); i++){
            li.add((char)i+"");
        }
        // System.out.println(li);
        int input = (N-1)*2+1;
        int  x = 0;
        for(int k=0; k<N; k++){
            for(int j=0; j<input; j++){
                if(j>N-1){
                    int diff = j-(N-1);
                    x=j-(2*diff);
                }
                else{
                    x=j;
                }
                System.out.print(li.get(x));
        }
        li.set(k, " ");
        System.out.println();
    }
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        alphabet_pattern.solution(sc.nextInt());
        sc.close();
    }
}