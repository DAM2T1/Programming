package View;

import Controller.TipoAgua;
import Exception.PokemonException;
import Model.Agua;
import Model.Fuego;
import Model.Planta;
import Model.Pokemon;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Albert Montagut Casero <AlbertMontagutCasero.com>
 */
public class ListaPokemon extends javax.swing.JDialog
{

    private int contadorPokemon = 0;

    /**
     * Creates new form ListaPokemon
     */
    public ListaPokemon(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        CBTipoPokemon.addItem("-- Selecciona un pokemon --");
        CBTipoPokemon.addItem("Todos los pokemon");
        CBTipoPokemon.addItem("Fuego");
        CBTipoPokemon.addItem("Planta");
        CBTipoPokemon.addItem("Agua");
        hideItems();

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
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));

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
        BSiguiente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BSiguienteActionPerformed(evt);
            }
        });

        BAnterior.setText("Anterior");
        BAnterior.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAnteriorActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ExitActionPerformed(evt);
            }
        });

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
    //TODO solve error message at start

    private boolean isSelectOptionDefaultSelected()
    {
        if (CBTipoPokemon.getSelectedIndex() == 0)
        {
            return true;
        }
        return false;
    }

    private void setGenericLabels(Pokemon pokemon)
    {
        LTipoPokemon.setText(pokemon.getClass().getSimpleName());
        LAtaque.setText(Integer.toString(pokemon.getAtk()));
        LDefensa.setText(Integer.toString(pokemon.getDef()));
        LPokeName.setText(pokemon.getName());
        LVida.setText(Integer.toString(pokemon.getLife()));
    }

    private void CBTipoPokemonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CBTipoPokemonActionPerformed
    {//GEN-HEADEREND:event_CBTipoPokemonActionPerformed
        if (isSelectOptionDefaultSelected())
        {
            showError("No puedes seleccionar esta opcion", "Invalid selection");
            return;
        }
        try
        {
            contadorPokemon = 0;
            //TODO Meter esto en un metodo para llamarlo tambien desde BSiguiente y BAnterior
            showAndSetLabelValues();
        } catch (PokemonException ex)
        {
            showError(ex.getMessage(), "Pokemon Not Found");
        }
    }//GEN-LAST:event_CBTipoPokemonActionPerformed

    private void showAndSetLabelValues() throws PokemonException
    {
        switch (CBTipoPokemon.getSelectedIndex())
        {
            case 1:
                Pokemon[] pokemonCollection = Controller.Controller.getObjMap();
                if (pokemonCollection.length == 0)
                {
                    throw new PokemonException("No Existe ningun pokemon");
                }
                showGenericItems();
                checkStatmentButtons(pokemonCollection.length);
                if (contadorPokemon < pokemonCollection.length)
                {
                    if (pokemonCollection[contadorPokemon] instanceof Fuego)
                    {
                        setGenericLabels(pokemonCollection[contadorPokemon]);
                    } else if (pokemonCollection[contadorPokemon] instanceof Agua)
                    {
                        showWaterItems();
                        setGenericLabels(pokemonCollection[contadorPokemon]);
                        if (((Agua) pokemonCollection[contadorPokemon]).getTipoAgua() == TipoAgua.DULCE)
                        {
                            LTipoAgua.setText("Dulce");
                        } else
                        {
                            LTipoAgua.setText("Salada");
                        }
                    } else if (pokemonCollection[contadorPokemon] instanceof Planta)
                    {
                        showPlantItems();
                        setGenericLabels(pokemonCollection[contadorPokemon]);
                        LHabitat.setText(((Planta) pokemonCollection[contadorPokemon]).getHabitat());
                    }
                }
                break;
            case 2: //fuego
                ArrayList<Fuego> fuegoCollection = Controller.Controller.getObjMapFire();
                if (fuegoCollection.isEmpty())
                {
                    throw new PokemonException("No hay pokemons del tipo fuego");
                }
                showGenericItems();
                setGenericLabels(fuegoCollection.get(contadorPokemon));
                checkStatmentButtons(fuegoCollection.size());
                break;
            case 3: //planta
                ArrayList<Planta> plantaCollection = Controller.Controller.getObjMapPlant();
                if (plantaCollection.isEmpty())
                {
                    throw new PokemonException("No hay pokemons del tipo planta");
                }
                showGenericItems();
                showPlantItems();
                checkStatmentButtons(plantaCollection.size());
                setGenericLabels(plantaCollection.get(contadorPokemon));
                LHabitat.setText(((Planta) plantaCollection.get(contadorPokemon)).getHabitat());
                break;
            case 4: //agua
                ArrayList<Agua> waterCollection = Controller.Controller.getObjMapWater();
                if (waterCollection.isEmpty())
                {
                    throw new PokemonException("No hay pokemons del tipo agua");
                }
                showGenericItems();
                showWaterItems();
                checkStatmentButtons(waterCollection.size());
                setGenericLabels(waterCollection.get(contadorPokemon));
                if (((Agua) waterCollection.get(contadorPokemon)).getTipoAgua() == TipoAgua.DULCE)
                {
                    LTipoAgua.setText("Dulce");
                } else
                {
                    LTipoAgua.setText("Salada");
                }
                break;
        }
    }

    private void BAnteriorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAnteriorActionPerformed
    {//GEN-HEADEREND:event_BAnteriorActionPerformed
        contadorPokemon--;
        try
        {
            showAndSetLabelValues();
        } catch (PokemonException ex)
        {
            showError(ex.getMessage(), "Pokemon Not Found");
        }
    }//GEN-LAST:event_BAnteriorActionPerformed

    private void BSiguienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BSiguienteActionPerformed
    {//GEN-HEADEREND:event_BSiguienteActionPerformed
        contadorPokemon++;
        try
        {
            showAndSetLabelValues();
        } catch (PokemonException ex)
        {
            showError(ex.getMessage(), "Pokemon Not Found");
        }
    }//GEN-LAST:event_BSiguienteActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExitActionPerformed
    {//GEN-HEADEREND:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed
    private void showError(String msg, String errorName)
    {
        JOptionPane.showMessageDialog(this, msg,
                errorName, JOptionPane.ERROR_MESSAGE);
    }

    private void checkStatmentButtons(int Pokelength)
    {
        if (contadorPokemon == 0)
        {
            BAnterior.setVisible(false);
            BSiguiente.setVisible(true);
        } else if (contadorPokemon == Pokelength - 1)
        {
            BAnterior.setVisible(true);
            BSiguiente.setVisible(false);
        } else
        {
            BAnterior.setVisible(true);
            BSiguiente.setVisible(true);
        }
    }

    private void showPlantItems()
    {
        LTipoAgua.setVisible(true);
        LStaticTipoAgua.setVisible(true);
        LStaticHabitat.setVisible(false);
        LHabitat.setVisible(false);
    }

    private void showWaterItems()
    {
        LTipoAgua.setVisible(false);
        LStaticTipoAgua.setVisible(false);
        LStaticHabitat.setVisible(true);
        LHabitat.setVisible(true);
    }

    private void showGenericItems()
    {
        LAtaque.setVisible(true);
        LDefensa.setVisible(true);
        LPokeName.setVisible(true);
        LStaticAtaque.setVisible(true);
        LStaticDef.setVisible(true);
        LStaticPokeName.setVisible(true);
        LStaticVida.setVisible(true);
        LTipoPokemon.setVisible(true);
        LVida.setVisible(true);
    }

    private void hideItems()
    {
        BSiguiente.setVisible(false);
        BAnterior.setVisible(false);
        LAtaque.setVisible(false);
        LDefensa.setVisible(false);
        LHabitat.setVisible(false);
        LPokeName.setVisible(false);
        LStaticAtaque.setVisible(false);
        LStaticDef.setVisible(false);
        LStaticHabitat.setVisible(false);
        LStaticPokeName.setVisible(false);
        LStaticTipoAgua.setVisible(false);
        LStaticVida.setVisible(false);
        LTipoAgua.setVisible(false);
        LTipoPokemon.setVisible(false);
        LVida.setVisible(false);
    }

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
