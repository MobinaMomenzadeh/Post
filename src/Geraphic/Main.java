package Geraphic;

import Classes.*;
import Geraphic.Show;

import javax.swing.*;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main
{
    public static HashMap<String, Letter> letters;
    public static HashMap<String, House> houses;
    public static HashMap<String, Person> persons;
    public static PriorityQueue<ParcelPost> parcelPosts;


    public static void main(String[] args) throws InterruptedException {



        Thread t1 = new Thread(new Runnable() {
            public void run() {
                letters = FileReaders.letterReader();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                houses = FileReaders.houseReader();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                persons = FileReaders.personReader();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();



        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Show x = new Show();
                x.setVisible(true);
            }
        });


        ParcelPost.orderPosts(letters,houses,persons);
        parcelPosts = ParcelPost.allParcelPosts;

        ;

        /*for(int i=0; i<parcelPosts.size(); i++) {
            System.out.println(parcelPosts.poll());
            if(i == parcelPosts.size())
                System.out.println(parcelPosts.peek().toString());
        }*/





    }
}
