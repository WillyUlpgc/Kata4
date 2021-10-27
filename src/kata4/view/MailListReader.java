

package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;


public class MailListReader {

    public List<Mail> read(String fileName){
        List<Mail> res = new ArrayList<Mail>();

        try{
            File file = new File(fileName);
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
        }return res;
        }
    
    
}
