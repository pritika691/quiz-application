import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    // ArrayList to store all questions - this is Collections Framework
    private ArrayList<Question> questions;
    private int score;

    // Constructor
    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    // Add a question to the list
    public void addQuestion(Question q) {
        questions.add(q);
    }

    // Run the quiz
    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            System.out.println("\nQ" + (i + 1) + ": " + q.getQuestionText());

            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Your answer (1-4): ");

            // Exception Handling for wrong input
            try {
                int answer = scanner.nextInt();
                if (answer == q.getCorrectAnswer()) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer was: " 
                        + q.getCorrectAnswer());
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Skipping question.");
                scanner.next();
            }
        }

        System.out.println("\n===== QUIZ COMPLETE =====");
        System.out.println("Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}