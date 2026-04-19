import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) throws ParseException {
        String now = "2025-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(now);
        System.out.println(date);
    }
}
