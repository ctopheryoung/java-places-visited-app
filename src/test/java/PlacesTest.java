import org.junit.*;
import static org.junit.Assert.*;

public class PlacesTest {

  @Test
  public void Places_instantiatesCorrectly_true() {
    Places myPlace = new Places("Portland, OR", 2016);
    assertEquals(true, myPlace instanceof Places);
  }

  @Test
  public void place_instantiatesWithName_true() {
    Places myPlace = new Places("Portland, OR", 2016);
    assertEquals("Portland, OR", myPlace.getPlaceName());
  }

  @Test
  public void place_instantiatesWithYearVisited_true() {
    Places myPlace = new Places("Portland, OR", 2016);
    assertEquals(2016, myPlace.getYearVisited());
  }

}
