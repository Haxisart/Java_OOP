package OOP_for_midterm;

import java.util.Arrays;

public class Student {

    // 1. Data members
    private String id;
    private String firstname;
    private String lastname;
    private int[] scores = new int[5]; // default int = 0

    // 2. Constructors
    public Student() {
        // Default constructor
    }

    public Student(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // 3. Methods

    // Getter and Setter for firstname
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Getter and Setter for lastname
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Getter and Setter for scores
    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        if (scores.length == this.scores.length) {
            this.scores = scores;
        } else {
            throw new IllegalArgumentException("Scores array must have exactly " + this.scores.length + " elements.");
        }
    }

    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Get a specific score by test number
    public int getScore(int testNumber) {
        if (testNumber >= 0 && testNumber < scores.length) {
            return scores[testNumber];
        } else {
            throw new IndexOutOfBoundsException("Test number must be between 0 and " + (scores.length - 1));
        }
    }

    // Set a specific score by test number
    public boolean setScore(int testNumber, int score) {
        if (testNumber >= 0 && testNumber < scores.length) {
            scores[testNumber] = score;
            return true;
        }
        return false;
    }

    // Calculate the total score
    public int totalScore() {
        int total = 0;
        for (int each : scores) {
            total += each;
        }
        return total;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Student ID: " + id + ", First Name: " + firstname + ", Last Name: " + lastname + ", Scores: " + Arrays.toString(scores);
    }
}
