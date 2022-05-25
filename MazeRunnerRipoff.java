import java.util.Scanner;

/**
 * Write a description of class MazeRunnerRipoff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeRunnerRipoff
{
    static String name; //Added these 2 static varibles for more flexibilty on using the.// 
    static String text; //The same code.//
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--PortalMazeRunnerRipoff--");
        System.out.println("Type in your name");
        name = scanner.nextLine();
        System.out.println("Welcome "  +name+ " To the Aperture Science Inovations centre");
        System.out.println("and reaserch complex of obscure anomlies");
        System.out.println("-Type in \"go\" to preceed with the next pragraph");
        System.out.println("-Type in  \"skip\" if the paragraph ends with ':' if you want to ignore any dialoge-");
        text = scanner.nextLine();
        if (text.equals ("go")) //If the player types in go the string will be directed to this 
        //section of code. If the player types in skip however, it will ignore this portion.
        {
            System.out.println("Hello " +name+ ". The names's Jasper.");
            System.out.println("I'm a special prototype of the newly devolped");
            System.out.println("personality construct sphere android.");
            System.out.println("But for you normies, you may refer to me as a core. As some people find this whole");
            System.out.println("naming system extremly stupid and tedious.");
            text = scanner.nextLine();
            System.out.println("Just like me. LOL 'comic rimshot'");
            text = scanner.nextLine();
            System.out.println("For my understanding,this place is definitly about to'cave'in due to how old it is");
            System.out.println("Im even suprised you got here without being detected by..'her'");
            text = scanner.nextLine();
            System.out.println("Anyways "+name+" we should probably stop wastin'our time and");
            System.out.println("get the hell out of here!");
            text = scanner.nextLine();
            System.out.println("Oh right. I kinda forgot to tell you that your mouth has been glued shot with");
            System.out.println("'Monkie glue' so talking to me is quite useless");
            text = scanner.nextLine();
            System.out.println("Now that I think about. It kinda makes things alot difficult for us to escape");
            System.out.println("So much for scientifc reaserch, Am I right? 'comic rimshot'");
            text = scanner.nextLine();
            System.out.println("Alright, jokes aside we should probably head out.");
            text = scanner.nextLine();
        }
        //This is when if the player typed in skip, they will be sent this text instead of the prevous
        //diolage.
        System.out.println("-You exited the reaserch office and entered a corrider_");
        System.out.println("-There you reached a door located in the middle, with a electronic lock on it-");
        System.out.println("-While looking at the keypad you noticed a sticky note right beside the door hinge-");
        System.out.println("-You took the time to read through the sticky note-");
        System.out.println("-It said 'What's small and painful to see. Safe to touch but hard to drink. Not a lie and edible to eat'-");
        System.out.println("-As Jasper was about to make a witty remark, you taken account the riddle and started thinking_");
        System.out.println("-You also noticed 2 other entrences, another door without lock to right and a ventlation shaft to the left-;");
        text= scanner.nextLine();
        System.out.println("-If you see this symbol at the end of the sentance';'It means that you are about to reach a branching path-");
        firstjunction(); //Methods is placed at the end of the code as a way to send the player
        //into a diffrent 'location'. Which is the methods by the way//
    }
    public static void firstjunction()
    {
        Scanner scanner = new Scanner(System.in); //For each new method, Scanner scanner code must be 
        //repeated.
        text = scanner.nextLine();
        while (text.equals ("go")) //A first example of challange question.//
        {
          // Here there are 3 choices you could do.//
          System.out.println("-You could either type (1) to go to the lock,"); //Using the int values as "mutiple choice" questions.
          System.out.println("-(2) go to the right vent,-");
          System.out.println("-(3) to the left door,-");
          System.out.println("-The sticky note said 'What's small and painful to see. Safe to touch but hard to drink. Not a lie and edible to eat'-");
          int t;
          t= scanner.nextInt();
          if (t==1)
          {
             System.out.println("-You took the chance type in the passcode-:");
             text = scanner.next();
             if (text.equals("go")) //once again another example of the optional text skipping
             //added scanner.next() before the if statement or this skip feature won't work.
             //as it will skip this text completely even if you typed in go.
             {
                 System.out.println("Hey if you don't know how to solve riddles");
                 System.out.println("Then im so sorry of your school life");
                 System.out.println("I hope you liked getting bullied.");
                 text = scanner.nextLine();
             }
             System.out.println("-Type in the pass code-");
             String code;
             code = "lemon"; //The player must type the exact code in this string or they will gety the answer wrong//
             text = scanner.nextLine();
             if (text.equals (code))
             {
                 System.out.println("-You typed down the passcode-");
                 System.out.println("-A 'ding'sound was emitid. The code was right-");
                 System.out.println("-The door opens and you stepped inside the room-");
                 text = scanner.nextLine();
                 System.out.println("Well I guess my confidance finally paid off.");
                 System.out.println("Let's go;");
                 precorrider(); //Sending to a diffrent location/method
             }
             else //If you type in the answer wrong you will be sent to the while loop.
             {
                 System.out.println("-You typed down the passcode-");
                 System.out.println("-Suddenly something popped out of the electronic lock-");
                 text = scanner.nextLine();
                 System.out.println("Hey Uhh," +name+ " I would probably step back if I were you..");
                 text = scanner.nextLine();
                 System.out.println("-But it was too late, the object that came out was a small can of pepper spray-");
                 System.out.println("-You immediately stepped back as your eyes was violently sprayed from the canister-");
                 System.out.println("-As you fell down, you could feel your eyes being melted away as you screamed in agony-");
                 System.out.println("-Soon the burning sensestauon resides as you went back onto your feet-");
                 System.out.println("-Wrong answer, mate-");
                 text = scanner.next();   
             }   //Added scanner.next() in order for the if statement to return to the while loop. If the plyer gets the wrong answer.
          }
          if (t==2) //Diffrent options will lead into diffrent sub options
          //Which inturn will lead into a diffrent path/method.
          {
              System.out.println("-You head to the right as you couldn't stand looking at the riddle-");
              System.out.println("-You thought to yourself 'who needs to use your brain when you could go to the vent");
              System.out.println("-'Like a badass'-");
              text = scanner.nextLine();
              System.out.println("-As you made it to the vent you noticed that it's smaller then you imagined-");
              text = scanner.nextLine();
              System.out.println("-(1) squeeze through,-");
              System.out.println("-(2) find another option-");
              int h;
              h= scanner.nextInt();
              if (h==1)
              {
                  System.out.println("-Looks like you made a risky move, Oh well you only live once-");
                  text = scanner.nextLine();
                  System.out.println("-Miraculously you managed to made it through, with a little help of Japser of course-");
                  System.out.println("-Ironically enough the shaft itself is alot bigger than the cover-");
                  text = scanner.nextLine();
                  System.out.println("Well I guess using my strength finally paid off for once.");
                  System.out.println("Let's go.");
                  text = scanner.nextLine();
                  System.out.println("Oh I almost forgot, right at the end of the ventshaft, there is a TURRET testing room,");
                  System.out.println("So please be careful when getting out, or else  we will become a targets");
                  System.out.println("Umm Good news. Right beside the testing room is the exit to the surface,");
                  System.out.println("So that's something.");
                  preventshaft();
                  
              }
              else //In some instances you could back to the while loop and choose a diffrent path.
              {
                  System.out.println("-You thought to yourself 'this is alrady a bad idea to begin with");
                  System.out.println(" and I could get stuck in here due to how tight it is.'-");
                  text = scanner.nextLine();
                  System.out.println("-As you walk back to the locked door you could hear Jasper calling you a coward behind you-");
                  text = scanner.next();
              }
          }
          if (t==3)
          {
              System.out.println("-You made the the choice on trying to the other direction:-");
              text = scanner.next();
              if (text.equals ("go"))
              {
                  System.out.println("-As you down you thought to yourself 'man im glad that I don't need to do riddles");
                  text = scanner.nextLine();
                  System.out.println("-You reached the door and noticed through the window");
                  System.out.println("-the room behind it is covered in complete darkness-");
                  System.out.println("-Maybe its not bad to try out the riddle.-");
                  text = scanner.nextLine();
              }
              System.out.println("(1) go back");
              System.out.println("(2) go forward" );
              int v;
              v = scanner.nextInt();
              if (v == 2)
              {
                  System.out.println("-After talking some time to think about the situation you mustered the strength to open the door-");
                  System.out.println("-You opened the door and entered the dusty room-");
                  text = scanner.nextLine();
                  System.out.println("I would have provided with you some light but my flashlight is broken,");
                  System.out.println("So uhh...yeah sorry,");
                  computerroom();
              }
              if (v == 1)
              {
                  System.out.println("-You thought to yourself that trying the riddle wouldn't");
                  System.out.println("so bad after all. Besides nothing bad ever comes when solving a riddle-");
                  text = scanner.next();
                  System.out.println("-As you made it back to the entrence. Jasper was making chicken sounds-");
                  text = scanner.next();
              }
          }
        }
    }

    public static void precorrider() //Sometimes I like to add a descripttive elements depending on the
    // route that you take. This is an example if you got the right ansewer for the locked door.
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("Here we are " +name+ " The old office space responisble for most of our former reasrch");
        System.out.println("-Inside the room you noticed that it reminds you of an old office complex-");
        System.out.println("-As you walk within the small and decrepted hallway you found something infront of you-");
        corriderA();

    }
    public static void corriderA() //Added letters at the end of the name of the methods in order to repesent the 
    //same locations only acting slightly diffeently depending on the route you take//
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-Within the middle of the hallway you saw a painting of an old man");
        System.out.println("-and an old woman.");
        text = scanner.nextLine();
        System.out.println("-You glanced between the left and the right and saw 2 diffrent branching paths-");
        System.out.println("-On the left is a dark hallway and on the right is a dimily lit hallway with a corner;-");
        text = scanner.nextLine();
        while (text.equals ("go")) //I sometimes like to add scanner.next() in some of the code just for anticapation.
        {
           System.out.println("-(1) go to the left,");
           System.out.println("-(2) go to the right-"); 
           System.out.println("-(3) go back to the entrence-");
           int d;
           d =scanner.nextInt();
           if (d==3) //Sometimes going back to prevoius junction is inpossible. Jasper remarks this//
           {
               System.out.println("Why the hell do you want to go back");
               System.out.println("You do want to escape right?  And not get pepper sprayed");
               text = scanner.nextLine();
               System.out.println("Spolier lol");
               text = scanner.nextLine();
           }
           if (d==2)
           {
               System.out.println("Alright lets go:");
               text = scanner.next();
               if (text.equals("go"))
               {
                   System.out.println("-You took the liberty on choosing a much safer route-");
                   System.out.println("-After all it's alot less dangerous than the other side-");
                   text = scanner.nextLine();
                   System.out.println("Wait wait stop look look!");
                   System.out.println("-You looked around to see a what seems to be another core like Jasper-");
                   System.out.println("-Except newer looking, and painted in a coat of black and blue and looks like a police officer-");
                   text = scanner.nextLine();
               }
               System.out.println("What the hell is HE doing here?");
               System.out.println("Be careful I know this core. He has a taser and belive me you do not want to get tased by this guy");
               text = scanner.nextLine();
               System.out.println("(1) go back");
               System.out.println("(2) go forward" );
               int f;
               f =scanner.nextInt();
               if (f==1)
               {
                   System.out.println("Yeah your right, lets go and find another option");
                   text = scanner.next();
               }
               if (f==2)
               {
                   System.out.println("Alright if you say so");
                   officerA();
               }
           }
           if (d==1)
           {
               System.out.println("Lets roll out:");
               text = scanner.next();
               if (text.equals("go"))
               {
                   System.out.println("-You took the liberty on choosing the most dangerous route-");
                   text = scanner.nextLine();
                   System.out.println("Wait! stop stop look!"); 
                   System.out.println("-In the hallway you noticed that there was a bunch of motion sensers on the wall_");
                   text = scanner.nextLine();
                   System.out.println("Whatever you do. Do not trip those sensers");
                   System.out.println("It will actvate an alarm and emit a bunch of nourotoxins in the hallway");
                   System.out.println("Hey it seems that there is a button on the wall, it might help you disable them");
                   text = scanner.nextLine(); 
               }
               System.out.println("(1) red");
               System.out.println("(2) blue" );
               System.out.println("(3) green");
               System.out.println("(4) purple" );
               System.out.println("(5) go foward like a jackass");
               int l;
               l = scanner.nextInt();
               if (l==2)
               {
                   System.out.println("-You pressed the one of the following buttons-");
                   text = scanner.nextLine();
                   System.out.println("-The lights on the sensers turned off-");
                   System.out.println("-Right choice-");
                   hypocritecore();
                   
               }
               else if (l==5)
               {
                   System.out.println("-You thought to yourself that if I ran fowrad fast enough the toxin won't reach to me-");
                   text= scanner.nextLine();
                   System.out.println("-As you ran pass the sensers like a complete 'jackass' the lights on them turned red-");
                   System.out.println("-You contuined runner until a metallic door felldown infornt of you-");
                   System.out.println("-Despite all your efforts on opening the door you quickly ran back before the toxin was relased-");
                   text = scanner.next();
                   System.out.println("-Idiot-");
                   text = scanner.next();
               }
               else
               {
                   System.out.println("-You pressed the one of the following buttons-");
                   text = scanner.nextLine();
                   System.out.println("-The lights on the sensers turned red and the ventsshafts opened-");
                   System.out.println("-Knowing common sense you ran back before the toxin was relased-");
                   System.out.println("-Wrong answer-");
                   text = scanner.next();
               }
           }
        }
        
    }
    public static void preventshaft() //The text if the player chooses to go to the vent in the right.
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-Within the confinds of the ventshaft you made it aorund a tight corner");
        System.out.println("as your crawl away in the tunnel to your freedom.-");
        System.out.println("-Crawling through the vents you taken acocount how dusty and misty it is-");
        System.out.println("-Like someone hasn't dusted it for years-");
        System.out.println("-There were even visble dust particles floating in the air-");
        text = scanner.nextLine();
        System.out.println("-You noticed that there was a gate blocking your path and another vent opening on to your left;-");
        ventshaft();
    }
    public static void ventshaft() 
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        while (text.equals ("go"))
        {
           System.out.println("-(1) go to the left-");
           System.out.println("-(2) go foward-"); 
           System.out.println("-(3) go back to the entrence-");
           int d;
           d =scanner.nextInt();
           if (d==3)
           {
               System.out.println("-You thought that you could go back and try out the riddle-");
               System.out.println("-However you realised that going out backwards is");
               System.out.println("-alot harder than going out in front.-");
               text = scanner.nextLine();
               System.out.println("Not to mention that the vent will be straight to th exit..");
               text = scanner.nextLine();
           }
           if (d==1)
           {
               System.out.println("-You decided that it is a good idea that you have enough time-");
               System.out.println("crawling in the vents. Talk about being claustrophobic-");
               text = scanner.nextLine();
               System.out.println("-Carefully, you managed to squeeze out of the small vent cover like before");
               System.out.println("-and made it into the office complex-:");
               officerB(); //Method describing the same location but going into a diffrent route.
           }
           if (d==2)
           {
               System.out.println("-You decided that it is a good idea to bypass the gate:-");
               text= scanner.next();
               if (text.equals ("go"))
               {
                   System.out.println("For some odd reason there is a small electronic keypad right");
                   System.out.println("beside the gate. To be honest I don't what's the deal with ");
                   System.out.println("Aperture science and their obsession with keypads, but they do sure,");
                   System.out.println("love to put it in the most weirdest places");
               }
               keypadchallange();
           }
        }
    }
    public static void keypadchallange() //Loop challange//
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-You entered a gate and saw a small keypad right beside you:-");
        text = scanner.next();
        System.out.println("-Beside the keypad there is a screen showing a pattern-");
        text = scanner.nextLine();
        System.out.println("-The screen showed a message it said 'type in the reverse order'");
        text = scanner.nextLine();
        while (text.equals ("go"))
        {
            System.out.println("-'The number shown is (659438412)");
            System.out.println("-'type in the reverse order with only even numbers AND one of the odd numbers'"); //Maybe add a time limit//
            int n = 659437412;  //Originally I intend for the player to type in the code in reverse, but since this is a challange question
            //I made it more harder by forcing the player to type only even numbers and ONE of the following odd numbers
            int digit;
            int reverse = 2484601; //The player has to think outside of the box for this one ;)
            digit = scanner.nextInt();
            if (reverse==digit)
            {
                System.out.println("-You typed down the number code on the keypad:-");
                text=scanner.next();
                if (text.equals ("go"))
                {
                    System.out.println("-The vent grate slightly -");
                    System.out.println("-You stared in confusion on why it hasn't opened completly-");
                    System.out.println("-Aperently you noticed that there are 3 buttons to open the gate_");
                    text=scanner.nextLine();
                    System.out.println("Why does it always have to be so complcated");
                    
                } // added more questions to make things alot more harder
                System.out.println("-There are 3 buttons and one of them is the corect one-");
                System.out.println("-(1)-");
                System.out.println("-(2)-");
                System.out.println("-(3)-");
                int d;
                d=scanner.nextInt();
                if (d==3)
                {
                    System.out.println("-You pressed one of the following buttons-");
                    text=scanner.next();
                    System.out.println("-It was correct as the gate opened fully-");
                    turretroom();
                }
                else 
                {
                    System.out.println("-You pressed one of the following buttons-");
                    text=scanner.next();
                    System.out.println("-Inivetably it was wrong. Looks like you have to do it all over again-");
                    text=scanner.next();
                }
            
            }
            else
            {
                System.out.println("-You typed down the number code on the keypad:-");
                text=scanner.next();
                System.out.println("-The vent grate still remained closed-");
                System.out.println("-Maybe try again later-");
                text=scanner.next();
            } //This could be by far the most annoying question ever.
        }
    }
    public static void turretroom() //Method of The second last challange//
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-As you made your way through the vent shaft you finally seen the exit-");
        System.out.println("-You squeezed through small vent cover and carefully made it onto the floor-");
        text = scanner.nextLine();
        System.out.println("-In the room there were 5 turrets that are curently in sleep mode-");
        System.out.println("-Taken the precuation that Japser said, you make sure not to make a sound-");
        System.out.println("-And started look for a way to distract the turrets-");
        text=scanner.nextLine();
        while (text.equals("go")) //Made these last 2 questions the most diffucult ones as if you make a simple mistake it will sent you to the frist junction
        {
            System.out.println("-You realised there are 8 objects in your disposle-");
            text = scanner.nextLine();
            System.out.println("-However make your choice wisly as choosing the wrong object");
            System.out.println("will result in your death and you will start from the begining-");
            text = scanner.next();
            System.out.println("(1) Hammer");
            System.out.println("(2) Old recipe" );
            System.out.println("(3) Gun");
            System.out.println("(4) Cute cat picture" );
            System.out.println("(5) Boombox");
            System.out.println("(6) Baseball bat");
            System.out.println("(7) Spare bullets");
            System.out.println("(8) Shoe");
            int i = scanner.nextInt();
            if (i==2)
            {
                System.out.println("-You grabbed one of the objects that you saw-");
                text=scanner.next();
                System.out.println("-It was an old recipe for choclate cake");
                text=scanner.nextLine();
                System.out.println("How the hell is that going to help us?");
                text=scanner.nextLine();
                System.out.println("-Before you knew it the 5 turrets acctvited themselves and readied their guns-");
                System.out.println("-You used the recipe as a shield 'great thinking by the way' and for some odd");
                System.out.println("reason the turret lowered their guns and started slowly started singing-");
                text=scanner.nextLine();
                System.out.println("-You snuck pass them and into the door where it said 'exit'");
                exitjunction();
            }
            else if (i==6)
            {
                System.out.println("-You grabbed one of the objects that you saw-");
                text=scanner.next();
                System.out.println("-It was an old metal baseball bat-");
                System.out.println("-Feeling the bat you noticed that's suprisling light-");
                text=scanner.next();
                System.out.println("Now that's what im talking about");
                text=scanner.nextLine();
                System.out.println("_Suddenly the 5 turrets actvited themselves and readied their guns-");
                System.out.println("-You swung the bat like crazy maniac causing all the turrets to be knocked over");
                System.out.println("-before they even shot their machine guns-");
                text=scanner.next();
                System.out.println("-You dropped the baseball bat and ran towards the exit-");
                exitjunction();
            }
            else
            {
                System.out.println("-You grabbed one of the objects that you saw-");
                text=scanner.nextLine();
                System.out.println("-Before you knew it the 5 turrets actvited themselves and readied their guns-");
                text=scanner.next();
                System.out.println("-They fired their guns as you could feel you body being torned into shreds-");
                System.out.println("-You lied down as you oculd see the light getting brighter....");
                text=scanner.next();
                System.out.println("-------<Game over>--------");
                firstjunction(); //This code will direct the pleyer back to the first ever junction aka the first method.
            }
        }
    }
    public static void exitjunction() // The last question.
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-After getting out you stand towards the door to your freedom-");
        System.out.println("-Once again it's one of those electronic locks with a sticky note-");
        System.out.println("Well this is it. your chance too be free");
        System.out.println("You know during our short time together I'm really going to miss you");
        text = scanner.nextLine();
        System.out.println("-You looked at the sticky note and it's once again a riddle-");
        System.out.println("-It said 'Im tall and opposing, I cannot move but can always see and cause harm, what am I?");
        text = scanner.next();
        System.out.println("Welp you know the drill");
        while (text.equals ("go"))
        {
            System.out.println("-(1)- go to lock-");
            System.out.println("-(2)- hug Jasper-"); //Soft moment
            System.out.println("-Riddle 'Im tall and opposing, I cannot move but always see and cause harm, what am I?");
            int d = scanner.nextInt();
            if (d==1)
            {
                System.out.println("-You went to the lock and think of the solving the riddle-");
                String code;
                code ="GlaDos";
                System.out.println("-Type in the passcode-");
                text=scanner.next();
                if (text.equals (code))
                {
                    System.out.println("-You typed in the passcode.._");
                    text=scanner.next();
                    System.out.println("-The locked clicked and suddenly...");
                    text=scanner.next();
                    System.out.println("-The door opened. And as the door moved, cracks of sunlight peaked through-");
                    goodbye();
                }
                else
                {
                    System.out.println("-You typed in the passcode.._");
                    text=scanner.next();
                    System.out.println("-The locked clicked and suddenly...");
                    text=scanner.next();
                    System.out.println("-A pistol came out of the lock and shot you in the head-");
                    System.out.println("-You lied down unconscious as you could see the light getting brighter....");
                    text=scanner.next();
                    System.out.println("-------<Game over>--------");
                    firstjunction();
                }
            }
            else
            {
                System.out.println("-Feeling bad for the lone core you knelt down and wrapped your arms around him-");
                System.out.println("-You felt a warm feeling inside of you as you contuined to hug Jasper-");
                System.out.println("-Despite being a machine Jasper thanked you for hugging him-");
                text=scanner.next();
                System.out.println("-And also thanking you for being his ONLY friend in his entire life-");
                text=scanner.next();
            }
        }
        
    }
    public static void hypocritecore2() //Same locations but will act diffently depending on the route.
    //This method will exacute if the player chosoes to leave the vent and defeat the guard.
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-After making it through the sensers you managed to make it to a corner-");
        System.out.println("-As you walk forward you noticed a sign that said 'exit':-");
        text = scanner.next();
        if (text.equals("go"))
        {
            System.out.println("My scanners inidcate that right beside corner is our ticket out of here");
            System.out.println("All we need to do is walk around the corner and reach the door to our freedom");
            System.out.println("You know this is actually quite easy..");
            text = scanner.nextLine();
            System.out.println("-Before Jasper was able to finish his sentance another core dropped down from the celing-");
            System.out.println("-This time it was core with orange eyes and a bowtie-");
            text= scanner.nextLine();
            System.out.println("Oh no. not HER..");
            System.out.println("\"Escuse me but will you kindly be quiet. Im trying to intruduce myself.\"");
            System.out.println("\"Also next time when you want to have a consversation try to say 'exucse me'\"");
            text=scanner.nextLine();
            System.out.println("But I wasn't even..");
            System.out.println("\"I SAID. Also next time when you want to join a consversation try to say 'exucse me'\"");
            System.out.println("\"Anyways before I was rudely intrubuted by that mentally retard machine I'm the...\"");
            text= scanner.next();   
        }
        System.out.println("-As the core contuined to ramble you started to doze off-");
        System.out.println("-However you woke up as you realised that you need to escape out of this place-");
        text=scanner.nextLine();
        System.out.println("-You need to think of something to get rid of the core-");
        System.out.println("-Looking around you saw a vase with some fake flowers on them-");
        System.out.println("-You also noticed that the sensers are still off-");
        text=scanner.nextLine();
        while (text.equals ("go"))
        {
            System.out.println("-There are multiple ways to get rid of the core-");
            System.out.println("-(1) Hack into the core-");
            System.out.println("-(2) Create a distraction-");
            System.out.println("-(3) Go back-");
            int d = scanner.nextInt();
            if (d==3)//The only time Japser allows you to go back/
            // since you dealt with the guard already you will be taken to the keybborad chhalneg in the vent
            {
                System.out.println("-You made the choice to go back and this time Jasper agrees-");
                text=scanner.next();
                System.out.println("Hey you hypocrite...F$5k You!");
                System.out.println("\"Excuse me. What did you say!?\"");
                text=scanner.nextLine();
                System.out.println("-Before you knew it you and Jasper ran back to the around the corner and into");
                System.out.println("the original junction point where you started-");
                text=scanner.nextLine();
                System.out.println("Yeah I really do not have the time to deal with her BS");
                System.out.println("Anyways let's go to the other direction");
                text = scanner.next();
                System.out.println("-You both decided to return back to the vents shaft again-");
                System.out.println("-At least it's better than staying with her-");
                keypadchallange();
            }
            if (d==2)
            {
                System.out.println("-You came up with an idea to destract her-");
                text= scanner.next();
                System.out.println("-Grabbing the vase you threw it on the ground and stomped on the flowers-");
                System.out.println("-Flatting them in the process as both cores looked in shock and in awe-");
                text=scanner.nextLine();
                System.out.println("Well that was something...");
                System.out.println("\"What on earth did you just do, Those are priceless flowers made by the finest-");
                text=scanner.nextLine();
                System.out.println("-As the core contuined to complain, both of you managed to sneak right");
                System.out.println("Behind her and locking the door behind you-");
                text=scanner.nextLine();
                System.out.println("Thank goodness I don't need to deal with her ever again");
                exitjunction();
            }
            if  (d==1)
            {
                System.out.println("-You made the attempt on trying to hack her-");
                System.out.println("-But you realised she's just too annoying to bear-");
                text=scanner.next();
            }
        }
    }
    public static void hypocritecore()
    // This method will happen if the player chooses to solve the lock or go to the door onto the right//
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-After making it through the sensers you managed to make it to a corner-");
        System.out.println("-As you walk forward you noticed a sign that said 'exit':-");
        text = scanner.next();
        if (text.equals("go"))
        {
            System.out.println("My scanners inidcate that right beside corner is our ticket out of here");
            System.out.println("All we need to do is walk around the corner and reach the door to our freedom");
            System.out.println("You know this is actually quite easy..");
            text = scanner.nextLine();
            System.out.println("-Before Jasper was able to finish his sentance another core dropped down from the celing-");
            System.out.println("-This time it was core with orange eyes and a bowtie-");
            text= scanner.nextLine();
            System.out.println("Oh no. not HER..");
            System.out.println("\"Escuse me but will you kindly be quiet. Im trying to intruduce myself.\"");
            System.out.println("\"Also next time when you want to have a consversation try to say 'exucse me'\"");
            text=scanner.nextLine();
            System.out.println("But I wasn't even..");
            System.out.println("\"I SAID. Also next time when you want to join a consversation try to say 'exucse me'\"");
            System.out.println("\"Anyways before I was rudely intrubuted by that mentally retard machine I'm the...\"");
            text= scanner.next();   
        }
        System.out.println("-As the core contuined to ramble you started to doze off-");
        System.out.println("-However you woke up as you realised that you need to escape out of this place-");
        text=scanner.nextLine();
        System.out.println("-You need to think of something to get rid of the core-");
        System.out.println("-Looking around you saw a vase with some fake flowers on them-");
        System.out.println("-You also noticed that the sensers are still off-");
        text=scanner.nextLine();
        while (text.equals ("go"))
        {
            System.out.println("-There are multiple ways to get rid of the core-");
            System.out.println("-(1) Hack into the core-");
            System.out.println("-(2) Create a distraction-");
            System.out.println("-(3) Go back-");
            int d = scanner.nextInt();
            if (d==3)
            {
                System.out.println("-You made the choice to go back and this time Jasper agrees-");
                text=scanner.next();
                System.out.println("Hey you hypocrite...F$5k You!");
                System.out.println("\"Excuse me. What did you say!?\"");
                text=scanner.nextLine();
                System.out.println("-Before you knew it you and Jasper ran back to the around the corner and into");
                System.out.println("the original junction point where you started-");
                text=scanner.nextLine();
                System.out.println("Yeah I really do not have the time to deal with her BS");
                System.out.println("Anyways let's go to the other direction");
                text = scanner.next();
                if (text.equals("go")) // since You choose this route, you havent dealt with the guard yet so you will have to defeat him //
                {
                   System.out.println("-You took the liberty on choosing a much safer route-");
                   System.out.println("-After all it's more tolerable-");
                   text = scanner.nextLine();
                   System.out.println("Wait wait stop look look!");
                   System.out.println("-You looked around to see a what seems to be another core-");
                   System.out.println("-This time looking like a police officer-");
                   text = scanner.nextLine();
                }
                System.out.println("Great now we have to deal with HIM as well");
                System.out.println("Be careful. He has a taser and belive me you do not want to get tased by this guy");
                text = scanner.nextLine();
                System.out.println("(1) go back");
                System.out.println("(2) go forward" );
                int f;
                f =scanner.nextInt();
                if (f==1) //Jasper really hates that core
                {
                   System.out.println("And deal with Her of all people, yeah no way");
                   System.out.println("Let's go deal with him");
                   officerA();
                }
                if (f==2)
                {
                   System.out.println("Let's go");
                   officerA();
                }
            }
            if (d==2)
            {
                System.out.println("-You came up with an idea to destract her-");
                text= scanner.next();
                System.out.println("-Grabbing the vase you threw it on the ground and stomped on the flowers-");
                System.out.println("-Flatting them in the process as both cores looked in shock and in awe-");
                text=scanner.nextLine();
                System.out.println("Well that was something...");
                System.out.println("\"What on earth did you just do, Those are priceless flowers made by the finest-");
                text=scanner.nextLine();
                System.out.println("-As the core contuined to complain, both of you managed to sneak right");
                System.out.println("Behind her and locking the door behind you-");
                text=scanner.nextLine();
                System.out.println("Thank goodness I don't need to deal with her ever again");
                exitjunction();
            }
            if  (d==1)
            {
                System.out.println("-You made the attempt on trying to hack her-");
                System.out.println("-But you realised she's just too annoying to bear-");
                text=scanner.next();
            }
        }
    }
    public static void officerA() //The first encounter pof the guard if the player chooses to solve the lock or exit the computer room
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-You hid behind a wall as you glanced beside it"); 
        System.out.println("Realising that the core is in sleep mode-");
        System.out.println("Alright we need a plan to get rid off him");
        System.out.println("If only we could send him somewhere else");
        text = scanner.nextLine();
        System.out.println("-You noticed a small computer terminal on the left and heads towards it-");
        text = scanner.nextLine();
        System.out.println("-And thought of an idea;-");
        System.out.println("-The screen shows mutiple options for somesort of");
        System.out.println("transportation system-");
        text = scanner.nextLine();
        while (text.equals ("go")) //Questins that requires to type in a code, to EXACT code shown in the text//
        {
            System.out.println("-Type 'Send To Range'-");
            System.out.println("-Type 'Send To Android Hell'-");
            System.out.println("-Type 'Send To Chamber'-");
            System.out.println("-Type 'Send To NFT'-"); 
            text = scanner.nextLine();
            if (text.equals ("Send To Range")) //2 diffrent options to deal with the guard. Each with it's own set of repononses.
            {
                System.out.println("-You typed in one of the locations-");
                System.out.println("-For a few seconds the computer screen buffered-");
                System.out.println("-Until a voice came out of the speakers-");
                text=scanner.nextLine();
                System.out.println("\"-Core transfer initiated. Sending core to Target range-\"");
                System.out.println("\"Wait...What's going on?\"");
                text=scanner.next();
                System.out.println("-Before the core knew what was happening since he just woke up");
                System.out.println("a shaft opened in the celing. The arm connected to him lifted");
                System.out.println("him up and dragged him to the direction of the desination that you typed-");
                text=scanner.next();
                System.out.println("_As the shaft closed you could even hear his voice getting lower");
                System.out.println("and lower until hear nothing more but just the fan in the room-");
                preventcover();
                
            }
            else if (text.equals ("Send To NFT"))
            {
                System.out.println("-You typed in one of the locations-");
                System.out.println("-For a few seconds the computer screen buffered-");
                text=scanner.nextLine();
                System.out.println("(Ding dong)");
                System.out.println("\"Wait...What's going on?\"");
                text=scanner.next();
                System.out.println("\"Hey! Your not supposed to be here!");
                text=scanner.nextLine();
                System.out.println("-However before the core aprehend the intruders the intercome turned on-");
                System.out.println("\"-Core transfer initiated. Sending core to Neurotoxin Filtration Testing Chamber\"");
                System.out.println("\"Wait WHAT!?\"");
                text=scanner.next();
                System.out.println("-Before the core knew what was happening");
                System.out.println("a shaft opened in the celing. The arm connected to him lifted");
                System.out.println("him up and dragged him to the direction of the desination that you typed-");
                text=scanner.next();
                System.out.println("_As the shaft closed you could even hear his scraems getting lower");
                System.out.println("and lower until it was just a memory inside your head-");
                text=scanner.nextLine();
                System.out.println("Yeah I knew he's just a machine, but I know for a fact that he really");
                System.out.println("REALLY hates that place..nice job putting him there by the way.");
                preventcover();
            }
            else
            {
                System.out.println("-You typed in one of the locations-");
                System.out.println("-For a few seconds the computer screen buffered-");
                System.out.println("-Until a voice came out of the speakers-");
                text=scanner.nextLine();
                System.out.println("\"-ERROR..ERROR..ERROR...-\"");
                System.out.println("(Ding dong)");
                System.out.println("\"Wait...What's that noise?\"");
                System.out.println("-Before the core knew what was happening since he just woke up");
                System.out.println("you hid behind the wall until the computer stopped glitching-");
                System.out.println("-When it stopped you looked back on to the core, which is once again");
                System.out.println("asleep. Maybe you should try a diffrent response-");
                text=scanner.nextLine();
            }
        }
        
    }
    public static void preventcover() //If you defeat the guard. NOTE in this route this is your first time going into the vents//
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-After that whole ordieal you made it towards a vent cover-");
        System.out.println("-You looked at it with discomfort seeing that the cover is alot smaller then you imagined-");
        text = scanner.nextLine();
        System.out.println("Oh I almost forgot, right at the end of the ventshaft, there is a TURRET testing room,");
        System.out.println("So please be careful when getting out, or else we will become a targets");
        System.out.println("Umm Good news. Right beside the testing room is the exit to the surface,");
        System.out.println("So that's something.");
        text = scanner.nextLine();
        while (text.equals ("go"))
        {
            System.out.println("-(1) go back");
            System.out.println("-(2) go to the cover");
            System.out.println("-(3) complain");
            int d;
            d=scanner.nextInt();
            if (d==1) 
            {
                System.out.println("Do you seriously want to go back? Isn't a bit to late by now?");
                text=scanner.next();
            }
            if (d==2)
            {
                System.out.println("-You said to your self, welp there's no turning back now-");
                System.out.println("-You bend down and squeezed through the cover, unhamred-");
                text=scanner.nextLine();
                System.out.println("-Miraculously you managed to made it through-");
                System.out.println("-Ironically enough the shaft itself is alot bigger than the cover-");
                text = scanner.nextLine();
                System.out.println("Aperture science does have a few handfull of large vents");
                System.out.println("Big enough to fit a human child.");
                System.out.println("Anaways enough chit chat Let's go.");
                keypadchallange();
            }
            if (d==3)
            {
                System.out.println("-You made the choice to let out your anger on how this whole");
                System.out.println("situtaion is all out of hands and that everything bad always ended");
                System.out.println("happening to you.-");
                text = scanner.nextLine();
                System.out.println("-However you reliased there is one big problem-");
                text = scanner.nextLine();
                System.out.println("-Your mouth has been glued shut-");
                text = scanner.nextLine();
            }
        }
        
    }
    public static void computerroom()
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-The room was covered in dust, you could even see dust bunnies shaped like bunnies:-");
        text = scanner.nextLine();
        if (text.equals("go"))
        {
            System.out.println("-You noticed that there was a bunch of old computers stacked ontop of each other.-");
            System.out.println("-Like a pancake, Which reminded yourself that you are stuck in an underground lab with no food or water-");
            System.out.println("-Sad isn't-");
            text = scanner.next();
            System.out.println("-Eventually you saw a dimily source of light-");
            text = scanner.nextLine();
            System.out.println("-You walked towards the source and saw that the light being projected was an old computer-");
            System.out.println("-A computer that looks like it came form an old vintaage 1980s commerical-");
            System.out.println("-Looking at the old cracked screen it said the following message-");
            text = scanner.nextLine();    
        }
        System.out.println("\"Remember the code to open the door and type the answer on the keypad\"");
        System.out.println("-Looking to your right you noticed that there was a door with a electronic lock-");
        System.out.println("-Only this time it has a cable that is connected to the computer;-");
        computerprechallnge();
    }
    public static void computerprechallnge() // The only time where getting the question worng will send you back to the prevoius junction
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        while (text.equals ("go"))
        {
            System.out.println("-(1) go to the computer-");
            System.out.println("-(2) go back-"); 
            System.out.println("-(3) destroy the computer (Warning don't do it)-");
            int d;
            d = scanner.nextInt();
            if (d==3)
            {
                System.out.println("-Initinally you thought to yourself why on Earth do I want to destroy a computer");
                troll();
                
            }
            if (d==2)
            {
                System.out.println("Why the hell do you want to go back");
                System.out.println("Isn't just a huge waste of time just to go back");
                System.out.println("For a stupid riddle");
                text = scanner.nextLine();
            }
            if (d==1)
            {
                System.out.println("-You took the chance to try out the computer code-:");
                text = scanner.nextLine();
                System.out.println("Just as a reminder, I rememeber these types of passcodes, being");
                System.out.println("Difficult to type it down so think about it alright");
                computerchallange();
            }
        }
    }
    public static void computerchallange() //The hardest challange yet//
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-You stepped towards the computer screen and it emiitted a message-");
        text = scanner.nextLine();
        int x = (int)(Math.random() * 15);
        int y = (int)(Math.random() * 10);
        System.out.println("What is (5x+(6y+28))+34 if x is " +x+ " and y is " +y);
        System.out.println("-Also try doing it without a calculator-");
        int answer = (5*x+(6*y+28))+34;
        int input = scanner.nextInt();
        if (input == answer)
        {
            System.out.println("\"Loading..\"");
            text=scanner.next();
            System.out.println("\"Acsess granted\"");
            System.out.println("\"Unlock\"");
            System.out.println("-You exited the computer room with pride and for some odd 'advice' from Jasper");
            System.out.println("You turned to the left and into the junction point of the complex-");
            corriderA();
        }
        else //If you get the answer wrong the code will set you baclk to the prevoius junction.
        {
            System.out.println("\"Loading..\"");
            text=scanner.next();
            System.out.println("\"Acsess Denied Rebooting\"");
            System.out.println("-You felt dissapointed and stepped away from the computer-");
            System.out.println("-Looking down you could see Jasper being disapointed as well-");
            computerprechallnge();
        }
    }
    public static void troll() // If you destroy the computer. Joke
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("Especially that this computer holds the power to unlock the door-");
        text= scanner.nextLine();
        System.out.println("-but you soon realised that yoour friend called you a'big brain'. Soooooo-");
        text= scanner.nextLine();
        System.out.println("-You found a hammer on top of some stacked computers and smashed the screen-");
        System.out.println("-Like a hyperactive toddler stuffed with suger in a pinata party-");
        text = scanner.nextLine();
        System.out.println("What the hell did you just do!?");
        System.out.println("-Jasper said in vain as sparks came flying off the computer like a firework");
        System.out.println(" display before it resides and smoke appears in both the lock and the computer-");
        text = scanner.next();
        System.out.println("-You leaned back and realised that you made a stupid choice in your entire life.-");
        System.out.println("-You put your arm on top of your head and contemplate the fact you could have");
        System.out.println("used your brain to type down the passcode. But I suppose that you had be a jackass");
        System.out.println("and destroyed your only ticket out of here..");
        text = scanner.nextLine();
        System.out.println("-------<Game over>--------");
        text = scanner.next();
        text = scanner.next();
        System.out.println("-Suddenly and miraculously the locked door flew open as the lock fell down");
        System.out.println("to the cold hard concrete floor. You and Jasper both look in");
        System.out.println("bewilderment and in shock.-");
        text = scanner.next();
        System.out.println("I do not know what you just did, but please for the love of god don't do that again!");
        System.out.println("Or else I will personlly send you to 'HER' for intrusion.");
        text = scanner.nextLine();
        System.out.println("-Eventually you exited the computer room and for some odd 'advice' from Jasper");
        System.out.println("You turned to the left and into the junction point of the complex-");
        corriderA();
    }
    public static void officerB() // The other encounter of the guard if the player chooses to enter the vents in the begining
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        if (text.equals("go"))
        {
            System.out.println("You know " +name+ " I wish we could crawl our way out of the vents");
            System.out.println("but hey at least this is alot safer");
            text = scanner.nextLine();
            System.out.println("-You took the liberty on choosing a much safer route-");
            System.out.println("-After all it's alot less dangerous than going into a room full of deadly turrets-");
            System.out.println("-Even if it's closer to the exit-");
            text = scanner.nextLine();
            System.out.println("Wait stop look up!");
            System.out.println("-You looked around to see a what seems to be another core like Jasper-");
            System.out.println("-Except newer looking, and painted in a coat of black and blue which looks like a police officer-");
            text = scanner.nextLine();
            System.out.println("What the hell is HE doing here?!");
            text = scanner.nextLine();
            System.out.println("(Ding dong)");
            text = scanner.nextLine();
            System.out.println("me and my big mouth..");
            text = scanner.nextLine();
        }
        System.out.println("-Inventably and on cue the core woke up and immediately locked focus at the 2 intruders-");
        System.out.println("-Which is you two by the way-");
        text = scanner.nextLine();
        System.out.println("\"Hey! You're not supposed to be here!\"");
        text = scanner.next();
        while (text.equals ("go"))
        {
            System.out.println("-(1) Reason with the guard-");
            System.out.println("-(2) Head back");
            System.out.println("-(3) Talk about donuts-");
            System.out.println("-(4) Complement-");
            System.out.println("-(5) Drink a cup of coffee-");
            System.out.println("-(6) Talk about his paintjob-");
            int d;
            d = scanner.nextInt();
            if (d==2)
            {
                System.out.println("\"Where do you think you're going?\"");
                System.out.println("\"As long I'm awake you two aren't going anywhere!\"");
                text=scanner.next();
                System.out.println("-So much for using an overused game feature;)-,");
                text=scanner.next();
            }
            else if (d==5)
            {
                System.out.println("-You quickly searched the small room for a cupand found a mug-");
                System.out.println("-Holding the mug, you realised that it's carrying a cup of coffee,-");
                System.out.println("-A cup of hot coffee to be exact-");
                text=scanner.next();
                System.out.println("-Withought hesistation you immediately through the cup of coffee onto his robotic eye-");
                System.out.println("-You managed to bypass him and a certain computer panel on the wall-");
                System.out.println("As you run you could hear the cries and swears the core said after you splashed him");
                System.out.println("with the coffee taht you found. HIS coffee-");
                System.out.println("-Eventually you heard a shaft opening and closing, indicating that the core has left-");
                text=scanner.nextLine();
                System.out.println("I do not know what you just did, but that was narly.");
                corriderB();
            }
            else
            {
                System.out.println("\"You have the right remain silent\"");
                text= scanner.next();
                System.out.println("You do realise he's unable talk..");
                System.out.println("\"YOU HAVE THE RIGHT TO REMIAIN SILENT!\"");
                text = scanner.next();
                System.out.println("...");
                text = scanner.next();
            }
        }
    }
    public static void corriderB() //If the player hgoes to the vent and defeat the guard.
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-Within the side of the hallway you saw a painting of an old man");
        System.out.println("-and an old woman.");
        text = scanner.nextLine();
        System.out.println("-You glanced between the left and infront of you, noticing the 2 diffrent branching paths-");
        System.out.println("-On the left is the entrence of the room and infront is a creepy hallway;-");
        text = scanner.nextLine();
        while (text.equals ("go"))
        {
           System.out.println("-(1) go forward,");
           System.out.println("-(2) go back-"); 
           System.out.println("-(3) go to the left-");
           int d;
           d =scanner.nextInt();
           if (d==3)
           {
               System.out.println("Why the hell do you want to go back");
               System.out.println("You do want to escape right? And not get pepper sprayed");
               text = scanner.nextLine();
               System.out.println("Spolier lol");
               text = scanner.nextLine();
           }
           if (d==2)
           {
               System.out.println("You do realise that he might come back");
               System.out.println("And I can tell you 100% he won't be as merciful as the");
               System.out.println("first time we've met him.");
               text = scanner.nextLine();
               System.out.println("Which, by the way is the reason why policemen can sometimes use force to enforce");
               System.out.println("the law, (comic rimshot).");
               text = scanner.nextLine();
           }
           if (d==1)
           {
               System.out.println("Alright lets go:");
               text = scanner.next();
               if (text.equals("go"))
               {
                   System.out.println("-You took the liberty on choosing the only route-");
                   text = scanner.nextLine();
                   System.out.println("Wait! stop stop look!"); 
                   System.out.println("-In the hallway you noticed that there was a bunch of motion sensers on the wall_");
                   text = scanner.nextLine();
                   System.out.println("Whatever you do. Do not trip those sensers");
                   System.out.println("It will actvate an alarm and emit a bunch of nourotoxins in the hallway");
                   System.out.println("Hey it seems that there is a button on the wall, it might help you disable them");
                   text = scanner.nextLine(); 
               }
               System.out.println("(1) red");
               System.out.println("(2) blue" );
               System.out.println("(3) green");
               System.out.println("(4) purple" );
               System.out.println("(5) go foward like a jackass");
               int l;
               l = scanner.nextInt();
               if (l==2)
               {
                   System.out.println("-You pressed the one of the following buttons-");
                   text = scanner.nextLine();
                   System.out.println("-The lights on the sensers turned off-");
                   System.out.println("-Right choice-");
                   hypocritecore2();
                   
               }
               else if (l==5)
               {
                   System.out.println("-You thought to yourself that if I ran fowrad fast enough the toxin won't reach to me-");
                   text= scanner.nextLine();
                   System.out.println("-As you ran pass the sensers like a complete 'jackass' the lights on them turned red-");
                   System.out.println("-You contuined runner until a metallic door felldown infornt of you-");
                   System.out.println("-Despite all your efforts on opening the door you quickly ran back before the toxin was relased-");
                   text = scanner.next();
                   System.out.println("-What a complete numbskull-");
                   text = scanner.nextLine();
               }
               else
               {
                   System.out.println("-You pressed the one of the following buttons-");
                   text = scanner.next();
                   System.out.println("-The lights on the sensers turned red and the ventcover opened-");
                   System.out.println("-Knowing common sense you ran back before the toxin was relased-");
                   System.out.println("-Wrong answer-");
                   text = scanner.next();
               }
           }
        }
        
    }
    public static void goodbye() //The final method. The player made it out of the maze.
    {
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("-You walked back as the door slowly opened revaling a field of golden wheat-");
        text= scanner.nextLine();
        System.out.println("-As you waved goodbye to your friend, you exited the facility and breathed in the fresh");
        System.out.println("air as you wait your next adventure full of new choices.");
        text = scanner.next();
        System.out.println("-------<The End>--------");
        text = scanner.nextLine();
    }
}
