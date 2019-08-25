package string_buffer;

public class string_buffer{
    public static void main(String args[]){
        StringBuffer br = new StringBuffer("Testing");
        for(int i=1;i<=5;i++){
            br.append(" done");
        }
        System.out.println(br.toString());
    }
}
