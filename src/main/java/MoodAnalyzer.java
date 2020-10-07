import java.util.Scanner;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(String message)
    {
        this.message=message;
    }
    public MoodAnalyzer()
    {
        this.message="";
    }
    public String analyzeMood() {
        try {
            for (int position = 0; position < message.length(); position++) {
                String s = "" + message.charAt(position) + message.charAt(position + 1) + message.charAt(position + 2);
                if (s.equalsIgnoreCase("SAD")) {
                    return "Sad";
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            return "Happy";
        }
        catch(NullPointerException e)
        {
            return "Null";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mood");
        String message = scanner.nextLine();
        MoodAnalyzer m = new MoodAnalyzer(message);
    }
}
