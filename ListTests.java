import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        input1.add("a");
        input1.add("c");
        input2.add("b");
        input2.add("d");
        ListExamples.merge(input1, input2);


    }
}
