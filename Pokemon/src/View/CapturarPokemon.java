package View;

import Model.Pokemon;
import javax.swing.JOptionPane;

/**
 * @author Albert Montagut Casero <AlbertMontagutCasero.com>
 */
public class CapturarPokemon extends javax.swing.JDialog
{

    /**
     * Creates new form CapturarPokemon
     */
    public CapturarPokemon(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        CBName.addItem("-- Selecciona un pokemon --");
        BCapturar.setVisible(false);
        fillCBName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        CBName = new javax.swing.JComboBox<>();
        BCapturar = new javax.swing.JButton();
        BExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Capturar Pokemon");
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));

        CBName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CBNameActionPerformed(evt);
            }
        });

        BCapturar.setText("Capturar");
        BCapturar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BCapturarActionPerformed(evt);
            }
        });

        BExit.setText("Exit");
        BExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(CBName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BCapturar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BExit)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(CBName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BCapturar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(BExit)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //TODO solve error message at start
    private boolean isSelectOptionDefaultSelected()
    {
        if (CBName.getSelectedIndex() == 0)
        {
            return true;
        }
        return false;
    }

    private void fillCBName()
    {
        for (String pokeName : Controller.Controller.getNameMap())
        {
            CBName.addItem(pokeName);
        }
    }

    private void BExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BExitActionPerformed
    {//GEN-HEADEREND:event_BExitActionPerformed
        dispose();
    }//GEN-LAST:event_BExitActionPerformed

    private void CBNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CBNameActionPerformed
    {//GEN-HEADEREND:event_CBNameActionPerformed
        if (isSelectOptionDefaultSelected())
        {
            showError("No puedes seleccionar esta opcion", "Invalid selection");
            BCapturar.setVisible(false);
            return;
        }
        BCapturar.setVisible(true);
    }//GEN-LAST:event_CBNameActionPerformed

    private void BCapturarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BCapturarActionPerformed
    {//GEN-HEADEREND:event_BCapturarActionPerformed
        String pokeName = CBName.getSelectedItem().toString();
        Pokemon pokemon = Controller.Controller.getObjPokeMap(pokeName);
        if (pokemon.isCapturable())
        {
            showSuccessMessage("Capturado!!", "Success"); 
        } else
        {
            showError("Se ha escapado!!", "Fail");
        }
    }//GEN-LAST:event_BCapturarActionPerformed

    public void showError(String msg, String errorName)
    {
        JOptionPane.showMessageDialog(this, msg,
                errorName, JOptionPane.ERROR_MESSAGE);
    }

    public void showSuccessMessage(String msg, String errorName)
    {
        JOptionPane.showMessageDialog(this, msg,
                errorName, JOptionPane.INFORMATION_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCapturar;
    private javax.swing.JButton BExit;
    private javax.swing.JComboBox<String> CBName;
    // End of variables declaration//GEN-END:variables
}
