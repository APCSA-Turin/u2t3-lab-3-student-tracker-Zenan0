package com.example.project;

public class Student {
    // instance variables

    // first name (String)
    private String name1;
    // last name (String)
    private String name2;

    // graduation year (int)
    private int graduationYear;

    // sum of test scores (double).. should initialize at 0.0
    private double sumOfTests;
    // test score count (int) ..should initialize at 0
    private int numberOfTests = 0;
    // highest test score (double).. should initialize at 0.0
    private double highestTestScore = 0.0;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        name1 = firstName;
        name2 = lastName;
        graduationYear = gradYear;

    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return name1;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return name2;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestTestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return numberOfTests;
    }

    public int getGradYear(){
        //implement code here!
        return graduationYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        graduationYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        numberOfTests++;
        sumOfTests = sumOfTests + newTestScore;
        if (newTestScore>highestTestScore) {
            highestTestScore=newTestScore;
        }

    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        if ((sumOfTests/numberOfTests)>65) {
            return true;
        } else {
             return false;
        }
       
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return (sumOfTests/numberOfTests);
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + name1 + " " + name2);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Number of tests: " + numberOfTests);
        System.out.println("Average Test Score: " + (sumOfTests/numberOfTests));
        System.out.println("Highest Test Score: " + highestTestScore);
        System.out.println("Is passing: " + isPassing());
    }
 }
 