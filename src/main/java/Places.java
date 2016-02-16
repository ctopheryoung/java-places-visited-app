public class Places {
  private String mPlaceName;
  private int mYearVisited;

  public Places (String placeName, int yearVisited) {
    mPlaceName = placeName;
    mYearVisited = yearVisited;
  }

  public String getPlaceName() {
    return mPlaceName;
  }

  public int getYearVisited() {
    return mYearVisited;
  }
}
