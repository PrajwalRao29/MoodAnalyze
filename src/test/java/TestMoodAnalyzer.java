import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {
MoodAnalyzer m=new MoodAnalyzer();
@Test
        public void test1AnalyzeMoodWhenSad() {
    Assert.assertEquals(m.analyzeMood("I am in sad mood"), "Sad");
}
    @Test
    public void test2AnalyzeMoodWhenNotSad() {
        Assert.assertEquals(m.analyzeMood("I am in Any mood"), "Happy");
    }
}
