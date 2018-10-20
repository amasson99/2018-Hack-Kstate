package model;

class Question {
    private final String questionText;
    private final String[] answers;
    private final int correctAnswer;

    Question(String questionText, int correct, String... answers) {
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswer = correct;
    }
}
