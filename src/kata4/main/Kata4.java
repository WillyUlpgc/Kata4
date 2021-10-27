

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
    public static List<Mail> mails = new ArrayList<Mail>();
    
    public static void main(String[] args) {
        execute();

    }
    
    public static void execute(){
        
        input();
        proccess();
        output();
    }
    
    public static void input(){
        String file = "email.txt";
        List<Mail> res = new ArrayList<Mail>();
        try{
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while((line=br.readLine()) != null){
                Mail lineMail = new Mail(line);
                res.add(lineMail);
            }
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    
    public static void proccess(){
        MailListReader mailReader = new MailListReader();
        String file = "email.txt";
        mails = mailReader.read(file);
    }
    
    public static void output(){
        Histogram histogram = new Histogram();
        MailHistogramBuilder histBuilder = new MailHistogramBuilder();
        histogram = histBuilder.build(mails);
        new HistogramDisplay(histogram).execute();
    }
    
}
