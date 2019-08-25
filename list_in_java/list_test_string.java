package list_in_java;
import java.io.*;
import java.util.ArrayList;
public class list_test_string{
    public static void main(String args[])throws IOException{
        ArrayList<String> listA = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<4;i++){
            listA.add(br.readLine());
        }
        System.out.println(listA);
        String check = "harsh";
        if(listA.contains(check) == true){
            listA.remove("harsh");
        }
        System.out.println(listA);
    }
}