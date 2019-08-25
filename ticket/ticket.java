package ticket;
import java.util.ArrayList;
import java.util.Scanner;
class ticket{
    public static int waitingTime(ArrayList<Integer> tickets, int person){
        person = person-1;
        int length = tickets.size();
        int time = 0;
        int i = 0;
        while(tickets.get(person) != 0){
            time++;
            if(tickets.get(i) != 0){
                tickets.add(i, tickets.get(i)-1);
                tickets.remove(i+1);
                if(i == length-1){
                    i = 0;
                }
                else if(i != length-1){
                    i++;
                }
            }
            else if(tickets.get(i) == 0){
                time = time-1;
                i++;
                continue;
            }
            System.out.println("tickets= "+tickets+"\n");
        }
        return time;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ticketCount = sc.nextInt();
        ArrayList<Integer> tickets = new ArrayList<Integer>();
        for(int i=0;i<ticketCount;i++){
            tickets.add(sc.nextInt());
        }
        int person = sc.nextInt();
        int result = waitingTime(tickets, person);
        System.out.println("Result= "+result);
        sc.close();
    }
}