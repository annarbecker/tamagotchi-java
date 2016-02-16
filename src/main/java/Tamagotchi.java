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
    if (mSleep <= 5 || mPlay <= 5) {
      return mFood -= 2;
    } else {
      return mFood--;
    }
  }

  public boolean isAlive() {
    return mFood > 1;
  }

  public void setFoodLevel(int food) {
    mFood = food;
    if (mFood > 10) {
      mFood = MAX_FOOD;
    }
  }

  public void setSleepLevel(int sleep) {
    mSleep = sleep;
    if (mSleep > 10) {
      mSleep = MAX_SLEEP;
    }
  }

  public void setPlayLevel(int play) {
    mPlay = play;
    if (mPlay > 10) {
      mPlay = MAX_PLAY;
    }
  }

  public void randomEvent(){
    switch ((int) (Math.random()*6)){
      case 6: mSleep -= 2;
      case 5: mPlay -= 2;
      case 4: mFood -= 2;
      case 3: mPlay++;
      case 2: mFood++;
      case 1: mSleep++;
      default: break;
    }
  }

  public void addFood() {
    mFood++;
  }
}
