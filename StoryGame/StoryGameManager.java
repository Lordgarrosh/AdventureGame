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
                                     "A student with no experience —adad but with a spark of curiosity burning brighter than any skill.",
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
                Thread.sleep(500);
                System.out.println(narrate);   
        }
          Thread.sleep(500);
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
        scan.nextLine();
        DifficultyMode difficultyChosen = DifficultyMode.values()[chooseDifficulty - 1];
        System.out.println("You have chosen " + difficultyChosen);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return difficultyChosen;
    }

    @Override
    public int computeGameScore() {
        return 1;
    }

    @Override
    public int startGame(Scanner scan) {
        setDifficulty(chooseLevel(scan));
        narrate();
        Student student = new Student();
        Prelim prelim = new Prelim(getDifficulty());
        Midterm midterm = new Midterm(getDifficulty());
        PreFinals preFinals = new PreFinals(getDifficulty());
        Finals finals = new Finals(getDifficulty());
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
                                    "After discussing the principles the teacher is asking some questions about some questions related to their course"}
        );
      student.setRecitationScore(prelim.recitation(new RecitationQuestions[]{
            new RecitationQuestions("Who is considered the first person to develop the concept of a programming language? A - Ada Lovelace B - James Gosling C - Bill Gates", "A", 10, "Correct! Ada Lovelace is recognized as the first computer programmer — she created the first algorithm intended for a machine.", "Not quite. The correct answer is letter A — Ada Lovelace, the pioneer of programming concepts."),
            new RecitationQuestions("What is a programming langauge use for? A - to communicate instructions to a computer\n B - Googling stuff in the internet\n C - Typing random things in your computer ", "A", 10, "That's it you got the correct answer you will receive 10 points for your recitation", "No, sorry but the right answer is letter A"),
            new RecitationQuestions("Ok last question What is the importance of programming in developing our future?\n A - It limits technological advancement and creativity.\n B - It enables the creation of new technologies and solutions that improve our daily lives.\n C - It only helps people play computer games.\n D - It prevents automation and efficiency in industries.", "B", 10, "Yes, You got it programming have a massive impact in innovating our future from the AI, the website the mobile and other most innovation are created with the help of programming", "I'm sorry the correct answer is letter B")
        }, scan));
        System.out.println("Your total grade for your recitation are " + student.getRecitationScore());
     student.setQuizScore(prelim.quizzes(new WrittenQuestions[]{
                new WrittenQuestions("1. Which of the following is the correct way to declare a variable in Java? A) int num = 10; B) int = 10 num; C) num int = 10; D) declare int num = 10;", "A", 5),
    new WrittenQuestions("2. Which keyword is used to create a subclass in Java? A) implements B) extends C) inherits D) superclass;", "B", 5),
    new WrittenQuestions("3. What does JVM stand for? A) Java Variable Machine B) Java Virtual Mechanism C) Java Virtual Machine D) Java Version Manager;", "C", 5),
    new WrittenQuestions("4. Which of the following is NOT a Java access modifier? A) public B) private C) protected D) secured;", "D", 5),
    new WrittenQuestions("5. What will be the output of the statement: System.out.println(5 + 2 + \"7\"); A) 12 B) 57 C) 77 D) 527;", "C", 5)
        } , scan));
         System.out.println("Your total grade for your quiz are " + student.getQuizScore());
     student.setExamScore(prelim.examination(new WrittenQuestions[] {
    new WrittenQuestions("1. Which company originally developed Java? A) Microsoft B) Sun Microsystems C) IBM D) Oracle", "B", 5),
    new WrittenQuestions("2. In what year was Java first released to the public? A) 1991 B) 1995 C) 1998 D) 2001", "B", 5),
    new WrittenQuestions("3. Who is known as the father of Java programming language? A) Bill Gates B) James Gosling C) Dennis Ritchie D) Bjarne Stroustrup", "B", 5),
    new WrittenQuestions("4. What is one of the main goals behind Java's creation? A) Fast machine code execution B) Platform independence C) Hardware-level control D) Game development", "B", 5),
    new WrittenQuestions("5. What does the phrase 'Write Once, Run Anywhere' mean in Java? A) Java programs can only run on Windows B) Java needs different versions for each OS C) Java can run on any platform with JVM D) Java compiles directly to machine code", "C", 5),
    new WrittenQuestions("6. What is the importance of learning programming? A) It helps automate tasks and solve problems B) It replaces all human jobs C) It’s only for software engineers D) It has no practical use", "A", 5),
    new WrittenQuestions("7. Which of the following is the correct way to declare a variable in Java? A) int num = 10; B) int = 10 num; C) num int = 10; D) declare int num = 10;", "A", 5),
    new WrittenQuestions("8. What is the correct file extension for a Java source file? A) .jav B) .java C) .jv D) .class", "B", 5),
    new WrittenQuestions("9. Which of the following is NOT a Java data type? A) int B) float C) number D) boolean", "C", 5),
    new WrittenQuestions("10. What is the output of System.out.println(\"Hello, Java!\"); ? A) Hello, Java! B) 'Hello, Java!' C) Hello Java D) Error", "A", 5),
    new WrittenQuestions("11. What is the purpose of the main method in a Java program? A) It stores constants B) It acts as the entry point of the program C) It defines all classes D) It compiles the program", "B", 5),
    new WrittenQuestions("12. What does JVM stand for? A) Java Variable Machine B) Java Virtual Machine C) Java Version Manager D) Java Visual Model", "B", 5),
        new WrittenQuestions("13. Which of the following correctly creates a Scanner object for input? A) Scanner sc = new Scanner(System.in); B) Scanner = new Scanner; C) new Scanner(System); D) Input sc = Scanner.new();", "A", 5),
        new WrittenQuestions("14. Which symbol is used for single-line comments in Java? A) # B) // C) /* */ D) --", "B", 5),
    new WrittenQuestions("15. What will happen if you forget to include a semicolon at the end of a statement in Java? A) The program will still run B) It will throw a syntax error C) The compiler will fix it automatically D) It will ignore the statement", "B", 5)
        }, scan));
         System.out.println("Your total grade for your Examination are " + student.getExamScore());
        student.setPrelimGrade();
       System.out.println("Your total Grade for this prelim are: " + student.getPrelimGrade());
       midterm.narrate(new String[] {
        "The prelim period is now over and now it is midterm now",
        "Akhito after passing the prelim felt relief",
        "Seeing that the handful of lessons and expeirence he gained in shs in the past are worth it",
        "However tearfully thinking of how much more could he become if he is given more time to progress and learn without the need to work and learn at the same time",
        "He only uses cellphone as means to learn during his shs days and he is still starting to navigate the environment in his laptop",
        "Confusing at first he said but nevertheless he didnt let that hinder him from learning",
        "He searched online, join online communities and learn with people online or f2f to gain more additional knowledge",
        "It is hard for him to learn at first considering he is also a slow learner and can easily forget some things",
        "Nevertheless he dedicate a time to learn more about programming and how to navigate his device as well as perform small maintenance",
        "Few days passed after the examination and showing of grades and now their professor starts the day with yet another lesson",
        "While their teacher is discussing he wrote important things and test it himself to effectively know what their prof is teaching",
        "Now that their professor is done it is time again for the class to face another recitation to test if they learned something from the discussion"
       });
     student.setRecitationScore(midterm.recitation(new RecitationQuestions[] {
            new RecitationQuestions("What keyword is used in Java to make a decision based on a condition? A - if B - loop C - check", "A", 10, "Correct! The 'if' keyword allows decision-making based on a condition. You earn 10 points!", "Incorrect. The right answer is A — 'if' is used for conditional statements."),
new RecitationQuestions("Which keyword is used to provide an alternative action when the 'if' condition is false? A - or B - else C - then", "B", 10, "That's right! 'else' executes when the 'if' condition is false. You get 10 points!", "Nope. The correct answer is B — 'else' handles the false condition."),
new RecitationQuestions("What operator is used to compare two values in a conditional statement? A - = B - == C - equals", "B", 10, "Excellent! '==' is used to compare two values in Java conditionals. You earn 10 points!", "Sorry, the correct answer is B — '==' is used for comparison in conditionals."),
       }, scan));
       System.out.println("Your total grade for your recitation are " + student.getRecitationScore());
      student.setQuizScore(midterm.quizzes(new WrittenQuestions[] {
new WrittenQuestions("1. What keyword is used to start a conditional statement in Java? A) if B) else C) condition D) check", "A", 5),
new WrittenQuestions("2. Which symbol represents the 'equal to' comparison operator in Java? A) = B) == C) != D) equals", "B", 5),
new WrittenQuestions("3. What will this condition evaluate to: if (10 > 5)? A) true B) false C) error D) undefined", "A", 5),
new WrittenQuestions("4. Which keyword is used to test multiple conditions one after another? A) else B) else if C) continue D) switch", "B", 5),
new WrittenQuestions("5. What is the output of this code: if (3 < 2) { System.out.println('Yes'); } else { System.out.println('No'); } A) Yes B) No C) Error D) Nothing", "B", 5),
       }, scan));
       System.out.println("Your total grade for your quizzes are " + student.getQuizScore());
     student.setExamScore(midterm.examination(new WrittenQuestions[]{
new WrittenQuestions("1. What keyword is used in Java to start a conditional statement? A) if B) else C) switch D) check", "A", 5),
new WrittenQuestions("2. Which operator is used to compare two values for equality in Java? A) = B) == C) != D) equals", "B", 5),
new WrittenQuestions("3. Which keyword is used when you want to perform an action only if the 'if' condition is false? A) while B) else C) do D) switch", "B", 5),
new WrittenQuestions("4. What will this condition return: (10 < 5)? A) true B) false C) error D) 10 < 5", "B", 5),
new WrittenQuestions("5. Which operator represents logical AND in Java? A) & B) && C) and D) ||", "B", 5),
new WrittenQuestions("6. Which of the following correctly represents a nested conditional statement? A) if(if condition) B) if (x > 0) { if (y > 0) {...}} C) if = if D) if inside if()", "B", 5),
new WrittenQuestions("7. What will happen if the condition in an 'if' statement is false and no 'else' is provided? A) Program stops B) Nothing happens C) Error occurs D) Loop repeats", "B", 5),
new WrittenQuestions("8. What keyword allows checking another condition after an 'if' fails? A) else if B) next if C) elif D) second if", "A", 5),
new WrittenQuestions("9. What keyword is used to begin a switch statement in Java? A) case B) switch C) choose D) option", "B", 5),
new WrittenQuestions("10. What keyword defines each possible value to check inside a switch? A) case B) else C) if D) break", "A", 5),
new WrittenQuestions("11. What keyword is used to exit a case once a match is found? A) stop B) end C) break D) exit", "C", 5),
new WrittenQuestions("12. What happens if 'break' is missing in a switch case? A) The program stops B) It causes an error C) Execution continues to the next case D) It skips to default", "C", 5),
new WrittenQuestions("13. What keyword is used when none of the switch cases match the expression? A) else B) default C) otherwise D) none", "B", 5),
new WrittenQuestions("14. Which of the following data types can be used in a switch statement? A) int, char, String B) float, double C) boolean only D) arrays only", "A", 5),
new WrittenQuestions("15. What is the correct syntax to end a switch block? A) end switch; B) break; C) } D) stop;", "C", 5)
}, scan));
System.out.println("Your total grade for your examination are " +  student.getExamScore());
    student.setMidtermGrade();
    System.out.println("Your total grade for this midterm are: " + student.getMidtermGrade());
        return 2;
    }
    
}
