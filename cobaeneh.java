
package vie;
import latihan.coba;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import latihan.main;


/**
 *
 * @author ayuma
 */
public class cobaeneh extends javax.swing.JFrame {
    DefaultComboBoxModel <String> mdl = new DefaultComboBoxModel<>();
    DefaultComboBoxModel <String> mdl1 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel <String> mdl2 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel <String> mdl3 = new DefaultComboBoxModel<>();
        
    /**
     * Creates new form cobaeneh
     */
    public cobaeneh() {
        initComponents();
//        cmerk.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgjeniskelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rblaki = new javax.swing.JRadioButton();
        rbperempuan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bprose = new javax.swing.JButton();
        ttotalharga = new javax.swing.JTextField();
        tlama = new javax.swing.JTextField();
        thargasewa = new javax.swing.JTextField();
        cmerk = new javax.swing.JComboBox<>();
        ctype = new javax.swing.JComboBox<>();
        tuangbayar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tkembali = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Id Pelanggan");

        jLabel2.setText("Nama");

        jLabel3.setText("Jenis Kelamin");

        bgjeniskelamin.add(rblaki);
        rblaki.setText("Laki-Laki");

        bgjeniskelamin.add(rbperempuan);
        rbperempuan.setText("Permpuan");

        jLabel4.setText("Merk Camera");

        jLabel5.setText("Type");

        jLabel6.setText("Harga Sewa Perhari");

        jLabel7.setText("Lama Sea");

        jLabel8.setText("Total Harga");

        jLabel9.setText("Uang Bayar");

        bprose.setText("Proses");
        bprose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bproseActionPerformed(evt);
            }
        });

        cmerk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Merk-", "1-canon", "2-sony" }));
        cmerk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmerkItemStateChanged(evt);
            }
        });
        cmerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmerkActionPerformed(evt);
            }
        });

        ctype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ctypeItemStateChanged(evt);
            }
        });
        ctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctypeActionPerformed(evt);
            }
        });

        jLabel10.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(rblaki)
                                .addGap(18, 18, 18)
                                .addComponent(rbperempuan))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cmerk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thargasewa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ctype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tkembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                                .addComponent(tuangbayar, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ttotalharga, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(tlama, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 24, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bprose)))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(cmerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addComponent(ctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rblaki)
                    .addComponent(rbperempuan)
                    .addComponent(jLabel6)
                    .addComponent(thargasewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tlama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(bprose)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tuangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //mdl.addElement("0-Pilih");
//        mdl.addElement("1-canon");
//        mdl.addElement("2-sony");
//        cmerk.setModel(mdl);
        //type camera 1
        
        //type camera 2
        
    }//GEN-LAST:event_formComponentShown

    private void cmerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmerkActionPerformed
//        for( int i>1&&i <=3){
//            
//        }
//        if(cmerk.getSelectedItem().equals("0-Pilih")){
//            mdl3.addElement("");
//            ctype.setModel(mdl3);
//        }else 
//            if(cmerk.getSelectedItem().equals("1-canon")){
//            
//            mdl1.addElement("1. Type a ");
//            mdl1.addElement("2. Type b ");
//            mdl1.addElement("3. Type c ");
//            ctype.setModel(mdl1);
//        }else if(cmerk.getSelectedItem().equals("2-sony")){
//            mdl2.addElement("1. tipe 1");
//            mdl2.addElement("2. tipe 2");
//            mdl2.addElement("3. tipe 3");
//            ctype.setModel(mdl2);
//        }
    }//GEN-LAST:event_cmerkActionPerformed

    private void cmerkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmerkItemStateChanged
         ArrayList<String> array=new ArrayList<>();
         Iterator<String> iter ;
        if(cmerk.getSelectedItem().equals("1-canon")){
            ctype.removeAllItems();
            array.add("1. Type a");
            array.add("2. Type b");
            array.add("3. Type c");
            iter=array.iterator();
            while(iter.hasNext()){
                ctype.addItem(iter.next());
            }
        }else if(cmerk.getSelectedItem().equals("2-sony")){
            ctype.removeAllItems();
            array.add("1. Type 1");
            array.add("2. Type 2");
            array.add("3. Type 3");
            iter=array.iterator();
            while(iter.hasNext()){
            ctype.addItem(iter.next());
            }
        }else if(cmerk.getSelectedItem().equals("-Pilih Merk-")){
            ctype.removeAllItems();
            
            
        }
    }//GEN-LAST:event_cmerkItemStateChanged

    private void bproseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bproseActionPerformed
//        String merk=cmerk.getSelectedItem().toString();
//            String [] pisah = merk.split("-"); //{"1", "PNS"}
//            String merek = pisah [0]; //1
//            String type = pisah [1]; //PNS
//            int merekcamera = Integer.parseInt(merek);
//            int typecamera = Integer.parseInt(type);
//            
//           coba obj = new coba();
//           obj.setPilihan(merekcamera, typecamera);
//           
//           if (merekcamera>=1&&merekcamera<=2&&typecamera>=1&&typecamera<=2){
//                    double harga=obj.infoHargaSewa();
//                    String hs=Double.toString(harga);
//                    
//                    double hari=obj.infoLamaSewa();
//                    String harisewa=Double.toString(hari);
//                    
//                    double total = obj.infoTotalHarga();
//                    String totalharga = Double.toString(total);
//                    ttotalharga.setText(totalharga);
//                    thargasewa.setText(hs);
//                    tlama.setText(harisewa);
//           }else{
//               ttotalharga.setText("");
//               thargasewa.setText("");
//               tlama.setText("");
//           }
               
               
                    
                    
           
    }//GEN-LAST:event_bproseActionPerformed

    private void ctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctypeActionPerformed
            
    
            
    }//GEN-LAST:event_ctypeActionPerformed

    private void ctypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ctypeItemStateChanged
            String merk=cmerk.getSelectedItem().toString();
            String typec=ctype.getSelectedItem().toString();
            String [] pisah = merk.split("-"); //{"1", "PNS"}
            String merek = pisah [0]; //1
            String type = pisah [1]; //PNS
            int merekcamera = Integer.parseInt(merek);
            //int typecamera = Integer.parseInt(type);
            
            
           coba obj = new coba();
           obj.setPilihan(merekcamera,Integer.parseInt(type));
          
//           if (cmerk.getSelectedItem()!=("-Pilih Merk-")){
//               
//               if(typecamera>=1&&typecamera<=3){
//                   double harga=obj.infoHargaSewa();
////                    double hari=obj.infoLamaSewa();
////                    String harisewa=Double.toString(hari);
//                    String hs=Double.toString(harga);
////                    
//                    thargasewa.setText(hs);
////               if(typecamera>=1&&typecamera<=2){
////                    
////                    
////               }
//               }
//                
//        }
    }//GEN-LAST:event_ctypeItemStateChanged

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
            java.util.logging.Logger.getLogger(cobaeneh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cobaeneh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cobaeneh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cobaeneh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cobaeneh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgjeniskelamin;
    private javax.swing.JButton bprose;
    private javax.swing.JComboBox<String> cmerk;
    private javax.swing.JComboBox<String> ctype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rblaki;
    private javax.swing.JRadioButton rbperempuan;
    private javax.swing.JTextField thargasewa;
    private javax.swing.JTextField tkembali;
    private javax.swing.JTextField tlama;
    private javax.swing.JTextField ttotalharga;
    private javax.swing.JTextField tuangbayar;
    // End of variables declaration//GEN-END:variables
}
