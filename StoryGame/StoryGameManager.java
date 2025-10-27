package AdventureGame.StoryGame;

import java.util.Scanner;

import AdventureGame.GameMechanics.DifficultyMode;
import AdventureGame.GameMechanics.GameEngine;
import java.util.Scanner;
public class StoryGameManager extends GameEngine  {
//college life simulator
    
    @Override
    public void narrate() {
                try {
        String[] narrateSentences = {"In the prefecture of okinawa sits a young innovator",
                                     "A student with no experience — but with a spark of curiosity burning brighter than any skill.",
                                     "He doesn’t know much yet.",
                                     "Syntax errors scare him.",
                                     "Logic confuses him.",
                                     "Even finds hard to categorize computer parts and perform simple maintenance",
                                     "But every programmer... starts here",
                                     "(Sound of rain tapping against the window)",
                                     "Days pass and the time for his college journey will begun",
                                     "While others enjoy their long vacation",
                                     "He endured the struggles, the failures and the nevver ending anxiety during his vacation.",
                                     "(Soft music rises — hopeful tone)",
                                     "He dreams of becoming an innovator that can impact the world of technology.",
                                     "Having closer to achieve his dreams",
                                     "With only one task left to start his career",
                                     "That is to graduate in his chosen program",
                                     "But with only a few more grind the fire in his spirit rises to accomplish his long dream."};
        for (String narrate : narrateSentences) {
                Thread.sleep(2000);
                System.out.println(narrate);   
        }
          Thread.sleep(30000);
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }








    @Override
    public DifficultyMode chooseLevel(Scanner scan) {
        System.out.println("1 - Junior");
        System.out.println("2 - Associate ");
        System.out.println("3 - Senior");
         System.out.print("Enter the difficulty that you want: ");
        int chooseDifficulty = scan.nextInt();
        DifficultyMode difficultyChosen = DifficultyMode.values()[chooseDifficulty - 1];
        System.out.println("You have chosen " + difficultyChosen);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return difficultyChosen;
    }

    @Override
    public int computeGameScore() {
        return 1;
    }

    public void startGame(Scanner scan) {
        setDifficulty(chooseLevel(scan));
        narrate();
        Student student = new Student();
        Prelim prelim = new Prelim(getDifficulty()                                                                                                                                                                                                                               );
        prelim.narrate(new String[]{"The very first day of your class as well as your first day of your college journey",
                                    "You tried finding your classroom",
                                    "Your heart shaking, thinking what would your classmate and teacher think and how will you impress them on your first day",
                                    "Upon entering the classroom you observed",
                                    "Just like you expected most of the student are not familiar with each other with only a few students interacting with each other",
                                    "(Someone enters the room)",
                                    "It is your professor",
                                    "He introduced the subjects that you are going to tuckle in your first year",
                                    "You are excited thrilled and eager to learn more about programming and tech ",
                                    "However as your teacher discuss some possible lessons that you will be tuckling", 
                                    "You felt anxiety and worriness because some are different from what you self study",
                                    "After discussing the principles the teacher is asking some questions about some programs"}
        );
         prelim.recitation(new Questions[]{
            new Questions("Why did you choose this course", null, 10, "Thanks for sharing your response", null ),
            new Questions("What is a programming langauge use for? A - to communicate instructions to a computer\n B - Googling stuff in the internet\n C - Typing random things in your computer ", "A", 10, "That's it you got the correct answer you will receive 10 points for your recitation", "No, sorry but the right answer is letter A"),
            new Questions("Ok last question What is the importance of programming in developing our future?\n A - It limits technological advancement and creativity.\n B - It enables the creation of new technologies and solutions that improve our daily lives.\n C - It only helps people play computer games.\n D - It prevents automation and efficiency in industries.", "B", 10, "Yes, You got it programming have a massive impact in innovating our future from the AI, the website the mobile and other most innovation are created with the help of programming", "I'm sorry the correct answer is letter B")
        }, scan);
    }
    
}
