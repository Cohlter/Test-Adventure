import java.util.Scanner;
// Cohl Dickerson (elMulatto)
public class text_is_life {

    public static String name = "Canalipso";
    public static String bastion = "platinum";
    public static boolean has_gun = false;
    public static boolean has_life = true;

    public static int[] data = new int[3];

    // scene
    public static void scene() {

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();

    }

    // part
    public static void part() {

        System.out.println();
    }



    // character
    public static void character_creation(Scanner input) {

        scene();
        System.out.println("What do you go by? ");
        System.out.print("Name: ");
        name = input.nextLine();

        part();
        System.out.println("What bastion are you apart of? ");
        System.out.print("Name (less than 7 letters):");
        bastion = input.nextLine();

        if (bastion.length() >= 7) {
            character_eradication();
        }

    }

    // death
    public static void character_eradication() {

        System.out.println("Yashwada: 'Wow, seeing you here is rather dissapointing.'");
        System.out.println("Yashwada: 'Who would've thought that in a universe of typing, you'd mispell or misswrite something?'");
        System.out.println("Yashwada: 'But look, HERE WE ARE!'");
        System.out.println("Yashwada: 'An utter disappointment...'");
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

            part();
            System.out.println("You wake up in a red room on a dirty white matress.");

            part();
            System.out.print("Type 'next' to continue: ");
            String next = input.nextLine();
        }


    }

    // hospital
    public static void hospital(Scanner input) {

        // bed
        if (has_life == true) {
            scene();
            System.out.println("You see an odd looking gun on the nightstand by your bed.");

            part();
            System.out.println("Do you pick it up?");
            System.out.print("Type 'yes' or 'no': ");
            String ans1 = input.nextLine();

            part();
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
            System.out.println("You get up and look around. There are two doors with signs and a vent. Which way shall you go?");
            System.out.print("Type 'Operations', 'Exit' or 'vent': ");
            String ans2 = input.nextLine();

            part();
            if (ans2.equalsIgnoreCase("operations")) {
                System.out.println("You go into the operations room.");
                data[0] = 1;
            } else if (ans2.equalsIgnoreCase("exit")) {
                System.out.println("You exit the building.");
                data[0] = 2;
            } else if (ans2.equalsIgnoreCase("office")) {
                System.out.println("You go into the office.");
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

            part();
            System.out.println("Doctor: 'Well, anyways, what do you need?'");
            if (has_gun == true) {
                System.out.println("Type 'i want more guns', 'can I leave?' or 'why am I here?':");
            } else {
                System.out.print("Type 'i want a gun', 'can I leave?' or 'why am I here?': ");
            }
            String ans3 = input.nextLine();

            System.out.println();
            if (ans3.equalsIgnoreCase("i want a gun")) {
                System.out.println("Doctor: 'Well, I had a gun out there and youuuu could've taken ittt. Jokes on you...'");
                has_life = false;
                System.out.println("You've been shot with the doctor's other gun. At least you were right that he had another.");
                data[1] = 1;
            } else if (ans3.equalsIgnoreCase("i want more guns") && has_gun == true) {
                System.out.println("Doctor: 'Ohhhh, I thiink you've gottt enoughghgh!'");
                has_life = false;
                System.out.println("You've been shot with the doctor's other gun. At least you were right that he had another.");
                data[1] = 2;
            } else if (ans3.equalsIgnoreCase("can I leave?")) {
                System.out.println("You came and got me, so now you're gonna stick with me.");
                System.out.print("You better stay in that room, lemme get ya checked out.");
                data[1] = 3;
            } else if (ans3.equalsIgnoreCase("why am I here?")){
                System.out.println("Ohh you've badly injured by an enemy.");
                System.out.println("We could've killed you, but they see something in you.");
                System.out.print("But now that you're awake, stay in that room, lemme get ya checked out.");
                data[1] = 3;
            } else {
                character_eradication();
            }
        }
        


    }

    // exit
    public static void exit(Scanner input) {

        // war
        if (has_life == true) {
            System.out.println("You walk outside.");
            if (bastion.length() <= 3) {
                System.out.println("You are part of a bastion hated here in bastion brown. The members surround you.");
                System.out.println("You get knifed in the side and ache in pain while falling down.");
                System.out.println("Then another clickso missle hit you.");
                has_life = false;
                data[1] = 1;
            } else if (bastion.length() != 5){
                System.out.println("The world clicks in so many wonderful ways.");
                System.out.println("On that note a clique approaches you.");
                System.out.println("Clique Member: 'Something looks off about you...'");
                part();
                System.out.print("Type 'Wdym?', 'Am I sick?' or 'Something looks off about you!'");
                String ans4 = input.nextLine();
                if (ans4.equalsIgnoreCase("Wdym?")) {
                    System.out.println("Clique Member: 'Something a little tricky. You're not from here are you?'");
                    System.out.println("Clique Member: 'Don't worry, you ain't gotta answer. You look chill. Lemme introduce myself.'");
                    System.out.println("Clique Member: 'I'm Ricardo from here at Bastion Brown and I'm part of Clique IV.'");
                    System.out.println("Ricardo: 'Where are you from?'");
                    System.out.print("Type 'Bastion " + bastion + "'");
                    String ans5 = input.nextLine();
                    if (ans5.equalsIgnoreCase("Bastion " + bastion)) {
                        System.out.println("Ricardo: 'Well, well. Never been to close with anyone from there, but I like you.'");
                        System.out.println("Ricardo: 'If ya don't mind, come join us on our amazing adventure.'");
                        System.out.println("You join Ricardo and the rest of his clique. You are officially part of Bastion Brown.");
                        bastion = "Brown";
                    } else {
                        character_eradication();
                    }
                } else if (ans4.equalsIgnoreCase("Am I sick?")) {
                    System.out.println("Clique Member: 'Oh no. Not that. That's kinda fishy though.");
                    System.out.println("Clique Member: 'You don't seem like the... type of individual I hang with.");
                    System.out.println("Clique Member: 'But, I guess I wish you my farewells from where ever you come from.");
                    // end
                } else if (ans4.equalsIgnoreCase("Something looks off about you!")) {
                    System.out.println("Clique Member: 'I was just tryna be generous! We don't play around these parts!'");
                    System.out.println("The member of the clique that was talking to you aggresively pulls out a small device.");
                    System.out.println("Next thing you know you see many images flash across your mind.");
                    System.out.println("A doctor. A girl. A friend. You don't know what they are, but they all seem oddly familiar. Then all goes black.");
                    has_life = false;
                }
            } else {
                System.out.println("Friend: 'Well, if it isn't ol'" + name + "."+ "I haven't seen you here in a while buddy.'");
                part();
                System.out.println("Friend: 'Where have you been at?'");
                System.out.print("Type 'Been doing what I told you I would do' or 'Not you!'");
                String ans4 = input.nextLine();
            }
        }
        

    }

    // vent
    public static void vent(Scanner input) {

        System.out.println("You open the door slowly, where you see a girl with wide hips and cute eyes sitting down.");

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
        scene();
        System.out.print("You've reached an end. Type 'next' to continue: ");
        String next = input.nextLine();
        part();
        System.out.println("---" + name +"'s Stats---");
        System.out.println("Bastion: " + bastion);
        System.out.println("Gun: " + has_gun);
        System.out.println("Life: " + has_life);
        System.out.print("You went down path ");
        for (int i=0; i<data.length; i++) {
            System.out.print(data[i]);
        }

        
    }
}
