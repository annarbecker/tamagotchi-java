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
}
