import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String date = sdf.format(now);
        System.out.println(date);
    }
}
