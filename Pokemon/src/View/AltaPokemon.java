package View;

import Exception.PokemonException;
import javax.swing.JOptionPane;

/**
 * @author Albert Montagut Casero <AlbertMontagutCasero.com>
 */
public class AltaPokemon extends javax.swing.JDialog
{

    public AltaPokemon(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        RBAgua.setActionCommand("Agua");
        RBFuego.setActionCommand("Fuego");
        RBPlanta.setActionCommand("Planta");
        //** VIEW  CUSTOMIZATION **//
        hideItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        TipoPokemon = new javax.swing.ButtonGroup();
        RBFuego = new javax.swing.JRadioButton();
        RBPlanta = new javax.swing.JRadioButton();
        RBAgua = new javax.swing.JRadioButton();
        LNombre = new javax.swing.JLabel();
        LAtaque = new javax.swing.JLabel();
        LDefensa = new javax.swing.JLabel();
        LSalud = new javax.swing.JLabel();
        LHabitat = new javax.swing.JLabel();
        LTipoAgua = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        SAtaque = new javax.swing.JSpinner();
        SDefensa = new javax.swing.JSpinner();
        Salud = new javax.swing.JSpinner();
        TFPropEspPlanta = new javax.swing.JTextField();
        BValidar = new javax.swing.JButton();
        CBPropEspAgua = new javax.swing.JComboBox<>();
        bExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta pokemon");
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(700, 400));

        TipoPokemon.add(RBFuego);
        RBFuego.setText("Fuego");
        RBFuego.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RBFuegoActionPerformed(evt);
            }
        });

        TipoPokemon.add(RBPlanta);
        RBPlanta.setText("Planta");
        RBPlanta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RBPlantaActionPerformed(evt);
            }
        });

        TipoPokemon.add(RBAgua);
        RBAgua.setText("Agua");
        RBAgua.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RBAguaActionPerformed(evt);
            }
        });

        LNombre.setText("Nombre");

        LAtaque.setText("Ataque");

        LDefensa.setText("Defensa");

        LSalud.setText("Salud");

        LHabitat.setText("Habitat");

        LTipoAgua.setText("TipoAgua");

        SAtaque.setModel(new javax.swing.SpinnerNumberModel(25, 1, 50, 1));
        SAtaque.setToolTipText("");

        SDefensa.setModel(new javax.swing.SpinnerNumberModel(25, 1, 50, 1));

        Salud.setModel(new javax.swing.SpinnerNumberModel(55, 20, 100, 1));

        BValidar.setText("Alta");
        BValidar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BValidarActionPerformed(evt);
            }
        });

        CBPropEspAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salada", "Dulce" }));
        CBPropEspAgua.setToolTipText("Introduce el tipo de pokemon de agua");

        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(RBFuego)
                .addGap(18, 18, 18)
                .addComponent(RBPlanta)
                .addGap(18, 18, 18)
                .addComponent(RBAgua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(BValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LDefensa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LSalud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LHabitat, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(LTipoAgua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPropEspPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SAtaque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SDefensa, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Salud, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBPropEspAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bExit)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(BValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RBFuego)
                            .addComponent(RBPlanta)
                            .addComponent(RBAgua))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNombre)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LDefensa)
                            .addComponent(SDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LSalud)
                            .addComponent(Salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LHabitat)
                            .addComponent(TFPropEspPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBPropEspAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LTipoAgua))
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bExit)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showSuccessMessage(String msg, String errorName)
    {
        JOptionPane.showMessageDialog(this, msg,
                errorName, JOptionPane.INFORMATION_MESSAGE);
    }

    private void BValidarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BValidarActionPerformed
    {//GEN-HEADEREND:event_BValidarActionPerformed

        String tipo;
        try
        {
            tipo = TipoPokemon.getSelection().getActionCommand();
        } catch (NullPointerException e)
        {
            showError("No hay ningun tipo de pokemon seleccionado", "Tipo Incorrecto");
            return;
        }
        if (tipo.equals("Agua"))
        {
            try
            {
                Controller.Controller.altaPokemonAgua(TFNombre.getText(), (int) SAtaque.getValue(),
                        (int) SDefensa.getValue(), (int) Salud.getValue(), CBPropEspAgua.getSelectedItem().toString());
                showSuccessMessage("Pokemon Dado de alta", "Success");
            } catch (PokemonException e)
            {
                showError(e.getMessage(), "Error");
            }

        } else if (tipo.equals("Planta"))
        {
            try
            {
                Controller.Controller.altaPokemonPlanta(TFNombre.getText(), (int) SAtaque.getValue(),
                        (int) SDefensa.getValue(), (int) Salud.getValue(), TFPropEspPlanta.getText());
                showSuccessMessage("Pokemon Dado de alta", "Success");
            } catch (PokemonException e)
            {
                showError(e.getMessage(), "Error");
            }

        } else if (tipo.equals("Fuego"))
        {
            try
            {
                Controller.Controller.altaPokemonFuego(TFNombre.getText(), (int) SAtaque.getValue(),
                        (int) SDefensa.getValue(), (int) Salud.getValue());
                showSuccessMessage("Pokemon Dado de alta", "Success");
            } catch (PokemonException e)
            {
                showError(e.getMessage(), "Error");
            }

        }
    }//GEN-LAST:event_BValidarActionPerformed

    private void RBFuegoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RBFuegoActionPerformed
    {//GEN-HEADEREND:event_RBFuegoActionPerformed
        hideItems();
        viewGenericItems();
    }//GEN-LAST:event_RBFuegoActionPerformed

    private void RBPlantaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RBPlantaActionPerformed
    {//GEN-HEADEREND:event_RBPlantaActionPerformed
        hideItems();
        viewPlantaSpecial();
    }//GEN-LAST:event_RBPlantaActionPerformed

    private void RBAguaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RBAguaActionPerformed
    {//GEN-HEADEREND:event_RBAguaActionPerformed
        hideItems();
        viewAguaSpecial();
    }//GEN-LAST:event_RBAguaActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bExitActionPerformed
    {//GEN-HEADEREND:event_bExitActionPerformed
        dispose();
    }//GEN-LAST:event_bExitActionPerformed

    private void hideItems()
    {
        LAtaque.setVisible(false);
        LDefensa.setVisible(false);
        LNombre.setVisible(false);
        LHabitat.setVisible(false);
        LSalud.setVisible(false);
        SAtaque.setVisible(false);
        SDefensa.setVisible(false);
        Salud.setVisible(false);
        TFNombre.setVisible(false);
        TFPropEspPlanta.setVisible(false);
        CBPropEspAgua.setVisible(false);
        LTipoAgua.setVisible(false);
    }

    private void viewGenericItems()
    {
        LAtaque.setVisible(true);
        LDefensa.setVisible(true);
        LNombre.setVisible(true);
        LSalud.setVisible(true);
        SAtaque.setVisible(true);
        SDefensa.setVisible(true);
        Salud.setVisible(true);
        TFNombre.setVisible(true);
    }
    //private void show

    private void viewAguaSpecial()
    {
        viewGenericItems();
        CBPropEspAgua.setVisible(true);
        LTipoAgua.setVisible(true);
    }

    private void viewPlantaSpecial()
    {
        viewGenericItems();
        TFPropEspPlanta.setVisible(true);
        LHabitat.setVisible(true);
    }

    public void showError(String msg, String errorName)
    {
        JOptionPane.showMessageDialog(null, msg,
                errorName, JOptionPane.ERROR_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BValidar;
    private javax.swing.JComboBox<String> CBPropEspAgua;
    private javax.swing.JLabel LAtaque;
    private javax.swing.JLabel LDefensa;
    private javax.swing.JLabel LHabitat;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LSalud;
    private javax.swing.JLabel LTipoAgua;
    private javax.swing.JRadioButton RBAgua;
    private javax.swing.JRadioButton RBFuego;
    private javax.swing.JRadioButton RBPlanta;
    private javax.swing.JSpinner SAtaque;
    private javax.swing.JSpinner SDefensa;
    private javax.swing.JSpinner Salud;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPropEspPlanta;
    private javax.swing.ButtonGroup TipoPokemon;
    private javax.swing.JButton bExit;
    // End of variables declaration//GEN-END:variables
}
