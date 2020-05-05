package br.com.project.view;

import br.com.project.dao.ClientDao;
import br.com.project.model.Client;
import br.com.project.model.Utilities;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class JfClient extends javax.swing.JFrame {

    private ClientDao clientDao;
    private Client client;

//    METODO LISTAR TABELA
    public void listClient() {
        clientDao = new ClientDao();
        List<Client> dataClient = clientDao.listClients();
        DefaultTableModel dataTable = (DefaultTableModel) tabelaCiente.getModel();
        dataTable.setNumRows(0);

        for (Client client1 : dataClient) {
            dataTable.addRow(new Object[]{
                client1.getId(),
                client1.getName(),
                client1.getIdentityDocument(),
                client1.getIndividualRegistration(),
                client1.getEmail(),
                client1.getPhone(),
                client1.getCellPhone(),
                client1.getZipCode(),
                client1.getAddress(),
                client1.getNumber(),
                client1.getComplement(),
                client1.getNeighborhood(),
                client1.getCity(),
                client1.getState()
            });
        }
    }

    public JfClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customer_consultation_panel = new javax.swing.JTabbedPane();
        personal_data_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comBoxEstadoCliente = new javax.swing.JComboBox<>();
        txtTelefoneCliente = new javax.swing.JFormattedTextField();
        txtNumeroCliente = new javax.swing.JTextField();
        txtCompCliente = new javax.swing.JTextField();
        txtCidadeCliente = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtRgCliente = new javax.swing.JTextField();
        txtBairroCliente = new javax.swing.JTextField();
        txtCepCliente = new javax.swing.JFormattedTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtCodCliente = new javax.swing.JTextField();
        txtCelularCliente = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtNomeClientePesquisar = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCiente = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        customer_consultation_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_consultation_panelMouseClicked(evt);
            }
        });

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nome:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("CEP:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("RG:");

        jLabel8.setText("Endereço:");

        jLabel9.setText("Cidade:");

        jLabel10.setText("CPF:");

        jLabel11.setText("Celular:");

        jLabel12.setText("Complemento:");

        jLabel13.setText("Telefone Fixo:");

        jLabel14.setText("Nº:");

        jLabel15.setText("UF:");

        comBoxEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comBoxEstadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxEstadoClienteActionPerformed(evt);
            }
        });

        try {
            txtTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneCliente.setMinimumSize(new java.awt.Dimension(4, 24));
        txtTelefoneCliente.setPreferredSize(new java.awt.Dimension(55, 24));

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### - ### - ### - ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setMinimumSize(new java.awt.Dimension(4, 24));
        txtCpfCliente.setPreferredSize(new java.awt.Dimension(67, 24));

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepCliente.setMinimumSize(new java.awt.Dimension(4, 24));
        txtCepCliente.setPreferredSize(new java.awt.Dimension(38, 24));

        try {
            txtCelularCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularCliente.setMinimumSize(new java.awt.Dimension(14, 22));
        txtCelularCliente.setPreferredSize(new java.awt.Dimension(14, 22));

        javax.swing.GroupLayout personal_data_panelLayout = new javax.swing.GroupLayout(personal_data_panel);
        personal_data_panel.setLayout(personal_data_panelLayout);
        personal_data_panelLayout.setHorizontalGroup(
            personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_data_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personal_data_panelLayout.createSequentialGroup()
                        .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(personal_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(personal_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personal_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(14, 14, 14)
                                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(personal_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(personal_data_panelLayout.createSequentialGroup()
                                        .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCompCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comBoxEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(personal_data_panelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(txtRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(personal_data_panelLayout.createSequentialGroup()
                        .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(2, 2, 2)
                        .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(personal_data_panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 112, Short.MAX_VALUE))
        );
        personal_data_panelLayout.setVerticalGroup(
            personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_data_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroCliente)
                    .addComponent(txtCepCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(jLabel14)
                        .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(comBoxEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personal_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        customer_consultation_panel.addTab("Dados Pessoais", personal_data_panel);

        jLabel16.setText("Nome:");

        txtNomeClientePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClientePesquisarActionPerformed(evt);
            }
        });
        txtNomeClientePesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeClientePesquisarKeyPressed(evt);
            }
        });

        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        tabelaCiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "RG", "CPF", "E-mail", "Telefone", "Celular", "CEP", "Endereço", "Nº", "Comp", "Bairro", "Cidade", "UF"
            }
        ));
        tabelaCiente.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tabelaCienteComponentAdded(evt);
            }
        });
        tabelaCiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCiente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeClientePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarCliente)
                        .addGap(0, 471, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeClientePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        customer_consultation_panel.addTab("Consulta de Clientes", jPanel3);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customer_consultation_panel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customer_consultation_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comBoxEstadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxEstadoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxEstadoClienteActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // BOTAO SALVAR

        client = new Client();

        client.setName(txtNomeCliente.getText());
        client.setIdentityDocument(txtRgCliente.getText());
        client.setIndividualRegistration(txtCpfCliente.getText());
        client.setEmail(txtEmailCliente.getText());
        client.setPhone(txtTelefoneCliente.getText());
        client.setCellPhone(txtCelularCliente.getText());
        client.setZipCode(txtCepCliente.getText());
        client.setAddress(txtEnderecoCliente.getText());
        client.setNumber(Integer.parseInt(txtNumeroCliente.getText()));
        client.setComplement(txtCompCliente.getText());
        client.setNeighborhood(txtBairroCliente.getText());
        client.setCity(txtCidadeCliente.getText());
        client.setState(comBoxEstadoCliente.getSelectedItem().toString());

        clientDao = new ClientDao();
        clientDao.registerClient(client);

        new Utilities().cleanScreen(personal_data_panel);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeClientePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClientePesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClientePesquisarActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
//        BOTÃO PESQUISAR 
        String name = txtNomeClientePesquisar.getText();
        clientDao = new ClientDao();
        List<Client> dataClient = clientDao.searchClientByName(name);
        DefaultTableModel dataTable = (DefaultTableModel) tabelaCiente.getModel();
        dataTable.setNumRows(0);

        for (Client client1 : dataClient) {
            dataTable.addRow(new Object[]{
                client1.getId(),
                client1.getName(),
                client1.getIdentityDocument(),
                client1.getIndividualRegistration(),
                client1.getEmail(),
                client1.getPhone(),
                client1.getCellPhone(),
                client1.getZipCode(),
                client1.getAddress(),
                client1.getNumber(),
                client1.getComplement(),
                client1.getNeighborhood(),
                client1.getCity(),
                client1.getState()
            });
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void tabelaCienteComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tabelaCienteComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCienteComponentAdded

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        CARREGAR LISTA
        listClient();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaCienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCienteMouseClicked
//        PEGAR OS DADOS
        customer_consultation_panel.setSelectedIndex(0);

        txtCodCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 0).toString());
        txtNomeCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 1).toString());
        txtRgCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 2).toString());
        txtCpfCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 3).toString());
        txtEmailCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 4).toString());
        txtTelefoneCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 5).toString());
        txtCelularCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 6).toString());
        txtCepCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 7).toString());
        txtEnderecoCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 8).toString());
        txtNumeroCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 9).toString());
        txtCompCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 10).toString());
        txtBairroCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 11).toString());
        txtCidadeCliente.setText(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 12).toString());
        comBoxEstadoCliente.setSelectedItem(tabelaCiente.getValueAt(tabelaCiente.getSelectedRow(), 13).toString());
//        UTILIZADO PARA MANIPULAÇÃO DOS DADOS AO CLICAR PREENCHE A TELA DE CADASTRO, SENDO POSSIVEL ALTERAR
//        EXCLUIR OU CADASTRAR A ENTIDADE COM NOVAS INFORMAÇÕES  
    }//GEN-LAST:event_tabelaCienteMouseClicked

    private void customer_consultation_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_consultation_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_consultation_panelMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
//        BOTAO EDITAR
        client = new Client();

        client.setName(txtNomeCliente.getText());
        client.setIdentityDocument(txtRgCliente.getText());
        client.setIndividualRegistration(txtCpfCliente.getText());
        client.setEmail(txtEmailCliente.getText());
        client.setPhone(txtTelefoneCliente.getText());
        client.setCellPhone(txtCelularCliente.getText());
        client.setZipCode(txtCepCliente.getText());
        client.setAddress(txtEnderecoCliente.getText());
        client.setNumber(Integer.parseInt(txtNumeroCliente.getText()));
        client.setComplement(txtCompCliente.getText());
        client.setNeighborhood(txtBairroCliente.getText());
        client.setCity(txtCidadeCliente.getText());
        client.setState(comBoxEstadoCliente.getSelectedItem().toString());

        client.setId(Integer.parseInt(txtCodCliente.getText()));

        clientDao = new ClientDao();
        clientDao.changeClient(client);

        new Utilities().cleanScreen(personal_data_panel);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
//      LIMPA OS DADOS DO FORMULARIO
        new Utilities().cleanScreen(personal_data_panel);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
//        BOTAO EXCLUIR
        client = new Client();

        client.setId(Integer.parseInt(txtCodCliente.getText()));

        clientDao = new ClientDao();
        clientDao.deleteClient(client);

        new Utilities().cleanScreen(personal_data_panel);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtNomeClientePesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClientePesquisarKeyPressed

        String name = txtNomeClientePesquisar.getText();
        clientDao = new ClientDao();
        List<Client> dataClient = clientDao.searchClientByName(name);
        DefaultTableModel dataTable = (DefaultTableModel) tabelaCiente.getModel();
        dataTable.setNumRows(0);

        for (Client client1 : dataClient) {
            dataTable.addRow(new Object[]{
                client1.getId(),
                client1.getName(),
                client1.getIdentityDocument(),
                client1.getIndividualRegistration(),
                client1.getEmail(),
                client1.getPhone(),
                client1.getCellPhone(),
                client1.getZipCode(),
                client1.getAddress(),
                client1.getNumber(),
                client1.getComplement(),
                client1.getNeighborhood(),
                client1.getCity(),
                client1.getState()
            });
        }
    }//GEN-LAST:event_txtNomeClientePesquisarKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comBoxEstadoCliente;
    private javax.swing.JTabbedPane customer_consultation_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel personal_data_panel;
    private javax.swing.JTable tabelaCiente;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JFormattedTextField txtCelularCliente;
    private javax.swing.JFormattedTextField txtCepCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCompCliente;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeClientePesquisar;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtRgCliente;
    private javax.swing.JFormattedTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
