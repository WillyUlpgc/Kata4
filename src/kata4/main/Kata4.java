

package kata4.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;


public class Kata4 {
    public List<Mail> mails = new ArrayList<Mail>();
    Histogram histogram = new Histogram();
    
    public static void main(String[] args) {
        Kata4 exec = new Kata4();
        exec.execute();

    }
    
    public void execute(){
        
        input();
        proccess();
        output();
    }
    
    public void input(){
        MailListReader mailReader = new MailListReader();
        String file = "email.txt";
        mails = mailReader.read(file);
        }
    
    public void proccess(){
        
        MailHistogramBuilder histBuilder = new MailHistogramBuilder();
        histogram = histBuilder.build(mails);
    }
    
    public void output(){
        new HistogramDisplay(histogram).execute();
    }
    
}
