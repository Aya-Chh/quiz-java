package quiz;

public class Question {
    String text;
    String[] choices;
    int correctIndex;

    public Question(String text, String[] choices, int correctIndex) {
        this.text = text;
        this.choices = choices;
        this.correctIndex = correctIndex;
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctIndex;
    }

    public void display() {
        System.out.println(text);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }
}
