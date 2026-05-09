public class Main {

    public static void main(String[] args) {

        // Create Quiz object
        Quiz quiz = new Quiz();

        // Create questions and add to quiz
        quiz.addQuestion(new Question(
            "What is the size of int in Java?",
            new String[]{"8 bytes", "4 bytes", "2 bytes", "1 byte"},
            2
        ));

        quiz.addQuestion(new Question(
            "Which keyword is used for inheritance in Java?",
            new String[]{"implements", "extends", "inherits", "super"},
            2
        ));

        quiz.addQuestion(new Question(
            "What does OOP stand for?",
            new String[]{"Object Oriented Programming", 
                         "Open Oriented Programming",
                         "Object Output Programming", 
                         "None of these"},
            1
        ));

        quiz.addQuestion(new Question(
            "Which collection allows duplicate values?",
            new String[]{"Set", "Map", "ArrayList", "HashSet"},
            3
        ));

        quiz.addQuestion(new Question(
            "What is used to handle exceptions in Java?",
            new String[]{"try-catch", "if-else", "for loop", "switch"},
            1
        ));

        // Start the quiz
        quiz.startQuiz();
    }
}