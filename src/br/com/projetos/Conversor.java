package br.com.projetos;

import java.text.DecimalFormat;

/**
 *
 * @author grazi
 */
public class Conversor extends javax.swing.JFrame {

    public Conversor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        btnGroupEscalaTemperatura = new javax.swing.ButtonGroup();
        inputCelsius = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultadoConversao = new javax.swing.JLabel();
        btnConverter = new javax.swing.JButton();
        btnRCelsius = new javax.swing.JRadioButton();
        btnRFahreheit = new javax.swing.JRadioButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");

        jLabel1.setText("Digite a Temperatura :");

        jLabel2.setText("Temperatura convertida :  ");

        btnConverter.setText("Converter");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        btnGroupEscalaTemperatura.add(btnRCelsius);
        btnRCelsius.setSelected(true);
        btnRCelsius.setText("Celsius");

        btnGroupEscalaTemperatura.add(btnRFahreheit);
        btnRFahreheit.setText("Fahrenheit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultadoConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(inputCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRCelsius)
                            .addComponent(btnRFahreheit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(btnConverter)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConverter)
                            .addComponent(btnRCelsius))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRFahreheit)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(resultadoConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed
        DecimalFormat df = new DecimalFormat("#.##");
        double valorTemperatura = Double.valueOf(inputCelsius.getText());
        
        if (btnRCelsius.isSelected()) {
            
            Double fahrenheit = (valorTemperatura * 9 / 5) + 32;
            resultadoConversao.setText(df.format(fahrenheit) + "ºF");
        } else if (btnRFahreheit.isSelected()) {

            Double celsius = (valorTemperatura - 32) * 5 / 9;
            resultadoConversao.setText(df.format(celsius) + "ºC");
        }
    }//GEN-LAST:event_btnConverterActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverter;
    private javax.swing.ButtonGroup btnGroupEscalaTemperatura;
    private javax.swing.JRadioButton btnRCelsius;
    private javax.swing.JRadioButton btnRFahreheit;
    private javax.swing.JTextField inputCelsius;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel resultadoConversao;
    // End of variables declaration//GEN-END:variables
}
