
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yhy
 */
public class AddVolunteer extends javax.swing.JFrame {

    /**
     * Creates new form AddVolunteer
     */
    public static boolean validateEmail(String email){
        
        int c = 0;
        
        for(int i = 0; i < email.length(); i++)
        {
            String one = email.substring(i, i+1);
            if(one.equals("@"))
            {
                c++;
            }
        }
        
        if(c==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public AddVolunteer() {
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
        s2.addItem("N/A");
        
        l1.removeAllItems();
        l1.addItem("N/A");
        l1.addItem("English");
        l1.addItem("Spanish");
        l1.addItem("Chinese");
        l1.addItem("Japanese");
        l1.addItem("Korean");
        l1.addItem("Malay");
        l1.addItem("N/A");
        
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        peer = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        marketing = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        pe = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        score = new javax.swing.JRadioButton();
        boundary = new javax.swing.JRadioButton();
        sports = new javax.swing.JRadioButton();
        venue = new javax.swing.JRadioButton();
        medical = new javax.swing.JRadioButton();
        match = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        p1 = new javax.swing.JComboBox<>();
        p2 = new javax.swing.JComboBox<>();
        s1 = new javax.swing.JComboBox<>();
        s2 = new javax.swing.JComboBox<>();
        l1 = new javax.swing.JComboBox<>();
        l2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel4.setText("Grade level");

        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Volunteer type ( you are welcome to select more than one type of volunteer ) :");

        peer.setText("Peer helper");
        peer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peerActionPerformed(evt);
            }
        });

        jLabel6.setText("If selected, please fill out speciality(ies) below");

        jLabel7.setText("ID number");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        marketing.setText("Marketing helper");
        marketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketingActionPerformed(evt);
            }
        });

        jLabel9.setText("If selected, please fill out language(s) you speak below");

        pe.setText("PE helper");
        pe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peActionPerformed(evt);
            }
        });

        jLabel11.setText("If selected, please select the section(s) that you can help below");

        buttonGroup1.add(score);
        score.setText("Score board");

        buttonGroup1.add(boundary);
        boundary.setText("Boundary line");

        buttonGroup1.add(sports);
        sports.setText("Sports equipments");

        buttonGroup1.add(venue);
        venue.setText("Venue layout");

        buttonGroup1.add(medical);
        medical.setText("Medical equipments");

        buttonGroup1.add(match);
        match.setText("Match arrangement");

        jLabel12.setText("Please select the time period(s) that you are available to be a volunteer in the table below ( maximum 2 periods )");

        jButton1.setText("Add a new volunteer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        p1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        p2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        s1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        s2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        l1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        l2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Email address");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Add new volunteer module");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grade, 0, 231, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(email))
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
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
                                        .addComponent(marketing))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(peer)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(marketing)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(match)))))
                .addGap(37, 37, 37)
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Homepage h = new Homepage();
        h.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    


    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int error = 0;
        
        
        //below is the code for completeness check
            if(name.getText().equals(""))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please input name", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            if(id.getText().equals(""))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please input ID number", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            
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
            
            
            //validity check below
            for(int i = 0; i < 10; i++)
            {
                if(name.getText().contains(i+""))
                {
                    javax.swing.JOptionPane.showMessageDialog(null, "Please do not include numbers in name", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                    error++;
                }
            }
            
            if(validateEmail(email.getText())==false)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please input a valid email address", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                error++;
            }
            
            //check id repetition
            try
            {
                FileReader r = new FileReader("Volunteer.txt");
                BufferedReader rr = new BufferedReader(r);

                String current = "";
                while ((current = rr.readLine()) != null) {
                    String[] arr = current.split(",");
                    
                    if(arr[1].equals(id.getText()))
                    {
                        javax.swing.JOptionPane.showMessageDialog(null, "ID already exist. Please create a new ID", "Message: error!", javax.swing.JOptionPane.ERROR_MESSAGE);
                        error++;
                    }
                }
            }
            catch(Exception e)
            {
                
            }
            
                
        
        
        try
        {
            
            String na = name.getText();
            int ID = Integer.parseInt(id.getText());
            String em = email.getText();
            int gr = Integer.parseInt(grade.getSelectedItem()+"");
            
            
            
            String period1 = p1.getSelectedItem()+"";
            String period2 = p2.getSelectedItem()+"";
            
            
            FileWriter vol = new FileWriter("Volunteer.txt", true);
            PrintWriter volp = new PrintWriter(vol);
            if(error == 0)
            {
                volp.println(na+","+ID+","+em+","+gr+","+period1+","+period2);
            }
            volp.close();
            
            if(peer.isSelected())
            {
                String spe1 = s1.getSelectedItem()+"";
                String spe2 = s2.getSelectedItem()+"";
                
                
                FileWriter p = new FileWriter("Peer.txt", true);
                PrintWriter pp = new PrintWriter(p);
                
                if(error == 0) pp.println(ID+","+spe1+","+spe2);
                pp.close();
            }
            if(marketing.isSelected())
            {
                String lang1 = l1.getSelectedItem()+"";
                String lang2 = l2.getSelectedItem()+"";
                
                FileWriter m = new FileWriter("Marketing.txt", true);
                PrintWriter mm = new PrintWriter(m);
                
                if(error == 0) mm.println(ID+","+lang1+","+lang2);
                mm.close();
            }
            if(pe.isSelected())
            {
                int sc = 0;
                int bo = 0;
                int sp = 0;
                int ve = 0;
                int ma = 0;
                int me = 0;
                if (score.isSelected()) sc = 1;
                if (boundary.isSelected()) bo = 1;
                if (sports.isSelected()) sp = 1;
                if (venue.isSelected()) ve = 1;
                if (match.isSelected()) ma = 1;
                if (medical.isSelected()) me = 1;
                
                FileWriter e = new FileWriter("PE.txt", true);
                PrintWriter ee = new PrintWriter(e);
                
                if(error == 0) ee.println(ID+","+sc+","+bo+","+sp+","+ve+","+ma+","+me);
                ee.close();
            }
            
            if(error == 0)
            {
               javax.swing.JOptionPane.showMessageDialog(null, "Voluteer Added!", "Message: successful!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(AddVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVolunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVolunteer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boundary;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> l1;
    private javax.swing.JComboBox<String> l2;
    private javax.swing.JCheckBox marketing;
    private javax.swing.JRadioButton match;
    private javax.swing.JRadioButton medical;
    private javax.swing.JTextField name;
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
