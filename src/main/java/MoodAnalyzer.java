import java.util.Scanner;

enum Error {
    EmptyError, NullError;
}

public class MoodAnalyzer {
    String message=null;
    public Error error;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
        this.message = "";
    }

    public String analyzeMood() {
        try {
            if (message != null) {
                for (int position = 0; position < message.length(); position++) {
                    if (position == message.length() - 2) {
                        this.error = Error.EmptyError;
                        throw new MoodAnalysisException();
                    }
                    String s = "" + message.charAt(position) + message.charAt(position + 1) + message.charAt(position + 2);
                    if (s.equalsIgnoreCase("SAD")) {
                        return "Sad";
                    } else if (s.equalsIgnoreCase("Hap") && position < message.length() - 2) {
                        String str = s + message.charAt(position + 3) + message.charAt(position + 4);
                        if (str.equalsIgnoreCase("Happy"))
                            return "Happy";
                    }
                }
            }
            this.error = Error.NullError;
            throw new MoodAnalysisException();
        } catch (MoodAnalysisException e) {
            System.out.println(error);
            return "Invalid Mood";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mood");
        String message = scanner.nextLine();
        MoodAnalyzer m = new MoodAnalyzer(message);
    }
}

class MoodAnalysisException extends Exception {
    public MoodAnalysisException() {
        System.out.println("Invalid Mood");
    }
}