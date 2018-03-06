package com.email.broadcaster;

public class SendMailSSL {
    public static void main(String[] args) {
        //from,password,to,subject,message
        try {
            Mailer.send("bilal.hobnail@gmail.com", "xyz", "ramish.fatima@mobilelive.ca", "hello from neighbour", "How r u? i hope you are ok");
            //change from, password and to
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
