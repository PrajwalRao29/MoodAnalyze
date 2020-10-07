import java.util.Scanner;

public class MoodAnalyzer {
    public String analyzeMood(String message) throws ArrayIndexOutOfBoundsException {
        try {
            for (int position = 0; position < message.length(); position++) {
                String s = "" + message.charAt(position) + message.charAt(position + 1) + message.charAt(position + 2);
                if (s.equalsIgnoreCase("SAD")) {
                    return "Sad";
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Happy";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoodAnalyzer m = new MoodAnalyzer();
        System.out.println("Enter the mood");
        String message = scanner.nextLine();
        String mood = m.analyzeMood(message);
    }
}
