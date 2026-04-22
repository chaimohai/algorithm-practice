import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse("2026-04-19");
        Date d2 = sdf.parse("2026-06-13");
        long ms = Math.abs(d2.getTime() - d1.getTime());
        long day = ms/(1000*60*60*24);
        System.out.println(day);
    }
}
