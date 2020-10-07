import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {
MoodAnalyzer m=new MoodAnalyzer();
@Test
        public void testAnalyzeMood() {
    Assert.assertEquals(m.analyzeMood("I am in sad mood"), "Sad");
}
}
