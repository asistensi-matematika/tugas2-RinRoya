/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ridho_Tugas2;
import java.awt.Toolkit; // library untuk icon
import javax.swing.JOptionPane; // library untuk pemberitahuan
/**
 *
 * @author Windows
 */
public class Ridho_Nur_Rohman_Wijaya_TUGAS2 extends javax.swing.JFrame {

    /**
     * Creates new form Ridho_Nur_Rohman_Wijaya_TUGAS2
     */
    public Ridho_Nur_Rohman_Wijaya_TUGAS2() {
        setIcon(); // Memanggil method untuk mengganti jFrame menjadi icon (ITS)
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        soal = new javax.swing.JComboBox();
        tampilansoal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Inputa = new javax.swing.JTextField();
        Inputn = new javax.swing.JTextField();
        Inputx = new javax.swing.JTextField();
        Hasil = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        syarat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 0, 204)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Masukkan nilai a");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 130, 150, 30);

        soal.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        soal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Soal", "Soal 3", "Soal 4", "Soal 5" }));
        soal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soalActionPerformed(evt);
            }
        });
        jPanel1.add(soal);
        soal.setBounds(40, 80, 370, 40);

        tampilansoal.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        tampilansoal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tampilansoal);
        tampilansoal.setBounds(480, 80, 310, 160);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("Masukkan nilai n");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 170, 150, 30);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Masukkan nilai x");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 210, 150, 30);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("Nilai  F(x)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 300, 150, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TUGAS 2 ASISTENSI ALPRO");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(14, 10, 450, 60);
        jPanel1.add(Inputa);
        Inputa.setBounds(210, 130, 200, 30);
        jPanel1.add(Inputn);
        Inputn.setBounds(210, 170, 200, 30);

        Inputx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputxActionPerformed(evt);
            }
        });
        jPanel1.add(Inputx);
        Inputx.setBounds(210, 210, 200, 30);

        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });
        jPanel1.add(Hasil);
        Hasil.setBounds(210, 300, 200, 30);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 300, 90, 30);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(580, 300, 110, 30);

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(700, 300, 90, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Keterangan:\n- Nilai f(x) adalah nilai pendekatan dengan menggunakan deret Taylor dengan n angka penting.\n- Nilai x yang dimasukkan harus disekitar a, agar nilai semakin akurat.\n- |x-a| < R , R adalah jari - jari konvergensi.\n- Nilai a, n, x yang dimasukkan harus berupa angka. \n  Jika menyatakan angka desimal, gunakan tanda \".\" bukan \",\".");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 340, 790, 120);

        syarat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        syarat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(syarat);
        syarat.setBounds(480, 250, 310, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("by Rin Roya");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(730, 20, 80, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Downloads\\cropped-1366-768-776937.png")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(14, 10, 800, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void soalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soalActionPerformed
        // TODO add your handling code here:
        // Melakukan program sesuai kondisi soal
        switch(soal.getSelectedIndex()){
            case 1: // Soal nomor 3
                // Mengosongkan tampilan
                Inputa.setText(null);
                Inputn.setText(null);
                Inputx.setText(null);
                Hasil.setText(null);
                // Menampilkan soal dan syaratnya
                tampilansoal.setText("f(x) = cosh(-6x)");
                syarat.setText("Syarat: a bil real, n bil bulat positif, x bil real");
                break;
            case 2: // Soal nomor 4
                // Mengosongkan tampilan
                Inputa.setText(null);
                Inputn.setText(null);
                Inputx.setText(null);
                Hasil.setText(null);
                // Menampilkan soal dan syaratnya
                tampilansoal.setText("f(x) = ln(-x)");
                syarat.setText("Syarat: a <0, n bilangan bulat positif, x <0");
                break;
            case 3: // Soal nomor 5
                // Mengosongkan tampilan
                Inputa.setText(null);
                Inputn.setText(null);
                Inputx.setText(null);
                Hasil.setText(null);
                // Menampilkan soal dan syaratnya
                tampilansoal.setText("f(x) = x / (1-x)");
                syarat.setText("Syarat: -1 < a < 1, n bil bulat positif, -1 < x < 1 ");
                break;
            default:
                // Mengosongkan tampilan
                Inputa.setText(null);
                Inputn.setText(null);
                Inputx.setText(null);
                Hasil.setText(null);
                tampilansoal.setText(null);
                syarat.setText(null);
        }
    }//GEN-LAST:event_soalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Deklarasi variabel dengan mengcasting inputan yang telah dimasukkan
        double a = Double.parseDouble(Inputa.getText());
        double n = Double.parseDouble(Inputn.getText());
        double x = Double.parseDouble(Inputx.getText());
        // Melakukan penyelesaian soal dengan program sesuai kondisi soal
        switch(soal.getSelectedIndex()){
            case 1: // Soal nomor 3
                if(n>=0){ // Jika input yang dimasukkan benar
                    // Menampilkan hasil perhitungan yang dihitung melalui method yang sesuai
                    Hasil.setText(String.valueOf(PerhitunganSoal3(a,n,x)));
                }else{  // Jika input yang dimasukkan salah
                    // Menampilkan pemberitahuan jika input yang dimasukkan salah
                    JOptionPane.showMessageDialog(null, "Input yang dimasukkan salah\n"+"Nilai n harus bilangan bulat positif");
                }
                break;
            case 2: // Soal nomor 4
                if(a<0 && x<0 && n>=0){ // Jika input yang dimasukkan benar
                    // Menampilkan hasil perhitungan yang dihitung melalui method yang sesuai
                    Hasil.setText(String.valueOf(PerhitunganSoal4(a,n,x)));
                }else{ // Jika input yang dimasukkan salah
                    // Menampilkan pemberitahuan jika input yang dimasukkan salah
                    JOptionPane.showMessageDialog(null, "Input yang dimasukkan salah\n"+"Nilai a dan x harus kurang dari 0\n"+"dan n harus bilangan bulat positif");
                }
                break;
            case 3: // Soal nomor 5
                if(a>-1 && a<1 && x>-1 && x<1 && n>=0){ // Jika input yang dimasukkan benar
                    // Menampilkan hasil perhitungan yang dihitung melalui method yang sesuai
                    Hasil.setText(String.valueOf(PerhitunganSoal5(a,n,x)));
                }else{ // Jika input yang dimasukkan salah
                    // Menampilkan pemberitahuan jika input yang dimasukkan salah
                    JOptionPane.showMessageDialog(null, "Input yang dimasukkan salah\n"+"Nilai a dan x harus lebih dari -1 dan kurang dari 1\n"+"dan n harus bilangan bulat positif");
                }
                break;
            default:
                // Menampilkan pemberitahuan jika harus memasukkan soal
                JOptionPane.showMessageDialog(null, "Masukkan Soal");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Mengosongkan tampilan setelah direset
        Inputa.setText(null);
        Inputn.setText(null);
        Inputx.setText(null);
        Hasil.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Keluar dari persoalan
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void InputxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputxActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilActionPerformed

    // Method untuk menyelesaikan soal nomor 3
    public static double PerhitunganSoal3(double a, double n, double x) { 
        // Deklarasi variabel
        double[] f = new double[100001]; // Menggunakan array untuk menyatakan nilai deret setiap suku yang ada
        double Fungsi=0; // Nilai penampung untuk mendapatkan nilai akhir fungsi yang dihitung dengan menggunakan aproksimasi deret Taylor
        // Menghitung suku pertama
        f[0] = (Math.exp(6*a)+Math.exp(-6*a))/2;
        // Menghitung nilai toleransi dengan n angka penting
        double es = 0.5 * Math.pow(10, 2-n);
        // Looping untuk mendapatkan nilai fungsi dan nilai deret setiap sukunya  
        for(int i=1; i<=100000; i++){
            // Untuk deret Maclaurin (a=0) harus dikhususkan karena pada soal ini di a=0 akan terjadi kesalahan perhitungan jika a dimasukkan ke deret Taylor
            if(a==0){
                // Perhitungan dengan deret Maclaurin
                f[i]=f[i-1] + Math.pow(6*x,2*i)/faktorial(2*i);
            }else{
                // Perhitungan dengan deret Taylor
                f[i]=f[i-1] + (( Math.exp(6*a) + Math.pow(-1,i)*Math.exp(-6*a))*(Math.pow(6,i)*Math.pow(x-a,i)))/(2*(faktorial(i)));
            }
            // Perhitungan nilai error dari perhitungan aproksimasi nilai fungsi
            double ea = ((f[i]-f[i-1])/f[i])*100;
            // Jika nilai error sudah kurang dari toleransi, maka looping berhenti
            if(Math.abs(ea)<es){
                // Nilai akhir dari aproksimasi nilai fungsi dengan deret Taylor
                Fungsi += f[i];
            break;
            }
        }
        // Pembulatan menjadi 5 digit dibelakang koma
        double Output = Math.floor(Fungsi*100000)/100000;
        return Output;
    }
    
    // Method untuk menyelesaikan soal nomor 4
    public static double PerhitunganSoal4(double a, double n, double x) {
        // Deklarasi variabel
        double[] f = new double[100001]; // Menggunakan array untuk menyatakan nilai deret setiap suku yang ada
        double Fungsi=0; // Nilai penampung untuk mendapatkan nilai akhir fungsi yang dihitung dengan menggunakan aproksimasi deret Taylor
        // Menghitung suku pertama
        f[0] = Math.log(-a);
        // Menghitung nilai toleransi dengan n angka penting
        double es = 0.5 * Math.pow(10, 2-n);
        // Looping untuk mendapatkan nilai fungsi dan nilai deret setiap sukunya
        for(int i=1; i<=100000; i++){
            // Perhitungan dengan deret Taylor
            f[i]=f[i-1] + (Math.pow(-1,i+1)*Math.pow(x-a, i))/(i*Math.pow(a,i));
            // Perhitungan nilai error dari perhitungan aproksimasi nilai fungsi
            double ea = ((f[i]-f[i-1])/f[i])*100;
            // Jika nilai error sudah kurang dari toleransi, maka looping berhenti
            if(Math.abs(ea)<es){
                // Nilai akhir dari aproksimasi nilai fungsi dengan deret Taylor
                Fungsi += f[i];
                break;
            }
        }
        // Pembulatan menjadi 5 digit dibelakang koma
        double Output = Math.floor(Fungsi*100000)/100000;
        return Output;
    }
    
    // Method untuk menyelesaikan soal nomor 5
    public static double PerhitunganSoal5(double a, double n, double x) {
        // Deklarasi variabel
        double[] f = new double[100001]; // Menggunakan array untuk menyatakan nilai deret setiap suku yang ada
        double Fungsi=0; // Nilai penampung untuk mendapatkan nilai akhir fungsi yang dihitung dengan menggunakan aproksimasi deret Taylor
        // Menghitung suku pertama
        f[0] = a/(1-a);
        // Menghitung nilai toleransi dengan n angka penting
        double es = 0.5 * Math.pow(10, 2-n);
        // Looping untuk mendapatkan nilai fungsi dan nilai deret setiap sukunya
        for(int i=1; i<=100000; i++){
            // Perhitungan dengan deret Taylor
            f[i]=f[i-1]+deret(x, a, i); // Deret menggunakan method
            // Perhitungan nilai error dari perhitungan aproksimasi nilai fungsi
            double ea = ((f[i]-f[i-1])/f[i])*100;
            // Jika nilai error sudah kurang dari toleransi, maka looping berhenti
            if(Math.abs(ea)<es){
                // Nilai akhir dari aproksimasi nilai fungsi dengan deret Taylor
                Fungsi += f[i];
                break;
            }
        }
        // Pembulatan menjadi 5 digit dibelakang koma
        double Output = Math.floor(Fungsi*100000)/100000;
        return Output;
    }
    
    // Method untuk mendapatkan nilai faktorial
    public static double faktorial(int angka) {
        if(angka==1 || angka==0){
            return 1;
        }else{
            return angka*faktorial(angka-1);
        }
    }
    
    // Method untuk mendapatkan deret Taylor pada soal nomor 5
    public static double deret(double x, double a, int suku) {
        // Deklarasi variabel
        double hasil = 1/(1-a);
        // Looping untuk mendapatkan nilai deret setiap sukunya
        for(int i=1; i<=suku; i++){
            hasil *=(x-a)/(1-a); 
        }
        return hasil;
    }
    
    // Method untuk mengganti jFrame menjadi icon (ITS)
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("its.png")));
    }
    
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
            java.util.logging.Logger.getLogger(Ridho_Nur_Rohman_Wijaya_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ridho_Nur_Rohman_Wijaya_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ridho_Nur_Rohman_Wijaya_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ridho_Nur_Rohman_Wijaya_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ridho_Nur_Rohman_Wijaya_TUGAS2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hasil;
    private javax.swing.JTextField Inputa;
    private javax.swing.JTextField Inputn;
    private javax.swing.JTextField Inputx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox soal;
    private javax.swing.JTextField syarat;
    private javax.swing.JTextField tampilansoal;
    // End of variables declaration//GEN-END:variables

}