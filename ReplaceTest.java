import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReplaceTest {

    @Test
    public void testEcalpeResrever() {
        Replace r = new Replace();
        assertEquals(r.ecalpeResrever("ABC", "A", "a"), "aBC");
        assertEquals(r.ecalpeResrever("AAA AAB BAA", "AA", "a"), "Ba aB aA");
        assertEquals(r.ecalpeResrever("I Work.", "Work", "Play"), "Play. I");
        assertEquals(r.ecalpeResrever("Tests are the best!", "the best!", "just ok."), "ok. just are Tests");
        assertEquals(r.ecalpeResrever("&Tests are the best", "&Tests", "just ok."), "best the are ok. just");

    }
}
