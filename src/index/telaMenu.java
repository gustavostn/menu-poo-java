package index;

import java.util.ArrayList;

public class telaMenu extends javax.swing.JFrame {

    Dados tela = new Dados();

    public telaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JLabel();
        txtIdade = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputIdade = new javax.swing.JTextField();
        btnConfCadastro = new javax.swing.JButton();
        txtCelular = new javax.swing.JLabel();
        inputCelular = new javax.swing.JTextField();
        Logo = new javax.swing.JLabel();
        headerMenu = new javax.swing.JLabel();
        btnVerCad = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEditaDado = new javax.swing.JButton();
        btnExcluiCad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostraDados = new javax.swing.JTextArea();
        inputVlrAntigo = new javax.swing.JTextField();
        inputVlrNovo = new javax.swing.JTextField();
        txtVlrAntigo = new javax.swing.JLabel();
        txtVlrNovo = new javax.swing.JLabel();
        btnConfAlteracao = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNome.setText("Nome");

        txtIdade.setText("Idade");

        txtEmail.setText("Email");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        inputIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdadeActionPerformed(evt);
            }
        });

        btnConfCadastro.setText("Confirmar Cadastro");
        btnConfCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfCadastroActionPerformed(evt);
            }
        });

        txtCelular.setText("Celular");

        inputCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCelular)
                        .addGap(18, 18, 18)
                        .addComponent(inputCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtIdade)
                                .addComponent(txtNome))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(inputNome)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(txtEmail)
                            .addGap(18, 18, 18)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfCadastro)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnConfCadastro)
                .addContainerGap())
        );

        Logo.setForeground(new java.awt.Color(247, 0, 12));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index/logo.png"))); // NOI18N

        headerMenu.setText("Por favor realize o cadastro para poder utilizar a nossa plataforma");

        btnVerCad.setText("Verficar Cadastro");
        btnVerCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCadActionPerformed(evt);
            }
        });

        jButton2.setText("Calcular IMC");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEditaDado.setText("Editar Cadastro");
        btnEditaDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaDadoActionPerformed(evt);
            }
        });

        btnExcluiCad.setText("Excluir Cadastro");
        btnExcluiCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiCadActionPerformed(evt);
            }
        });

        mostraDados.setColumns(20);
        mostraDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mostraDados.setRows(5);
        mostraDados.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(mostraDados);

        inputVlrAntigo.setVisible(false);
        inputVlrAntigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputVlrAntigoActionPerformed(evt);
            }
        });

        inputVlrNovo.setText(" ");
        inputVlrNovo.setVisible(false);

        txtVlrAntigo.setText("Valor antigo");
        txtVlrAntigo.setVisible(false)

        txtVlrNovo.setText("Valor antigo");
        txtVlrNovo.setVisible(false);

        btnConfAlteracao.setText("Alterar Cadastro");
        btnConfAlteracao.setVisible(false)
        btnConfAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(headerMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditaDado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluiCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfAlteracao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVlrAntigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputVlrAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVlrNovo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputVlrNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerCad)
                    .addComponent(jButton2)
                    .addComponent(btnEditaDado)
                    .addComponent(btnExcluiCad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputVlrAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVlrAntigo)
                    .addComponent(inputVlrNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVlrNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfAlteracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfCadastroActionPerformed
        // TODO add your handling code here:

        mostraDados.setText(null);

        String nome = inputNome.getText();
        String idade = inputIdade.getText();
        String email = inputEmail.getText();
        String celular = inputCelular.getText();
        
        
        tela.novoCadastro(nome, idade, email, celular);
        mostraDados.append("Cadastro realizado com sucesso!");
    }//GEN-LAST:event_btnConfCadastroActionPerformed

    private void inputIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdadeActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void btnVerCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCadActionPerformed

        mostraDados.setText(null);

        if (tela.verificaVazio()) {
            mostraDados.append(tela.consultaCompleta());
        } else {
            mostraDados.append("Não há dados cadastrados!");
        }

    }//GEN-LAST:event_btnVerCadActionPerformed

    private void btnExcluiCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiCadActionPerformed

        mostraDados.setText(null);

        if (tela.verificaVazio()) {
            mostraDados.append("Cadastro excluido com sucesso!");
            tela.excluiCadastros();
        } else {
            mostraDados.append("Não há cadastro para ser excluido!");
        }

    }//GEN-LAST:event_btnExcluiCadActionPerformed

    private void btnEditaDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaDadoActionPerformed

        mostraDados.setText(null);

        if (tela.verificaVazio()) {
            inputVlrAntigo.setVisible(true);
            txtVlrAntigo.setVisible(true);
            inputVlrNovo.setVisible(true);
            txtVlrNovo.setVisible(true);
            btnConfAlteracao.setVisible(true);
            mostraDados.setText(null);
        } else {
            mostraDados.append("Não há cadastro para ser alterado!");
        }

    }//GEN-LAST:event_btnEditaDadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputVlrAntigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputVlrAntigoActionPerformed

    }//GEN-LAST:event_inputVlrAntigoActionPerformed

    private void btnConfAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfAlteracaoActionPerformed

        mostraDados.setText(null);

        String valorAntigo = inputVlrAntigo.getText();
        String valorNovo = inputVlrNovo.getText();

        if (tela.verificaVazio()) {
            if (valorAntigo.isEmpty()) {
                mostraDados.append("Informe o valor que deseja trocar e o novo valor a ser inserido");
            } else {
                tela.alteraDados(valorAntigo, valorNovo);
                mostraDados.append("Dado alterado com sucesso!\n");
                mostraDados.append(tela.consultaCompleta());
                inputVlrAntigo.setVisible(false);
                txtVlrAntigo.setVisible(false);
                inputVlrNovo.setVisible(false);
                txtVlrNovo.setVisible(false);
                btnConfAlteracao.setVisible(false);
            }
        } else {
            mostraDados.append("Não há cadastro para ser alterado!");
        }

    }//GEN-LAST:event_btnConfAlteracaoActionPerformed

    private void inputCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCelularActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnConfAlteracao;
    private javax.swing.JButton btnConfCadastro;
    private javax.swing.JButton btnEditaDado;
    private javax.swing.JButton btnExcluiCad;
    private javax.swing.JButton btnVerCad;
    private javax.swing.JLabel headerMenu;
    private javax.swing.JTextField inputCelular;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputIdade;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputVlrAntigo;
    private javax.swing.JTextField inputVlrNovo;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea mostraDados;
    private javax.swing.JLabel txtCelular;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtIdade;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtVlrAntigo;
    private javax.swing.JLabel txtVlrNovo;
    // End of variables declaration//GEN-END:variables

}
