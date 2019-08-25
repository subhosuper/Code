import java.util.*;
class selection_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp=0;
        int arr[] = new int[5];
        for(int i=0; i<5; i++){
                arr[i] = sc.nextInt();
            }
        for(int i=0; i<5-1; i++){
            for(int j=i+1; j<5; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)+"\n"+Arrays.toString(arr).getClass().getName());
        sc.close();
    }
}