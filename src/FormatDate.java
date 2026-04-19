import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        Date now = new Date();
        // LocalDateTime now = LocalDateTime.now();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(now);
        System.out.println(time);
    }
}
