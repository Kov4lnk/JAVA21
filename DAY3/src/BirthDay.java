import java.util.StringTokenizer;

public class BirthDay {
    public static void main(String[] args) {
        StringTokenizer fullDate;

        String bDay = "26/09/1990";
        System.out.println(bDay);

        fullDate = new StringTokenizer(bDay, "/");
        System.out.println("The date is: " + fullDate.nextToken());
        System.out.println("The month is: " + fullDate.nextToken());
        System.out.println("The year is: " + fullDate.nextToken());

        //OR ANOTHER IMPLEMENTATION

        String birthday = "09/26/1990";
        String month = birthday.substring(0, 2);
        String day = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);
        System.out.println("\n\n\nBirthday: " + birthday);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
    }
}
