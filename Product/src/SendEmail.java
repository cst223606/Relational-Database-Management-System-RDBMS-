
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yhy
 */
public class SendEmail {
    
    public static void sendingEmail(String toApplicant, String toVolunteer, String subject, String content)
    {
        final String username = "yhyang23@iskl.edu.my";
        final String password = "odkbgnoiwcguziyc";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("yhyang23@iskl.edu.my"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toApplicant)
            );
            message.setRecipients(
                    Message.RecipientType.CC,
                    InternetAddress.parse(toVolunteer)
            );
            message.setSubject(subject);
            message.setText(content);

            javax.mail.Transport.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    
    
    
    
    
    
    
    
    public static void sendSingle(String to, String subject, String content)
    {
        final String username = "yhyang23@iskl.edu.my";
        final String password = "odkbgnoiwcguziyc";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("yhyang23@iskl.edu.my"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to)
            );
            message.setSubject(subject);
            message.setText(content);

            javax.mail.Transport.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
}
