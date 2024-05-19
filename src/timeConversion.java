public class timeConversion {
    public static String convertTime(String s){
        int hours = Integer.parseInt(s.substring(0,2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String ampm = s.substring(8, 10);

        //Adjust hours for PM time
        if(ampm.equals("PM") && hours != 12){
            hours += 12;
        }
        if(ampm.equals("AM") && hours == 12){
            hours = 0;
        }
        return String.format("%02d:%02d:%02d", hours,minutes,seconds);
    }
    public static void main(String[] args){
        String time12Format = "03:23:19PM";
        String time24Format = convertTime(time12Format);
        System.out.println("converted Time: " + time24Format);
    }
}
