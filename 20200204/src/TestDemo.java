
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry = 0;
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        int[] res = new int[(m > n ? m : n) + 1];
        for (int i = (m > n ? m : n) + 1; i > 0 ; i--) {
            int q ;
            int p ;
            if(m <= 0) {
                q = 0;
            }else  {
                q = array1[m - 1] - '0';
            }
            if(n <= 0) {
                p = 0;
            }else {
                p = array2[n - 1] - '0';
            }
            int k = q + p + carry;
            int count = k % 2;
            carry = k / 2;
            res[i] = count + '0';
            m--;
            n--;
        }
        return res.toString();
    }
}

class Solution7 {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int bol = 1;
        int ans = 0;
        char[] cdhr = str.toCharArray();
        int i = 0;
        if (cdhr[0] == '-') {
            bol = -1;
            i = i + 1;
        }else if(cdhr[0] == '+'){
            i = i + 1;
        }
        for (; i < str.length(); i++) {
            if (48 > str.charAt(i) || str.charAt(i) >57) {
                break;
            }

            if(ans*bol > Integer.MAX_VALUE/10||ans*bol == Integer.MAX_VALUE / 10 && (cdhr[i] - 48) > 7 ){
                return Integer.MAX_VALUE;
            }
            if(ans*bol < Integer.MIN_VALUE/10||ans*bol == Integer.MIN_VALUE / 10 && (cdhr[i] - 48) > 8 ){
                return Integer.MIN_VALUE;
            }
            ans = ans * 10 + (cdhr[i] - 48);

        }
        ans=ans*bol;

        return  ans;

    }
}

class Solution6 {
    public int myAtoi(String str) {
        long res = 0;
        boolean flag = true;
        int f = -1;
        char[] c = str.toCharArray();
        for(int i = 0; i<c.length;i++) {
            if(f==-1 && (c[i]=='-' || c[i]=='+') ) {
                flag = c[i]=='-'?false:true;
                f = 1;
            }else if(Character.isDigit(c[i])) {
                res = res*10 + (c[i]-'0');
                if(res>Integer.MAX_VALUE){
                    if(!flag) return  Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                f = 1;
            }else if(c[i]>30 ){
                if(f==-1 && c[i]==' ') continue;
                break;
            }
        }
        return flag == true?(int)res:(int)-res;
    }
}

class Solution5 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int iA = a.length() - 1;
        int iB = b.length() - 1;
        // 进位
        int carry = 0;
        while( 0 <= iA || 0 <= iB || carry == 1){
            // 统计1的个数
            int count = carry;
            if(0 <= iA){
                count += a.charAt(iA--) - '0';
            }
            if(0 <= iB){
                count += b.charAt(iB--) - '0';
            }
            res.append(count % 2);
            // 大于2, 进位
            carry = count / 2;
        }
        return res.reverse().toString();
    }
}

class Solution4 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ia = a.length() - 1;
        int ib = b.length() - 1;
        int carry = 0;
        while(ia >= 0 || ib >= 0 || carry > 0){
            carry += (ia >= 0) ? a.charAt(ia--) - '0' : 0;
            carry += (ib >= 0) ? b.charAt(ib--) - '0' : 0;
            res.append(carry % 2);
            carry = carry / 2;
        }
        return res.reverse().toString();
    }
}

class Solution3 {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0) c += a.charAt(i --) - '0';
            if(j >= 0) c += b.charAt(j --) - '0';
            stb.append(c % 2);
            c >>= 1;
        }

        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        // // 双重循环 循环极限为(n^2-n)/2
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = nums.length - 1; j > i; j --){
        //         if(nums[i]+nums[j] == target){
        //            indexs[0] = i;
        //            indexs[1] = j;
        //            return indexs;
        //         }
        //     }
        // }
        return indexs;
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for(int i = 0;i < nums.length ;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] != nums[j] && nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return null;
    }
}

public class TestDemo {
        public static void main(String args[]){
            int num = 10;
            System.out.println(test(num));
        }
        public static int test(int b){
            try {
                b += 10;
                return b;
            }catch(RuntimeException e){
            }catch(Exception e2){
            } finally{
                b += 10;
                return b;
            }
        }
}
