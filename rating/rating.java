package rating;
import java.util.*;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();
        int integer = (int)rate;
        double decimal = rate - (integer + 0.0);
        decimal = decimal * 10;
        System.out.println(decimal);

        if(integer != 0){
            for(int i=1; i<=integer; i++){
                System.out.print("full ");
            }
        }
        if(integer < 5 && (int)decimal == 5){
            System.out.print("half ");
            for(int j=1; j<=(5-(integer+1)); j++){
                System.out.print("empty ");
            }
        }
        else if(integer < 5 && (int)decimal == 0){
            for(int k=1; k<= 5-(integer); k++){
                System.out.print("empty ");
            }
        }
        else if(integer == 0 && (int)decimal ==0){
            for(int k=1; k<=5; k++){
                System.out.print("empty ");
            }            
        }
        sc.close();
    }
}