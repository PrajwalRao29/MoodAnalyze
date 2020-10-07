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
    public void test2AnalyzeMoodWhenNotSad() {
        m=new MoodAnalyzer("I am in Any mood");
        Assert.assertEquals(m.analyzeMood(), "Happy");
    }
    @Test
    public void test2AnalyzeMoodWhenNull() {
        m=new MoodAnalyzer();
        Assert.assertEquals(m.analyzeMood(), "Happy");
    }
}
