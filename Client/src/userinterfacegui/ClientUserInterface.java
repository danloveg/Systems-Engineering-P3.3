package userinterfacegui;

import java.awt.event.WindowAdapter;

/**
 * Graphical client user interface.
 * 
 * @author loveboat
 */
public class ClientUserInterface extends javax.swing.JFrame
                                 implements userinterface.Userinterface {
    
    private clientmessagehandler.ClientMessageHandler commandHandler;

    /**
     * Creates new form ClientUserInterface
     */
    public ClientUserInterface() {
        initComponents();
        setupCloseConditions();
    }


    /**
     * Update the user interface with a new message.
     * @param message The message to be appended to the user message display.
     */
    @Override
    public void update(String message) {
        // Append message to output text area
        this.outputTextArea.append(message + "\n");
    }


    /**
     * Set the command handler.
     * @param handler The command handler to be associated with this.
     */
    public void setCommandHandler(clientmessagehandler.ClientMessageHandler handler) {
        commandHandler = handler;
    }


    /**
     * Set up the conditions on the window closing. Makes sure that quit is sent
     * to the server before the window closes, so that the server knows we
     * wanted to quit.
     */
    private void setupCloseConditions() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Send quit command
                commandHandler.execute("q");
                // Dispose of the window
                windowEvent.getWindow().dispose();
                // Quit the program
                System.exit(0);
            }
        });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connectToServerButton = new javax.swing.JButton();
        disconnectFromServerButton = new javax.swing.JButton();
        led1CheckBox = new javax.swing.JCheckBox();
        led2CheckBox = new javax.swing.JCheckBox();
        led3CheckBox = new javax.swing.JCheckBox();
        led4CheckBox = new javax.swing.JCheckBox();
        scrollPane = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        outputLabel = new javax.swing.JLabel();
        btn1StateButton = new javax.swing.JButton();
        btn2StateButton = new javax.swing.JButton();
        btn3StateButton = new javax.swing.JButton();
        btn1Label = new javax.swing.JLabel();
        btn2Label = new javax.swing.JLabel();
        btn3Label = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        connectToServerButton.setBackground(new java.awt.Color(131, 254, 71));
        connectToServerButton.setText("Connect");
        connectToServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectToServerButtonActionPerformed(evt);
            }
        });

        disconnectFromServerButton.setBackground(new java.awt.Color(254, 163, 34));
        disconnectFromServerButton.setText("Disconnect");
        disconnectFromServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectFromServerButtonActionPerformed(evt);
            }
        });

        led1CheckBox.setText("LED1 ON");
        led1CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                led1CheckBoxActionPerformed(evt);
            }
        });

        led2CheckBox.setText("LED2 ON");
        led2CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                led2CheckBoxActionPerformed(evt);
            }
        });

        led3CheckBox.setText("LED3 ON");
        led3CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                led3CheckBoxActionPerformed(evt);
            }
        });

        led4CheckBox.setText("LED4 ON");
        led4CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                led4CheckBoxActionPerformed(evt);
            }
        });

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        scrollPane.setViewportView(outputTextArea);

        outputLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        outputLabel.setText("Output");

        btn1StateButton.setText("BTN1");
        btn1StateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1StateButtonActionPerformed(evt);
            }
        });

        btn2StateButton.setText("BTN2");
        btn2StateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2StateButtonActionPerformed(evt);
            }
        });

        btn3StateButton.setText("BTN3");
        btn3StateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3StateButtonActionPerformed(evt);
            }
        });

        btn1Label.setText("Get BTN1 state");

        btn2Label.setText("Get BTN2 state");

        btn3Label.setText("Get BTN3 state");

        quitButton.setBackground(new java.awt.Color(254, 81, 70));
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(connectToServerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(disconnectFromServerButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(led1CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(led2CheckBox)
                            .addComponent(led3CheckBox)
                            .addComponent(led4CheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1StateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1Label))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn2StateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn3StateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2Label)
                                    .addComponent(btn3Label)))
                            .addComponent(quitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(outputLabel)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {connectToServerButton, quitButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn1StateButton, btn3StateButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectToServerButton)
                    .addComponent(disconnectFromServerButton)
                    .addComponent(outputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(led1CheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(led2CheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(led3CheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(led4CheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1StateButton)
                            .addComponent(btn1Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn2StateButton)
                            .addComponent(btn2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn3StateButton)
                            .addComponent(btn3Label))
                        .addGap(18, 18, 18)
                        .addComponent(quitButton)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectToServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectToServerButtonActionPerformed
        commandHandler.execute("connect");
    }//GEN-LAST:event_connectToServerButtonActionPerformed

    private void disconnectFromServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectFromServerButtonActionPerformed
        commandHandler.execute("d");
    }//GEN-LAST:event_disconnectFromServerButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        commandHandler.execute("q");
    }//GEN-LAST:event_quitButtonActionPerformed

    private void btn1StateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1StateButtonActionPerformed
        commandHandler.execute("gpb1");
    }//GEN-LAST:event_btn1StateButtonActionPerformed

    private void btn2StateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2StateButtonActionPerformed
        commandHandler.execute("gpb2");
    }//GEN-LAST:event_btn2StateButtonActionPerformed

    private void btn3StateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3StateButtonActionPerformed
        commandHandler.execute("gpb3");
    }//GEN-LAST:event_btn3StateButtonActionPerformed

    private void led1CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_led1CheckBoxActionPerformed
        if (led1CheckBox.isSelected()) {
            commandHandler.execute("L1on");
        } else {
            commandHandler.execute("L1off");
        }
    }//GEN-LAST:event_led1CheckBoxActionPerformed

    private void led2CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_led2CheckBoxActionPerformed
        if (led2CheckBox.isSelected()) {
            commandHandler.execute("L2on");
        } else {
            commandHandler.execute("L2off");
        }
    }//GEN-LAST:event_led2CheckBoxActionPerformed

    private void led3CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_led3CheckBoxActionPerformed
        if (led3CheckBox.isSelected()) {
            commandHandler.execute("L3on");
        } else {
            commandHandler.execute("L3off");
        }
    }//GEN-LAST:event_led3CheckBoxActionPerformed

    private void led4CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_led4CheckBoxActionPerformed
        if (led4CheckBox.isSelected()) {
            commandHandler.execute("L4on");
        } else {
            commandHandler.execute("L4off");
        }
    }//GEN-LAST:event_led4CheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn1Label;
    private javax.swing.JButton btn1StateButton;
    private javax.swing.JLabel btn2Label;
    private javax.swing.JButton btn2StateButton;
    private javax.swing.JLabel btn3Label;
    private javax.swing.JButton btn3StateButton;
    private javax.swing.JButton connectToServerButton;
    private javax.swing.JButton disconnectFromServerButton;
    private javax.swing.JCheckBox led1CheckBox;
    private javax.swing.JCheckBox led2CheckBox;
    private javax.swing.JCheckBox led3CheckBox;
    private javax.swing.JCheckBox led4CheckBox;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton quitButton;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
