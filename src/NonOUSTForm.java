import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonOUSTForm extends javax.swing.JPanel {
    private javax.swing.JButton btnOUSTSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUnitScores;
    private javax.swing.JTextField txtStudentID;
    private JButton btnNonOUSTSubmit;
    private JLabel lblResultMessage;

    public NonOUSTForm() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnitScores = new javax.swing.JTable();
        btnNonOUSTSubmit = new javax.swing.JButton();
        lblResultMessage = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Student ID");
        jScrollPane1.setViewportView(tblUnitScores);

        jScrollPane1.setPreferredSize(new Dimension(jScrollPane1.getPreferredSize().width, 30 * tblUnitScores.getRowHeight()));
        tblUnitScores.setPreferredSize(new Dimension(tblUnitScores.getPreferredSize().width, 30 * tblUnitScores.getRowHeight()));

        tblUnitScores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Unit", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUnitScores);

        lblResultMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultMessage.setForeground(new java.awt.Color(102, 0, 51));

        btnNonOUSTSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNonOUSTSubmit.setForeground(new java.awt.Color(0, 0, 102));
        btnNonOUSTSubmit.setText("Submit");
        btnNonOUSTSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonOUSTSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtStudentID))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNonOUSTSubmit))
                    .addComponent(lblResultMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNonOUSTSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Document studentIDDocument = txtStudentID.getDocument();
        studentIDDocument.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateLength();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateLength();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateLength();
            }

            private void validateLength() {
                String studentID = txtStudentID.getText();
                if (studentID.length() > 8) {
                    String trimmedStudentID = studentID.substring(0, 8);
                    SwingUtilities.invokeLater(() -> txtStudentID.setText(trimmedStudentID));
                }
            }
        });

    }

    private void btnNonOUSTSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Map<String, Double[]> unitScoresMap = new HashMap<>();

        for (int i = 0; i < tblUnitScores.getRowCount(); i++) {
        String unit = (String) tblUnitScores.getValueAt(i, 0);
        Double score = (Double) tblUnitScores.getValueAt(i, 1);

        if (score != null) {
            if (unitScoresMap.containsKey(unit)) {
                Double[] oldArr = unitScoresMap.get(unit);
                Double[] newArr = Arrays.copyOf(oldArr, oldArr.length + 1);
                newArr[oldArr.length] = score;
                unitScoresMap.put(unit, newArr);
            } else {
                unitScoresMap.put(unit, new Double[]{score});
            }
        }
    }
        int personId = Integer.parseInt(txtStudentID.getText());
        try {
            processTableData(personId, unitScoresMap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }                                                
    
    private void processTableData(int personId, Map<String, Double[]> unitScoresMap) throws MalformedURLException, NotBoundException, RemoteException {
        HonorsEvaluator evaluator = (HonorsEvaluator) Naming.lookup("rmi://localhost:1099/HonorsEvaluator");
        SerializableResult serializableResult = evaluator.evaluateHonorsEligibility("NonOUST", personId, "", "", unitScoresMap);
        String result = serializableResult.getResult();
        setResult(result);
    }
    
    private void setResult(String result) {
        lblResultMessage.setText(result);
    }
}