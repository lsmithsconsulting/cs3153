package com.company;
import java.io.PrintWriter;

public class d2lQuestion {

    public void inputMCQuestion(String q, String a1, int w1, String a2, int w2, String a3, int w3, String a4, int w4) {

    }

    public void outputQuestion(PrintWriter pw){

        pw.println("NewQuestion,MC,");
        pw.println("ID,CHEM110-237")
        pw.println("Title,This is a multiple choice question,");
        pw.println("QuestionText,This is the question text for MC1,");
        pw.println("Points,1,");
                Difficulty,1,
                Image,images/MC1.jpg,
                Option,100,This is the correct answer,,This is feedback for option 1
        Option,0,This is incorrect answer 1,,This is feedback for option 2
        Option,0,This is incorrect answer 2,,This is feedback for option 3
        Option,25,This is partially correct,,This is feedback for option 4
        Hint,This is the hint text,,,
        Feedback,This is the feedback text,,,
    }
}

