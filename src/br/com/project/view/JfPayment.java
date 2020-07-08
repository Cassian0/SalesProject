package br.com.project.view;

import br.com.project.dao.ProductsDao;
import br.com.project.dao.SaleItemDao;
import br.com.project.dao.SalesDao;
import br.com.project.model.Client;
import br.com.project.model.Products;
import br.com.project.model.SaleItem;
import br.com.project.model.Sales;
import br.com.project.model.Utilities;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JfPayment extends javax.swing.JFrame {
    
    public Client clientPayment = new Client();
    public DefaultTableModel shoppingCarPayment;
    public String dateFormat;
    
    public JfPayment() {
        initComponents();
        
        txtCardPayment.setText("0");
        txtMoneyPayment.setText("0");
        txtCheckPayment.setText("0");
        txtChangePayment.setText("0");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMoneyPayment = new javax.swing.JTextField();
        txtChangePayment = new javax.swing.JTextField();
        txtCardPayment = new javax.swing.JTextField();
        txtTotalPayment = new javax.swing.JTextField();
        txtCheckPayment = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaNote = new javax.swing.JTextArea();
        buttonFinalizeSale = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pagamentos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Dinheiro:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cartão:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Cheque:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Troco:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Total:");

        txtChangePayment.setEditable(false);

        txtTotalPayment.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Observação"));

        textAreaNote.setColumns(20);
        textAreaNote.setRows(5);
        jScrollPane1.setViewportView(textAreaNote);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonFinalizeSale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonFinalizeSale.setText("Finalizar Venda");
        buttonFinalizeSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizeSaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCardPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(txtMoneyPayment)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCheckPayment))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalPayment)
                                    .addComponent(txtChangePayment))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonFinalizeSale, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFinalizeSale))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMoneyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCheckPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtChangePayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFinalizeSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizeSaleActionPerformed
//        FINALIZAR VENDA
//        CALCULAR TROCO
        double paymentMoney, paymentCard, paymentCheck, totalPaid, totalSale, changeOfMoney;
        
        paymentMoney = Double.parseDouble(txtMoneyPayment.getText());
        paymentCard = Double.parseDouble(txtCardPayment.getText());
        paymentCheck = Double.parseDouble(txtCheckPayment.getText());

        //CALCULAR O TOTAL E O TROCO
        totalSale = Double.parseDouble(txtTotalPayment.getText());
        
        totalPaid = paymentMoney + paymentCard + paymentCheck;
        
        changeOfMoney = totalSale - totalPaid;
        txtChangePayment.setText(String.valueOf(changeOfMoney));
        
        if (totalPaid < totalSale) {
            JOptionPane.showMessageDialog(null, "Valor insuficiente");
            
        } else {
            
            txtChangePayment.setText(String.valueOf(changeOfMoney));

//            Client client = new Client();
//            client.setId(clientPayment.getId());
            Sales sales = new Sales();
            sales.setClient(clientPayment);
            sales.setDateSale(dateFormat);
            sales.setTotalSale(totalSale);
            sales.setNote(textAreaNote.getText());
            
            SalesDao salesDao = new SalesDao();
            salesDao.registerSales(sales);

            //RETORNA O ID DA ULTIMA VENDA 
            sales.setId(salesDao.returnLastSale());
            //System.out.println("id ultima venda: " + sales.getId());

            //CADASTRANDO PRODUTOS NA TABELA DE ITENS VENDAS
            for (int i = 0; i < shoppingCarPayment.getRowCount(); i++) {// getRowCount retorna um numero de linha da defaultTableModel

                //BAIXA NO ESTOQUE (QUANTIDADE EM ESTOQUE/ QUANTIDADE COMPRADA/ QUANTIDADE ATUALIZADA)
                int stockQuantity, purchasedQuantity, updatedQuantity;                
                ProductsDao productsDao = new ProductsDao();

                //PEGA O ID DA VENDA
                SaleItem saleItem = new SaleItem();
                saleItem.setSales(sales);
                
                Products products = new Products();                          //0 REPRESENTA A COLUNA DA TABELA
                products.setId(Integer.parseInt(shoppingCarPayment.getValueAt(i, 0).toString()));//PEGA O CODIGO DA LINHA SELECIONADA
                saleItem.setProducts(products);                             //i REPRESENTA A LINHA DA TABELA 
                
                saleItem.setQuantity(Integer.parseInt(shoppingCarPayment.getValueAt(i, 2).toString()));//PEGA A QUANTIDADE
                
                saleItem.setSubTotal(Double.parseDouble(shoppingCarPayment.getValueAt(i, 4).toString()));//PEGA O SUBTOTAL

                //BAIXA NO ESTOQUE
                stockQuantity = productsDao.returnCurrentyIventory(products.getId());//PEGA O ID
                purchasedQuantity = Integer.parseInt(shoppingCarPayment.getValueAt(i, 2).toString());//QUANTIDADE COMPRADA
                updatedQuantity = stockQuantity - purchasedQuantity;

                //METODO BAIXA MO ESTOQUE 
                productsDao.writeOffStock(products.getId(), updatedQuantity);

                //METODO CADASTRAR ITEM
                SaleItemDao saleItemDao = new SaleItemDao();
                saleItemDao.registerItem(saleItem);
                
            }
            
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
            
            this.dispose();
            
        }

    }//GEN-LAST:event_buttonFinalizeSaleActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date date = new Date();
        SimpleDateFormat dateBr = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat = dateBr.format(date);
    }//GEN-LAST:event_formWindowActivated

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFinalizeSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaNote;
    private javax.swing.JTextField txtCardPayment;
    private javax.swing.JTextField txtChangePayment;
    private javax.swing.JTextField txtCheckPayment;
    private javax.swing.JTextField txtMoneyPayment;
    public javax.swing.JTextField txtTotalPayment;
    // End of variables declaration//GEN-END:variables
}
