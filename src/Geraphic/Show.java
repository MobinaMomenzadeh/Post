package Geraphic;

import Classes.House;
import Classes.Letter;
import Classes.Person;
import Geraphic.PostAll;

import java.awt.*;
import java.awt.event.*;
import java.nio.file.Paths;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Thu Jun 30 09:36:11 IRDT 2022
 */



/**
 * @author Mobina
 */
public class Show extends JFrame {
    public Show() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PostAll x = new PostAll();
                x.setVisible(true);
            }
        });

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mobina
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        label3 = new JLabel();
        scrollPane3 = new JScrollPane();
        table3 = new JTable();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {
            String[][] personT = new String[Person.allPersons.size()][5];
            for(int i=0; i<Person.allPersons.size(); i++)
            {
                personT[i][0] = Person.allPersons.get(i).getName();
                personT[i][1] = Person.allPersons.get(i).getFamily();
                personT[i][2] = Person.allPersons.get(i).getNationalId();
                personT[i][3] = Person.allPersons.get(i).getBirthday();
                personT[i][4] = Person.allPersons.get(i).getBirthPlace();

            }

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                    personT,
                    new String[] {
                            "Name", "Family", "National code", "Birthday", "Birth palce"
                    }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, Object.class, Object.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            {
                TableColumnModel cm = table1.getColumnModel();
                cm.getColumn(0).setResizable(false);
            }
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(90, 85, 510, 105);

        //---- label1 ----
        label1.setText("Person");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(315, 30), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("House");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(315, 230), label2.getPreferredSize()));

        //======== scrollPane2 ========
        {

            String[][] houseT = new String[House.allHouses.size()][5];
            for(int i=0; i<House.allHouses.size(); i++)
            {
                houseT[i][0] = House.allHouses.get(i).getOwner_nationalId();
                houseT[i][1] = House.allHouses.get(i).getPrice();
                houseT[i][2] = House.allHouses.get(i).getPostalCode();
                houseT[i][3] = House.allHouses.get(i).getArea();
                houseT[i][4] = House.allHouses.get(i).getAddress();

            }
            scrollPane2.setFocusTraversalPolicyProvider(true);
            scrollPane2.setFocusCycleRoot(true);

            //---- table2 ----
            table2.setModel(new DefaultTableModel(
                    houseT,
                    new String[] {
                            "Owner National code ", "Price", "Postal code", "Area", "Address"
                    }
            ));
            table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            table2.setAutoCreateColumnsFromModel(false);
            table2.setUpdateSelectionOnSort(false);
            scrollPane2.setViewportView(table2);
        }
        contentPane.add(scrollPane2);
        scrollPane2.setBounds(90, 275, 510, 105);

        //---- label3 ----
        label3.setText("Letter");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
        contentPane.add(label3);
        label3.setBounds(315, 415, 80, label3.getPreferredSize().height);

        //======== scrollPane3 ========
        {
            String[][] letterT = new String[Letter.allLetters.size()][5];
            for(int i=0; i<Letter.allLetters.size(); i++)
            {
                letterT[i][0] = Letter.allLetters.get(i).getLetterText();
                letterT[i][1] = Letter.allLetters.get(i).getReceiverPC();
                letterT[i][2] = Letter.allLetters.get(i).getSenderPC();
                letterT[i][3] = String.valueOf(Letter.allLetters.get(i).getPriorityDegree());
                letterT[i][4] = Letter.allLetters.get(i).getLetterId();

            }

            table3.setModel(new DefaultTableModel(
                    letterT,
                    new String[] {
                            "Letter Text ", "Receiver PC", "Sender PC", "Priority degree", "Letter Id"
                    }
            ));



            //---- table3 ----
            table3.setUpdateSelectionOnSort(false);
            scrollPane3.setViewportView(table3);
        }
        contentPane.add(scrollPane3);
        scrollPane3.setBounds(90, 450, 510, 105);

        //---- button1 ----
        button1.setText("Parcel Post");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(290, 620), button1.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(690, 745));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mobina
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JLabel label3;
    private JScrollPane scrollPane3;
    private JTable table3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
