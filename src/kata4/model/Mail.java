

package kata4.model;


public class Mail {

    String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        String domain = "";
        String[] emailParts = this.mail.split("@");
        if(emailParts.length == 2){
            domain = emailParts[1];
        }
        return domain;
    }
}
