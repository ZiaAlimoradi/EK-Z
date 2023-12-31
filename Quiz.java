import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Quiz {
    private List<QuizElement> quizElements;

    public Quiz() {
        this.quizElements = new ArrayList<>();
    }

    public void addQuizElement(QuizElement quizElement) {
        quizElements.add(quizElement);
    }

    public void askQuestion(QuizElement quizElement) {
        System.out.println(quizElement.getQuestion());
        // Logic for printing question and options to user
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        for (QuizElement element : quizElements) {
            askQuestion(element);
            String userAnswer = scanner.nextLine();
            if (element.isCorrect(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }
        scanner.close();
    }
}
