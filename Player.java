import java.util.*;

public class Player
{
  String name;
  int health;
  int gold;
  int monstersDefeated;
  String weapon;

  public Player(String playerName, int startingHealth, int startingGold)
  {
    name = playerName;
    health = startingHealth;
    gold = startingGold;
  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    name = newName;
  }

  public int getHealth()
  {
    return health;
  }

  public void setHealth(int newHealth)
  {
    health = newHealth;
  }

  public double getGold()
  {
    return gold;
  }

  public void setGold(int newAmount)
  {
    gold += newAmount;
  }

  public int getMonstersDefeated()
  {
    return monstersDefeated;
  }

  public void defeatMonster()
  {
    monstersDefeated++;
  }

  public String getWeapon(){
    return weapon;
  }

  public void changeWeapon(String newWeapon){
    weapon = newWeapon;
  }
}