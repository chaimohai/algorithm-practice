import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class stringToDate {
    public static void main(String[] args) throws ParseException {
        String now = "2026-04-19 15:25:20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = sdf.parse(now);
        System.out.println(date);
    }
}
