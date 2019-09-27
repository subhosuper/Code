package swap_word_form;
import java.util.*;

class monk_swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int word_size = sc.nextInt();
        String word_init = sc.next();
        String word_final = sc.next();
        int i = 0;
        char character[] = word_init.toCharArray();
        String result = swap(word_size, word_init, word_final, character, i);
        System.out.println(result);
        sc.close();
    }

    public static String swap(int size, String word_init, String word_final, char character[], int i){
        String word = "";
        char ch = character[i];
        int index_init = word_init.indexOf(ch);
        int index_final = word_final.indexOf(ch);
        char init_ch = word_init.charAt(index_final);
        int replacement_index = word_init.indexOf(init_ch);
        for(int j=0; j<size; j++){
            if(j == index_init){
                word = word + init_ch; 
            }
            else if(j == replacement_index){
                word = word + ch;
            }
            else{
                word = word + word_init.charAt(j);
            }
        }
        word_init = word;
        if(word_init.equalsIgnoreCase(word_final) == false && i <= size-1){
            swap(size, word_init, word_final, character, i++);
        }
        else{
            return "YES";
        }
        return "NO";
    }
}