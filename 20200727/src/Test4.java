import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        //1079. 活字印刷
    }
}
class Solution4 {
    int res = 0;
    int len = 0;
    public int numTilePossibilities(String tiles) {
        char[] cs = tiles.toCharArray();
        Arrays.sort(cs);
        len = cs.length;
        int[] val = new int[len];
        search(cs,val);
        return res-1;
    }

    public void search(char[] cs,int[] val){
        res++;
        for(int i = 0;i<len;i++){
            if(val[i]==0){
                if(i>0&&cs[i]==cs[i-1]&&val[i-1]==0){
                    continue;
                }else{
                    val[i] = 1;
                    search(cs,val);
                    val[i] = 0;
                }
            }
        }
    }
}