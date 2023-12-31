import java.util.List;

public class Main {
    public static void main(String[] args) {

        QuizElement q1 = new QuizElement("Question 1);" + "What is the capital city of Denmark ?"+ "\n Arhus " +" \n Alborg "+" \n Odense "+" \n copenhagen ","Copenhagen", List.of("Arhus"+"Alborg"+"Odense"));

        QuizElement q2 =new QuizElement("what is the oldest flag in the world "+"\n The Swedish flag"+"\n The Danish flag "+"\n The Norwegian flag ","The Danish flag",List.of("The Swedish flag"+"The Norwegian flag"+"The Danish flag"));

        Quiz quiz = new Quiz();

        quiz.addQuizElement(q1) ;
        quiz.addQuizElement(q2) ;

        quiz.playGame();

    }
}
