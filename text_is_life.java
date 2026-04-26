import java.util.Scanner;
// Cohl Dickerson (elMulatto)
public class text_is_life {

    public static String name = "Canalipso";
    public static int hair = 4;
    public static boolean has_gun = false;
    public static int[] data = new int[3];
    public static boolean has_life = true;


    // character
    public static void characterCreation(Scanner input) {

        System.out.println();
        System.out.print("What do you go by: ");
        name = input.nextLine();

        System.out.println();
        System.out.println("1) Platinum, 2) Blonde, 3) Sand, 4) Light-Brown, 5) Brown, 6) Dark-Brown, 7) Black");
        System.out.print("What color hair would you like: ");
        hair = input.nextInt();

    }


    // intro
    public static void intro() {

        System.out.println();
        System.out.println("You are dropped into a world of cliques and bastions.");
        System.out.println("A world far different yet so similar to one of your own.");
        System.out.println("One day you were hit by a weapon called a clickso.");
        System.out.println("It knocked you out and an enemy from Bastion 6 Clique III took you away.");
        System.out.println("You wake up in a red room on a dirty white matress.");

    }

    // hospital
    public static void hospital(Scanner input) {

        System.out.println();
        System.out.println("You see an odd looking gun on the nightstand by your bed.");
        System.out.println("1) Yes, 2) No");
        System.out.print("Do you pick it up: ");
        int ans1 = input.nextInt();

        System.out.println();
        if (ans1 == 1) {
            System.out.println("You pick up odd looking gun.");
            has_gun = true;
        } else {
            System.out.println("You pass on the odd looking thing.");
            has_gun = false;
        }

        System.out.println();
        System.out.println("You get up and look around. There are three doors.");
        System.out.println("1) Left, 2) Forward, 3) Right");
        System.out.print("Which way do you go: ");
        int ans2 = input.nextInt();

        System.out.println();
        data[0] = ans2;
        if (ans2 == 1) {
            System.out.println("You go left.");
        } else if (ans2 == 2) {
            System.out.println("You go forward.");
        } else {
            System.out.println("You go right.");
        }

    }

    // doctor
    public static void doctor(Scanner input) {

        System.out.println();
        System.out.println("You: 'Doctor?!' ");
        System.out.println("A tall white grey haired man walks from behind a corner and is startled to see you.");
        System.out.println("Doctor: 'Didn't think you'd be up quite yet, " + name + "'.");
        if (has_gun == true) {
            System.out.println("Doctor: 'Ahh, looks like you've been fascinated by my gun, I see.'");
        }

        System.out.println();
        System.out.println("1) 'I want a gun', 2) 'Can I leave?' 3) 'Why am I here?'");
        System.out.print("Doctor: 'Well, anyways, what do you need': ");
        int ans3 = input.nextInt();

        System.out.println();
        data[1] = ans3;
        if (ans3 == 1) {
            System.out.println("Doctor: 'Ohhhh, I thiink you've gottt enoughghgh!'");
            has_life = false;
            System.out.println("You've been shot with the doctor's other gun. At least you were right that he had another.");
        } else if (ans3 == 2) {
            System.out.println("You came and got me, so now you're gonna stick with me.");
            System.out.print("You better");
        } else {
            System.out.println("Ohh you've badly injured by an enemy.");
            System.out.println("We could've killed you, but they see something in you.");
            System.out.print("But now that you're awake,");
        }

        if (ans3 != 1) {
            System.out.println(" stay in that room, lemme get ya checked out.");
        }


    }

    // war
    public static void war(Scanner input) {

        System.out.println("You walk outside. The enemies have approached.");
        System.out.println("You get knifed in the side and ache in pain while falling down.");
        System.out.println("Then another calipso missle hit you.");

    }

    // freaky
    public static void freaky(Scanner input) {

        System.out.println("You open the door slowly, where you see a girl with wide hips and cute eyes sitting down.");

    }

    
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        characterCreation(input);

        intro();

        hospital(input);

        if (data[0] == 1) {
            doctor(input);
        } else if (data[0] == 2) {
            war(input);
        } else {
            freaky(input);
        }

        // stats
        System.out.println();
        System.out.println("_" + name +"'s Stats_");
        System.out.println("Hair Type: " + hair);
        System.out.println("Gun: " + has_gun);
        System.out.println("Life: " + has_life);
        System.out.print("You went down path ");
        for (int i=0; i<data.length; i++) {
            System.out.print(data[i]);
        }

        
    }
}
