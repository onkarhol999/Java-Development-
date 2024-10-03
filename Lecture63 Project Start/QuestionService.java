import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Questions(1, "What is the name", "o1", "o2", "o3", "o4", "ans");
        questions[1] = new Questions(2, "What is the age", "o1", "o2", "o3", "o4", "ans");
        questions[2] = new Questions(3, "What is the height", "o1", "o2", "o3", "o4", "ans");
        questions[3] = new Questions(4, "What is the weight", "o1", "o2", "o3", "o4", "ans");
        questions[4] = new Questions(5, "What is the fav color", "o1", "o2", "o3", "o4", "ans");
    }

    public void playQuiz() {
        int i = 0;
        for (Questions q : questions) {
            if (i == 4) {
                System.out.println("Last Question");
            }
            System.out.println("Question no . " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

        System.out.println("Result");
        // for (String str : selection) {
        // System.out.println(str);
        // }
        int j = 0;
        for (Questions a : questions) {
            String ans = a.getAns();
            if (ans.equals(selection[j])) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
            }
            j++;
        }
    }

}
