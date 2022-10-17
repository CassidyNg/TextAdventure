import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 700, 700);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Arlo", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    // ADD CODE HERE
    ourHero.changeName(input);
    
    // describe the starting situation. Feel free to change this
    System.out.println("You wake up to find yourself on the edge of a shadowy forest with the sun nearly set. \nYou see what looks like a city in the distance. \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nnap: go back to sleep\n" + ourHero.getName() + ": ");
    input = inScanner.nextLine();
    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    if(input.equals("city")){
      enterZone1();
    }else if(input.equals("forest")){
      enterZone2();
    }else{
      enterZone11();
    }
  }

  private void enterZone1()
  {
    // change image
    // ADD CODE HERE
    console.setImage("city.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You trudge through the drizzling rain into the city of suspicious figures. \nPeople around you give you weird glances as you search for something to entertain yourself. \nWhile wandering you arrive at a row of shops with several goods on display but only two take your interest. \nWhere would you like to go?");
    System.out.println("antique: enter the antique store \nquest: enter the store of quests\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("antique")){
      enterZone4();
    }else{
      enterZone6();
    }
  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE
    console.setImage("forest.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You feel a chill down your spine as you step into the misty forest. \nSmall creatures scurry by and the trees seem to whisper in your ear... \nTwenty minutes have passed and now you have finally arrived at a crossroads. \nWhich direction will you take?");
    System.out.println("left: towards an small glow \nright: towards a faint whisper\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("left")){
      enterZone3();
    }else{
      enterZone8();
    }
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE
    console.setImage("fairygraveyard.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You turn left and head for the faded light you spotted. \nAs you get closer you begin to notice stones along the path... Graves? \nYou shudder and begin to approach the end of the path where a statue gives off a gentle glow.");
    System.out.println("You step up the stairs an face the statue. \nIt's beautifully made as you take in all its intricacy and notice two small engraved stones at its center. \nOne glows blue with moss crawling upon it and the other glows green with small flowers growing around it. \nIntrigued you decide to take one of the stones.");
    System.out.println("Which stone will you choose? \nblue: the blue stone covered in moss \ngreem: the green stone surrounded with flowers \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("blue")){
      enterZone9();
    }else{
      System.out.println("You reach for the green stone and pluck it off the the statue. \nYou suddenly feel a sort of pulse and in a flash of light you're transported to a cave. \nIt was a beautiful one, covered with moss, flowers, and clear reflecting water.");
      enterZone10();
    }
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE
    console.setImage("antiqueshop.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You open the door to the antique shop and look around to see if anything catches your eye. \nThe shop smells of dust and old parchment as you work your way further into the store. \n\"Looking for anything in particular?\" \nThe voice came from the old man at the counter who had put his newspaper down.");
    System.out.println("You shake your head and continue to look up and down the shelves before you spot a rather intriguing book. \nThe book is light in your hands with a charred but beautiful cover. \n\"Ah, that's a new piece I've recently gotten my hands on. Nice isn't it? You can take it for only eleven *caerics and two *australs.");
    System.out.println("*caerics - copper clover-shaped coins \n*australs - silver star-shaped coins (worth more than a caeric) \nTake it? \nyes: pay the eleven caerics and two australs \nno: leave instead\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("yes")){
      System.out.println("You pull out the coins and place them on the counter, wondering where they came from. \nYou thank the man, place the book into your bag and step back outside where night has fallen. \nYou trace over the books cover with your hands and search for somehwere to open it.");
      console.setImage("nightcity.jpg");
      System.out.println("You find an isolated area between two buildings and take the book out of the bag. \nOpen it? \nyes: open the book and discover what's inside. \n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();
      if(input.equals("yes")){
        System.out.println("There's a bright flash and everything goes black. \nYou find yourself in a cave, the sun bright in your eyes indicating daytime and the book gone from your hands. \nWhat a waste...");
        enterZone10();
      }
    }else{
      System.out.println("You tell the old man that you're okay and must be on your way. \nOutside the moon is bright in the sky and the air is wet from the rain. \nYou take a deep breath and wander back outside the city into the forest...");
      enterZone2();
    }
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE
    console.setImage("dragontemple.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE
    console.setImage("questshop.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You enter the store of quests to see several weapons and armor on display. \nWandering around the shop you are stopped when a women taps on your shoulder. \n\"May I help you?\" \nYou ask about possible quests you could take up and she tells you about the dragon slaying quest.");
    System.out.println("You hesitantly agree wondering what this dragon looks like. \n\"Oh my I almost forgot to ask, do you have any weapons to help you on your journey?\" \nYou shake your head and she goes to the back room, coming out a minute later with a variety of weapons. \n\"Choose the one you think is best suited for you.\"");
    System.out.println("Which weapon do you want? \nsword - the platinum sword that has an electric touch \nfans - the twin fans that manipulate fire and wind \nstaff - the staff that can rock the earth \nring - the ring that gives the user light manipulation\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("sword")){
      ourHero.changeWeapon("sword");
    }else if(input.equals("fans")){
      ourHero.changeWeapon("twin fans");
    }else if(input.equals("staff")){
      ourHero.changeWeapon("staff");
    }else{
      ourHero.changeWeapon("ring");
    }
    System.out.println("You choose the " + ourHero.getWeapon() + " to assist you on your quest and the women quickly sweeps the others away. \n\"You should get started right away\"\n The women drew a magic circle around you and transported you to a new location. \nc - press c to continue");
    input = inScanner.nextLine();
    if(input.equals("c")){
      enterZone5();
    }
  }

  private void enterZone7()
  {
    // change image
    // ADD CODE HERE
    console.setImage("abandonedcastleinterior.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone8()
  {
    // change image
    // ADD CODE HERE
    console.setImage("hauntedswamp.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You decide to follow your ears and turn right. \nAs you walk closer the whispers get louder and the mist starts to thicken. \nYour feet become damp as you enter the swamp and spot... a body? \nHanging from a tree? \nYou hear giggles from the ghosts surrounding it and hide partially behind a tree nearby. \nWhile trying to quietly leave you accidentally step on a branch, stirring the spirits attention.");
    System.out.println("You search for something to protect yourself with and find an enchanted bracelet in your bag. \nWhat would you like to do? \nprotect: protect yourself with the bracelet \nrun: attempt to run\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("protect")){
      System.out.println("You quickly put on the bracelet as the spirits begin to creep closer. \nThe bracelet glows as it casts a barrier surrounding you, not just you, but the entire swamp. \nThe three spirits waltz towards giggling and begin to closely surround you. \nYou begin to feel faint and shut your eyes as if something is being sucked out of you. \nYou force your eyes back open as you see a ghost that looks just like you...");
      console.setImage("ghost.jpg");
      System.out.println("You have been turned into a spirit as your soul had been sucked out of your body... \nYour have lived a life without success or fortune.\n" + ourHero.getName() + ", your journey now comes to an end.");
    }else{
      System.out.println("You are sprinting as fast as you can away from the chasing spirits when you stumble upon a tree root. \nWhile the ghosts push closer you decide to pull out a small dagger you found in your bag and swipe it at them. \nOnce hit the spirits begin to vanish, leaving behind six spirit blooms which turned into gold at the touch of the dagger. \nWow, what a dagger.");
      ourHero.defeatMonster();
      ourHero.defeatMonster();
      ourHero.defeatMonster();
      ourHero.setGold(6);
      System.out.println("Congratulations, you defeated " + ourHero.getMonstersDefeated() + " monsters and now have " + ourHero.getGold() + " gold coins. \nWhere would you like to go?");
      System.out.println("left - back to the other path \nwander - wander around the forest until you find something \n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();
      if(input.equals("left")){
        enterZone3();
      }else{
        System.out.println("You walk around the forest for hours and decide to rest beside a tree. \nAlthough it was supposed to be a temperary rest you end up falling asleep.");
        enterZone11();
      }
    }
  }

  private void enterZone9()
  {
    // change image
    // ADD CODE HERE
    console.setImage("ocean.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone10()
  {
    // change image
    // ADD CODE HERE
    console.setImage("cave.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You jump as you hear a hiss from behind. \nThe fear of what's there eats at you and you shiver at what you may see. \nWhat would you like to do? \nturn - turn aroud and see what's behind you \nrun - sprint to the cave opening and dive into the water \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("turn")){
      enterZone12();
    }else{
      System.out.println("You run for the cave's exit and dive into the ocean as there is nowhere else to jump. \nThe waves are harsh and you're knocked back against the cave rock, causing a blackout.");
      enterZone9(); 
    }
  }

  private void enterZone11()
  {
    // change image
    // ADD CODE HERE
    console.setImage("abandonedcastle.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You wake up with rubbing eyes and jerk upwards as you look around. \nA castle? How'd you get there? \nYou shrug it off and climb up the hill and stairs, peeking through inside. \nWhat would you like to do?");
    System.out.println("path - follow the path you spotted nearby \ncastle - explore the castle\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("path")){
      enterZone3();
    }else{
      enterZone7();
    }
    
  }

  private void enterZone12()
  {
    // change image
    // ADD CODE HERE
    console.setImage("cavemonster.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone13()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone14()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone15()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone16()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone17()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone18()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone19()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone20()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}