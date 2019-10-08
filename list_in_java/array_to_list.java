package list_in_java;
import java.io.*;
import java.util.*;
public class array_to_list{
    public static void main(String args[])throws IOException{
        String arrayString[] = {"anjali","subhampagal","harshitha","harshithak"};
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(arrayString));       //convert string array to String List passing array into the contructor of ArrayList<>
        System.out.println(al+"\n"+al.getClass().getName());  
        al.add("anjalis");
        System.out.println(al);
        al.remove(al.size()-1);
        System.out.println(al);
        List<String> list = Arrays.asList(arrayString);     //convert string array to String List by directly storing the Array as List as the initialised value
        System.out.println(list);
        System.out.println(list+"\n"+al.getClass().getName());
    }
}