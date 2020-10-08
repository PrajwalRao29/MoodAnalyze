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
        this.message = null;
    }

    public String analyzeMood() {
        try {
            if(message==null)
            {
                this.error=Error.NullError;
                throw new MoodAnalysisException();
                }
            else if(message.contains("sad"))
            {
                return "Sad";
            }
            else if(message.contains("happy"))
            {
                return "Happy";
            }
            else if(message==" ") {
                this.error = Error.EmptyError;
                throw new MoodAnalysisException();
            }
        } catch (MoodAnalysisException e) {
            System.out.println(error);
            return "Invalid Mood";
        }
        return "Invalid Mood";
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