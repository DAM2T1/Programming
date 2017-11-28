package View;

import Model.Pokemon;
import javax.swing.JOptionPane;

/**
 *
 * @author Albert Montagut Casero <AlbertMontagutCasero.com>
 */
public class ModificarPropiedades extends javax.swing.JDialog
{

    /**
     * Creates new form ModificarPropiedades
     */
    public ModificarPropiedades(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        hideItems();
        CBName.addItem("-- Selecciona un pokemon --");
        fillCBName();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        CBName = new javax.swing.JComboBox<>();
        SAtaque = new javax.swing.JSpinner();
        SDefensa = new javax.swing.JSpinner();
        SVida = new javax.swing.JSpinner();
        LAtaque = new javax.swing.JLabel();
        LDefensa = new javax.swing.JLabel();
        LVida = new javax.swing.JLabel();
        BModificar = new javax.swing.JButton();
        BExit = new javax.swing.JButton();
        LStaticAtaque = new javax.swing.JLabel();
        LStaticDefensa = new javax.swing.JLabel();
        LStativVida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Propiedades");
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

        SAtaque.setModel(new javax.swing.SpinnerNumberModel(25, 1, 55, 1));

        SDefensa.setModel(new javax.swing.SpinnerNumberModel(25, 1, 55, 1));

        SVida.setModel(new javax.swing.SpinnerNumberModel(55, 20, 100, 1));

        LAtaque.setText("asd");
        LAtaque.setToolTipText("");

        LDefensa.setText("asd");

        LVida.setText("asd");

        BModificar.setText("Modificar!");
        BModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BModificarActionPerformed(evt);
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

        LStaticAtaque.setText("Ataque");

        LStaticDefensa.setText("Defensa");

        LStativVida.setText("Vida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LStaticAtaque)
                            .addComponent(LStaticDefensa)
                            .addComponent(LStativVida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(LVida))
                                    .addComponent(LDefensa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LAtaque, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SAtaque)
                                    .addComponent(SDefensa)
                                    .addComponent(SVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241)
                                .addComponent(BModificar)))))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BModificar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LAtaque)
                    .addComponent(LStaticAtaque))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDefensa)
                    .addComponent(LStaticDefensa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LVida)
                    .addComponent(LStativVida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(BExit)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CBNameActionPerformed
    {//GEN-HEADEREND:event_CBNameActionPerformed
        if (isSelectOptionDefaultSelected())
        {
            showError("No puedes seleccionar esta opcion", "Invalid selection");
            return;
        }
        String pokeName = CBName.getSelectedItem().toString();
        changeLabelText(Controller.Controller.getObjPokeMap(pokeName));
        showItems();
    }//GEN-LAST:event_CBNameActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BModificarActionPerformed
    {//GEN-HEADEREND:event_BModificarActionPerformed
        Pokemon pokemon = Controller.Controller.getObjPokeMap(CBName.getSelectedItem().toString());
        Controller.Controller.changeProperties(
                pokemon, //Combobox pokemon object selected
                (int) SAtaque.getValue(),
                (int) SDefensa.getValue(),
                (int) SVida.getValue());
        changeLabelText(pokemon);
    }//GEN-LAST:event_BModificarActionPerformed

    private void BExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BExitActionPerformed
    {//GEN-HEADEREND:event_BExitActionPerformed
        dispose();
    }//GEN-LAST:event_BExitActionPerformed

    /**
     * change the label text for the actual pokemon stats
     *
     * @param pokemon object
     */
    private void changeLabelText(Pokemon pokemon)
    {
        LAtaque.setText(Integer.toString(pokemon.getAtk()));
        LDefensa.setText(Integer.toString(pokemon.getDef()));
        LVida.setText(Integer.toString(pokemon.getLife()));
    }

    private void hideItems()
    {
        LAtaque.setVisible(false);
        LDefensa.setVisible(false);
        LVida.setVisible(false);
        SAtaque.setVisible(false);
        SDefensa.setVisible(false);
        SVida.setVisible(false);
        BModificar.setVisible(false);
        LStaticAtaque.setVisible(false);
        LStaticDefensa.setVisible(false);
        LStativVida.setVisible(false);
    }

    private void showItems()
    {
        LAtaque.setVisible(true);
        BModificar.setVisible(true);
        LDefensa.setVisible(true);
        LVida.setVisible(true);
        SAtaque.setVisible(true);
        SDefensa.setVisible(true);
        SVida.setVisible(true);
        LStaticAtaque.setVisible(true);
        LStaticDefensa.setVisible(true);
        LStativVida.setVisible(true);
    }

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

    public void showError(String msg, String errorName)
    {
        JOptionPane.showMessageDialog(this, msg,
                errorName, JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BExit;
    private javax.swing.JButton BModificar;
    private javax.swing.JComboBox<String> CBName;
    private javax.swing.JLabel LAtaque;
    private javax.swing.JLabel LDefensa;
    private javax.swing.JLabel LStaticAtaque;
    private javax.swing.JLabel LStaticDefensa;
    private javax.swing.JLabel LStativVida;
    private javax.swing.JLabel LVida;
    private javax.swing.JSpinner SAtaque;
    private javax.swing.JSpinner SDefensa;
    private javax.swing.JSpinner SVida;
    // End of variables declaration//GEN-END:variables
}
