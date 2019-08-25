package list_in_java;
import java.util.ArrayList;
public class list_test_integer{
    public static void main(String args[]){
        ArrayList<Integer> listA = new ArrayList<Integer>();
        // int remove=4;
        for(int i=0;i<5;i++){
            listA.add(i+1);
        }
        // System.out.println(listA);     // useful lines
        // listA.remove(remove);
        // System.out.println(listA);
        // listA.remove(2);
        System.out.println("actual list= "+listA);
        int trace = listA.indexOf(3);
        for(int j=0;j<=trace;j++)
            System.out.println(listA.get(j));
        System.out.println("Initial size: "+listA.size());
        listA.remove(0);
        System.out.println("Final size: "+listA.size());
        listA.remove(listA.size()-1);
        System.out.println(listA);
        System.out.println(listA.getClass().getName());
        //Convert integer list to string variable
        String listA_string = listA.toString();
        System.out.println(listA_string);
        System.out.println(listA_string.getClass().getName());

    }
}