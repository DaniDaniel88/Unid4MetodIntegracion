
package Principal1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaSimpson extends javax.swing.JFrame {

    Object [] fila;
    DefaultTableModel MoldeTabla;
    FormmulasSimpson Etapa;
    String head[]= {"Iteraciones", "Xn", "F(x)", "K", "K*f(x)"};
    String data[][]={}; 
    int i;
    
    public VentanaSimpson() {
        initComponents();
        MoldeTabla= new DefaultTableModel(data,head);
        TablaS.setModel(MoldeTabla);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LimB = new javax.swing.JLabel();
        BLimit = new javax.swing.JTextField();
        LimA = new javax.swing.JLabel();
        ALimit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NVeces = new javax.swing.JTextField();
        Ancho = new javax.swing.JLabel();
        ancho = new javax.swing.JTextField();
        BTCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        ResultadoF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaS);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setText("Metodo de Simpson");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        LimB.setText("LimiteB");

        LimA.setText("LimiteA");

        jLabel4.setText("N:");

        Ancho.setText("Hancho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LimA)
                    .addComponent(LimB)
                    .addComponent(jLabel4)
                    .addComponent(Ancho))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ancho, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(NVeces, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLimit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ALimit, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimB)
                    .addComponent(BLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimA)
                    .addComponent(ALimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(NVeces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ancho)
                    .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        BTCalcular.setText("Calcular");
        BTCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Resultado");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ResultadoF))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BTCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultadoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCalcularActionPerformed
        this.CalcularM();
    }//GEN-LAST:event_BTCalcularActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
       ancho.setText(" ");
       ALimit.setText("");
       BLimit.setText("");
       NVeces.setText("");
       ResultadoF.setText(" ");

       BLimit.requestFocus();
       //jldoble.setText(" ");
       for(int j=0; j<i; j++){
            MoldeTabla.removeRow(0);
        }
        i=0;
    }//GEN-LAST:event_NuevoActionPerformed

    public void CalcularM(){
        try{
            int Ki[];                  
            double suma,resultado,Ax,Xi[],funcion[],K_f[];                      
            int a=Integer.parseInt(ALimit.getText());
            int b=Integer.parseInt(BLimit.getText());
            int n=Integer.parseInt(NVeces.getText());
            
            int NxDos=this.DublicaNXDos(n);
            Etapa=new FormmulasSimpson();       
            fila=new Object[NxDos+1]; 
                 
            Ax=Etapa.AnchoS(b, a, NxDos);
            Xi= Etapa.XAumento(a, Ax, NxDos);
            funcion=Etapa.FuncionPreterminada(Xi, a, NxDos);
            Ki=Etapa.MultiploFuncion(NxDos);
            K_f=Etapa.K_funcion(Ki,funcion, NxDos);
            
            for(i=0;i<=NxDos;i++)
            {
                fila[0]=i;               
                fila[1]=Xi[i];
                fila[2]=funcion[i]; 
                fila[3]=Ki[i];
                fila[4]=K_f[i];
                MoldeTabla.addRow(fila);
           }
            ancho.setText(""+Ax);
            suma=Etapa.SumaFunciones(K_f, NxDos);
            resultado=Etapa.resultadoFinal(Ax, suma);
            ResultadoF.setText(""+resultado);
          
            NVeces.setText(""+NxDos);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingresó un dato incorrecto");
        }
    }
   
    public int DublicaNXDos(int n){
        return 2*n;
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALimit;
    private javax.swing.JLabel Ancho;
    private javax.swing.JTextField BLimit;
    private javax.swing.JButton BTCalcular;
    private javax.swing.JLabel LimA;
    private javax.swing.JLabel LimB;
    private javax.swing.JTextField NVeces;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTextField ResultadoF;
    private javax.swing.JTable TablaS;
    private javax.swing.JTextField ancho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
