public class Question {

    // These are private variables - this is ENCAPSULATION
    private String questionText;
    private String[] options;
    private int correctAnswer;

    // Constructor - sets up each question
    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Getter methods - only way to access private data
    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
