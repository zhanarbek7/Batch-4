package Day44;

import java.util.ArrayList;

public class Question {
    private String questionText;
    private ArrayList<String> options;
    private int correctOption;

    public Question(String questionText, ArrayList<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void displayQuestion(){
        System.out.println(questionText);
        int oN = 1;
        for (String option : options) {
            System.out.print(oN + ". ");
            oN++;
            System.out.println(option);
        }
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}
