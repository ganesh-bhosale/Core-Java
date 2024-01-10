package Practise.InterviewCodes;

import javax.xml.stream.events.Characters;
import java.util.Random;

public class RandomString {
    public static void main(String [] args){

        int length = 10;
        String randomStr = generateRandomString(length);
        System.out.println("Random String : "+randomStr);
    }

    // Function to generate random String of specified length
    public static String generateRandomString(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for(int i = 0; i<length; i++){
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomString.append(randomChar);
        }
        return randomString.toString();
    }
}
