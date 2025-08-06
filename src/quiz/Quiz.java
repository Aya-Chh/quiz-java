package quiz;

import java.util.Scanner;

public class Quiz {
    Question[] questions;
    int score;

    public Quiz() {
        this.questions = new Question[] {
                new Question("Quelle est la capitale de la France ?", new String[] {"Paris", "Lyon", "Marseille", "Nice"}, 0),
                new Question("Combien de continents y a-t-il ?", new String[] {"5", "6", "7", "8"}, 2),
                new Question("Java est-il un langage compilé ?", new String[] {"Oui", "Non"}, 0)
        };
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question q : questions) {
            q.display();
            System.out.print("Votre réponse (1-4) : ");
            int answer = scanner.nextInt() - 1;

            if (q.isCorrect(answer)) {
                System.out.println("✅ Correct !\n");
                score++;
            } else {
                System.out.println("❌ Mauvaise réponse.\n");
            }
        }

        System.out.println("Fin du quiz ! Votre score est : " + score + " / " + questions.length);
    }
}

