package distinct_character_final;
import java.io.*;
public class distinct_character{
    public static void distinct(String str){
        final int NO_OF_CHARS = 256;
        int count[] = new int[NO_OF_CHARS];
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i) != ' ')
                count[(int)str.charAt(i)]++;
        }

        for(int j=0;j<NO_OF_CHARS;j++){
            if(count[j] != 0)
                System.out.print((char)j+":"+count[j]+"\n");
        }
        System.out.println();
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        distinct(str.toLowerCase());
    }
}
