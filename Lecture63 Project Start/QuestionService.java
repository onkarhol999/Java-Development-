public class QuestionService {
    Questions[] questions = new Questions[5];

    public QuestionService() {
        questions[0] = new Questions(1, "What is the name", "o1", "o2", "o3", "o4", "ans");
        questions[1] = new Questions(2, "What is the age", "o1", "o2", "o3", "o4", "ans");
        questions[2] = new Questions(3, "What is the height", "o1", "o2", "o3", "o4", "ans");
        questions[3] = new Questions(4, "What is the weight", "o1", "o2", "o3", "o4", "ans");
        questions[4] = new Questions(5, "What is the fav color", "o1", "o2", "o3", "o4", "ans");
    }

    public void displayQuestion() {
        for (Questions q : questions) {
            System.out.println(q);
        }
    }

}
