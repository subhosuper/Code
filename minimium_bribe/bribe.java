package minimium_bribe;
import java.util.*;
class bribe{
    static int count;
    static List<Integer> briber;
    static void minimumBribes(int[] q) {
        briber = new ArrayList<Integer>();
        count = 0;
        int temp = 0, k = 0;
        int length = q.length;
        int sorted_array[] = new int[length];
        sorted_array = Arrays.copyOf(q,length);
        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(sorted_array[j] < sorted_array[i]){
                    temp = sorted_array[i];
                    sorted_array[i] = sorted_array[j];
                    sorted_array[j] = temp;
                }
            }
        }
        String result = check(q,sorted_array,k);
        System.out.println(result);   
    }
    static String check(int q[], int sorted_array[], int i){
        int temp = 0;
        int length = q.length;
        if(i == length-1){ i = 0; }
        if(q[i+1] < q[i]){
            if(briber.contains(q[i+1]) != true){
                briber.add(q[i+1]);
                temp = q[i+1];
                q[i+1] = q[i];
                q[i] = temp;
                i++; count++;
                System.out.println(Arrays.toString(q));
                if(Arrays.equals(q,sorted_array) == false){
                    check(q,sorted_array,i);}
                else{
                    System.out.println("Point 1");
                    return String.valueOf(count);
                }
            }
            else{
                return "Too chaotic";
            }
        }
        else if(!(q[i+1] < q[i])){
            i++;
            if(Arrays.equals(q,sorted_array) == false){
                    check(q,sorted_array,i);}
            else{
                System.out.println("Point 2");
                return String.valueOf(count);
        }
    }
    System.out.println("Point 3");
    return String.valueOf(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int q[] = new int[5];
        for(int i=0; i<5; i++)
            q[i] = sc.nextInt();
        minimumBribes(q);
        sc.close();
    }
}
