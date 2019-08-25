package string_tokenizer;
import java.util.StringTokenizer;

class tokenizer{
    public static void nodelimit(){
        StringTokenizer str = new StringTokenizer("My name is Bro");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
        System.out.println();
    }
    public static void withdelimit(){
        StringTokenizer str = new StringTokenizer("My,name,is,Bruh");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken(","));
        }
    }

    public static void main(String args[]){
        tokenizer.nodelimit();
        tokenizer.withdelimit();
    }
}
