import com.jwetherell.algorithms.strings.StringFunctions;

/**
 * Created by Dravit on 3/20/2015.
 */
public class MyTest {
    public static void main(String[] args) {
        String string = "abc";
        System.out.println("All possible subsets.");
        long before = System.nanoTime();
        String [] output = StringFunctions.generateSubsets(string);
        for (String e : output) {
            System.out.println(e);
        }
    }
}
