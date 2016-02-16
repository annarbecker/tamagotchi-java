import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly_true() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    assertEquals("Tom", myPet.getName());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getPlayLevel());
  }
  
  @Test
  public void timePasses_foodDecreasesByOne() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    myPet.timePasses();
    assertEquals(9, myPet.getFoodLevel());
  }

  @Test
  public void isAlive_foodLevelAbove0_true() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    assertEquals(true, myPet.isAlive());
  }

  @Test
  public void isAlive_foodLevelBelow1_false() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    myPet.setFoodLevel(0);
    assertEquals(false, myPet.isAlive());
  }

  @Test
  public void isFed_foodLevelDoesNotExceedMax_true() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    myPet.setFoodLevel(11);
    assertEquals(10, myPet.getFoodLevel());
  }

  @Test
  public void isPlayful_playLevelDoesNotExceedMax_true() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    myPet.setPlayLevel(11);
    assertEquals(10, myPet.getPlayLevel());
  }

  @Test
  public void timePasses_foodDecreasesByTwo_8() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    myPet.setSleepLevel(5);
    assertEquals(8, myPet.timePasses());
  }

  @Test
  public void randomEvent_addsSleep_true() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    myPet.setSleepLevel(6);
    myPet.randomEvent();
    assertEquals(7, myPet.getSleepLevel());
  }

  @Test
  public void addFood_foodIncreasesByOne_true() {
    Tamagotchi myPet = new Tamagotchi("Tom");
    myPet.setFoodLevel(4);
    myPet.addFood();
    assertEquals(5, myPet.getFoodLevel());
  }
}
