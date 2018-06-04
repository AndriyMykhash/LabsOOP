package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private int trueAnswer;
    private String title = null;
    private ArrayList<String> question = new ArrayList<>();


    public void enterTitleOfTest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of question: ");
        title = sc.nextLine();
    }

    protected void addTitle(String t){
        this.title = t;
    }
    protected void addQuest(String q){
        question.add(q);
    }

    void setTrueAnswer(String trueAnswe){
        if (question.contains(trueAnswe)){
            trueAnswer = question.indexOf(trueAnswe);
        }else
            System.out.println("Error");
    }

    public void enterAllQuestion() {
        String temp = "";
        Scanner sc = new Scanner(System.in);
        System.out.print(" >: ");
        while (!(((temp = sc.next()).compareTo("exit")) == 0)){
            System.out.print(" >: ");
            question.add(temp);
        }
        System.out.print("Enter rigth answer: ");
        if (question.contains((temp = sc.next()))){
            trueAnswer = question.indexOf(temp);
        }else
            System.out.println("Error");
    }

    public void showTest() {
        System.out.println(title);
        for (int i = 0; i< question.size(); i++)
        System.out.println("   " + question.get(i));
    }

    public String getTrueAnswer() {

        return question.get(trueAnswer);
    }

    protected String [] getAnswer(){
        return question.toArray(new String[question.size()]);
    }

    protected int getSize(){
        return  question.size();
    }

    protected String getTitle(){
        return  title;
    }
}
