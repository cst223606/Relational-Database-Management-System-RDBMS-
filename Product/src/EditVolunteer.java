
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yhy
 */
public class EditVolunteer extends javax.swing.JFrame {

    /**
     * Creates new form EditVolunteer
     */
    public EditVolunteer() {
        initComponents();
        
        grade.removeAllItems();
        grade.addItem("1");
        grade.addItem("2");
        grade.addItem("3");
        grade.addItem("4");
        grade.addItem("5");
        grade.addItem("6");
        grade.addItem("7");
        grade.addItem("8");
        grade.addItem("9");
        grade.addItem("10");
        grade.addItem("11");
        grade.addItem("12");
        
        p1.removeAllItems();
        p1.addItem("N/A");
        
        p1.addItem("Monday Period 1");
        p1.addItem("Monday Period 2");
        p1.addItem("Monday Period 3");
        p1.addItem("Monday Period 4");
        
        p1.addItem("Tuesday Period 1");
        p1.addItem("Tuesday Period 2");
        p1.addItem("Tuesday Period 3");
        p1.addItem("Tuesday Period 4");
        
        p1.addItem("Wednesday Period 1");
        p1.addItem("Wednesday Period 2");
        p1.addItem("Wednesday Period 3");
        p1.addItem("Wednesday Period 4");
        
        p1.addItem("Thursday Period 1");
        p1.addItem("Thursday Period 2");
        p1.addItem("Thursday Period 3");
        p1.addItem("Thursday Period 4");
        
        p1.addItem("Friday Period 1");
        p1.addItem("Friday Period 2");
        p1.addItem("Friday Period 3");
        p1.addItem("Friday Period 4");
        
        
        
        p2.removeAllItems();
        
        p2.addItem("N/A");
        
        p2.addItem("Monday Period 1");
        p2.addItem("Monday Period 2");
        p2.addItem("Monday Period 3");
        p2.addItem("Monday Period 4");
        
        p2.addItem("Tuesday Period 1");
        p2.addItem("Tuesday Period 2");
        p2.addItem("Tuesday Period 3");
        p2.addItem("Tuesday Period 4");
        
        p2.addItem("Wednesday Period 1");
        p2.addItem("Wednesday Period 2");
        p2.addItem("Wednesday Period 3");
        p2.addItem("Wednesday Period 4");
        
        p2.addItem("Thursday Period 1");
        p2.addItem("Thursday Period 2");
        p2.addItem("Thursday Period 3");
        p2.addItem("Thursday Period 4");
        
        p2.addItem("Friday Period 1");
        p2.addItem("Friday Period 2");
        p2.addItem("Friday Period 3");
        p2.addItem("Friday Period 4");
        
        
        
        
        
        
        s1.removeAllItems();
        s1.addItem("N/A");
        s1.addItem("English");
        s1.addItem("Maths");
        s1.addItem("Science");
        s1.addItem("Computer science");
        s1.addItem("Music");
        s1.addItem("Social studies");
        s1.addItem("Visual art");
        s1.addItem("PE");
        
        
        s2.removeAllItems();
        s2.addItem("N/A");
        s2.addItem("English");
        s2.addItem("Maths");
        s2.addItem("Science");
        s2.addItem("Computer science");
        s2.addItem("Music");
        s2.addItem("Social studies");
        s2.addItem("Visual art");
        s2.addItem("PE");
        
        
        
        
        l1.removeAllItems();
        l1.addItem("N/A");
        l1.addItem("English");
        l1.addItem("Spanish");
        l1.addItem("Chinese");
        l1.addItem("Japanese");
        l1.addItem("Korean");
        l1.addItem("Malay");
        
        
        l2.removeAllItems();
        l2.addItem("N/A");
        l2.addItem("English");
        l2.addItem("Spanish");
        l2.addItem("Chinese");
        l2.addItem("Japanese");
        l2.addItem("Korean");
        l2.addItem("Malay");
        
        
        
        s1.setEnabled(false);
        s2.setEnabled(false);
        s2.setEnabled(false);
        
        l1.setEnabled(false);
        l2.setEnabled(false);
        
        score.setEnabled(false);
        boundary.setEnabled(false);
        sports.setEnabled(false);
        venue.setEnabled(false);
        match.setEnabled(false);
        medical.setEnabled(false);
        
        
        id.removeAllItems();
        id.addItem("Select volunteer");
        //below is the code to get the helper's names
        try
        {
            FileReader e = new FileReader("Volunteer.txt");
            BufferedReader ee = new BufferedReader(e);
            
            String s = "";
            
            while((s=ee.readLine())!=null)
            {
                StringTokenizer tok = new StringTokenizer(s, ",");
                
                String n = tok.nextToken();
                String i = tok.nextToken();
                String em = tok.nextToken();
                String grade = tok.nextToken();
                String pr1 = tok.nextToken();
                String pr2 = tok.nextToken();
                
                
                id.addItem(n+","+i+","+em);
                
            }
            
            
            ee.close();
        }
        catch(Exception e)
        {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        score = new javax.swing.JRadioButton();
        boundary = new javax.swing.JRadioButton();
        sports = new javax.swing.JRadioButton();
        venue = new javax.swing.JRadioButton();
        medical = new javax.swing.JRadioButton();
        match = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        grade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        peer = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        marketing = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        pe = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        p1 = new javax.swing.JComboBox<>();
        p2 = new javax.swing.JComboBox<>();
        id = new javax.swing.JComboBox<>();
        s1 = new javax.swing.JComboBox<>();
        s2 = new javax.swing.JComboBox<>();
        l1 = new javax.swing.JComboBox<>();
        l2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        score.setText("Score board");

        boundary.setText("Boundary line");

        sports.setText("Sports equipments");

        venue.setText("Venue layout");

        medical.setText("Medical equipments");

        match.setText("Match arrangement");

        jLabel4.setText("Grade level");

        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Volunteer type ( you are welcome to select more than one type of volunteer ) :");

        peer.setText("Peer helper");
        peer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peerActionPerformed(evt);
            }
        });

        jLabel6.setText("If selected, please fill out the information required below");

        jLabel7.setText("Select volunteer");

        jLabel8.setText("Specialities");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        marketing.setText("Marketing helper");
        marketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketingActionPerformed(evt);
            }
        });

        jLabel9.setText("If selected, please fill out the information required below");

        jLabel12.setText("Please select the time period(s) that you are available to be a volunteer in the table below ( max 2 )");

        jButton1.setText("Save changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("language you speak");

        pe.setText("PE helper");
        pe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peActionPerformed(evt);
            }
        });

        jLabel11.setText("If selected, please select the section(s) that you can help below");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remove this volunteer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        p1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        p2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        s1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        s2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        l1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        l2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton4.setText("Read volunteer data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Edit volunteer module");

        jLabel1.setText("Click the button below to load the");

        jLabel3.setText("information of this selected volunteer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7))
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(81, 81, 81)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(score)
                            .addComponent(venue))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boundary)
                            .addComponent(match))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medical)
                            .addComponent(sports)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pe)
                            .addComponent(peer)
                            .addComponent(jLabel8)
                            .addComponent(marketing)
                            .addComponent(jLabel10))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)
                                    .addGap(53, 53, 53)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(peer)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(marketing)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pe)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(score)
                                .addComponent(boundary)
                                .addComponent(sports))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(venue)
                                .addComponent(medical)
                                .addComponent(match))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Homepage h = new Homepage();
        h.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    boolean peerS = false;
    boolean mktS = false;
    boolean peS = false;
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int error = 0;
        //below is the code for completeness check
            
            if(peer.isSelected() && (s1.getSelectedItem()+"").equals("N/A") && (s2.getSelectedItem()+"").equals("N/A") )
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please select at least 1 speciality", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            if(marketing.isSelected() && (l1.getSelectedItem()+"").equals("N/A") && (l2.getSelectedItem()+"").equals("N/A"))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please select at least 1 language", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            if(pe.isSelected() && score.isSelected()==false && boundary.isSelected()==false && sports.isSelected()==false && venue.isSelected()==false && match.isSelected()==false && medical.isSelected()==false)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please select at least 1 section", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            if( (p1.getSelectedItem()+"").equals("N/A") && (p2.getSelectedItem()+"").equals("N/A"))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please select at least 1 available period", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            //completeness check done
            
            //below is the code for repetition check
            if( (s1.getSelectedItem()+"").equals(s2.getSelectedItem()+"") && (s1.getSelectedItem()+"").equals("N/A")==false )
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please do not select repeated specialities", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            if( (l1.getSelectedItem()+"").equals(l2.getSelectedItem()+"") && (l1.getSelectedItem()+"").equals("N/A")==false )
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please do not select repeated languages", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            if( (p1.getSelectedItem()+"").equals(p2.getSelectedItem()) && (p1.getSelectedItem()+"").equals("N/A")==false )
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please do not select repeated periods", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            //repetition check done
            
             
        
        
        if (error == 0)
        {
            try {
                //below is the code for main volunteer txt
                String ID = (id.getSelectedItem() + "").split(",")[1];
                
                int gr = Integer.parseInt(grade.getSelectedItem() + "");

                String period1 = p1.getSelectedItem() + "";
                String period2 = p2.getSelectedItem() + "";

                //below is the code for accessing the volunteer txt
                ArrayList<String> r = new ArrayList<String>();

                FileReader e = new FileReader("Volunteer.txt");
                BufferedReader ee = new BufferedReader(e);

                String s = "";

                while ((s = ee.readLine()) != null) {
                    r.add(s);
                }
                //end accessing volunteer txt and arraylist r is complete
                ee.close();

                //initialize filewriter and clear txt
                FileWriter vol = new FileWriter("Volunteer.txt", false);
                PrintWriter volp = new PrintWriter(vol);

                //below to refill txt
                for (int k = 0; k < r.size(); k++) {
                    String w = r.get(k);

                    //below to divide tokens
                    StringTokenizer tok = new StringTokenizer(w, ",");

                    String name = tok.nextToken();
                    String idk = tok.nextToken();

                    String grade = tok.nextToken();
                    String pr1 = tok.nextToken();
                    String pr2 = tok.nextToken();
                    //finish dividing tokens

                    if (ID.equals(idk)) {
                        volp.println((id.getSelectedItem() + "") + "," + gr + "," + period1 + "," + period2);
                    } else {
                        volp.println(w);
                    }
                }
                //volunteer txt is refilled
                volp.close();

                //below is the code for peer txt
                String spe1 = s1.getSelectedItem() + "";
                String spe2 = s2.getSelectedItem() + "";

                //bwlow is the code for accessing the original file and putting into an arraylist
                ArrayList<String> x = new ArrayList<String>();

                FileReader z = new FileReader("Peer.txt");
                BufferedReader zz = new BufferedReader(z);

                String temp = "";

                while ((temp = zz.readLine()) != null) {
                    x.add(temp);
                }
                //finishing adding items into the arraylist
                zz.close();

                //initialize filewriter and clear txt
                FileWriter p = new FileWriter("Peer.txt", false);
                PrintWriter pp = new PrintWriter(p);

                boolean have = false;

                //below to refill txt
                for (int n = 0; n < x.size(); n++) {
                    String y = x.get(n);

                    StringTokenizer d = new StringTokenizer(y, ",");

                    String id = d.nextToken();
                    String s1 = d.nextToken();
                    String s2 = d.nextToken();

                    //if found, if is selected - refill, if not selected - do nothing
                    //if not found, if is selected - add, if not - do nothing
                    if (ID.equals(id)) {
                        have = true;
                        if (peer.isSelected()) {
                            pp.println(ID + "," + spe1 + "," + spe2);
                        } else {

                        }
                    } else {
                        pp.println(y);
                    }

                }
                if (have == false && peer.isSelected()) {
                    pp.println(ID + "," + spe1 + "," + spe2);
                }
                //txt refilled
                pp.close();

                //below is the code for mkt
                String lang1 = l1.getSelectedItem() + "";
                String lang2 = l2.getSelectedItem() + "";

                //below is the code for accessing the marketing txt and putting into an arraylist
                ArrayList<String> mkt = new ArrayList<String>();

                FileReader mark = new FileReader("Marketing.txt");
                BufferedReader mar = new BufferedReader(mark);

                String curr = "";

                while ((curr = mar.readLine()) != null) {
                    mkt.add(curr);
                }//arraylist filled
                mar.close();

                //initialize filewriter and clear txt
                FileWriter m = new FileWriter("Marketing.txt", false);
                PrintWriter mm = new PrintWriter(m);

                boolean hav = false;

                //below to refill txt
                for (int count = 0; count < mkt.size(); count++) {
                    String inf = mkt.get(count);

                    StringTokenizer tok = new StringTokenizer(inf, ",");

                    String id = tok.nextToken();
                    String lan1 = tok.nextToken();
                    String lan2 = tok.nextToken();

                    if (ID.equals(id)) {
                        hav = true;
                        if (marketing.isSelected()) {
                            mm.println(ID + "," + lang1 + "," + lang2);
                        } else {

                        }
                    } else {
                        mm.println(inf);
                    }
                }
                if (hav == false && marketing.isSelected()) {
                    mm.println(ID + "," + lang1 + "," + lang2);
                }
                //txt refilled

                mm.close();

                //below is the code for PE
                int sc = 0;
                int bo = 0;
                int sp = 0;
                int ve = 0;
                int ma = 0;
                int me = 0;
                if (score.isSelected()) {
                    sc = 1;
                }
                if (boundary.isSelected()) {
                    bo = 1;
                }
                if (sports.isSelected()) {
                    sp = 1;
                }
                if (venue.isSelected()) {
                    ve = 1;
                }
                if (match.isSelected()) {
                    ma = 1;
                }
                if (medical.isSelected()) {
                    me = 1;
                }

                //below is the code for accessing the pe txt and putting into arraylist
                ArrayList<String> pehelp = new ArrayList<String>();

                FileReader rpe = new FileReader("PE.txt");
                BufferedReader reader = new BufferedReader(rpe);

                String interim = "";

                while ((interim = reader.readLine()) != null) {
                    pehelp.add(interim);
                }//arraylist filled
                reader.close();

                //initialize filewriter and clear txt
                FileWriter q = new FileWriter("PE.txt", false);
                PrintWriter qq = new PrintWriter(q);

                boolean ha = false;

                //below to refill txt
                for (int no = 0; no < pehelp.size(); no++) {
                    String info = pehelp.get(no);

                    StringTokenizer tok = new StringTokenizer(info, ",");

                    String id = tok.nextToken();
                    String score = tok.nextToken();
                    String boundary = tok.nextToken();
                    String sports = tok.nextToken();
                    String venue = tok.nextToken();
                    String match = tok.nextToken();
                    String medical = tok.nextToken();

                    if (ID.equals(id)) {
                        ha = true;
                        if (pe.isSelected()) {
                            qq.println(ID + "," + sc + "," + bo + "," + sp + "," + ve + "," + ma + "," + me);
                        } else {

                        }
                    } else {
                        qq.println(info);
                    }
                }

                if (ha == false && pe.isSelected()) {
                    qq.println(ID + "," + sc + "," + bo + "," + sp + "," + ve + "," + ma + "," + me);
                }
                //txt refilled
                qq.close();

                javax.swing.JOptionPane.showMessageDialog(null, "Voluteer edit successful!", "Message: successful!", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            }
            catch (Exception e)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "An error occured, please restart the program.", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //remove volunteer code below
        try
        {
            int ID = Integer.parseInt( (id.getSelectedItem()+"").split(",")[1]);
            
            
            
            //delete for volunteer txt
            ArrayList<String> vol = new ArrayList<String>();
            
            FileReader readV = new FileReader("Volunteer.txt");
            BufferedReader v = new BufferedReader(readV);
            
            String emp = "";
            while((emp=v.readLine())!=null)
            {
                vol.add(emp);
            }
            v.close();
            
            FileWriter writeV = new FileWriter("Volunteer.txt", false);
            PrintWriter wv = new PrintWriter(writeV);
            
            for(int k = 0; k < vol.size(); k++)
            {
                String w = vol.get(k);
                
                //below to divide tokens
                StringTokenizer tok = new StringTokenizer(w, ",");
                
                String name = tok.nextToken();
                String id = tok.nextToken();
                
                String grade = tok.nextToken();
                String pr1 = tok.nextToken();
                String pr2 = tok.nextToken();
                //finish dividing tokens
                
                if(ID==Integer.parseInt(id))
                {
                     
                }
                else
                {
                    wv.println(w);
                }
            }
            wv.close();
            
            
            
            
            
            
            
            
            //below to delete for peer txt
            ArrayList<String> pee = new ArrayList<String>();
            
            FileReader readP = new FileReader("Peer.txt");
            BufferedReader p = new BufferedReader(readP);
            
            String empt = "";
            while((empt=p.readLine())!=null)
            {
                pee.add(empt);
            }
            p.close();
            
            FileWriter writeP = new FileWriter("Peer.txt", false);
            PrintWriter wp = new PrintWriter(writeP);
            
            for(int k = 0; k < pee.size(); k++)
            {
                String w = pee.get(k);
                
                //below to divide tokens
                StringTokenizer tok = new StringTokenizer(w, ",");
                
                String id = tok.nextToken();
                    String s1 = tok.nextToken();
                    String s2 = tok.nextToken();
                    //finish dividing tokens
                
                if(ID==Integer.parseInt(id))
                {
                     
                }
                else
                {
                    wp.println(w);
                }
            }
            wp.close();
            
            
            
            
            
            
            
            
            
            
            //below to delete for mkt txt
            ArrayList<String> mar = new ArrayList<String>();
            
            FileReader readM = new FileReader("Marketing.txt");
            BufferedReader m = new BufferedReader(readM);
            
            String empty = "";
            while((empty=m.readLine())!=null)
            {
                mar.add(empty);
            }
            m.close();
            
            FileWriter writeM = new FileWriter("Marketing.txt", false);
            PrintWriter wm = new PrintWriter(writeM);
            
            for(int k = 0; k < mar.size(); k++)
            {
                String w = mar.get(k);
                
                //below to divide tokens
                StringTokenizer tok = new StringTokenizer(w, ",");
                
                String id = tok.nextToken();
                    String lan1 = tok.nextToken();
                    String lan2 = tok.nextToken();//finish dividing tokens
                
                if(ID==Integer.parseInt(id))
                {
                     
                }
                else
                {
                    wm.println(w);
                }
            }
            wm.close();
            
            
            
            
            
            
            
            
            
            //below to delete for pe txt
            ArrayList<String> pepe = new ArrayList<String>();
            
            FileReader readPE = new FileReader("PE.txt");
            BufferedReader PE = new BufferedReader(readPE);
            
            String em = "";
            while((em=PE.readLine())!=null)
            {
                pepe.add(em);
            }
            PE.close();
            
            FileWriter writePE = new FileWriter("PE.txt", false);
            PrintWriter wPE = new PrintWriter(writePE);
            
            for(int k = 0; k < pepe.size(); k++)
            {
                String w = pepe.get(k);
                
                //below to divide tokens
                StringTokenizer tok = new StringTokenizer(w, ",");
                
                String id = tok.nextToken();
                    String score = tok.nextToken();
                    String boundary = tok.nextToken();
                    String sports = tok.nextToken();
                    String venue = tok.nextToken();
                    String match = tok.nextToken();
                    String medical = tok.nextToken();//finish dividing tokens
                
                if(ID==Integer.parseInt(id))
                {
                     
                }
                else
                {
                    wPE.println(w);
                }
            }
            wPE.close();
            
            
            
            javax.swing.JOptionPane.showMessageDialog(null, "Volunteer removed!", "Message: successful!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed

        
        
    }//GEN-LAST:event_idActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //restore all the information of that student
        
        
        String idnum = (id.getSelectedItem()+"").split(",")[1].trim();
        
        
        try
        {
            
            //below to read volunteer txt
            
            
            
            FileReader readVul = new FileReader("Volunteer.txt");
            BufferedReader rr = new BufferedReader(readVul);
            
            String temp = "";
            
            while((temp=rr.readLine())!=null)
            {
                StringTokenizer tok = new StringTokenizer(temp, ",");
                
                String na = tok.nextToken();
                int id = Integer.parseInt(tok.nextToken());
                String em = tok.nextToken();
                
                String gr = tok.nextToken();
                String pr1 = tok.nextToken();
                String pr2 = tok.nextToken();
                
                
                if((id+"").equals(idnum))
                {
                    
                    grade.setSelectedItem(gr);
                    p1.setSelectedItem(pr1);
                    p2.setSelectedItem(pr2);
                    
                    
                }
            }
            rr.close();
            
            //below to read peer helper txt
            FileReader readPeer = new FileReader("Peer.txt");
            BufferedReader buf = new BufferedReader(readPeer);
            
            String curr = "";
            int isPeer = 0;
            while((curr=buf.readLine())!=null)
            {
                StringTokenizer tok = new StringTokenizer(curr, ",");
                
                int idno = Integer.parseInt(tok.nextToken());
                String spec1 = tok.nextToken();
                String spec2 = tok.nextToken();
                
                
                if((idno+"").equals(idnum))
                {
                    isPeer = 1;
                    peer.setSelected(true);
                    s1.setEnabled(true);
                    s2.setEnabled(true);
                    peerS = true;
                    s1.setSelectedItem(spec1);
                    s2.setSelectedItem(spec2);
                    
                }
            }//finish reading peer txt
            buf.close();
            if(isPeer==0)
            {
                peer.setSelected(false);
                s1.setEnabled(false);
                s2.setEnabled(false);
                s1.setSelectedItem("N/A");
                s2.setSelectedItem("N/A");
            }
            
            
            //below to read mkt txt
            FileReader readMKT = new FileReader("Marketing.txt");
            BufferedReader m = new BufferedReader(readMKT);
            int isMKT = 0;
            String te = "";
            
            while((te=m.readLine())!=null)
            {
                StringTokenizer tok = new StringTokenizer(te, ",");
                
                int idb = Integer.parseInt(tok.nextToken());
                String lang1 = tok.nextToken();
                String lang2 = tok.nextToken();
                
                if((idb+"").equals(idnum))
                {
                    isMKT = 1;
                    marketing.setSelected(true);
                    l1.setEnabled(true);
                    l2.setEnabled(true);
                    mktS = true;
                    l1.setSelectedItem(lang1);
                    l2.setSelectedItem(lang2);
                }
            }//finish mkt txt
            m.close();
            if(isMKT==0)
            {
                marketing.setSelected(false);
                l1.setEnabled(false);
                l2.setEnabled(false);
                l1.setSelectedItem("N/A");
                l2.setSelectedItem("N/A");
            }
            
            
            //below to read pe txt
            FileReader readPE = new FileReader("PE.txt");
            BufferedReader p = new BufferedReader(readPE);
            int isPE = 0;
            String t = "";
            
            while((t=p.readLine())!=null)
            {
                StringTokenizer tok = new StringTokenizer(t, ",");
                
                int idn = Integer.parseInt(tok.nextToken());
                int sc = Integer.parseInt(tok.nextToken());
                int bo = Integer.parseInt(tok.nextToken());
                int sp = Integer.parseInt(tok.nextToken());
                int ve = Integer.parseInt(tok.nextToken());
                int ma = Integer.parseInt(tok.nextToken());
                int me = Integer.parseInt(tok.nextToken());
                
                if((idn+"").equals(idnum))
                {
                    isPE = 1;
                    pe.setSelected(true);
                    score.setEnabled(true);
                    boundary.setEnabled(true);
                    sports.setEnabled(true);
                    venue.setEnabled(true);
                    match.setEnabled(true);
                    medical.setEnabled(true);
                    
                    peS=true;
                    
                    if(sc==1) score.setSelected(true); else score.setSelected(false);
                    if(bo==1) boundary.setSelected(true); else boundary.setSelected(false);
                    if(sp==1) sports.setSelected(true); else sports.setSelected(false);
                    if(ve==1) venue.setSelected(true); else venue.setSelected(false);
                    if(ma==1) match.setSelected(true); else match.setSelected(false);
                    if(me==1) medical.setSelected(true); else medical.setSelected(false);
                }
                
                
            }//finish pe txt
            p.close();
            if(isPE==0)
            {
                pe.setSelected(false);
                score.setEnabled(false);
                boundary.setEnabled(false);
                sports.setEnabled(false);
                venue.setEnabled(false);
                match.setEnabled(false);
                medical.setEnabled(false);

                score.setSelected(false);
                boundary.setSelected(false);
                sports.setSelected(false);
                venue.setSelected(false);
                match.setSelected(false);
                medical.setSelected(false);
            }
        }
        catch(Exception e)
        {
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void peerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peerActionPerformed

        if (peer.isSelected())
        {
            s1.setEnabled(true);
            s2.setEnabled(true);
            
        }
        else
        {
            s1.setEnabled(false);
            s2.setEnabled(false);
            
            s1.setSelectedItem("N/A");
            s2.setSelectedItem("N/A");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_peerActionPerformed

    private void marketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketingActionPerformed

        if(marketing.isSelected())
        {
            l1.setEnabled(true);
            l2.setEnabled(true);
        }
        else
        {
            l1.setEnabled(false);
            l2.setEnabled(false);
            
            l1.setSelectedItem("N/A");
            l2.setSelectedItem("N/A");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_marketingActionPerformed

    private void peActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peActionPerformed

        if(pe.isSelected())
        {
            score.setEnabled(true);
            boundary.setEnabled(true);
            sports.setEnabled(true);
            venue.setEnabled(true);
            match.setEnabled(true);
            medical.setEnabled(true);
        }
        else
        {
            score.setEnabled(false);
            boundary.setEnabled(false);
            sports.setEnabled(false);
            venue.setEnabled(false);
            match.setEnabled(false);
            medical.setEnabled(false);
            
            score.setSelected(false);
            boundary.setSelected(false);
            sports.setSelected(false);
            venue.setSelected(false);
            match.setSelected(false);
            medical.setSelected(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_peActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditVolunteer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boundary;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> l1;
    private javax.swing.JComboBox<String> l2;
    private javax.swing.JCheckBox marketing;
    private javax.swing.JRadioButton match;
    private javax.swing.JRadioButton medical;
    private javax.swing.JComboBox<String> p1;
    private javax.swing.JComboBox<String> p2;
    private javax.swing.JCheckBox pe;
    private javax.swing.JCheckBox peer;
    private javax.swing.JComboBox<String> s1;
    private javax.swing.JComboBox<String> s2;
    private javax.swing.JRadioButton score;
    private javax.swing.JRadioButton sports;
    private javax.swing.JRadioButton venue;
    // End of variables declaration//GEN-END:variables
}
