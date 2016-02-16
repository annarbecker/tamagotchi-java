public class Tamagotchi {
  private String mName;
  private int mFood;
  private int mSleep;
  private int mPlay;
  private static final int MAX_FOOD = 10;
  private static final int MAX_SLEEP = 10;
  private static final int MAX_PLAY = 10;

  public Tamagotchi(String name) {
    mName = name;
    mFood = MAX_FOOD;
    mSleep = MAX_SLEEP;
    mPlay = MAX_PLAY;
  }

  public String getName() {
    return mName;
  }

  public int getFoodLevel() {
    return mFood;
  }

  public int getSleepLevel() {
    return mSleep;
  }

  public int getPlayLevel() {
    return mPlay;
  }

  public int timePasses() {
    return mFood--;
  }

  public boolean isAlive() {
    return mFood > 1;
  }
}
