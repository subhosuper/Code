package self_explanatory;
import java.util.*;
class self_expl_no{
    public static void main(String args[]){
        long start_time = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int number = sc.nextInt();
        int length = Integer.toString(number).length();
        if(length % 2 != 0){
            System.out.println("Not self-explanatory");
        }
        else{
        int num_array[] = new int[length];
        int index = -1;
        int digit = 0;
        for(int i=length-1;i>=0;i--){                           //storing digits in array
            digit = number/(int)Math.pow(10,i);
            num_array[++index] = digit;
            number = number % (int)Math.pow(10,i);
        }

        index = 0;                                             //calculating frequencey of each digit
        int n = 0;
        while(index <= length-1){
            n = num_array[index];
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
            index++;
        }

        index = length-1; boolean flag = true;                 //checking if self-explanatory
        while(index >= 1){
            if(map.containsKey(num_array[index])){
                if(map.get(num_array[index]) != num_array[index-1]){
                    flag = false;
                    break;
                }
            }
            index = index - 2;
        }
        if(flag == false){
            System.out.println("Not Self-explanatory");
        }
        else{
            System.out.println("Self-explanatory");
        }
        }
        sc.close();
        System.out.println("Time taken = "+((System.currentTimeMillis()/1000)-(start_time/1000)+" ms"));
    }
}