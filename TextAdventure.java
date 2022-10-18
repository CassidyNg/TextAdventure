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
    System.out.println("You turn left and follow the path without distractions. \nAs you get closer you begin to notice stones along the path... Graves? \nYou shudder and begin to approach the end of the path where a statue gives off a gentle glow.");
    System.out.println("You step up the stairs an face the statue. \nIt's beautifully made as you take in all its intricacy and notice two small engraved stones at its center. \nOne glows blue with moss crawling upon it and the other glows green with small flowers growing around it. \nIntrigued you decide to take one of the stones.");
    System.out.println("Which stone will you choose? \nblue: the blue stone covered in moss \ngreem: the green stone surrounded with flowers \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("blue")){
      System.out.println("You reach for the blue stone and pluck it off the statue. \nYou're blinded by a flash of light and the smell of salt begins to fill your nose as the world turns black.");
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
    System.out.println("You appear before a dragon temple high in the mountains. \nMist surrounds it with the mountains seeming to protect it. \nYou approach the temple and as you get closer you notice how beautiful it is up close. \nYou hear a sudden screech behind you. \nturn - turn around and see what it was \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("turn")){
      console.setImage("dragon.jpg");
      System.out.println("A beautiful grey dragon flies down with a hard landing that crumbles part of the mountain. \nAlready? You pull out your " + ourHero.getWeapon() + " and steady your grip. \nHow do you attack? \nforward - dive straight and slash its chest \nhide - hide behind a nearby building \n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();
      if(input.equals("forward")){
        ourHero.setHealth(69);
        System.out.println("You dive forward and attempt to slash what you hope is a weak spot but miss as the dragon swipes you away. \nYour health is now " + ourHero.getHealth() + ", suffering damage from the hit (dragons deal greater damage). \nWhere do you aim next? \nwings - slice the wings \nhorns - cut one of the horns \ntail - damage the tail \n" + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if(input.equals("wings") || input.equals("tail")){
          ourHero.setHealth(43);
          System.out.println("You charge forward and aim for its " + input + ", but the dragon hits you with its tail and damages you greatly. \nYour current health is " + ourHero.getHealth() + ". \nWhile trying to stabilize your footing the dragon releases a shrieking echo which shatters your ears. \nNow with the loss of hearing your state is greatly weakened. \nYour slapped down by its horns as it pushes the points deeper into your skin. \nWas it wrong too accept this quest?");
          console.setImage("flyingdragon.jpg");
          ourHero.setHealth(0);
          System.out.println("The power of dragons are just too great...");
          gameEnd();
        }else{
          ourHero.setHealth(73);
          System.out.println("You push forward and aim for the horns. \nYou jump high up onto its back as it starts to thrash. \nYou struggle to maintain your balance as you aim for its horns. \nThe dragon notices and screeches as you attack. \nDamage is done to one and the dragon's flight seems to weaken. \nThe dragon flies until you lose your grip, not before you cut one horn off. \nIts horn bleeds black as it collapses against the mountain, destroying a house or two. \nYou march forward and hesitantly cut off its other horn with your " + ourHero.getWeapon() + ". \nc- continue \n" + ourHero.getName() + ": ");
          input = inScanner.nextLine();
          if(input.equals("c")){
            System.out.println("The dragon begins to fade, its glowing eyes staring directly into yours sadly. \nYour body feels a surge of power through you as the remainders of the dragon's energy is transferred to you. \nCongrtaulations, you have gained ultimate power! \nBut... what made you hesitate?");
            console.setImage("ultimatepower.webp");
            ourHero.defeatMonster();
            gameEnd();
          }
        }
      }else{
        System.out.println("You run an hide behind one of the buildings in fear of the dragon. \nIt begins to stomp and destroy the temple, leaving no remaining pieces. \nStil hiding you hope that the dragon doesn't discover you. \nBut the crumbling of the buildings and the mountain interrupt your thoughts as they fall above you... \nLooks like you'll never face the dragon.");
        console.setImage("flyingdragon.jpg");
        gameEnd();
      }
    }
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
    System.out.println("You choose the " + ourHero.getWeapon() + " to assist you on your quest and the women quickly sweeps the others away. \n\"You should get started right away\"\n The women drew a magic circle around you and transported you to a new location. \nc - continue \n" + ourHero.getName() + ": ");
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
    System.out.println("You enter the castle and are greeted by a cloud of dust. \nIt looks as if it hasn't been occupied in years, the furniture was wrecked and the glass shattered. \nYou explore the long hallways of the castle and find a large staircase. \nWhich direction will you take?");
    System.out.println("left - climb up the stairs turning left \nright - climb up the stairs turning right \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("left")){
      enterZone14();
    }else{
      enterZone13();
    }
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
      gameEnd();
    }else{
      System.out.println("You are sprinting as fast as you can away from the chasing spirits when you stumble upon a tree root. \nWhile the ghosts push closer you decide to pull out a small dagger you found in your bag and swipe it at them. \nOnce hit the spirits begin to vanish, leaving behind six spirit blooms which turned into gold at the touch of the dagger. \nWow, who knew there were gold coins too.");
      ourHero.defeatMonster();
      ourHero.defeatMonster();
      ourHero.defeatMonster();
      ourHero.setGold(6);
      System.out.println("Where would you like to go now?");
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
    System.out.println("You open your eyes to a stormy sky and the rocking of a ship. \nYou rub your eyes and take a glance at your surroundings. \nNo one else seems to be aboard as you explore the ship. \nYou go to the captain's cabin and discover a hollowed out step. \nUnderneath are two pouches of gold and a black steel whip. \nYou shove the gold and whip into your bag while making your way to the main deck. \nWhat do you want to do?");
    ourHero.setGold(30);
    ourHero.changeWeapon("whip");
    System.out.println("quarter - go to the quarter deck \nsail - check on the ship's sails \nbowsprit - climb on the bowsprit \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("quarter")){
      System.out.println("You head to the quarter deck and skip around before the ship jerks you against the steering wheel. \nYou straighten yourself and look at the wheel curiously. \nYou try to turn the wheel but do not have the strength to do so. \nYou make a face and grab the whip you found earlier and pull on the steering wheel until it budges. \nYou jump back as the wheel begins to spin on its own. \nYou hear a noise overboard and peek over as you see a whirlpool forming and a... tail?");
      System.out.println("Emerging out of the pool is a large body of scales. \nc - continue \n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();
      if(input.equals("c")){
        enterZone15();
      }
    }else{
      System.out.println("You climb up and steady yourself as you try to find your balance. \nThe air is misty from the ocean and the storm seems to be getting worse. \nSuddenly the ship tilts and you lose your balance, holding on by one hand. \nWhat do you do?");
      System.out.println("whip - attempt to grab the whip with your other hand \nnothing - let yourself fall \n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();
      if(input.equals("whip")){
        System.out.println("You struggle to grab your whip out of your bag and finally feel its grip as you pull it out. \nAttempting to lasso onto something the ship rocks once again and you fall into the sea. \n c - continue \n" + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if(input.equals("c")){
          console.setImage("drowning.jpg");
          System.out.println("You plunge into the water, the stormy waves tossing you into and out of the water. \nThe weight you cannot get off you sinks you...");
          System.out.println("You have drowned in the sea of monsters. \nYou ended your journey with " + ourHero.getGold());
          gameEnd();
        }
      }else{
        console.setImage("drowning.jpg");
        System.out.println("With your death in sight you let yourself fall into the stormy sea. \nThe salt water fills your lungs and your eyelids become heavy... \nYou have ended your journey with " + ourHero.getGold());
        gameEnd();
      }
    }
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
    System.out.println("You turn around and witness a horror. \nYou can't tell what it is but it makes you stop cold, your eyes widening. \nIt hisses with its teeth flaring. \nHow do you approach it?");
    System.out.println("bag - search for something in your bag to fend it off with \nscare - attempt to scare it away \nfrozen - stay frozen with fear\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("bag") || input.equals("frozen")){
      ourHero.setHealth(89);
      System.out.println("Within a second you're knocked back into the water, soaking wet, and your bag has been flung to the side. \nYour health is now at " + ourHero.getHealth() + ".\nYou spot a small black dagger peeking out of your bag. \nYou run out of the water and grab it as the monster is about to charge. \nYou notice different switches on the dagger. Which setting do you use?");
      System.out.println("steel - turn on the steel setting \ndark - turn on the darkness setting \nice - turn on the ice setting \n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();
      if(input.equals("steel")){
        ourHero.setHealth(80);
        System.out.println("You switch the dagger setting and it turns to steel. \nThe monster is upon you and you're able to cut one of its arms off. \nIt winces and flicks you with its tail up against the rock. \nYour health is now at " + ourHero.getHealth() + ". \nWhere would you like to attack?");
        System.out.println("head - stab its head \nback - aim for the back scales \ntail - cut its tail off"  + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if(input.equals("head") || input.equals("tail")){
          ourHero.setHealth(75);
          System.out.println("You sprint forward and aim for its " + input + ", but you're set hurdling backwards and into the water once again. \nIt hisses and whips its tail. \nYou notice how it always seems to protect its back scales. \nAttack its back? \nyes \nno \n" + ourHero.getName() + ": ");
          input = inScanner.nextLine();
          if(input.equals("yes")){
            System.out.println("You lunge and jump on its back as it shrieks and tries to jerk you off. \nYou slice its back scales all the way down and it goes limp. \nIt melts into a puddle of goop, leaving behind ten gold coins.");
            ourHero.defeatMonster();;
            ourHero.setGold(10);
            System.out.println("Feeling relieved that you've finally gotten rid of the monster you slump against the cave walls and rest.");
            enterZone9();
          }else{
            System.out.println("The monster flings you across the cave against one of the cave's pillars. \nThe cave begins to crumble as the monster scurrys away and you're left motionless...");
            ourHero.setHealth(0);
            console.setImage("grimreaper.jpg");
            gameEnd();
          }
        }else{
          System.out.println("You lunge and jump on its back as it shrieks and tries to jerk you off. \nYou slice its back scales all the way down and it goes limp. \nIt melts into a puddle of goop, leaving behind ten gold coins.");
          ourHero.defeatMonster();
          ourHero.setGold(10);
          System.out.println("Feeling relieved that you've finally gotten rid of the monster you slump against the cave walls and rest.");
          enterZone9();
        }
      }else if(input.equals("dark")){
        System.out.println("You turn on the darkness setting and the black dagger becomes surrounded by shadows. \nYou slash the shadows at the monster but it has not effect. \nYou begin to panic and try again, slashing the shadow dagger into its scales without damage. \nThe monster fed up with this attempt swings you by the feet and tosses you up against the cave's ceiling.");
        System.out.println("You feel the prick of several stalactites piercing your back. \nAfter a few seconds you fall back to the ground bleeding all over. \nThe monster hits you with its tail and your vision slowly turns black...");
        console.setImage("grimreaper.jpg");
        gameEnd();
      }else{
        System.out.println("You turn on the ice setting and the dagger turns cold in your hands. \nYou grip it tightly and slash the monster's scales with the dagger, forming ice crystals all around. \nThe ice crystals shatter in an instant tho as the monster shrieks. \nStunned you try close combat and aim to freeze its body. \nAs you swipe with the knife the monsters tail is lurking and shoves your slashing arms towards yourself.");
        System.out.println("You feel the frost beginning to form as the dagger makes contact with your hip and continues to spread. \nIn a panic you fling the dagger at the monster which stabs the middle between its eyes. \nYour body becomes colder as ice begins to grow and the monsters head begins to freeze. Weak point you guess. \nSlowly your body begins to freeze and you begin to drift into an icy sleep...");
        ourHero.defeatMonster();
        console.setImage("frozen.webp");
        gameEnd();
      }
    }else{
      System.out.println("You attempt to scare the monster with a hiss, standing tall to appear bigge than you seem. \nUnphased the monster grabs you and throws you into the water. \nIt pushes you deeper and deeper into the water as you thrash against its grip. \nYou begin to gasp for air and choke on the water filling your lungs. \nScaring it...what a stupid idea...");
      console.setImage("drowning.jpg");
      gameEnd();
    }
    
  }

  private void enterZone13()
  {
    // change image
    // ADD CODE HERE
    console.setImage("temple.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You follow the spiral staircase to the right, entering a long hallway. \nVines grow along the sides and the floor is covered in crumbled rock. \nAt the end of the hallway you enter a room that is now in ruins but once was very beautiful. \nImmeditaely the crystal globe in the center in the room catches your eye. \nYou start to approach it and gaze at it with curiosity. \nWhat do you do with it?");
    System.out.println("break - accidentally knock it over \nsteal - take it for yourself \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("break")){
      System.out.println("You accidentally break the crystal as you go over to get a closer look. \nYou fear what may happen to you as you don't know the consequences of breaking something in a temple.");
      int input1 = (int)(Math.random() * 6) + 1;
      if(input1 != 1 || input1 !=3){
        System.out.println("You hear a rumble and the broken crystal begins to glow ever so brightly. \nThere's a flash of white light and you hear a crack as you're taken by the light.");
        console.setImage("hauntedswamp.jpg");
        System.out.println("You fall into a swamp and become covered with moss and lilly pads. \nThe noise stirs the spirits nearby and they gaze at you wickedly. \nWhat do you do? \nrun - attempt to scurry away \nfight - attack them with a nearby stick \n" + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if(input.equals("run")){
          System.out.println("You try to run through the swamp as the spirits laugh and chase you. \nThey taunt and whisper to you as they catch up. \nYou sprint so hard that you end up toppling over from the misbalance. \nThe ghosts play with you and finally kill you...");
          console.setImage("grimreaper.jpg");
          gameEnd();
        }else{
          System.out.println("You quickly snatch the largest stick you could find up and begin to swipe at the ghosts. \nThe stick passes right through... dumb idea huh? \nThe spirits laugh in your ears before your soul is taken for themselves...");
          console.setImage("grimreaper.jpg");
          gameEnd();
        }
      }else{
        System.out.println("The broken crystal pieces begin to glow and circle around you. \nThey glow so intensely that it blinds you and prevents you from seeing the chaos of the pieces. c-continue");
        input = inScanner.nextLine();
        if(input.equals("c")){
          console.setImage("magiccircle.jpg");
          System.out.println("They form a star around you and the room begins to darken around it. \nYou feel an overflowing sense of power surrounding you as the light grows brighter. \nIts strength begins to seep into your skin and your body feels an overwhelming presence. \nc - continue \n" + ourHero.getName() + ": ");
          input = inScanner.nextLine();
          if(input.equals("c")){
            console.setImage("ultimatepower.webp");
            System.out.println("You have obtained ultimate power... how fortunate...");
          }
        }
      }
    }else{ 
      System.out.println("You swiftly snatch the crystal and tuck in into your bag. \nYou wait for a moment to see if anything happens. Silence. \nYou let out a sigh and make your way back to the center of the castle. \nAs you walk back you suddenly feel a rumbling beneath your feet and the floor crumbles beneath you. \nc - continue \n" + ourHero.getName() +": ");
      input = inScanner.nextLine();
      if(input.equals("c")){
         console.setImage("deathgamble.jpg");
         System.out.println("You rub your head and look around you in a panic. \nBefore you stands a mysterious person in a dark cloak who radiates a skin crawling energy. \n\"You have committed a grave sin, stealing a sacred object? How shameful...\" \nYou stand up quietly staring at the person. \n\"You're lucky... today is not a day for death. But if you cannot guess the symbolic number of our temple. You die.\" \nSymbolic number? You're confused by the question and are not sure what to think. \nThe figure asks you if you accept their offer for survival. \nAccept it? \nyes - accept \nno - dont' accept and die \n" + ourHero.getName() + ": ");
         input = inScanner.nextLine();
         if(input.equals("yes")){
          int symbolicNumber = (int)(Math.random() * 26);
          System.out.println("You accept their kind offer and think back to the temple \nWas there ever a hint of a number there? \nYou ask for a range with the response of 0 to 25. \nYou think hard but can't recall anything. \nWhat's your guess?\n" + ourHero.getName() + ": ");
          int input1 = inScanner.nextInt();
          if(input1 != 4){
            System.out.println("\"Well?\" \nYou answer hesitantly, \"" + input1 + "?\" \nAlthough their face is covered you see a grin form. \n\"Wrong.\" \nIn an instant you heartbeat slows and your eyes become heavy... game over.");
            console.setImage("grimreaper.jpg");
            gameEnd();
          }else{
            System.out.println("The cloacked figure sighs sadly. \n\"Congratulations... you will not be our sacrifice\" the figure says in a flat voice. \nYou release a long sigh and large doors open to a glowing room. \nYou look at the figure confused. \"Custom.\" \nYou walk through the doors and find... \nc - continue \n" + ourHero.getName() + ": ");
            input = inScanner.nextLine();
            if(input.equals("c")){
              console.setImage("goldentreasure.jpg");
              System.out.println("Gold? \nYou have passed the temple's protectors and are rewarded with a golden trasure... you win!");
              gameEnd();
            }
          }
         }else{
          System.out.println("\"Well then... goodbye.\" \nYou hear a scream and the room turns black...");
          console.setImage("grimreaper.jpg");
         }
      }
    }
  }

  private void enterZone14()
  {
    // change image
    // ADD CODE HERE
    console.setImage("shadowmonster.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You turn left to fall into a crumbling hole. \nIn the hole lies a monster built from steel and shadows. \nThe room is filled with smoke, dust, and the darkness leaking from the monster's body. \nWhat do you do? \nattack - fight the monster since there's no escape \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("fight")){
      System.out.println("You attempt to attack the monster but it throws you against the crumbling wall. \nYou slash and strike it as much as you can but the shadows begin to surround you. \nSlowly, the darkness consumes you as you fight blindly. \nThe monster charges at you over and over again as you stay helpless. \nYou never stood a chance.");
      console.setImage("grimreaper.jpg");
    }
  }

  private void enterZone15()
  {
    // change image
    // ADD CODE HERE
    console.setImage("seadragon.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("A sea dragon finally emerges out of the pool. \nThe rain becomes heavier and the waves wilder. \nYou jump off the ship as the dragon crushes it in an instance. \nWhat do you do next? \nattack - fight the monster with your whip \n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("attack")){
      ourHero.setHealth(70);
      System.out.println("You swim furiously over to the dragon and climb up its slimey scales with the whip in hand. \nYou desperately run and slash at its scales while maintaining your balance. \nThe dragon merely flicks you off and back into the water. \n Your health is now " + ourHero.getHealth() + "\nHow do you approach it?");
      System.out.println("water - stay in the water \nfight - attack the dragon \n" + ourHero.getName() + ": ");
      input = inScanner.nextLine();
      if(input.equals("water")){
        System.out.println("You try to stay afloat in the water when you spot something floating nearby. \nYou swim towards it and find a ring. \nThe dragon roars at you and you quickly put it on in hope of a miracle. \nYou feel a surge of power through your body and wiggle your fingers and toes with the sensation. \nYou charge forth towards the dragon, the ocean at your command and slash at it.");
        System.out.println("It growls as damage is done to its scales and attempts to smack you down. \nThe overflowing power in your veins twists its movememts and knocks it over with a wave of the water. \nThe struggle continues but you're finally able to hit it in its weak spot... its mouth. \nThe dragon fades, the sea calms down, and the storm moves away. \nAs the dragon fades its power remains and sinks into the sea. \nYou dive into the sea and attempt to collect it. \nc - continue \n" + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if(input.equals("c")){
          console.setImage("seatemple.jpg");
          System.out.println("You chase the flying power through the water and find an underwater temple. \nYou swim into it, following the light. \nc - continue \n" + ourHero.getName() + ": ");
          input = inScanner.nextLine();
          if(input.equals("c")){
            console.setImage("oceantreasure.jpg");
            System.out.println("You lose sight of it and swim through and around the temple in search of it and spot a chest. \nFour keys appear in front of you. One silver. One gold. One bronze. One copper. \nWhich key will you choose. \n1 - silver \n2 - gold \n3 - bronze \n4 - copper" + ourHero.getName() + ": ");
            int input1 = inScanner.nextInt();
            if(input1 != 1){
              System.out.println("You have chosen the wrong key... \nYou do not obtain ultimate power... \nGood game");
              console.setImage("seatemple.jpg");
              gameEnd();
            }else{
              console.setImage("ultimatepower.webp");
              ourHero.setGold(100);
              ourHero.defeatMonster();
              System.out.println("You open the treasure to find the dragon's remaining power along with several gold coins. \nThe dragon's power has given you ultimate power... \nYou've lived successfully, collecting " + ourHero.getGold() + " gold coins and defeating the ancient sea dragon...");
              gameEnd();
            }
          }
        }
      }else{
        System.out.println("You whip and stab at the dragon but there's no use. \nNone of your attacks can get past its scales. \nThe dragon eventually sinks you with its fangs... you drown in the sea of monsters...");
        console.setImage("drowning.jpg");
        gameEnd();
      }
    }
  }

  private void gameEnd()
  {
    System.out.println("You have ended the game with " + ourHero.getGold() + " coins and " + ourHero.getMonstersDefeated() +  " monsters defeated. \nHope you liked your adventure!");

    inScanner.close();
  }
}