
import java.util.*;
public class Main4{

    public static void main(String [] args){

        Scanner  sc=new Scanner(System.in);
        while(sc.hasNext()){
            int  input=sc.nextInt();
            Queue  list=new LinkedList();
            if(input>1000)input=999;
            for(int i=0;i<input;i++){
                list.offer(i);
            }
            while(list.size()!=1){
                for(int j=0;j<2;j++){
                    list.offer(list.poll());
                }
                list.poll();
            }

            System.out.println(list.poll());

        }
    }
}