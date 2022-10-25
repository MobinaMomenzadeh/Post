package Classes;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ParcelPost implements Comparable<ParcelPost>
{
    public static PriorityQueue<ParcelPost> allParcelPosts = new PriorityQueue<ParcelPost>(Letter.getAllLetters().size(), ParcelPost::compareTo);
    private Letter cargo;
    private String senderName;
    private String receiverName;
    private String senderPC;
    private String receiverPC;
    private String senderAddress;
    private String receiverAddress;
    private boolean returned;


    public ParcelPost(Letter cargo, String senderName, String receiverName,
                      String senderPC, String receiverPC, String senderAddress, String receiverAddress, boolean returned) {
        this.cargo = cargo;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.senderPC = senderPC;
        this.receiverPC = receiverPC;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.returned = returned;

        allParcelPosts.add(this);
    }

    public Letter getCargo() {return cargo;}
    public String getSenderName() {return senderName;}
    public String getReceiverName() {return receiverName;}
    public String getSenderPC() {return senderPC;}
    public String getReceiverPC() {return receiverPC;}
    public String getSenderAddress() {return senderAddress;}
    public String getReceiverAddress() {return receiverAddress;}
    public boolean isReturned() {return returned;}



    @Override
    public String toString() {
        return "Classes.ParcelPost{" +
                "cargo=" + cargo +
                ", senderName='" + senderName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", senderPC='" + senderPC + '\'' +
                ", receiverPC='" + receiverPC + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", returned=" + returned +
                '}';
    }


    @Override
    public int compareTo(ParcelPost o) {
        if(this.cargo.getPriorityDegree() < o.cargo.getPriorityDegree())
            return 1;
        else
            return -1;
    }

    public static void orderPosts (HashMap<String,Letter> letters, HashMap<String,House> houses, HashMap<String, Person> persons)
    {
        Letter cargo ;
        String senderName = null;
        String receiverName = null;
        String senderPC;
        String receiverPC;
        String senderAddress = null;
        String receiverAddress = null;
        boolean returned;

        String senderId = null;
        String receiverId = null;



        for(String i : Letter.allLettersId)
        {
            cargo = letters.get(i);
            senderPC = letters.get(i).getSenderPC();
            receiverPC = letters.get(i).getReceiverPC();

           // for(int j=0; j<houses.size(); j++)
            for(String j : House.allHousesKey)
                if(j.equals(senderPC))
                {
                    senderAddress = houses.get(j).getAddress();
                    senderId = houses.get(j).getOwner_nationalId();
                }


            for(String j : House.allHousesKey)
                if(j.equals(receiverPC))
                {
                    receiverAddress = houses.get(j).getAddress();
                    receiverId = houses.get(j).getOwner_nationalId();
                }

            for(String j : Person.allPersonsKey)
                if(j.equals(senderId))
                    senderName = persons.get(j).getName();

            for(String j : Person.allPersonsKey)
                if(j.equals(receiverId))
                    receiverName = persons.get(j).getName();


            if(receiverAddress != null)
                new ParcelPost(cargo,senderName,receiverName,senderPC,receiverPC,senderAddress,receiverAddress,false);
            else
                new ParcelPost(cargo,senderName,receiverName,senderPC,receiverPC,senderAddress,receiverAddress,true);
        }
    }
}
