package Day44;

import java.util.ArrayList;
import java.util.List;

public class QuizGame {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();

        ArrayList<String> options1 = new ArrayList<>(List.of("City1","City2","City3","Paris"));
        Question question1 = new Question("What is the capital of France?",
                options1, 4);

        ArrayList<String> options2 = new ArrayList<>(List.of("Earth","Mars","Planet2","Planet3"));
        Question question2 = new Question("Which planet is known as the Red planet",
                options2, 2);

        questions.add(question1);
        questions.add(question2);

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
