import java.util.Scanner;
// Cohl Dickerson (elMulatto)
public class text_is_life {

    public static String name = "Canalipso";
    public static String bastion = "platinum";
    public static boolean has_gun = false;
    public static boolean has_life = true;

    public static int[] data = new int[2];

    // scene
    public static void scene() {

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();

    }

    // part
    public static void type(String sentence) {

        System.out.println();
        System.out.print(sentence);
    }



    // character
    public static void character_creation(Scanner input) {

        scene();
        System.out.println("What do you go by? ");
        System.out.print("Type any name: ");
        name = input.nextLine();

        scene();
        System.out.println("What bastion are you apart of? ");
        System.out.print("Type a name less than 7 letters: ");
        bastion = input.nextLine();

        if (bastion.length() >= 7) {
            character_eradication();
        }

    }

    // death
    public static void character_eradication() {

        scene();
        System.out.println("Everything turns white. An anonymous black figure with bleeding white eyes appears in front of you.");
        System.out.println("Yashwada: 'Wow, seeing you here is rather dissapointing. Who would've thought that in a universe of typing, you'd mispell something?'");
        System.out.println("Yashwada: 'But look, here we are! An utter disappointment...'");
        has_life = false;

    }


    // intro
    public static void intro(Scanner input) {

        // open
        if (has_life == true) {
            scene();
            System.out.println("You are dropped into a world of cliques and bastions.");
            System.out.println("A world far different, yet so similar to your own.");
            System.out.println("One day you were hit by a weapon called a clickso.");
            System.out.println("It knocked you out and someone from Bastion Brown Clique III took you away.");
            System.out.println("You wake up in a red room on a dirty white matress.");

            type("Type 'next' to continue: ");
            String next = input.nextLine();
        }


    }

    // hospital
    public static void hospital(Scanner input) {

        // bed
        if (has_life == true) {
            scene();
            System.out.println("You see an odd looking gun on the nightstand by your bed. Do you pick it up?");
            type("Type 'yes' or 'no': ");
            String ans1 = input.nextLine();

            scene();
            if (ans1.equalsIgnoreCase("yes")) {
                System.out.println("You pick up odd looking gun.");
                has_gun = true;
            } else if (ans1.equalsIgnoreCase("no")) {
                System.out.println("You pass on the odd looking thing.");
                has_gun = false;
            } else {
                character_eradication();
            }
        }
        

        // doors
        if (has_life == true) {
            scene();
            System.out.println("You get up and look around. There are two doors labled Operations and Exit, and a vent. Which way shall you go?");
            type("Type 'Operations', 'Exit' or 'vent': ");
            String ans2 = input.nextLine();

            scene();
            if (ans2.equalsIgnoreCase("operations")) {
                System.out.println("You go into the operations room.");
                data[0] = 1;
            } else if (ans2.equalsIgnoreCase("exit")) {
                System.out.println("You exit the building and walk outside.");
                data[0] = 2;
            } else if (ans2.equalsIgnoreCase("vent")) {
                System.out.println("You go into the vent.");
                data[0] = 3;
            } else {
                character_eradication();
            }
        }

    }

    // operations
    public static void operations(Scanner input) {

        // doctor
        if (has_life == true) {
            scene();
            System.out.println("You: 'Doctor?!' ");
            System.out.println("A tall white grey haired man walks from behind a corner and is startled to see you.");
            System.out.println("Doctor: 'Didn't think you'd be up quite yet, " + name + ".'");
            if (has_gun == true) {
                System.out.println("Doctor: 'Ahh, looks like you've been fascinated by my gun too, I see.'");
            }
            System.out.println("Doctor: 'Well, anyways, what do you need?'");
            type("Type 'i want a gun', 'can I leave?' or 'why am I here?': ");
            String ans3 = input.nextLine();

            scene();
            if (ans3.equalsIgnoreCase("i want a gun") && has_gun == false) {
                System.out.println("Doctor: 'Well, I had a gun out there and youuuu could've taken ittt. Jokes on you...'");
                System.out.println("You get shot with the doctor's other gun. Should've take the one while you had a chance.");
                has_life = false;
                data[1] = 1;
            } else if (ans3.equalsIgnoreCase("i want a gun") && has_gun == true) {
                System.out.println("Doctor: 'Ohhhh, I thiink you've gottt enoughghgh!'");
                System.out.println("The doctor pulls out another one of his guns. You frantically try to fire your gun as well, but you can't figure out how to use it.");
                System.out.println("You get shot with the doctor's gun. At least you were right in asking since he had another.");
                has_life = false;
                data[1] = 2;
            } else if (ans3.equalsIgnoreCase("can I leave?")) {
                System.out.println("Doctor: 'You came and got me, so now you're gonna stick with me.'");
                System.out.println("Doctor: 'Go back in that room and you better stay. I gotta make sure your conditions are good.'");
            } else if (ans3.equalsIgnoreCase("why am I here?")){
                System.out.println("Doctor: 'Ohh you've been badly injured by a clickso missle.'");
                System.out.println("Doctor: 'But now that you're awake, stay in that room. Lemme get ya checked out.'");
            } else {
                character_eradication();
            }


            if (has_life == true) {

                System.out.println("You walk back into the room and wait for a while. The doctor opens the door with a loud bang that startles you.");
                System.out.println("I just got a call that my family just got bombed by Bastion Xel, so I'm not doing so hot, but let's see if we can fix you up.");
                type("Type 'next' to continue: ");
                    String reveal = input.nextLine();
                    scene();

                if (bastion.length() > 3){
                    System.out.println("The doctor finished his surgery and after a couple weeks you completely heal. But you feel oddly attached to the doctor.");
                    System.out.println("You stay for a while and help the doctor.");
                    System.out.println("Then one day, he too passes away and you take his spot.");
                    System.out.println("Decades later, you're waiting in the operation room until your new critically hurt patient shows more significant signs of life.");
                    System.out.println("You hear someone open a door. They yell: 'Doctor?!'");
                    data[1] = 3;
                } else {
                    System.out.println("Doctor: 'Wait a hot minute! On your medical sheet it says you're part of Bastion " + bastion + ". And they're associates with Bastion Xel!'");
                    System.out.println("Doctor: 'I cannot trust someone like you after what has happened today. Bye.'");
                    System.out.println("The doctor starts his surgery. He takes out all your organs one at a time. You slowly bleed out and pass away.");
                    data[1] = 4;
                }
                // end
            }

        }
        


    }

    // exit
    public static void exit(Scanner input) {

        // war
        if (has_life == true) {
            scene();
            if (bastion.length() <= 3) {
                System.out.println("Unfortunately, you are part of a bastion hated here in Bastion Brown. Many of their cliques surround you.");
                System.out.println("You get knifed in the side and ache in pain while falling down.");
                System.out.println("Then another clickso missle hits you and this time you don't make it out alive.");
                has_life = false;
                data[1] = 1;
            } else if (bastion.length() != 5){
                System.out.println("The world clicks in so many wonderful ways.");
                System.out.println("On that note a clique approaches you.");
                System.out.println("Clique Member: 'Something looks off about you...'");
                type("Type 'wdym?', 'am I sick?' or 'something looks off about you!': ");
                String ans4 = input.nextLine();

                if (ans4.equalsIgnoreCase("Wdym?")) {
                    scene();
                    System.out.println("Clique Member: 'Something a little tricky. You're not from here are you?'");
                    System.out.println("Clique Member: 'Don't worry, you ain't gotta answer. You look chill. Lemme introduce myself.'");
                    System.out.println("Clique Member: 'I'm Ricardo from here at Bastion Brown and I'm part of Clique IV.'");
                    System.out.println("Ricardo: 'Where are you from?'");
                    type("Type 'Bastion " + bastion + "': ");
                    String ans5 = input.nextLine();

                    if (ans5.equalsIgnoreCase("Bastion " + bastion)) {
                        scene();
                        System.out.println("Ricardo: 'Well, well. Never been to close with anyone from there, but I like you.'");
                        System.out.println("Ricardo: 'If ya don't mind, come join us on our amazing adventure.'");
                        System.out.println("You join Ricardo and the rest of his clique. You are officially part of Bastion Brown.");
                        bastion = "Brown";
                        data[1] = 2;
                    } else {
                        character_eradication();
                    }
                } else if (ans4.equalsIgnoreCase("Am I sick?")) {
                    scene();
                    System.out.println("Clique Member: 'Oh no. Not that. That's kinda fishy though.'");
                    System.out.println("Clique Member: 'You don't seem like the... type of individual I hang with.'");
                    System.out.println("Clique Member: 'But, I guess I wish you my farewells from where ever you come from.'");
                    data[1] = 3;
                } else if (ans4.equalsIgnoreCase("Something looks off about you!")) {
                    scene();
                    System.out.println("Clique Member: 'I was just tryna be generous! We don't play around these parts!'");
                    System.out.println("A member of the clique aggresively pulls out a small device.");
                    System.out.println("Next thing you know you see many images flash across your mind.");
                    System.out.println("A doctor. A girl. A friend. You don't know who they are, but they all seem oddly familiar. All goes black.");
                    has_life = false;
                    data[1] = 4;
                } else {
                    character_eradication();
                }
            } else {
                System.out.println("Friend: 'Well, if it isn't ol' " + name + "."+ " I haven't seen you in a while buddy.'");
                System.out.println("Friend: 'Where have you been at?'");
                type("Type 'I was living the dream' or 'not you!': ");
                String ans6 = input.nextLine();

                if (ans6.equalsIgnoreCase("I was living the dream")) {
                    scene();
                    System.out.println("Friend: 'Wow... I'm proud of you man.'");
                    System.out.println("You: 'Thanks Kenyetsa!'");
                    System.out.println("Your friend glances behind you and sees that you just came out of a hospital.");
                    System.out.println("Kenyetsa: 'Must've got injured badly durin' the job. Glad you're here though. This is a pleasant surpise.'");
                    System.out.println("Kenyetsa: 'You look hurt. I'm tired of being here. How 'bout we both head back our home bastion, good ol' Bastion " + bastion + ", and catch up?'");
                    System.out.println("Without another word you and Kenyetsa sneak out of Bastion Brown and catch up.");
                    data[1] = 5;
                } else if (ans6.equalsIgnoreCase("not you!")) {
                    scene();
                    System.out.println("Friend: 'Out of all the chances of this happening and you reply with that?!'");
                    System.out.println("Your friend pulls out a glock from his pock and aims it at you.");
                    System.out.println("There's a long pause as he stands there disappointed and very hurt. Immediately a loud shot rings and the lights are out.");
                    data[1] = 6;
                    has_life = false;
                } else {
                    character_eradication();
                }
            }
        }
        

    }

    // vent
    public static void vent(Scanner input) {

        if (has_life == true) {
            scene();
            System.out.println("You crawl through the vent until you get to an opening in the wall of an office.");
            System.out.println("Sitting in a chair cluelessly is a girl with wide hips and cute eyes.");
            if (has_gun == true) {
                type("Type 'shoot her' or 'talk to her': ");
            } else {
                type("Type 'attack her' or 'talk to her': ");
            }
            String ans7 = input.nextLine();

            if (ans7.equalsIgnoreCase("attack her")) {
                scene();
                System.out.println("You attempt to get out the vent, but you fall. You hear the girl scream.");
                System.out.println("You get up with fists clenched and run at the girl. She picks up the chair she was sitting on throws it at you.");
                System.out.println("It knocks you down. You try to get up, but she's repeatedly smacking you with the chair.");
                System.out.println("You grab the chair as she continuosly screams: 'Doctor?!'");
                System.out.println("You rip the chair from her hands and get up. She punches you before you can react. A door opens and hits you in the head and you lose grip of the chair.");
                System.out.println("She grabs the chair again and knocks you out with one swoop. You hear a gunshot as you fade away.");
                has_life = false;
                data[1] = 1;
            } else if (ans7.equalsIgnoreCase("shoot her") && has_gun == true) {
                scene();
                System.out.println("It takes you a moment to figure out how the gun works, but eventually you understand it.");
                System.out.println("You aim at the girls head and shoot. She's dead.");
                System.out.println("You're about to get down, but you hear frantic walking. A doctor walks in. You aim at his head and shoot. He's dead.");
                System.out.println("You take ownership of the hospital and kill everyone else who works there.");
                System.out.println("But you don't stop there and you take over all of Bastion Brown.");
                System.out.println("Something compels you to keep going and you take over all the other bastions.");
                System.out.println("Now the only bastion left is yours, but now there is no need for bastions. It is all just one homogenous world.");
                System.out.println("You have created World " + bastion + ".");
                data[1] = 2;
            } else if (ans7.equalsIgnoreCase("talk to her")) {
                scene();
                System.out.println("You: 'Hey...'");
                System.out.println("The girl screams and picks up her chair in defense.");
                System.out.println("You: 'Look, I mean no harm. Where am I? I'm so confused.'");
                System.out.println("Girl: 'How can I trust you?'");
                if (has_gun == true) {
                    System.out.println("You throw your gun in front of her and raise your hands.");
                    has_gun = false;
                } else {
                    System.out.println("You raise your hands and empty your nonexistent pockets.");
                }
                System.out.println("Girl: 'Well, what's your name?': ");
                type("Type '" + name + "': ");
                String ans8 = input.nextLine();

                if (ans8.equalsIgnoreCase(name)) {
                    scene();
                    System.out.println("Girl: 'Oh my, you were the patient in the clickso accident. Wow, I can't believe you're alive.'");
                    System.out.println("Girl: 'My name's Mia. Nice to meet you.'");
                    System.out.println("Mia: 'Let me tell the doctor that you're okay.'");
                    System.out.println("She tells the doctor and you are set free. But as you're about to leave, she looks at you with teary eyes.");
                    System.out.println("It pulls you back and you ask if she wants to hang out. Immediately she says yes and before you know it, you guys are hanging out everyday.");
                    System.out.println("A couple years later you guys have a kid. And then another. And then another.");
                    System.out.println("Life goes great and you guys spend the rest of your life together forever.");
                    data[1] = 3;
                } else {
                    character_eradication();
                }
            } else {
                character_eradication();
            }

        }

    }

    
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        character_creation(input);

        intro(input);

        hospital(input);

        if (data[0] == 1) {
            operations(input);
        } else if (data[0] == 2) {
            exit(input);
        } else {
            vent(input);
        }

        // stats
        
        if (data[0] != 0 && data[1] != 0) {
            type("You've reached an end. Type 'next' to continue: ");
        } else {
            type("Next time make sure you answer the prompt correctly, this includes punctuation. Type 'next' to continue: ");
        }
        String next = input.nextLine();
        scene();
        System.out.println("---" + name +"'s Stats---");
        System.out.println("Bastion: " + bastion);
        System.out.println("Gun: " + has_gun);
        System.out.println("Life: " + has_life);
        System.out.print("You went down path ");
        for (int i=0; i<data.length; i++) {
            System.out.print(data[i]);
            System.out.print(".");
        }
        System.out.println();

    }
}
