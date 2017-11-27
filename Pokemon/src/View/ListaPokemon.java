package View;

import Model.Pokemon;

/**
 * @author Albert Montagut Casero <AlbertMontagutCasero.com>
 */
public class ListaPokemon extends javax.swing.JDialog
{

    /**
     * Creates new form ListaPokemon
     */
    public ListaPokemon(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        CBTipoPokemon = new javax.swing.JComboBox<>();
        LTipoPokemon = new javax.swing.JLabel();
        LStaticPokeName = new javax.swing.JLabel();
        LStaticAtaque = new javax.swing.JLabel();
        LStaticDef = new javax.swing.JLabel();
        LStaticVida = new javax.swing.JLabel();
        LStaticHabitat = new javax.swing.JLabel();
        LStaticTipoAgua = new javax.swing.JLabel();
        LPokeName = new javax.swing.JLabel();
        LAtaque = new javax.swing.JLabel();
        LDefensa = new javax.swing.JLabel();
        LVida = new javax.swing.JLabel();
        LHabitat = new javax.swing.JLabel();
        LTipoAgua = new javax.swing.JLabel();
        BSiguiente = new javax.swing.JButton();
        BAnterior = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Pokemon");

        CBTipoPokemon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los pokemon", "Fuego", "Planta", "Agua" }));
        CBTipoPokemon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CBTipoPokemonActionPerformed(evt);
            }
        });

        LTipoPokemon.setText("Tipo Pokemon");

        LStaticPokeName.setText("Nombre");

        LStaticAtaque.setText("Ataque");

        LStaticDef.setText("Defensa");

        LStaticVida.setText("Vida");

        LStaticHabitat.setText("Habitat");

        LStaticTipoAgua.setText("TIpo Agua");

        LPokeName.setText("PokeName");

        LAtaque.setText("10");

        LDefensa.setText("10");

        LVida.setText("10");

        LHabitat.setText("pradera");

        LTipoAgua.setText("Salada");

        BSiguiente.setText("Siguiente");

        BAnterior.setText("Anterior");

        Exit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LTipoPokemon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBTipoPokemon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LStaticDef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LStaticAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LStaticPokeName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LPokeName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LStaticHabitat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LStaticTipoAgua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LStaticVida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LVida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addComponent(BSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(Exit)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(294, 294, 294)
                    .addComponent(BAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addGap(304, 304, 304)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CBTipoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(LTipoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LPokeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LStaticPokeName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LStaticAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LStaticDef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LDefensa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LStaticVida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LVida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LStaticHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LStaticTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSiguiente)
                    .addComponent(Exit))
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(345, Short.MAX_VALUE)
                    .addComponent(BAnterior)
                    .addGap(23, 23, 23)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBTipoPokemonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CBTipoPokemonActionPerformed
    {//GEN-HEADEREND:event_CBTipoPokemonActionPerformed
        switch (CBTipoPokemon.getSelectedIndex())
        {
            case 0: 
                Pokemon[] pokemonCollection = Controller.Controller.getObjMap();
                
                break;
            case 1: //fuego
                
                break;
            case 2: //planta
                break;
            case 3: //agua
                break;
        }
    }//GEN-LAST:event_CBTipoPokemonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAnterior;
    private javax.swing.JButton BSiguiente;
    private javax.swing.JComboBox<String> CBTipoPokemon;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel LAtaque;
    private javax.swing.JLabel LDefensa;
    private javax.swing.JLabel LHabitat;
    private javax.swing.JLabel LPokeName;
    private javax.swing.JLabel LStaticAtaque;
    private javax.swing.JLabel LStaticDef;
    private javax.swing.JLabel LStaticHabitat;
    private javax.swing.JLabel LStaticPokeName;
    private javax.swing.JLabel LStaticTipoAgua;
    private javax.swing.JLabel LStaticVida;
    private javax.swing.JLabel LTipoAgua;
    private javax.swing.JLabel LTipoPokemon;
    private javax.swing.JLabel LVida;
    // End of variables declaration//GEN-END:variables
}
