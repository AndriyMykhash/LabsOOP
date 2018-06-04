package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TestsCollection {

    private ArrayList<Test> collectionTest = new ArrayList<>();

    void createTest(int numberOfQuestion) {

        for (int i = 0; i < numberOfQuestion; i++) {
            collectionTest.add(new Test());
            collectionTest.get(i).enterTitleOfTest();
            collectionTest.get(i).enterAllQuestion();
        }
    }

    boolean isEmpty(){
        return collectionTest.isEmpty();
    }

    void passTest(){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < collectionTest.size(); i++) {

            collectionTest.get(i).showTest();
            if (sc.next().compareTo(collectionTest.get(i).getTrueAnswer()) == 0)
                System.out.println("Right");
            else
                System.out.println("False. Right is "+collectionTest.get(i).getTrueAnswer());
        }
    }

    void saveTest()  {
        int i = 0;
        try {
            File statText = new File("C:\\LabaTests\\SaveTest.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);

            String answer[] = collectionTest.get(i).getAnswer();
            for (int j = 0; j<collectionTest.size();j++) {
                w.write(""+collectionTest.get(j).getTitle());
                while (collectionTest.get(j).getSize()>i) {
                    w.write("\n "+answer[i]);
                    i++;
                }
                w.write("\n> "+collectionTest.get(j).getTrueAnswer());

            }
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file SaveTest.txt");
        }

    }

    void readTest() throws IOException {
        collectionTest.add(new Test());
        String readedFile = readFile();
        String temp [];
        temp = readedFile.split("\n");

        for (int i = 0; i < temp.length;i++){
            String t = temp[i].charAt(0)+"";
            if(t.compareTo("[") != 0){
                collectionTest.get(collectionTest.size()-1).addTitle(temp[i]);
            }
            if (t.compareTo(" ") == 0){
                collectionTest.get(collectionTest.size()-1).addQuest(temp[i].substring(1));
            }

            if (t.compareTo(">") == 0){
                collectionTest.get(collectionTest.size()-1).setTrueAnswer(temp[i].substring(1));
            }

        }
    }
    private String readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader ("C:\\LabaTests\\SaveTest.txt"));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

}




