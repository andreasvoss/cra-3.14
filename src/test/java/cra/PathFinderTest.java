package cra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.assertj.core.api.Assertions.*;

@RunWith(Parameterized.class)
public class PathFinderTest {


  private String name;

  public PathFinderTest(String name) {
    this.name = name;
  }

  @Parameters(name = "Test = {0}")
  public static Iterable<Object[]> data() {
    return Arrays.asList(new Object[][] {
             { "simple_2_2" },
             { "twocorners_3_3" },
             { "impossible_3_3" },
             { "oneBestPath_11_17" },
             { "multipleGoodPaths_10_5" },
             { "impossible_20_10" },
             { "manyGoodPaths_10_10" },
             { "multipleGoodPaths_40_20" },
             { "empty_20_15" },
             { "alldirections_6_7" },
     });
  }

  @Test
  public void assertThatActualSolutionIsContainedInValidSolutions() throws IOException {
    PathFinder finder = new PathFinder();
    String maze = loadResource(name + ".maze");
    String actualSolution = finder.findOptimalPath(maze);
    String validSolutions = loadResource(name + ".solutions");
    assertThat(validSolutions).describedAs("valid solutions should contain your solution").contains(actualSolution);

  }

  private String loadResource(String name) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(PathFinderTest.class.getResourceAsStream(name)))) {
      return br.lines().map(s -> s.trim()+ "\n").collect(Collectors.joining());
    }
  }

}
