package View;

import java.awt.Dimension;
/**
 * @author Albert Montagut Casero <AlbertMontagutCasero.com>
 */
public class MainMenu extends javax.swing.JFrame
{

    /**
     * Creates new form MainMenu
     */
    public MainMenu()
    {

        initComponents();
        setSize(900, 900);
        setTitle("Menu");
        this.setMinimumSize(new Dimension(900, 900));
        this.setMaximumSize(new Dimension(1100, 1100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonAltaPokemon = new javax.swing.JButton();
        buttonVerLista = new javax.swing.JButton();
        buttonModificarPropiedades = new javax.swing.JButton();
        buttonCapturarPokemon = new javax.swing.JButton();
        buttonVerPokemon = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonAltaPokemon.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonAltaPokemon.setText("Alta Pokemon");
        buttonAltaPokemon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAltaPokemon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonAltaPokemonActionPerformed(evt);
            }
        });

        buttonVerLista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonVerLista.setText("Ver Lista Pokemon");
        buttonVerLista.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonVerListaActionPerformed(evt);
            }
        });

        buttonModificarPropiedades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonModificarPropiedades.setText("Modificar Propiedades");
        buttonModificarPropiedades.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonModificarPropiedadesActionPerformed(evt);
            }
        });

        buttonCapturarPokemon.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonCapturarPokemon.setText("Capturar Pokemon");
        buttonCapturarPokemon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonCapturarPokemonActionPerformed(evt);
            }
        });

        buttonVerPokemon.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonVerPokemon.setText("Ver Total Pokemon");
        buttonVerPokemon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonVerPokemonActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVerPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCapturarPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonModificarPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonAltaPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVerLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(506, Short.MAX_VALUE)
                .addComponent(buttonAltaPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonModificarPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonVerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCapturarPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonVerPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(exit)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAltaPokemonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonAltaPokemonActionPerformed
    {//GEN-HEADEREND:event_buttonAltaPokemonActionPerformed
        //initialise Alta view & set visible 
        AltaPokemon aux = new AltaPokemon(this, true);
        aux.setVisible(true);
    }//GEN-LAST:event_buttonAltaPokemonActionPerformed

    private void buttonModificarPropiedadesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonModificarPropiedadesActionPerformed
    {//GEN-HEADEREND:event_buttonModificarPropiedadesActionPerformed
        //initialise Alta view & set visible 
        ModificarPropiedades aux = new ModificarPropiedades(this, true);
        aux.setVisible(true);
    }//GEN-LAST:event_buttonModificarPropiedadesActionPerformed

    private void buttonVerListaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonVerListaActionPerformed
    {//GEN-HEADEREND:event_buttonVerListaActionPerformed
        ListaPokemon aux = new ListaPokemon(this, true);
        aux.setVisible(true);    }//GEN-LAST:event_buttonVerListaActionPerformed

    private void buttonCapturarPokemonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonCapturarPokemonActionPerformed
    {//GEN-HEADEREND:event_buttonCapturarPokemonActionPerformed
        CapturarPokemon aux = new CapturarPokemon(this, true);
        aux.setVisible(true);    }//GEN-LAST:event_buttonCapturarPokemonActionPerformed

    private void buttonVerPokemonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonVerPokemonActionPerformed
    {//GEN-HEADEREND:event_buttonVerPokemonActionPerformed
        TotalPokemon aux = new TotalPokemon(this, true);
        aux.setVisible(true);    }//GEN-LAST:event_buttonVerPokemonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitActionPerformed
    {//GEN-HEADEREND:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAltaPokemon;
    private javax.swing.JButton buttonCapturarPokemon;
    private javax.swing.JButton buttonModificarPropiedades;
    private javax.swing.JButton buttonVerLista;
    private javax.swing.JButton buttonVerPokemon;
    private javax.swing.JButton exit;
    // End of variables declaration//GEN-END:variables
}
