import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {
    public static void main(String[] args) throws ParseException {
        String now = "2026/04/19";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf1.parse(now);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String d = sdf2.format(date);
        System.out.println(d);
    }
}
