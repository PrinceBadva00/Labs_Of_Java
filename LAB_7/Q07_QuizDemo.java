

enum Result {
    CORRECT, WRONG, UNANSWERED
}

public class Q07_QuizDemo 
{
    public static void main(String[] args) {

        char correct[] = {'C', 'A', 'B', 'D'};
        char submitted[] = {'C', 'B', 'B', 'D'}; // change here

        int correctCount = 0, wrong = 0;

        System.out.println("Q  Sub  Corr  Result");

        for (int i = 0; i < 4; i++) {

            Result r;

            if (submitted[i] == 'X') {
                r = Result.UNANSWERED;
            } else if (submitted[i] == correct[i]) {
                r = Result.CORRECT;
                correctCount++;
            } else {
                r = Result.WRONG;
                wrong++;
            }

            System.out.println((i+1) + "   " + submitted[i] + "    " + correct[i] + "   " + r);
        }

        System.out.println("Correct: " + correctCount);
        System.out.println("Wrong: " + wrong);

        if (correctCount >= 2)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
