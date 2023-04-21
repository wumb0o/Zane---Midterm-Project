import java.util.Scanner;
public class Quiz {
    static int correctAns = 0;
    static int passReq = 3;
    static int perfScore = 5;
    static int numDigits = String.valueOf(1).length();
    public static void main(String[] args) {
        QuOne();
        QuTwo();
        QuThree();
        QuFour();
        QuFive();
        score();
    }
    public static void QuOne() {          //Question One
        Scanner in = new Scanner(System.in);
        System.out.println("Are apples red?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("3. Sometimes");
        System.out.println("4. They're orange");
    
    int answer = 0;  
    int ndAnswer = String.valueOf(answer).length();
    do {
        System.out.println("Please enter 1, 2, 3, or 4.");

        while (!in.hasNextInt()) {
            System.out.println("Please enter 1, 2, 3, or 4.");
            in.next();
        }
        answer = in.nextInt();
    } while  (answer > 4 || answer < 1);
    System.out.println("You entered " + answer + ".");
    if (answer == 3) {
        correctAns ++;
        return;
    }
    else {
        return;
        }
    }

    public static void QuTwo() {          //Question Two
        Scanner in = new Scanner(System.in);
        System.out.println("What's the weather?");
        System.out.println("1. Weather is made from the government");
        System.out.println("2. I am the weather.");
        System.out.println("3. It's raining");
        System.out.println("4. There's some sun");
    
    int answer = 0;  
    int ndAnswer = String.valueOf(answer).length();
    do {
        System.out.println("Please enter 1, 2, 3, or 4.");

        while (!in.hasNextInt()) {
            System.out.println("Please enter 1, 2, 3, or 4.");
            in.next();
        }
        answer = in.nextInt();
    } while  (answer > 4 || answer < 1);
    System.out.println("You entered " + answer + ".");
    if (answer == 1) {
        correctAns ++;
        return;
    }
    else {
        return;
        }
    }

public static void QuThree() {          //Question Three
        Scanner in = new Scanner(System.in);
        System.out.println("What is 5 + 7?");
        System.out.println("1. The amount I owe the IRS");
        System.out.println("2. 12");
        System.out.println("3. 11.99 repeating");
        System.out.println("4. math is fake");
    
    int answer = 0;  
    int ndAnswer = String.valueOf(answer).length();
    do {
        System.out.println("Please enter 1, 2, 3, or 4.");

        while (!in.hasNextInt()) {
            System.out.println("Please enter 1, 2, 3, or 4.");
            in.next();
        }
        answer = in.nextInt();
    } while  (answer > 4 || answer < 1);
    System.out.println("You entered " + answer + ".");
    if (answer == 2) {
        correctAns ++;
        return;
    }
    else {
        return;
        }
    }

    public static void QuFour() {          //Question Four
        Scanner in = new Scanner(System.in);
        System.out.println("How many fingers does the average human have?");
        System.out.println("1. <10");
        System.out.println("2. 10>");
        System.out.println("3. 10");
        System.out.println("4. fingers aren't real");
    
    int answer = 0;  
    int ndAnswer = String.valueOf(answer).length();
    do {
        System.out.println("Please enter 1, 2, 3, or 4.");

        while (!in.hasNextInt()) {
            System.out.println("Please enter 1, 2, 3, or 4.");
            in.next();
        }
        answer = in.nextInt();
    } while  (answer > 4 || answer < 1);
    System.out.println("You entered " + answer + ".");
    if (answer == 1) {
        correctAns ++;
        return;
    }
    else {
        return;
        }
    }

    public static void QuFive() {          //Question Five
        Scanner in = new Scanner(System.in);
        System.out.println("What flavor is the sun?");
        System.out.println("1. 1 billion lions");
        System.out.println("2. Chicken Nuggets");
        System.out.println("3. Sweet and sour");
        System.out.println("4. Spicy Peach");
    
    int answer = 0;  
    int ndAnswer = String.valueOf(answer).length();
    do {
        System.out.println("Please enter 1, 2, 3, or 4.");

        while (!in.hasNextInt()) {
            System.out.println("Please enter 1, 2, 3, or 4.");
            in.next();
        }
        answer = in.nextInt();
    } while  (answer > 4 || answer < 1);
    System.out.println("You entered " + answer + ".");
    if (answer == 4) {
        correctAns ++;
        return;
    }
    else {
        return;
        }
    }

    public static void score() {
        if (correctAns == perfScore) {
            System.out.println("You were perfect. Your score: " + correctAns + "/" + perfScore);
        }
        else if (correctAns >= passReq) {
            System.out.println("You did okay. Your score: " + correctAns + "/" + perfScore);
        }
        else {
            System.out.println("You failed the quiz. Your score: " + correctAns + "/" + perfScore);
            System.out.println("Score a 3/5 to pass.");
        }
    }
}