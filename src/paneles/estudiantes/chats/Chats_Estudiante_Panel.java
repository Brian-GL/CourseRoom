/*
 * Copyright (C) 2022 LENOVO
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package paneles.estudiantes.chats;

import javax.swing.JLayeredPane;
import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import frames.estudiantes.Buscar_Usuario_Chatear_Estudiante_Frame;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelos.ChatsPersonalesModel;
import paneles.estudiantes.Tablero_Estudiante_Panel;

/**
 *
 * @author LENOVO
 */
public class Chats_Estudiante_Panel extends JLayeredPane implements Limpieza_Interface, Componentes_Interface{

    private Lista<Chat_Estudiante_Panel> mostrar_Chats_Lista;
    private Lista<Chat_Estudiante_Panel> buscar_Chats_Lista;
    
    /**
     * Creates new form Pagina_Chats_Estudiante
     */
    public Chats_Estudiante_Panel() {
        initComponents();
        Iniciar_Componentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrar_Chats_JPanel = new javax.swing.JPanel();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        acciones_JPanel = new javax.swing.JPanel();
        actualizar_JButton = new javax.swing.JButton();
        chatear_JButton = new javax.swing.JButton();
        buscar_Chats_JButton = new javax.swing.JButton();
        mostrar_Chats_JScrollPane = new javax.swing.JScrollPane();
        mostrar_Chats_JTable = new javax.swing.JTable();
        buscar_Chats_JPanel = new javax.swing.JPanel();
        buscar_JTextField = new javax.swing.JTextField();
        mostrar_Chats_JButton = new javax.swing.JButton();
        buscar_Chats_JScrollPane = new javax.swing.JScrollPane();
        buscar_Chats_JTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 630));
        setLayout(new java.awt.CardLayout());

        mostrar_Chats_JPanel.setOpaque(false);
        mostrar_Chats_JPanel.setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        contenido_Titulo_JPanel.setOpaque(false);
        contenido_Titulo_JPanel.setLayout(new java.awt.BorderLayout());

        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Chats Personales");
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));
        contenido_Titulo_JPanel.add(titulo_JLabel, java.awt.BorderLayout.WEST);

        acciones_JPanel.setOpaque(false);

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setToolTipText("<html> <h4>Actualizar<br>Página</h4> </html>");
        actualizar_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)actualizar_JButton.getIcon()).getImage().flush();
        actualizar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseExited(evt);
            }
        });

        chatear_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/online-chat.png"))); // NOI18N
        chatear_JButton.setToolTipText("<html> <h3>Nuevo<br>Chat</h3> </html>");
        chatear_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)chatear_JButton.getIcon()).getImage().flush();
        chatear_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatear_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chatear_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chatear_JButtonMouseExited(evt);
            }
        });

        buscar_Chats_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_Chats_JButton.setToolTipText("<html> <h3>Buscar<br>Chat</h3> </html>");
        buscar_Chats_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)buscar_Chats_JButton.getIcon()).getImage().flush();
        buscar_Chats_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_Chats_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_Chats_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_Chats_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout acciones_JPanelLayout = new javax.swing.GroupLayout(acciones_JPanel);
        acciones_JPanel.setLayout(acciones_JPanelLayout);
        acciones_JPanelLayout.setHorizontalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(chatear_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar_Chats_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar_JButton)
                .addGap(0, 0, 0))
        );
        acciones_JPanelLayout.setVerticalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_Chats_JButton)
                    .addComponent(actualizar_JButton)
                    .addComponent(chatear_JButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido_Titulo_JPanel.add(acciones_JPanel, java.awt.BorderLayout.EAST);

        mostrar_Chats_JScrollPane.setBorder(null);
        mostrar_Chats_JScrollPane.setOpaque(false);

        mostrar_Chats_JTable.setAutoCreateRowSorter(true);
        mostrar_Chats_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mostrar_Chats_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Chat", "Creado", "Último Mensaje"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }

                @Override
                public Class getColumnClass(int column)
                {
                    for(int i = 0; i < mostrar_Chats_JTable.getRowCount(); i++)
                    {
                        //The first valid value of a cell of given column is retrieved.
                        if(getValueAt(i,column) != null)
                        {
                            return getValueAt(i, column).getClass();
                        }
                    }
                    //if no valid value is found, default renderer is returned.
                    return super.getColumnClass(column);
                }
            });
            mostrar_Chats_JTable.setRowHeight(100);
            mostrar_Chats_JTable.setShowGrid(true);
            mostrar_Chats_JTable.setSurrendersFocusOnKeystroke(true);
            mostrar_Chats_JTable.setRowSorter(new TableRowSorter(mostrar_Chats_JTable.getModel()));
            mostrar_Chats_JTable.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.getClickCount() == 2) {

                        JTable tabla = (JTable) e.getComponent();
                        int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                        int columna = tabla.getSelectedColumn();

                        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

                        Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                        Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                    }
                }
            });
            mostrar_Chats_JScrollPane.setViewportView(mostrar_Chats_JTable);

            javax.swing.GroupLayout mostrar_Chats_JPanelLayout = new javax.swing.GroupLayout(mostrar_Chats_JPanel);
            mostrar_Chats_JPanel.setLayout(mostrar_Chats_JPanelLayout);
            mostrar_Chats_JPanelLayout.setHorizontalGroup(
                mostrar_Chats_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Chats_JPanelLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(mostrar_Chats_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                        .addComponent(mostrar_Chats_JScrollPane))
                    .addGap(32, 32, 32))
            );
            mostrar_Chats_JPanelLayout.setVerticalGroup(
                mostrar_Chats_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Chats_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(mostrar_Chats_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addContainerGap())
            );

            add(mostrar_Chats_JPanel, "Mostrar");

            buscar_Chats_JPanel.setOpaque(false);
            buscar_Chats_JPanel.setPreferredSize(new java.awt.Dimension(1110, 630));

            buscar_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
            buscar_JTextField.setToolTipText("<html> <h3>Buscar chats. Presiona ENTER para realizar la búsqueda</h3> </html>");
            buscar_JTextField.setBorder(null);
            buscar_JTextField.setMaximumSize(new java.awt.Dimension(2147483647, 50));
            buscar_JTextField.setMinimumSize(new java.awt.Dimension(64, 50));
            buscar_JTextField.setPreferredSize(new java.awt.Dimension(64, 50));
            buscar_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    buscar_JTextFieldKeyPressed(evt);
                }
            });

            mostrar_Chats_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/video-chat.png"))); // NOI18N
            mostrar_Chats_JButton.setToolTipText("<html>\n<h3>Regresar A Mis Chats Personales</h3>\n</html>");
            mostrar_Chats_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            mostrar_Chats_JButton.setMaximumSize(new java.awt.Dimension(64, 64));
            mostrar_Chats_JButton.setMinimumSize(new java.awt.Dimension(64, 64));
            mostrar_Chats_JButton.setPreferredSize(new java.awt.Dimension(64, 64));
            ((ImageIcon)mostrar_Chats_JButton.getIcon()).getImage().flush();
            mostrar_Chats_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mostrar_Chats_JButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    mostrar_Chats_JButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    mostrar_Chats_JButtonMouseExited(evt);
                }
            });

            buscar_Chats_JScrollPane.setBorder(null);
            buscar_Chats_JScrollPane.setOpaque(false);

            buscar_Chats_JTable.setAutoCreateRowSorter(true);
            buscar_Chats_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            buscar_Chats_JTable.setModel(

                new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Chat", "Creado", "Último Mensaje"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }

                    @Override
                    public Class getColumnClass(int column)
                    {
                        for(int i = 0; i < buscar_Chats_JTable.getRowCount(); i++)
                        {
                            //The first valid value of a cell of given column is retrieved.
                            if(getValueAt(i,column) != null)
                            {
                                return getValueAt(i, column).getClass();
                            }
                        }
                        //if no valid value is found, default renderer is returned.
                        return super.getColumnClass(column);
                    }
                });
                buscar_Chats_JTable.setRowHeight(100);
                buscar_Chats_JTable.setShowGrid(true);
                buscar_Chats_JTable.setSurrendersFocusOnKeystroke(true);
                buscar_Chats_JTable.setRowSorter(new TableRowSorter(buscar_Chats_JTable.getModel()));
                buscar_Chats_JTable.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (e.getClickCount() == 2) {

                            JTable tabla = (JTable) e.getComponent();
                            int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                            int columna = tabla.getSelectedColumn();

                            DefaultTableModel modelo = (DefaultTableModel) buscar_Chats_JTable.getModel();

                            Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                            Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                        }
                    }
                });
                buscar_Chats_JScrollPane.setViewportView(buscar_Chats_JTable);

                javax.swing.GroupLayout buscar_Chats_JPanelLayout = new javax.swing.GroupLayout(buscar_Chats_JPanel);
                buscar_Chats_JPanel.setLayout(buscar_Chats_JPanelLayout);
                buscar_Chats_JPanelLayout.setHorizontalGroup(
                    buscar_Chats_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscar_Chats_JPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(buscar_Chats_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscar_Chats_JPanelLayout.createSequentialGroup()
                                .addComponent(mostrar_Chats_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
                            .addComponent(buscar_Chats_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                );
                buscar_Chats_JPanelLayout.setVerticalGroup(
                    buscar_Chats_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscar_Chats_JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscar_Chats_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscar_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrar_Chats_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_Chats_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addContainerGap())
                );

                add(buscar_Chats_JPanel, "Buscar");
            }// </editor-fold>//GEN-END:initComponents

    private void buscar_Chats_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Chats_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            actualizar_JButton.setVisible(false);
            ((CardLayout)this.getLayout()).show(this, "Buscar");
        }
    }//GEN-LAST:event_buscar_Chats_JButtonMouseClicked

    private void buscar_Chats_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Chats_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_Chats_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_buscar_Chats_JButtonMouseEntered

    private void buscar_Chats_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Chats_JButtonMouseExited
        // TODO add your handling code here:
        buscar_Chats_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_buscar_Chats_JButtonMouseExited

    private void buscar_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_JTextFieldKeyPressed
        int longitud = buscar_JTextField.getText().length();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (longitud > 99) {
                buscar_JTextField.setText(buscar_JTextField.getText().substring(0, longitud - 1));
                CourseRoom.Utilerias().Mensaje_Alerta("Alerta!!!","La Busqueda De Chats<br>Rebasa Los 100 Caracteres");
            }else{
                    Buscar_Chats_Personales(buscar_JTextField.getText());
            }
        }

    }//GEN-LAST:event_buscar_JTextFieldKeyPressed

    private void mostrar_Chats_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Chats_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            actualizar_JButton.setVisible(true);
            ((CardLayout)this.getLayout()).show(this, "Mostrar");
        }
    }//GEN-LAST:event_mostrar_Chats_JButtonMouseClicked

    private void mostrar_Chats_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Chats_JButtonMouseEntered
        // TODO add your handling code here:
        mostrar_Chats_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_mostrar_Chats_JButtonMouseEntered

    private void mostrar_Chats_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Chats_JButtonMouseExited
        // TODO add your handling code here:
        mostrar_Chats_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_mostrar_Chats_JButtonMouseExited

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
                Obtener_Chats_Personales(true);
        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited

    private void chatear_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatear_JButtonMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {
            Buscar_Usuario_Chatear_Estudiante_Frame buscar_Usuario_Chatear_Frame
            = new Buscar_Usuario_Chatear_Estudiante_Frame();
            buscar_Usuario_Chatear_Frame.setVisible(true);
        }
    }//GEN-LAST:event_chatear_JButtonMouseClicked

    private void chatear_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatear_JButtonMouseEntered
        // TODO add your handling code here:
        chatear_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_chatear_JButtonMouseEntered

    private void chatear_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatear_JButtonMouseExited
        // TODO add your handling code here:
        chatear_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_chatear_JButtonMouseExited

    private void Obtener_Chats_Personales(boolean bandera){
        
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Chats_JTable.getModel();
        modelo.setRowCount(0);
        
        Chat_Estudiante_Panel chat_Estudiante_Panel;
        while(!mostrar_Chats_Lista.is_empty()){
            chat_Estudiante_Panel= mostrar_Chats_Lista.delist();
            Tablero_Estudiante_Panel.Retirar_Vista(chat_Estudiante_Panel);
            chat_Estudiante_Panel.Limpiar();
        }
            Lista<ChatsPersonalesModel> lista
                    = CourseRoom.Solicitudes().Obtener_Chats_Personales(Tablero_Estudiante_Panel.Id_Usuario());

            if (!lista.is_empty()) {
                while (!lista.is_empty()) {
                    Agregar_Chat(lista.delist());
                }
            } else {
                if(bandera){
                    CourseRoom.Utilerias().Mensaje_Alerta("Chats Personales", "No Se Encontraron Chats Personales");
                }
            }
    }
    
    private void Buscar_Chats_Personales(String busqueda){
        
        DefaultTableModel modelo = (DefaultTableModel) buscar_Chats_JTable.getModel();
        modelo.setRowCount(0);
        
        Chat_Estudiante_Panel chat_Estudiante_Panel;
        while(!buscar_Chats_Lista.is_empty()){
            chat_Estudiante_Panel= buscar_Chats_Lista.delist();
            if(!Existe_Chat(chat_Estudiante_Panel.Id_Chat())){
                Tablero_Estudiante_Panel.Retirar_Vista(chat_Estudiante_Panel);
                chat_Estudiante_Panel.Limpiar();
            }
        }
            Lista<ChatsPersonalesModel> lista
                    = CourseRoom.Solicitudes().Buscar_Chats_Personales(busqueda, Tablero_Estudiante_Panel.Id_Usuario());

            if (!lista.is_empty()) {
                while (!lista.is_empty()) {
                    Agregar_Chat_Busqueda(lista.delist());
                }
            } else {
                CourseRoom.Utilerias().Mensaje_Alerta("Alerta", "No Se Encontraron Chats");
            }
    }
    
    private void Agregar_Chat(ChatsPersonalesModel chatsPersonalesModel) {

        DefaultTableModel modelo = (DefaultTableModel) mostrar_Chats_JTable.getModel();
            String id_Chat = CourseRoom.Utilerias().Concatenar("Chat_Personal_", chatsPersonalesModel.Id_Chat());
            Celda_Renderer[] celdas = new Celda_Renderer[3];
            Celda_Renderer celda;
            Image imagen;

            byte[] bytes_Imagen_Chat = CourseRoom.Solicitudes().Obtener_Imagen_Chat_Personal
            (chatsPersonalesModel.Id_Chat(), chatsPersonalesModel.Id_Usuario());

            if (bytes_Imagen_Chat.length > 0) {
                imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen_Chat);

                if (imagen != null) {
                    imagen = imagen.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                    ImageIcon icono_Imagen = new ImageIcon(imagen);
                    celda = new Celda_Renderer(icono_Imagen, chatsPersonalesModel.Nombre_Completo(), id_Chat);
                    celdas[0] = celda;
                } else {
                    celda = new Celda_Renderer(chatsPersonalesModel.Nombre_Completo(), id_Chat);
                    celdas[0] = celda;
                }
            }

            celda = new Celda_Renderer(chatsPersonalesModel.Fecha_Creacion(), id_Chat);
            celdas[1] = celda;
            celda = new Celda_Renderer(chatsPersonalesModel.Ultimo_Mensaje(), id_Chat);
            celdas[2] = celda;

            modelo.addRow(celdas);

            mostrar_Chats_JTable.setRowHeight(modelo.getRowCount() - 1, CourseRoom.Utilerias().Altura_Fila_Tabla_Icono(0));

            Chat_Estudiante_Panel chat_Estudiante_Panel
                    = new Chat_Estudiante_Panel(chatsPersonalesModel.Id_Chat(), chatsPersonalesModel.Id_Usuario());

            mostrar_Chats_Lista.push_back(chat_Estudiante_Panel);

            Tablero_Estudiante_Panel.Agregar_Vista(chat_Estudiante_Panel, id_Chat);
    }
    
    private void Agregar_Chat_Busqueda(ChatsPersonalesModel chatsPersonalesModel) {
            String id_Chat = CourseRoom.Utilerias().Concatenar("Chat_Personal_", chatsPersonalesModel.Id_Chat());
            DefaultTableModel modelo = (DefaultTableModel) buscar_Chats_JTable.getModel();

            Celda_Renderer[] celdas = new Celda_Renderer[3];
            Celda_Renderer celda;
            Image imagen;
            byte[] bytes_Imagen_Chat = CourseRoom.Solicitudes().Obtener_Imagen_Chat_Personal
            (chatsPersonalesModel.Id_Chat(), chatsPersonalesModel.Id_Usuario());

            if (bytes_Imagen_Chat.length > 0) {
                imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen_Chat);

                if (imagen != null) {

                    imagen = imagen.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                    ImageIcon icono_Imagen = new ImageIcon(imagen);
                    celda = new Celda_Renderer(icono_Imagen, chatsPersonalesModel.Nombre_Completo()
                            , CourseRoom.Utilerias().Concatenar("Chat_Personal_", chatsPersonalesModel.Id_Chat()));
                    celdas[0] = celda;
                    //icono_Imagen.getImage().flush();
                } else {
                    celda = new Celda_Renderer(chatsPersonalesModel.Nombre_Completo(), id_Chat);
                    celdas[0] = celda;
                }
            }

            celda = new Celda_Renderer(chatsPersonalesModel.Fecha_Creacion(), id_Chat);
            celdas[1] = celda;
            celda = new Celda_Renderer(chatsPersonalesModel.Ultimo_Mensaje(), id_Chat);
            celdas[2] = celda;

            modelo.addRow(celdas);

            buscar_Chats_JTable.setRowHeight(modelo.getRowCount() - 1, 
                CourseRoom.Utilerias().Altura_Fila_Tabla_Icono(0));

            if (!Existe_Chat(chatsPersonalesModel.Id_Chat())) {
                Chat_Estudiante_Panel chat_Estudiante_Panel
                        = new Chat_Estudiante_Panel(chatsPersonalesModel.Id_Chat(), chatsPersonalesModel.Id_Usuario());
                buscar_Chats_Lista.push_back(chat_Estudiante_Panel);

                Tablero_Estudiante_Panel.Agregar_Vista(chat_Estudiante_Panel, 
                CourseRoom.Utilerias().Concatenar("Chat_Personal_", chatsPersonalesModel.Id_Chat()));
            }
    }
    
    private boolean Existe_Chat(int id_Chat){
        Nodo<Chat_Estudiante_Panel> first = mostrar_Chats_Lista.front();
        Nodo<Chat_Estudiante_Panel> last = mostrar_Chats_Lista.back();

        int middle_index = (mostrar_Chats_Lista.size())/2;

        if(middle_index % 2 == 0){
            for (int i = 0; i < middle_index; i++) {

                if (first.element().Id_Chat() == id_Chat){
                    return true;
                }
                if (last.element().Id_Chat() == id_Chat){
                    return true;
                }
                first = first.next();
                last = last.previous();
            }
            return false;
        }else{
            for(int i = 0; i < middle_index;i++) {

                if(first.element().Id_Chat() == id_Chat){
                    return true;
                }
                if(last.element().Id_Chat() == id_Chat){
                    return true;
                }

                first = first.next();
                last = last.previous();
            }

            return mostrar_Chats_Lista.medium().Id_Chat() == id_Chat;
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acciones_JPanel;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JButton buscar_Chats_JButton;
    private javax.swing.JPanel buscar_Chats_JPanel;
    private javax.swing.JScrollPane buscar_Chats_JScrollPane;
    private javax.swing.JTable buscar_Chats_JTable;
    private javax.swing.JTextField buscar_JTextField;
    private javax.swing.JButton chatear_JButton;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton mostrar_Chats_JButton;
    private javax.swing.JPanel mostrar_Chats_JPanel;
    private javax.swing.JScrollPane mostrar_Chats_JScrollPane;
    private javax.swing.JTable mostrar_Chats_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {

        mostrar_Chats_JScrollPane.getViewport().setOpaque(false);
        mostrar_Chats_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        mostrar_Chats_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        mostrar_Chats_Lista = new Lista<>();

        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
        mostrar_Chats_JTable.getTableHeader().setFont(gadugi);

        mostrar_Chats_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        buscar_Chats_JScrollPane.getViewport().setOpaque(false);
        buscar_Chats_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        buscar_Chats_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        buscar_Chats_Lista = new Lista<>();

        buscar_Chats_JTable.getTableHeader().setFont(gadugi);

        buscar_Chats_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        Obtener_Chats_Personales(false);
        
    }

    @Override
    public void Colorear_Componentes() {
        
        chatear_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias().Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());

        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());

        Font fuente = new java.awt.Font("Segoe UI", 1, 14);
        BevelBorder borde_Linea = new BevelBorder(BevelBorder.LOWERED);
        TitledBorder borde_Titulo = new TitledBorder(borde_Linea, "Buscar Chat(s)", TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.TOP,  fuente, CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        buscar_JTextField.setBorder(borde_Titulo);

        buscar_JTextField.setBackground(CourseRoom.Utilerias().Segundo_Color());
        buscar_JTextField.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        buscar_JTextField.setCaretColor(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        buscar_Chats_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        mostrar_Chats_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        
        mostrar_Chats_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        mostrar_Chats_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        mostrar_Chats_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        mostrar_Chats_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        mostrar_Chats_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        mostrar_Chats_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        mostrar_Chats_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        buscar_Chats_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        buscar_Chats_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        buscar_Chats_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        buscar_Chats_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        buscar_Chats_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        buscar_Chats_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        buscar_Chats_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Chats_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }

        Chat_Estudiante_Panel chat_Estudiante_Panel;
        for (Nodo<Chat_Estudiante_Panel> nodo = mostrar_Chats_Lista.front(); nodo != null; nodo = nodo.next()) {
            chat_Estudiante_Panel = nodo.element();
            chat_Estudiante_Panel.Colorear_Componentes();
        }
        
        modelo = (DefaultTableModel) buscar_Chats_JTable.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }

        for (Nodo<Chat_Estudiante_Panel> nodo = buscar_Chats_Lista.front(); nodo != null; nodo = nodo.next()) {
            chat_Estudiante_Panel = nodo.element();
            chat_Estudiante_Panel.Colorear_Componentes();
        }
    }

    @Override
    public void Limpiar() {
        mostrar_Chats_Lista.clear();
        DefaultTableModel modelo = (DefaultTableModel) buscar_Chats_JTable.getModel();
        modelo.setRowCount(0);
        buscar_Chats_Lista.clear();
        modelo = (DefaultTableModel) mostrar_Chats_JTable.getModel();
        modelo.setRowCount(0);
    }
    
}
