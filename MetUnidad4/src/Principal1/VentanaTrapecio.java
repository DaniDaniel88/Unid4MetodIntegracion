package Principal1;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class VentanaTrapecio extends javax.swing.JFrame {
    Object [] fila;
    DefaultTableModel miModelo; 
    FormulasTrapecio proced;
    FormulasTrapecio[] aRTrapecio;
    String head[]= {"i", "Xi", "f(x)", "K", "K_f(x)"};
    String data[][]={}; 
    int i;    
    public VentanaTrapecio() {
        initComponents();
        miModelo= new DefaultTableModel(data,head);
        jtable.setModel(miModelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbseleccion = new javax.swing.ButtonGroup();
        jbNuevo = new javax.swing.JButton();
        jbCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jtfResultado = new javax.swing.JLabel();
        jtfresultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfAx = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LimB1 = new javax.swing.JLabel();
        LimA1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfB = new javax.swing.JTextField();
        jtfA = new javax.swing.JTextField();
        jtfIteraciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbNuevo.setBackground(new java.awt.Color(255, 0, 0));
        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbCalcular.setBackground(new java.awt.Color(255, 0, 0));
        jbCalcular.setText("CALCULAR");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        jtfResultado.setText("RESULTADO:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02.PNG"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        LimB1.setText("LimiteB");

        LimA1.setText("LimiteA");

        jLabel5.setText("N:");

        jtfB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LimA1)
                    .addComponent(LimB1)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jtfIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimB1)
                    .addComponent(jtfB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimA1)
                    .addComponent(jtfA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setText("Metodo de Trapecio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(342, 342, 342))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jtfAx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfResultado)
                                .addGap(18, 18, 18)
                                .addComponent(jtfresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfResultado)
                                            .addComponent(jtfresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jtfAx)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        this.Calcular();
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtfAx.setText(" ");
        jtfA.setText("");
        jtfB.setText("");
        jtfIteraciones.setText("");
        jtfresultado.setText(" ");    
        jtfB.requestFocus();
        for(int j=0; j<i; j++){
            miModelo.removeRow(0);
        }
        i=0;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jtfBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBActionPerformed

    public void Calcular(){            
        try{
            int a,b,n,Ki[];                  
            double suma,resultado,Ax,Xi[],funcion[],K_f[];          
            n = Integer.parseInt(jtfIteraciones.getText());
            if(n>=4){
                a=Integer.parseInt(jtfA.getText());
            b=Integer.parseInt(jtfB.getText());
            proced=new FormulasTrapecio();       
            fila=new Object[n+1]; 
            Ax=proced.AX(b, a, n);
            Xi= proced.XI(a, Ax, n);
            funcion=proced.funcion(Xi, a, n);
            Ki=proced.K( n);
            K_f=proced.Kfuncion(Ki,funcion, n);
            
            for(i=0;i<=n;i++){
                fila[0]=i;               
                fila[1]=Xi[i];
                fila[2]=funcion[i]; 
                fila[3]=Ki[i];
                fila[4]=K_f[i];
                miModelo.addRow(fila);
           }             
            jtfAx.setText("Ax: "+Ax);
            suma=proced.Suma(K_f, n);
            resultado=proced.Resul(Ax, suma);
            
            jtfresultado.setText(""+resultado);
            }else{
                JOptionPane.showMessageDialog(null, "Valido solo 4 o mas iteraciones");
                jtfIteraciones.requestFocus();
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Se ha ingresado un dato incorrecto");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALimit;
    private javax.swing.JLabel Ancho;
    private javax.swing.JTextField BLimit;
    private javax.swing.JLabel LimA;
    private javax.swing.JLabel LimA1;
    private javax.swing.JLabel LimB;
    private javax.swing.JLabel LimB1;
    private javax.swing.JTextField NVeces;
    private javax.swing.JTextField ancho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbNuevo;
    private javax.swing.ButtonGroup jbseleccion;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField jtfA;
    private javax.swing.JLabel jtfAx;
    private javax.swing.JTextField jtfB;
    private javax.swing.JTextField jtfIteraciones;
    private javax.swing.JLabel jtfResultado;
    private javax.swing.JTextField jtfresultado;
    // End of variables declaration//GEN-END:variables
}
