package checkbox_radio;
import java.util.*;

class checkbox_radio{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        string = string.toLowerCase();
        int number = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<number; i++){
            arr.add(sc.nextInt());
        }
        switch(string){
            case "checkbox":
                if(Collections.frequency(arr, 1) >= 1){
                    System.out.println("VALID");
                }
                else{
                    System.out.println("INVALID");
                }
                break;
            case "radio":
                if(Collections.frequency(arr, 1) == 1){
                    System.out.println("VALID");
                }
                else{
                    System.out.println("INVALID");
                }
                break;
            default:
                System.out.println("INVALID");
            }
            sc.close();
        }
    }