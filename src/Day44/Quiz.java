package Day44;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz(ArrayList<Question> questions){
        this.questions = questions;
        this.score = 0;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        int qn = 1;
        for(Question q: questions){
            System.out.print(qn + ". ");
            qn++;
            q.displayQuestion();
            System.out.print("Enter correct option: ");
            int userAnswer = scanner.nextInt();
            if(userAnswer == q.getCorrectOption()){
                System.out.println("Correct answer");
                score++;
            }
            else{
                System.out.println("Wrong answer");
            }
        }
        System.out.println("Quiz completed, Your score: "+ score + " out of "+ questions.size());
    }

}
