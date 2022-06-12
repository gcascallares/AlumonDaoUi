
import Class.Alumno;
import DAO.AlumnoDaoSql;
import DAO.AlumnoDaoTxt;
import DAO.DAO;
import DAO.DAOException;
import DAO.DAOFactory;
import Exception.AlumnoException;
import Exception.DAOFactoryException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author laboratorios
 */
public class AlumnoUI extends javax.swing.JFrame {

    /**
     * Creates new form AlumnoUI
     */
    
    DAO<Alumno, Integer> dao;
    AlumnoDaoTxt daoTxt;
    AlumnoDaoSql daoSql;
    private final AluTableModel alumnoModel;
    
    public AlumnoUI() {
        initComponents();
        setLocationRelativeTo(null);
        
        SqlPanel.setVisible(false);
        
        alumnoModel = new AluTableModel();
        AlumnoTable.setModel(alumnoModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrillaAlumnosPanel = new javax.swing.JPanel();
        Botonera = new javax.swing.JPanel();
        FilterPanel = new javax.swing.JPanel();
        ComboTipoDao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TxtPanel = new javax.swing.JPanel();
        FileChooser = new javax.swing.JButton();
        LabelPath = new javax.swing.JLabel();
        SqlPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ConectButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextConnection = new javax.swing.JTextField();
        TextPass = new javax.swing.JTextField();
        TextUser = new javax.swing.JTextField();
        GridAlumnosPanel = new javax.swing.JPanel();
        Buttons = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AlumnoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GrillaAlumnosPanelLayout = new javax.swing.GroupLayout(GrillaAlumnosPanel);
        GrillaAlumnosPanel.setLayout(GrillaAlumnosPanelLayout);
        GrillaAlumnosPanelLayout.setHorizontalGroup(
            GrillaAlumnosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrillaAlumnosPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        GrillaAlumnosPanelLayout.setVerticalGroup(
            GrillaAlumnosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrillaAlumnosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FilterPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ComboTipoDao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TXT", "SQL" }));
        ComboTipoDao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoDaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione tipo:");

        TxtPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FileChooser.setText("...");
        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        LabelPath.setText("label path");

        javax.swing.GroupLayout TxtPanelLayout = new javax.swing.GroupLayout(TxtPanel);
        TxtPanel.setLayout(TxtPanelLayout);
        TxtPanelLayout.setHorizontalGroup(
            TxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TxtPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(LabelPath, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FileChooser)
                .addGap(28, 28, 28))
        );
        TxtPanelLayout.setVerticalGroup(
            TxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TxtPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(TxtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileChooser)
                    .addComponent(LabelPath))
                .addContainerGap())
        );

        SqlPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Coneccion:");

        ConectButton.setText("Conectar");
        ConectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("user:");

        jLabel4.setText("pass:");

        TextConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextConnectionActionPerformed(evt);
            }
        });

        TextPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SqlPanelLayout = new javax.swing.GroupLayout(SqlPanel);
        SqlPanel.setLayout(SqlPanelLayout);
        SqlPanelLayout.setHorizontalGroup(
            SqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SqlPanelLayout.createSequentialGroup()
                .addGroup(SqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SqlPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SqlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextConnection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(SqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SqlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConectButton)
                        .addGap(49, 49, 49))
                    .addGroup(SqlPanelLayout.createSequentialGroup()
                        .addComponent(TextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        SqlPanelLayout.setVerticalGroup(
            SqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SqlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConectButton)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SqlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout FilterPanelLayout = new javax.swing.GroupLayout(FilterPanel);
        FilterPanel.setLayout(FilterPanelLayout);
        FilterPanelLayout.setHorizontalGroup(
            FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilterPanelLayout.createSequentialGroup()
                .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FilterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FilterPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(ComboTipoDao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(SqlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        FilterPanelLayout.setVerticalGroup(
            FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboTipoDao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SqlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        GridAlumnosPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Buttons.setBorder(new javax.swing.border.MatteBorder(null));

        AddButton.setText("Add");

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");

        Select.setText("Select");

        javax.swing.GroupLayout ButtonsLayout = new javax.swing.GroupLayout(Buttons);
        Buttons.setLayout(ButtonsLayout);
        ButtonsLayout.setHorizontalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddButton)
                    .addComponent(DeleteButton)
                    .addComponent(UpdateButton)
                    .addComponent(Select))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ButtonsLayout.setVerticalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(AddButton)
                .addGap(18, 18, 18)
                .addComponent(UpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Select)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(DeleteButton)
                .addGap(33, 33, 33))
        );

        AlumnoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(AlumnoTable);

        javax.swing.GroupLayout GridAlumnosPanelLayout = new javax.swing.GroupLayout(GridAlumnosPanel);
        GridAlumnosPanel.setLayout(GridAlumnosPanelLayout);
        GridAlumnosPanelLayout.setHorizontalGroup(
            GridAlumnosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GridAlumnosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        GridAlumnosPanelLayout.setVerticalGroup(
            GridAlumnosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GridAlumnosPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GridAlumnosPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GrillaAlumnosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GridAlumnosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FilterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(GridAlumnosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(GrillaAlumnosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
       try{
           if(daoTxt == null){
                JFileChooser chooser = new JFileChooser();
                int resp = chooser.showOpenDialog(this);
                if(resp != JFileChooser.APPROVE_OPTION)
                {
                    return;
                }
                File file = chooser.getSelectedFile();
                LabelPath.setText(file.getAbsolutePath());
                Map<String,String> config = new HashMap<String, String>();
                config.put(DAOFactory.TIPO_DAO, DAOFactory.TIPO_DAO_TXT);
                daoTxt = (AlumnoDaoTxt) DAOFactory.getInstance().CreateDAO(config);
           }
           dao = daoTxt;
           //aluTableModel.setAlumnos(dao.findAll(true));
           List<Alumno> alus = new ArrayList<>();
           alus.add(new Alumno(1111111, "Nombre1", "Apellido 1", null,null,null,null));
           alus.add(new Alumno(2222222, "Nombre2", "Apellido 2", null,null,null,null));
           alus.add(new Alumno(3333333, "Nombre3", "Apellido 3", null,null,null,null));
           alus.add(new Alumno(777777, "Nombre7", "Apellido 7", null,null,null,null));
           alus.add(new Alumno(55555, "Nombre5", "Apellido 5", null,null,null,null));
           alumnoModel.setAlumnos(alus);
           alumnoModel.fireTableDataChanged();
        } catch (DAOFactoryException ex) {
            Logger.getLogger(AlumnoUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DAOException ex) {
            Logger.getLogger(AlumnoUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlumnoException ex) {
            Logger.getLogger(AlumnoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FileChooserActionPerformed

    private void ConectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConectButtonActionPerformed

    private void TextConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextConnectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextConnectionActionPerformed

    private void ComboTipoDaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoDaoActionPerformed
       TxtPanel.setVisible(ComboTipoDao.getSelectedIndex() == 0);
       SqlPanel.setVisible(ComboTipoDao.getSelectedIndex() == 1);
    }//GEN-LAST:event_ComboTipoDaoActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void TextPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPassActionPerformed

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
            java.util.logging.Logger.getLogger(AlumnoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTable AlumnoTable;
    private javax.swing.JPanel Botonera;
    private javax.swing.JPanel Buttons;
    private javax.swing.JComboBox<String> ComboTipoDao;
    private javax.swing.JButton ConectButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton FileChooser;
    private javax.swing.JPanel FilterPanel;
    private javax.swing.JPanel GridAlumnosPanel;
    private javax.swing.JPanel GrillaAlumnosPanel;
    private javax.swing.JLabel LabelPath;
    private javax.swing.JButton Select;
    private javax.swing.JPanel SqlPanel;
    private javax.swing.JTextField TextConnection;
    private javax.swing.JTextField TextPass;
    private javax.swing.JTextField TextUser;
    private javax.swing.JPanel TxtPanel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
