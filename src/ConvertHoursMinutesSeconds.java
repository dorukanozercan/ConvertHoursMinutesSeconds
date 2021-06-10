
public class ConvertHoursMinutesSeconds {

    public static void main(String[] args) {
        String result = getDurationString(8, 36);
        System.out.println(result);
        String newResult = getDurationString(8800);
        System.out.println(newResult);
    }

    public static String getDurationString (int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int hour = minutes / 60;
            minutes = minutes % 60;

            String hourString = hour + "h ";
            String minuteString = minutes + "m ";
            String secondString = seconds + "s ";

            if (hour < 10) hourString = "0" + hour + "h ";
            if (minutes < 10) minuteString = "0" + minutes+ "m ";
            if (seconds < 10) secondString = "0" + seconds + "s ";

            return  hourString + minuteString + secondString;
        }
        return "Invalid value";
    }

    public static String getDurationString (int seconds) {
        double minutes = seconds / 60;
        double remainingSeconds = minutes % 60;

        return getDurationString((int) minutes, (int) remainingSeconds);
    }

}
