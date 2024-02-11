import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.text.Document;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public class OUSTForm extends JPanel {
    private JButton btnClear;
    private JButton btnOUSTSubmit;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JLabel lblResultMessage;
    private JTable tblUnitScores;
    private JTextField txtEmail;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtStudentID;

    public OUSTForm() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        txtStudentID = new JTextField();
        txtFirstName = new JTextField();
        jLabel3 = new JLabel();
        txtLastName = new JTextField();
        txtEmail = new JTextField();
        jLabel4 = new JLabel();
        btnOUSTSubmit = new JButton();
        btnClear = new JButton();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tblUnitScores = new JTable();
        lblResultMessage = new JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Email");


        btnOUSTSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOUSTSubmit.setForeground(new java.awt.Color(0, 0, 102));
        btnOUSTSubmit.setText("Submit");
        btnOUSTSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    btnOUSTSubmitActionPerformed(evt);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                } catch (NotBoundException e) {
                    throw new RuntimeException(e);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 102));
        btnClear.setText("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel1.setToolTipText("fdfdf");
        jPanel1.setName("fdfdf"); // NOI18N

        tblUnitScores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUnitScores.setEnabled(false);
        jScrollPane1.setViewportView(tblUnitScores);

        lblResultMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultMessage.setForeground(new java.awt.Color(102, 0, 51));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblResultMessage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultMessage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtStudentID, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnOUSTSubmit)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClear))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnOUSTSubmit))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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

    private void btnOUSTSubmitActionPerformed(ActionEvent evt) throws MalformedURLException, NotBoundException, RemoteException {
        StudentInfo student = new StudentInfo();
        int personId = Integer.parseInt(txtStudentID.getText());
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmail.getText();

        HonorsEvaluator evaluator = (HonorsEvaluator) Naming.lookup("rmi://localhost:1099/HonorsEvaluator");
        SerializableResult serializableResult = evaluator.evaluateHonorsEligibility("OUST", personId, firstName, email, null);
        String result = serializableResult.getResult();
        List<StudentUnit> studentUnitList = serializableResult.getStudentUnitList();
        setResult(result);
        setTableData(studentUnitList);
    }                                             

    private void btnClearActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    // private void setTableData(Map<String, Double> dataMap) {
    //     String[] columnNames = {"Unit", "Score"};
    //     table.DefaultTableModel model = (table.DefaultTableModel) tblUnitScores.getModel();
    //     model.setRowCount(0);

    //     for (Map.Entry<String, Double> entry : dataMap.entrySet()) {
    //         String unit = entry.getKey();
    //         Double score = entry.getValue();

    //         model.addRow(new Object[]{unit, score});
    //     }
    // }

    private void setTableData(List<StudentUnit> dataMap) {
        String[] columnNames = {"Unit", "Score"};
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblUnitScores.getModel();
        model.setRowCount(0); 

        for (StudentUnit entry : dataMap) {
            String unit = entry.getUnitCode();
            Double score = entry.getResultScore();
            model.addRow(new Object[]{unit, score});
        }
    }
    
    private void setResult(String result) {
        lblResultMessage.setText(result);
    }

}