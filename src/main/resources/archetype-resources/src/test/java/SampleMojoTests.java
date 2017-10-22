

import org.apache.maven.plugin.testing.MojoRule;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SampleMojoTests {

    @Rule
    public MojoRule rule = new MojoRule();

    @Test
    public void testHelloTask()
            throws Exception {
        File pom = new File(getClass().getResource("/test-pom.xml").toURI());
        assertNotNull(pom);
        assertTrue("Pom file does not exists", pom.exists());

        SampleMojo myMojo = (SampleMojo) rule.lookupMojo("hello", pom);
        assertNotNull(myMojo);
        myMojo.execute();
    }
}
