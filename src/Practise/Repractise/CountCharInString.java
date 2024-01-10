package Practise.Repractise;

public class CountCharInString {

    public static void main(String [] args){
        String acc = "Let there be a change";

        char [] ch = acc.toCharArray();

        for(int i=0; i<ch.length; i++){
            int count = 0;
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    // System.out.print(ch[i]+" ");
                    count++;
                }
            }
            if(count >0){
                System.out.println(ch[i]+ " - "+count);
            }
        }
    }
}
