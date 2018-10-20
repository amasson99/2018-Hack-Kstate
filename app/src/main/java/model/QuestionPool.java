package model;

class QuestionPool {
    private final String name;
    private final Question[] questions;

    QuestionPool(String name, Question... qs) {
        this.name = name;
        this.questions = qs;
    }
}
