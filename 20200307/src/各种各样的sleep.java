import java.util.concurrent.TimeUnit;

public class 各种各样的sleep {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10); // 毫秒
        TimeUnit.DAYS.sleep(10); // 天
        TimeUnit.HOURS.sleep(10); // 小时
    }
}
