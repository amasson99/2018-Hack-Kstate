package model;

class Quiz {
    private final Question[] questions;
    private int currentQuestion;
    private boolean failed;

    Quiz(Question... qs) {
        this.questions = qs;
        this.currentQuestion = 0;
        this.failed = false;
    }
}
