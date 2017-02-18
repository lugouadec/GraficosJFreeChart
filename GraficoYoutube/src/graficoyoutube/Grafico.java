/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficoyoutube;

import javax.swing.JOptionPane;
import org.jfree.chart.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;

import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author LugoUAdeC
 */
public class Grafico extends javax.swing.JFrame {

    /**
     * Creates new form Grafico
     */
    public Grafico() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.lineas.setVisible(false);
        this.barras.setVisible(false);
        this.pastel.setVisible(false);
        
        this.setVisible(true);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        capas = new javax.swing.JLayeredPane();
        lineas = new javax.swing.JPanel();
        barras = new javax.swing.JPanel();
        pastel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        l = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        p = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "X", "Y"
            }
        ));
        jScrollPane1.setViewportView(datos);

        capas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        capas.setName("capas"); // NOI18N

        javax.swing.GroupLayout lineasLayout = new javax.swing.GroupLayout(lineas);
        lineas.setLayout(lineasLayout);
        lineasLayout.setHorizontalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        lineasLayout.setVerticalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barrasLayout = new javax.swing.GroupLayout(barras);
        barras.setLayout(barrasLayout);
        barrasLayout.setHorizontalGroup(
            barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        barrasLayout.setVerticalGroup(
            barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pastelLayout = new javax.swing.GroupLayout(pastel);
        pastel.setLayout(pastelLayout);
        pastelLayout.setHorizontalGroup(
            pastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        pastelLayout.setVerticalGroup(
            pastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        capas.setLayer(lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(barras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(pastel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(barras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pastel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        l.setText("Lineas");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        b.setText("Barras");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        p.setText("Pastel");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Grafico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l)
                                    .addGap(18, 18, 18)
                                    .addComponent(b)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(capas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l)
                            .addComponent(b)
                            .addComponent(p))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
        barras.setVisible(true);
        capas.setLayer(barras, 0,0);
        l.setSelected(false);
        p.setSelected(false);
    }//GEN-LAST:event_bActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        // TODO add your handling code here:
        lineas.setVisible(true);
        capas.setLayer(lineas, 0,0);
        b.setSelected(false);
        p.setSelected(false);
        
    }//GEN-LAST:event_lActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
        pastel.setVisible(true);
        capas.setLayer(pastel, 0,0);
        b.setSelected(false);
        l.setSelected(false);
    }//GEN-LAST:event_pActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChartPanel panel;
        JFreeChart chart = null;
        
        
        if(l.isSelected()){
            //Graficas de Lineas
            int validar=1;
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset = new XYSeriesCollection();
            
            
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            
            XYSeries serie = new XYSeries("Datos");
            
            XYPlot plot;
            lineas.removeAll();
            
            try{
                for(int fila=0; fila<=datos.getRowCount(); fila++){
                    serie.add(Float.parseFloat(String.valueOf(datos.getValueAt(fila, 0))),
                    Float.parseFloat(String.valueOf(datos.getValueAt(fila, 1))));
                    //JOptionPane.showMessageDialog(this,datos.getValueAt(fila, 0)+" ,"+ datos.getValueAt(fila, 1));
                }
            }catch(Exception ex){
                validar =0;
                JOptionPane.showMessageDialog(this, ex.getMessage()+"\n"+validar);
                
            }
            if(validar==1){
                dataset.addSeries(serie);
                x.setLabel("Eje X");
                y.setLabel("Eje Y");
                plot = new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("Grafico de Lineas YouTube");
                
            }else{
                JOptionPane.showMessageDialog(this, "Debe llenar la tabla con datos numericos");
            }
            
        }else{
            if(b.isSelected()){
                //Grafico de Barras
                DefaultCategoryDataset data = new DefaultCategoryDataset();
                String producto1 = "Sopas";
                String producto2 = "Soda";
                
                String dia1 = "Dia 1";
                String dia2 = "Dia 2";
                String dia3 = "Dia 3";
                String dia4 = "Dia 4";
                
                data.addValue(18, producto1, dia1);
                data.addValue(15, producto1, dia2);
                data.addValue(14, producto1, dia3);
                data.addValue(1, producto1, dia4);
                
                data.addValue(50, producto2, dia1);
                data.addValue(45, producto2, dia2);
                data.addValue(31, producto2, dia3);
                data.addValue(10, producto2, dia4);
                
                chart = ChartFactory.createBarChart("Grafico de Barras YouTube",
                        "Dia",
                        "Cantidad",
                        data,
                        PlotOrientation.HORIZONTAL,
                        true,
                        true,
                        true);
                
                CategoryPlot plot = (CategoryPlot)chart.getPlot();
                plot.setDomainGridlinesVisible(true);
                
            }else{
                //Grafico de Pastel
                DefaultPieDataset data = new DefaultKeyedValuesDataset();
                data.setValue("Categoria 1", 20);
                data.setValue("Categoria 2", 60);
                data.setValue("Categoria 3", 20);
               
                chart = ChartFactory.createPieChart3D("Grafico de Pastel", data, true, true, true);
                
            }
        }
        panel = new ChartPanel(chart);
        panel.setBounds(5, 10, 410, 400);
        if(l.isSelected()){
            //Lineas
            lineas.add(panel);
            lineas.repaint();
        }else{
            if(b.isSelected()){
                barras.add(panel);
                barras.repaint();
            }else{
                pastel.add(panel);
                pastel.repaint();
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b;
    private javax.swing.JPanel barras;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton l;
    private javax.swing.JPanel lineas;
    private javax.swing.JRadioButton p;
    private javax.swing.JPanel pastel;
    // End of variables declaration//GEN-END:variables
}
