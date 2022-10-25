package Geraphic;

import Classes.ParcelPost;
//import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
/*
 * Created by JFormDesigner on Thu Jun 30 13:10:43 IRDT 2022
 */



/**
 * @author Mobina
 */
public class PostAll extends JFrame {
    public PostAll() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mobina
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {
            ParcelPost temp;
            String[][] postT = new String[Geraphic.Main.parcelPosts.size()][10];
            for(int i=0; i<Main.parcelPosts.size(); i++)
            {
                temp = Main.parcelPosts.poll();
                postT[i][0] = String.valueOf(temp.getCargo().getPriorityDegree());
                postT[i][1] = temp.getCargo().getLetterId();
                postT[i][2] = temp.getCargo().getLetterText();
                postT[i][3] = temp.getCargo().getReceiverPC();
                postT[i][4] = temp.getCargo().getSenderPC();
                postT[i][5] = temp.getReceiverName();
                postT[i][6] = temp.getSenderName();
                postT[i][7] = temp.getReceiverAddress();
                postT[i][8] = temp.getSenderAddress();
                postT[i][9] = String.valueOf(temp.isReturned());

                if(Main.parcelPosts.size() == 1)
                {
                    i++;
                    temp = Main.parcelPosts.peek();
                    postT[i][0] = String.valueOf(temp.getCargo().getPriorityDegree());
                    postT[i][1] = temp.getCargo().getLetterId();
                    postT[i][2] = temp.getCargo().getLetterText();
                    postT[i][3] = temp.getCargo().getReceiverPC();
                    postT[i][4] = temp.getCargo().getSenderPC();
                    postT[i][5] = temp.getReceiverName();
                    postT[i][6] = temp.getSenderName();
                    postT[i][7] = temp.getReceiverAddress();
                    postT[i][8] = temp.getSenderAddress();
                    postT[i][9] = String.valueOf(temp.isReturned());
                }
            }

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
               postT,
                new String[] {
                    "Priority degree", "Letter id", "Letter text", "Receiver PC", "Sender PC", "Receiver Name", "Sender Name", "Receiver Address", "Sender Address","Returned"
                }
            ));
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(40, 25, 655, 145);

        contentPane.setPreferredSize(new Dimension(730, 355));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mobina
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
