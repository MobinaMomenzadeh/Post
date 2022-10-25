package Classes;

import java.util.ArrayList;

public class Letter extends Data
{

    public static ArrayList<Letter> allLetters = new ArrayList<Letter>();
    public static ArrayList<String> allLettersId = new ArrayList<String>();
    private String letterText;
    private String receiverPC;//PC: postal code
    private String senderPC;
    private int priorityDegree;
    private String letterId;

    public Letter(String letterText, String receiverPC, String senderPC, int priorityDegree, String letterId) {
        this.letterText = letterText;
        this.receiverPC = receiverPC;
        this.senderPC = senderPC;
        this.priorityDegree = priorityDegree;
        this.letterId = letterId;
        this.key = letterId;

        allLetters.add(this);
        allLettersId.add(letterId);
    }

    public static ArrayList<Letter> getAllLetters() {return allLetters;}
    public String getLetterText() {return letterText;}
    public String getReceiverPC() {return receiverPC;}
    public String getSenderPC() {return senderPC;}
    public int getPriorityDegree() {return priorityDegree;}
    public String getLetterId() {return letterId;}
    public String getKey(){return (String) key;}


    @Override
    public String toString() {
        return "Classes.Letter{" +
                "letterText='" + letterText + '\'' +
                ", receiverPC='" + receiverPC + '\'' +
                ", senderPC='" + senderPC + '\'' +
                ", priorityDegree=" + priorityDegree +
                ", letterId='" + letterId + '\'' +
                '}';
    }

}

