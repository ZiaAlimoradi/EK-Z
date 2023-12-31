import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class QuizElement {
    private String question;
    private String correctAnswer;
    private List<String> wrongAnswers;

    public QuizElement(String question, String correctAnswer, List<String> wrongAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
    }

    public boolean isCorrect(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
    public String getQuestion() {
        return question;
    }


}
