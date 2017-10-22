
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello")
public class SampleMojo extends AbstractMojo {

    @Parameter(defaultValue = "Unknown")
    private String name;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello, " + name);
    }
}
