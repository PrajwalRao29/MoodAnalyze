import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {
MoodAnalyzer m;
@Test
        public void test1AnalyzeMoodWhenSad() {
    m=new MoodAnalyzer("I am in sad mood");
    Assert.assertEquals(m.analyzeMood(), "Sad");
}
    @Test
    public void test2AnalyzeMoodWhenHappy() {
        m=new MoodAnalyzer("I am in happy mood");
        Assert.assertEquals(m.analyzeMood(), "Happy");
    }
    @Test
    public void test3AnalyzeMoodWhenNull() {
        m=new MoodAnalyzer();
        Assert.assertEquals(m.analyzeMood(), "Invalid Mood");
    }
    @Test
    public void test4AnalyzeMoodWhenEmpty() {
        m=new MoodAnalyzer(" ");
        Assert.assertEquals(m.analyzeMood(), "Invalid Mood");
    }
}
