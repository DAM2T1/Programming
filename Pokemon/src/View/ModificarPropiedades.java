package View;

import Model.Pokemon;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

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

        //TODO make this in Netbeans window propietes
        //** SCREEN PROPETIES **//
        this.setMinimumSize(new Dimension(700, 400));
        this.setMaximumSize(new Dimension(600, 600));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Propiedades");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BExit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LAtaque)
                                .addComponent(LDefensa)
                                .addComponent(LVida))
                            .addGap(85, 85, 85)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SAtaque)
                                .addComponent(SDefensa)
                                .addComponent(SVida)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CBName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(241, 241, 241)
                            .addComponent(BModificar))))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LAtaque))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDefensa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LVida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
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
     * @param pokemon object 
     */
    private void changeLabelText(Pokemon pokemon){
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
        String[] pokeNames = Controller.Controller.getNameMap();
        for (String pokeName : pokeNames)
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
    private javax.swing.JLabel LVida;
    private javax.swing.JSpinner SAtaque;
    private javax.swing.JSpinner SDefensa;
    private javax.swing.JSpinner SVida;
    // End of variables declaration//GEN-END:variables
}
