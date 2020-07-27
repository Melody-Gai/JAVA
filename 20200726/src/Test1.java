import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
//力扣690
    }
}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
class Solution1 {
    private int sum = 0;
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees)
            map.put(e.id, e);
        return dfs(id, map);
    }

    public int dfs(int id, Map<Integer, Employee> map) {
        sum += map.get(id).importance;
        for (int a : map.get(id).subordinates)
            dfs(a, map);
        return sum;
    }
}