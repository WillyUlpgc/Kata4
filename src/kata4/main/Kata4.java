

package kata4.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;


public class Kata4 {

    public static void main(String[] args) {
        String file = "email.txt";
        MailListReader mailReader = new MailListReader();
        MailHistogramBuilder histBuilder = new MailHistogramBuilder();
        
        List<Mail> mails = new ArrayList<Mail>(mailReader.read(file));
        System.out.println(Arrays.toString(mails.toArray()));
        Histogram histogram = new Histogram();
        histogram = histBuilder.build(mails);
        new HistogramDisplay(histogram).execute();
        
        
    }
}
