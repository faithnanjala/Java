public class AlarmSetter {
    public static void main(String[] args) {
        String dayOfWeek = "Monday";  // You can change this value to test other days

        String alarmTime = getAlarmTime(dayOfWeek);
        System.out.println("Alarm set for: " + alarmTime);
    }

    public static String getAlarmTime(String dayOfWeek) {
        return switch (dayOfWeek) {
            case "Monday" -> "7:00 AM";
            case "Tuesday", "Wednesday", "Thursday", "Friday" -> "6:00 AM";
            case "Saturday", "Sunday" -> "No alarm";  // Assuming no alarm for weekends, adjust as needed
            default -> "Invalid day";
        };
    }
}
