
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Test{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String str = br.readLine();
        int maxcount = Integer.MIN_VALUE;
        for(int i = 0;i<str.length();i++){
            ArrayList<String> arr = new ArrayList<String>();
            for(int j = i;j<str.length();j++){
                String s = String.valueOf(str.charAt(0));
                if(!arr.contains(s)) {
                    arr.add(s);
                }
            }
        }
        System.out.println(arr);
    }
}
