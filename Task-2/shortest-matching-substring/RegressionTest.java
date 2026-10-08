// Command to generate tests: java -ea -classpath "%RANDOOP_JAR%;." randoop.main.Main gentests --testclass=Solution --literals-file=literals.txt --randomseed=2 --time-limit=60 --output-limit=10
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ RegressionTest0.class })
public class RegressionTest {
}

