/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteJF;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paqueteClass.Conexion;
 
/**
 *
 * @author Lugue
 */
public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        mostraTabla("");
        estructurarBox();
        
        
        deshabilitarComienzo();
    }

    //objetos
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    Avanzado av = new Avanzado();
    
    //var globales
   private String atributo = "id";
    @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tf_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        box_temporadas = new javax.swing.JComboBox<>();
        panel_temporadas = new javax.swing.JPanel();
        tf_temp1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label_temp4 = new javax.swing.JLabel();
        tf_temp4 = new javax.swing.JTextField();
        label_temp7 = new javax.swing.JLabel();
        tf_temp7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_temp3 = new javax.swing.JTextField();
        label_temp6 = new javax.swing.JLabel();
        tf_temp6 = new javax.swing.JTextField();
        label_temp9 = new javax.swing.JLabel();
        tf_temp9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_temp2 = new javax.swing.JTextField();
        label_temp5 = new javax.swing.JLabel();
        tf_temp5 = new javax.swing.JTextField();
        label_temp8 = new javax.swing.JLabel();
        tf_temp8 = new javax.swing.JTextField();
        rboton_mostrarTemp = new javax.swing.JRadioButton();
        boton_guardar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        boton_avanzado = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        boton_nuevo = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        box_encontrar = new javax.swing.JComboBox<>();
        tf_encontrar = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        boton_refrescar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del anime");

        panel_temporadas.setBackground(new java.awt.Color(51, 255, 51));
        panel_temporadas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Capitulos de cada temporada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        tf_temp1.setText("0");
        tf_temp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Temporada 1");

        label_temp4.setBackground(new java.awt.Color(0, 0, 0));
        label_temp4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp4.setForeground(new java.awt.Color(0, 0, 0));
        label_temp4.setText("Temporada 4");

        tf_temp4.setText("0");
        tf_temp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp4MouseClicked(evt);
            }
        });

        label_temp7.setBackground(new java.awt.Color(0, 0, 0));
        label_temp7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp7.setForeground(new java.awt.Color(0, 0, 0));
        label_temp7.setText("Temporada 7");

        tf_temp7.setText("0");
        tf_temp7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp7MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Temporada 3");

        tf_temp3.setText("0");
        tf_temp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp3MouseClicked(evt);
            }
        });

        label_temp6.setBackground(new java.awt.Color(0, 0, 0));
        label_temp6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp6.setForeground(new java.awt.Color(0, 0, 0));
        label_temp6.setText("Temporada 6");

        tf_temp6.setText("0");
        tf_temp6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp6MouseClicked(evt);
            }
        });

        label_temp9.setBackground(new java.awt.Color(0, 0, 0));
        label_temp9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp9.setForeground(new java.awt.Color(0, 0, 0));
        label_temp9.setText("Temporada 9");

        tf_temp9.setText("0");
        tf_temp9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp9MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Temporada 2");

        tf_temp2.setText("0");
        tf_temp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp2MouseClicked(evt);
            }
        });

        label_temp5.setBackground(new java.awt.Color(0, 0, 0));
        label_temp5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp5.setForeground(new java.awt.Color(0, 0, 0));
        label_temp5.setText("Temporada 5");

        tf_temp5.setText("0");
        tf_temp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp5MouseClicked(evt);
            }
        });

        label_temp8.setBackground(new java.awt.Color(0, 0, 0));
        label_temp8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp8.setForeground(new java.awt.Color(0, 0, 0));
        label_temp8.setText("Temporada 8");

        tf_temp8.setText("0");
        tf_temp8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp8MouseClicked(evt);
            }
        });

        rboton_mostrarTemp.setBackground(new java.awt.Color(51, 255, 51));
        rboton_mostrarTemp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rboton_mostrarTemp.setForeground(new java.awt.Color(0, 0, 255));
        rboton_mostrarTemp.setText("Mas temporadas");
        rboton_mostrarTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboton_mostrarTempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_temporadasLayout = new javax.swing.GroupLayout(panel_temporadas);
        panel_temporadas.setLayout(panel_temporadasLayout);
        panel_temporadasLayout.setHorizontalGroup(
            panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_temporadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(tf_temp1)
                    .addComponent(label_temp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp4)
                    .addComponent(label_temp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp7))
                .addGap(59, 59, 59)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_temp8, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(tf_temp8)
                    .addComponent(label_temp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp2))
                .addGap(54, 54, 54)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(tf_temp3)
                    .addComponent(label_temp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp9)
                    .addComponent(label_temp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp6))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_temporadasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rboton_mostrarTemp)
                .addGap(115, 115, 115))
        );
        panel_temporadasLayout.setVerticalGroup(
            panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_temporadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(rboton_mostrarTemp)
                .addGap(18, 18, 18)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        boton_guardar.setText("Guardar");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });

        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        boton_avanzado.setText("Avanzado");
        boton_avanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_avanzadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Temporadas");

        boton_nuevo.setText("Nuevo");
        boton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoActionPerformed(evt);
            }
        });

        boton_cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_temporadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_nombre))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(box_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_nuevo))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(boton_cancelar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(boton_avanzado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_guardar)
                            .addComponent(boton_eliminar))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(boton_nuevo))
                .addGap(18, 18, 18)
                .addComponent(panel_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_guardar)
                    .addComponent(boton_cancelar))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_eliminar)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_avanzado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        boton_refrescar.setText("Refrescar");
        boton_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(box_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_refrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_buscar)
                            .addComponent(boton_refrescar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tf_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        box_temporadas = new javax.swing.JComboBox<>();
        panel_temporadas = new javax.swing.JPanel();
        tf_temp1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label_temp4 = new javax.swing.JLabel();
        tf_temp4 = new javax.swing.JTextField();
        label_temp7 = new javax.swing.JLabel();
        tf_temp7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_temp3 = new javax.swing.JTextField();
        label_temp6 = new javax.swing.JLabel();
        tf_temp6 = new javax.swing.JTextField();
        label_temp9 = new javax.swing.JLabel();
        tf_temp9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_temp2 = new javax.swing.JTextField();
        label_temp5 = new javax.swing.JLabel();
        tf_temp5 = new javax.swing.JTextField();
        label_temp8 = new javax.swing.JLabel();
        tf_temp8 = new javax.swing.JTextField();
        rboton_mostrarTemp = new javax.swing.JRadioButton();
        boton_guardar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        boton_avanzado = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        boton_nuevo = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        box_encontrar = new javax.swing.JComboBox<>();
        tf_encontrar = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        boton_refrescar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del anime");

        panel_temporadas.setBackground(new java.awt.Color(51, 255, 51));
        panel_temporadas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Capitulos de cada temporada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        tf_temp1.setText("0");
        tf_temp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Temporada 1");

        label_temp4.setBackground(new java.awt.Color(0, 0, 0));
        label_temp4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp4.setForeground(new java.awt.Color(0, 0, 0));
        label_temp4.setText("Temporada 4");

        tf_temp4.setText("0");
        tf_temp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp4MouseClicked(evt);
            }
        });

        label_temp7.setBackground(new java.awt.Color(0, 0, 0));
        label_temp7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp7.setForeground(new java.awt.Color(0, 0, 0));
        label_temp7.setText("Temporada 7");

        tf_temp7.setText("0");
        tf_temp7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp7MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Temporada 3");

        tf_temp3.setText("0");
        tf_temp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp3MouseClicked(evt);
            }
        });

        label_temp6.setBackground(new java.awt.Color(0, 0, 0));
        label_temp6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp6.setForeground(new java.awt.Color(0, 0, 0));
        label_temp6.setText("Temporada 6");

        tf_temp6.setText("0");
        tf_temp6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp6MouseClicked(evt);
            }
        });

        label_temp9.setBackground(new java.awt.Color(0, 0, 0));
        label_temp9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp9.setForeground(new java.awt.Color(0, 0, 0));
        label_temp9.setText("Temporada 9");

        tf_temp9.setText("0");
        tf_temp9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp9MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Temporada 2");

        tf_temp2.setText("0");
        tf_temp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp2MouseClicked(evt);
            }
        });

        label_temp5.setBackground(new java.awt.Color(0, 0, 0));
        label_temp5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp5.setForeground(new java.awt.Color(0, 0, 0));
        label_temp5.setText("Temporada 5");

        tf_temp5.setText("0");
        tf_temp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp5MouseClicked(evt);
            }
        });

        label_temp8.setBackground(new java.awt.Color(0, 0, 0));
        label_temp8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_temp8.setForeground(new java.awt.Color(0, 0, 0));
        label_temp8.setText("Temporada 8");

        tf_temp8.setText("0");
        tf_temp8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_temp8MouseClicked(evt);
            }
        });

        rboton_mostrarTemp.setBackground(new java.awt.Color(51, 255, 51));
        rboton_mostrarTemp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rboton_mostrarTemp.setForeground(new java.awt.Color(0, 0, 255));
        rboton_mostrarTemp.setText("Mas temporadas");
        rboton_mostrarTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboton_mostrarTempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_temporadasLayout = new javax.swing.GroupLayout(panel_temporadas);
        panel_temporadas.setLayout(panel_temporadasLayout);
        panel_temporadasLayout.setHorizontalGroup(
            panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_temporadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(tf_temp1)
                    .addComponent(label_temp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp4)
                    .addComponent(label_temp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp7))
                .addGap(59, 59, 59)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_temp8, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(tf_temp8)
                    .addComponent(label_temp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp2))
                .addGap(54, 54, 54)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(tf_temp3)
                    .addComponent(label_temp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp9)
                    .addComponent(label_temp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_temp6))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_temporadasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rboton_mostrarTemp)
                .addGap(115, 115, 115))
        );
        panel_temporadasLayout.setVerticalGroup(
            panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_temporadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(rboton_mostrarTemp)
                .addGap(18, 18, 18)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_temporadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_temporadasLayout.createSequentialGroup()
                        .addComponent(label_temp8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        boton_guardar.setText("Guardar");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });

        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        boton_avanzado.setText("Avanzado");
        boton_avanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_avanzadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Temporadas");

        boton_nuevo.setText("Nuevo");

        boton_cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_temporadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_nombre))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(box_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_nuevo))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(boton_cancelar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(boton_avanzado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_guardar)
                            .addComponent(boton_eliminar))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(boton_nuevo))
                .addGap(18, 18, 18)
                .addComponent(panel_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_guardar)
                    .addComponent(boton_cancelar))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_eliminar)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_avanzado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        boton_refrescar.setText("Refrescar");
        boton_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(box_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_refrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_buscar)
                            .addComponent(boton_refrescar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_avanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_avanzadoActionPerformed
       mostraTabla("");
       av.setVisible(true);
    }//GEN-LAST:event_boton_avanzadoActionPerformed

    
    private void boton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarActionPerformed
       insertarDatos();
    }//GEN-LAST:event_boton_guardarActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        confirmarEliminacion();
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        buscarTFconBOX();
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void boton_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_refrescarActionPerformed
        mostraTabla("");
    }//GEN-LAST:event_boton_refrescarActionPerformed

    //cuando de click
    private void tf_temp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp1MouseClicked
        tf_temp1.setText("");
    }//GEN-LAST:event_tf_temp1MouseClicked

    private void tf_temp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp2MouseClicked
        tf_temp2.setText("");
    }//GEN-LAST:event_tf_temp2MouseClicked

    private void tf_temp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp3MouseClicked
        tf_temp3.setText("");
    }//GEN-LAST:event_tf_temp3MouseClicked

    private void tf_temp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp4MouseClicked
       tf_temp4.setText("");
    }//GEN-LAST:event_tf_temp4MouseClicked

    private void tf_temp5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp5MouseClicked
        tf_temp5.setText("");
    }//GEN-LAST:event_tf_temp5MouseClicked

    private void tf_temp6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp6MouseClicked
        tf_temp6.setText("");
    }//GEN-LAST:event_tf_temp6MouseClicked

    private void tf_temp7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp7MouseClicked
        tf_temp7.setText("");
    }//GEN-LAST:event_tf_temp7MouseClicked

    private void tf_temp8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp8MouseClicked
        tf_temp8.setText("");
    }//GEN-LAST:event_tf_temp8MouseClicked

    private void tf_temp9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_temp9MouseClicked
        tf_temp9.setText("");
    }//GEN-LAST:event_tf_temp9MouseClicked

    private void rboton_mostrarTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboton_mostrarTempActionPerformed
        mostrarTFradioBoton();
    }//GEN-LAST:event_rboton_mostrarTempActionPerformed

    private void boton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_nuevoActionPerformed

 
    private void mostraTabla(String valor){
         DefaultTableModel modelo = new DefaultTableModel();
            //agregar columnas
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Temp");
            modelo.addColumn("Cap. total");
            tabla.setModel(modelo);
            //Fin
            
            //variables
            String sql = "";
            //fin
            
            //verificar que es SQL
            if(valor.equalsIgnoreCase("")){
                sql = "SELECT id,nombre,temp,cap_total  FROM anime";
            }else{
                sql = "SELECT id, nombre, temp, cap_total FROM anime WHERE " +atributo +"=" +"'" +valor +"'";
            }
            //fin


            String datos[] = new String[5];
            Statement st;
            
             try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            

            
            //Agregar los reglones
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            
            tabla.setModel(modelo);
            //Fin

           
            
            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        //enviar los datos a la base de datos
    private void insertarDatos() {
        if (probarCamposVacios() == true) {
            pasarTFaVariables();
            try {
                PreparedStatement ppt = cn.prepareStatement("INSERT INTO anime(nombre,temp,cap_total,temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8,temp9) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                ppt.setString(1, tf_nombre.getText());
                ppt.setInt(2, sacarDelBox());
                ppt.setInt(3, calcularTotalCapitulos());
                ppt.setInt(4, numTemp1);
                ppt.setInt(5, numTemp2);
                ppt.setInt(6, numTemp3);
                ppt.setInt(7, numTemp4);
                ppt.setInt(8, numTemp5);
                ppt.setInt(9, numTemp6);
                ppt.setInt(10, numTemp7);
                ppt.setInt(11, numTemp8);
                ppt.setInt(12, numTemp9);
                
                ppt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Datos guardados");
                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos", "Problema con los datos", JOptionPane.QUESTION_MESSAGE);

                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    
    //box
    private int sacarDelBox(){
        String tempSelec = box_temporadas.getSelectedItem().toString();
        int numT = Integer.parseInt(tempSelec);
        return numT;
    }
    
    //provar campo nombre
    private boolean probarCamposVacios(){
        String y = tf_nombre.getText();
        boolean x ;
        if(y.isEmpty()){
             x = false;
              JOptionPane.showMessageDialog(null, "El campo del nombre esta vacio", "Problema con los datos", 0);
        }else{
             x = true;
        }
        
        return x;
    }
    
    //buscar con el box
    private void buscarTFconBOX(){
                atributo = box_encontrar.getSelectedItem().toString();
        mostraTabla(tf_encontrar.getText());
    }
    
    //calcular el total
    private int calcularTotalCapitulos(){
        int total;
        int temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9;
        temp1 = Integer.parseInt(tf_temp1.getText());
        temp2 = Integer.parseInt(tf_temp2.getText());
        temp3 = Integer.parseInt(tf_temp3.getText());
        temp4 = Integer.parseInt(tf_temp4.getText());
        temp5 = Integer.parseInt(tf_temp5.getText());
        temp6 = Integer.parseInt(tf_temp6.getText());
        temp7 = Integer.parseInt(tf_temp7.getText());
        temp8 = Integer.parseInt(tf_temp8.getText());
        temp9 = Integer.parseInt(tf_temp9.getText());
        total = temp1 + temp2+ temp3+ temp4+ temp5+ temp6+ temp7+ temp8+ temp9;
        return total;
    }
    
    private void pasarTFaVariables() {
        numTemp1 = Integer.parseInt(tf_temp1.getText());
        numTemp2 = Integer.parseInt(tf_temp2.getText());
        numTemp4= Integer.parseInt(tf_temp4.getText());
        numTemp5= Integer.parseInt(tf_temp5.getText());
        numTemp3= Integer.parseInt(tf_temp3.getText());
        numTemp6= Integer.parseInt(tf_temp6.getText());
        numTemp7= Integer.parseInt(tf_temp7.getText());
        numTemp8= Integer.parseInt(tf_temp8.getText());
        numTemp9= Integer.parseInt(tf_temp9.getText());
    }
    
    //agregar items al box temporada
    private void estructurarBox(){
        box_temporadas.addItem("1");
        box_temporadas.addItem("2");
        box_temporadas.addItem("3");
        box_temporadas.addItem("4");
        box_temporadas.addItem("5");
        box_temporadas.addItem("6");
        box_temporadas.addItem("7");
        box_temporadas.addItem("8");
        box_temporadas.addItem("9");
        
        box_encontrar.addItem("id");
        box_encontrar.addItem("nombre");
        box_encontrar.addItem("temp");
    }

        //eliminar datos
    private void eliminar() {
        int fila = tabla.getSelectedRow();
        String valor = tabla.getValueAt(fila, 0).toString();

        if (fila >= 0) {
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM anime WHERE  id = '" + valor + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato eliminado");
                mostraTabla("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el dato");
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            
        }
    }
    
    //confimar eliminacion
    private void confirmarEliminacion(){
        int x = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas eliminar este anime?", "Confirmacion",0);
        if(x == JOptionPane.YES_OPTION){
            eliminar();
        }
    }
    
    private void mostrarTFradioBoton(){
        if(rboton_mostrarTemp.isSelected()){
            tf_temp4.setVisible(true);
            tf_temp5.setVisible(true);
            tf_temp6.setVisible(true);
            tf_temp7.setVisible(true);
            tf_temp8.setVisible(true);
            tf_temp9.setVisible(true);
            label_temp4.setVisible(true);
            label_temp5.setVisible(true);
            label_temp6.setVisible(true);
            label_temp7.setVisible(true);
            label_temp8.setVisible(true);
            label_temp9.setVisible(true);
        }else{
                        tf_temp4.setVisible(false);
            tf_temp5.setVisible(false);
            tf_temp6.setVisible(false);
            tf_temp7.setVisible(false);
            tf_temp8.setVisible(false);
            tf_temp9.setVisible(false);
            label_temp4.setVisible(false);
            label_temp5.setVisible(false);
            label_temp6.setVisible(false);
            label_temp7.setVisible(false);
            label_temp8.setVisible(false);
            label_temp9.setVisible(false);
        }
    }
    
    //variables convertidas de tf a numeros
    private int numTemp1;
    private int numTemp2;
   private  int numTemp3;
    private int numTemp4;
    private int numTemp5;
  private   int numTemp6;
    private int numTemp7;
  private   int numTemp8;
    private int numTemp9;
    //fin de la variables convertidas

    //empezamos a deshabilitar y a habilitar
    private void deshabilitarComienzo(){
        tf_nombre.setEnabled(false);
        box_temporadas.setEnabled(false);
        panel_temporadas.setEnabled(false);
        boton_cancelar.setEnabled(false);
        boton_guardar.setEnabled(false);
    }
    
    private void cuandoDeANuevo(){
        boton_nuevo.setEnabled(false);
        boton_guardar.setEnabled(true);
        boton_cancelar.setEnabled(true);
        panel_temporadas.setEnabled(true);
        box_temporadas.setEnabled(true);
        tf_nombre.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_avanzado;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JButton boton_nuevo;
    private javax.swing.JButton boton_refrescar;
    private javax.swing.JComboBox<String> box_encontrar;
    private javax.swing.JComboBox<String> box_temporadas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_temp4;
    private javax.swing.JLabel label_temp5;
    private javax.swing.JLabel label_temp6;
    private javax.swing.JLabel label_temp7;
    private javax.swing.JLabel label_temp8;
    private javax.swing.JLabel label_temp9;
    private javax.swing.JPanel panel_temporadas;
    private javax.swing.JRadioButton rboton_mostrarTemp;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_encontrar;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_temp1;
    private javax.swing.JTextField tf_temp2;
    private javax.swing.JTextField tf_temp3;
    private javax.swing.JTextField tf_temp4;
    private javax.swing.JTextField tf_temp5;
    private javax.swing.JTextField tf_temp6;
    private javax.swing.JTextField tf_temp7;
    private javax.swing.JTextField tf_temp8;
    private javax.swing.JTextField tf_temp9;
    // End of variables declaration//GEN-END:variables
}
