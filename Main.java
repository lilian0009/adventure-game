import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean rightAnswer = false;
        String playerName =  "";

        // intro
        System.out.println("hi, there");
        System.out.println("welcome to the operating room!");
        System.out.println("pls enter your name");
        playerName = scanner.nextLine();
        System.out.println(playerName + "?" + " such an endearing name!");
        System.out.println("it's a pleasure meeting you Dr." + playerName);
        System.out.println("there are three patients on the patient beds");

        boolean isPlaying = true;

        while (isPlaying == true) {
            // First Choice
            System.out.println("do you want to dissect (1) Samuel or (2) Mandy or (3) I don't want to dissect anyone!");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Nice, You made the right decision!");
                System.out.println("let's take a closer look at Samuel ;)");
                System.out.println("oh no! Samuel is still alive!! what should you do?");
                System.out.println("Do you want to (1) grab him by his throat or (2) let him run for a minute and hunt him down?");
                int choiceTwo = scanner.nextInt();
                if (choiceTwo == 1){
                    System.out.println("oopsie it seems like samuel cannot breath");
                    System.out.println("Do you want to (1) choke him until death visits him or (2) dissect him while he still has his consciousness?");
                    int choiceThree = scanner.nextInt();
                    if (choiceThree == 1) {
                        System.out.println("You knock samuel out cold and begin the dissection.");
                        System.out.println("you took his organs out and sell them on the darkwebs");
                        isPlaying = false;
                    }else{
                        System.out.println("samuel's screams fill the room *blood spills all over you");
                        System.out.println("do you want to (1) ignore them or (2) put an end to it quickly?");
                        int choiceFive = scanner.nextInt();
                        if (choiceFive == 1) {
                            System.out.println("You ignore his screams, savoring every moment");
                            isPlaying = false;
                        } else {
                            System.out.println("You end it quickly by cutting his thraot, silencing his screams");
                            isPlaying = false;
                        } 
                    }
                }else{
                    System.out.println("samuel sprints out of the operating room while you observe him with a smug expression");
                    System.out.println("do you want to (1) chase him down or (2) go to the cctv control room?");
                    int choiceFour = scanner.nextInt();

                    if (choiceFour == 1) {
                        System.out.println("You chase Samuel down the hallway, and catch up to him.");
                        System.out.println("Do you want to (1) drag him back to the operating room or (2) end it right there?");
                        int choiceSix = scanner.nextInt();

                        if (choiceSix == 1) {
                            System.out.println("You drag him back to the operating room and continue the dissection");
                            isPlaying = false;
                        } else {
                            for(int i = 0; i <= 3; i+=3){
                                System.out.println("you stab him on his back");
                            }
                            System.out.println("You end Samuel’s life right there in the hallway, leaving a trail of blood");
                            isPlaying = false;
                        }
                    } else {
                        System.out.println("You go to the CCTV control room and watch Samuel’s frantic escape");
                        System.out.println("Do you want to (1) alert security to catch him or (2) let him go for now?");
                        int choiceSeven = scanner.nextInt();

                        if (choiceSeven == 1) {
                            System.out.println("You alert security, and they apprehend Samuel. You return to the operating room to finish what you started...");
                            isPlaying = false;
                        } else {
                            System.out.println("You let Samuel go for now, but you know he won’t get far");
                            System.out.println("You wander through the hospital corridors, the echo of your footsteps is the only sound accompanying you");
                            System.out.println("A faint rustling sound catch your attention, coming from the closet");
                            System.out.println("Do you want to (1) wait for him to come out or (2) whisper 'I FOUND YOU'?");
                            int choiceNine = scanner.nextInt();
                            if (choiceNine == 1) {
                                System.out.println("You lean against the cold wall, a sly smile tugging at the corners of your lips");
                                System.out.println("You can hear Samuel's labored breathing from inside the closet—panicked and shallow, just the way you like it");
                                System.out.println("The minutes tick by slowly, the silence growing heavier with each passing second");
                                System.out.println("He doesn't know if you're still out here or not");
                                System.out.println("You know that the fear inside that closet is building, twisting Samuel's mind into knots");
                                System.out.println("Finally, the door creaks open just a crack. You stay perfectly still, watching as a trembling hand pushes the door wider");
                                System.out.println("Samuel's eyes are wide, filled with terror as he peeks out, hoping against hope that you've gone");
                                System.out.println("And now, the show has began");
                                System.out.println("For people who got this result on first try, you need a therapy...");
                                isPlaying = false;
                            }else{
                                System.out.println("You push it open with ease, the door swinging wide to reveal Samuel huddled in the corner, your shadow looming over him");
                                System.out.println("There's no escape now...");
                                isPlaying = false;
                            }
                            
                        }
                    }
                }
            }else {
                System.out.println("WRONG CHOICE!");
                
            }
        }
        System.out.println("THE END!");
        }

    }

        


