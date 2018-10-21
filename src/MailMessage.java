/**
 * Created by Kor on 19.10.2018.
 */
public class MailMessage {
    private String from;
    private String to;
    private String endWord;

    public MailMessage(String from, String to, String endWord) {
        this.from = from;
        this.to = to;
        this.endWord = endWord;
    }



    public String getFrom(){
        return from;

    }
    public String getTo(){
        return to;
    }
    public String getContent(){
        return endWord;
    }
}
