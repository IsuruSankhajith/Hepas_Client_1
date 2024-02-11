import javax.swing.*;

public class MainForm extends JPanel {
    private JButton btnOUSTStudent;
    private JButton btnNonOUSTStudent;
    private JLabel jLabel1;
    private JLabel lblResult;
    private JPanel pnlForm;
    private JLabel jLabel2;
    private OUSTForm oustForm = new OUSTForm();
    private NonOUSTForm nonOUSTForm = new NonOUSTForm();

    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel pnlQuestion;

    public MainForm() {
        initComponents();
    }

    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        pnlQuestion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnOUSTStudent = new javax.swing.JButton();
        btnNonOUSTStudent = new javax.swing.JButton();
        // lblResult = new javax.swing.JLabel();
        pnlForm = new javax.swing.JPanel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        headerLabel.setText("Honors Enrolment Pre-assessment System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Are you a student at OUST?");

        btnOUSTStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btnOUSTStudent.setForeground(new java.awt.Color(0, 0, 102));
        btnOUSTStudent.setText("Yes");
        btnOUSTStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOUSTStudentActionPerformed(evt);
            }
        });

        btnNonOUSTStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btnNonOUSTStudent.setForeground(new java.awt.Color(0, 0, 102));
        btnNonOUSTStudent.setText("No");
        btnNonOUSTStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonOUSTStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlQuestionLayout = new javax.swing.GroupLayout(pnlQuestion);
        pnlQuestion.setLayout(pnlQuestionLayout);
        pnlQuestionLayout.setHorizontalGroup(
                pnlQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlQuestionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32)
                                .addComponent(btnOUSTStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNonOUSTStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
        );
        pnlQuestionLayout.setVerticalGroup(
                pnlQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuestionLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(pnlQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnOUSTStudent)
                                                .addComponent(btnNonOUSTStudent))
                                        .addComponent(jLabel2)))
        );

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        // .addComponent(lblResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 56, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                // .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                // .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    private void btnOUSTStudentActionPerformed(java.awt.event.ActionEvent evt) {
        // Load OUSTForm
        pnlForm.removeAll();
        pnlForm.add(new OUSTForm());
        pnlForm.revalidate();
        pnlForm.repaint();
    }

    private void btnNonOUSTStudentActionPerformed(java.awt.event.ActionEvent evt) {
        // Load NonOUSTForm
        pnlForm.removeAll();
        pnlForm.add(new NonOUSTForm());
        pnlForm.revalidate();
        pnlForm.repaint();
    }
}
