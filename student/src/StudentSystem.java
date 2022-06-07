
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class StudentSystem extends javax.swing.JFrame {
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private DefaultListModel<String> listModel = new DefaultListModel<String>();
    
    public StudentSystem() {
        initComponents();
    }
    
  public void listUpdate() {
        listModel = new DefaultListModel<String>();
        for(int i = 0; i < studentList.size(); i++)
        {
            Student student = studentList.get(i);
            listModel.addElement(student.getMajor() + " " + student.getNumber() + " " + student.getName());
        }
        studentListArea.setModel(listModel);
    }
    
    public void inputReset() {
        nameField.setText("");
        numberField.setText("");
        majorField.setText("");
        One.setSelected(false);
        Two.setSelected(false);        
        Three.setSelected(false);
        Four.setSelected(false);
        comboOne.setSelectedItem("1980");
        comboTwo.setSelectedItem("1");
        comboThree.setSelectedItem("1");
        phoneField.setText("");
        addressField.setText("");
        pictureField.setText("");
        introduceArea.setText("");
    }
    
    @SuppressWarnings("unchecked")                        
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        studentInformationInput = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        majorLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        introduceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        introduceArea = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        numberField = new javax.swing.JTextField();
        majorField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        pictureField = new javax.swing.JTextField();
        Two = new javax.swing.JRadioButton();
        One = new javax.swing.JRadioButton();
        Three = new javax.swing.JRadioButton();
        Four = new javax.swing.JRadioButton();
        comboOne = new javax.swing.JComboBox<>();
        comboTwo = new javax.swing.JComboBox<>();
        comboThree = new javax.swing.JComboBox<>();
        loadButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        studentInformationSearch = new javax.swing.JPanel();
        gradeCombo = new javax.swing.JComboBox<>();
        gradeSearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        studentInformation = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        informationArea = new javax.swing.JTextArea();
        ImageLabel = new javax.swing.JLabel();
        studentListText = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentListArea = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        call = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("양재백두체B", 1, 40));
        jLabel1.setText("학생 정보 시스템");

        studentInformationInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "학생 정보 입력", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("양재백두체B", 0, 25))); // NOI18N

        nameLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20)); 
        nameLabel.setText("이름");

        numberLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20)); 
        numberLabel.setText("학번");

        majorLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20));
        majorLabel.setText("학과");

        gradeLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20)); 
        gradeLabel.setText("학년");

        dateLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20)); 
        dateLabel.setText("생년월일");

        phoneLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20));
        phoneLabel.setText("휴대폰");

        addressLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20));
        addressLabel.setText("주소");

        pictureLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20));
        pictureLabel.setText("사진");

        introduceLabel.setFont(new java.awt.Font("맑은 고딕", 1, 20)); 
        introduceLabel.setText("프로필/자기소개");

        introduceArea.setColumns(20);
        introduceArea.setFont(new java.awt.Font("맑은 고딕", 1, 15)); 
        introduceArea.setRows(5);
        jScrollPane1.setViewportView(introduceArea);

        nameField.setFont(new java.awt.Font("맑은 고딕", 1, 18)); 
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        numberField.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        numberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        majorField.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        majorField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        phoneField.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        phoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        addressField.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        addressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pictureField.setFont(new java.awt.Font("맑은 고딕", 0, 18));
        pictureField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pictureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(Two);
        Two.setFont(new java.awt.Font("맑은 고딕", 1, 15)); 
        Two.setText("2학년");

        buttonGroup1.add(One);
        One.setFont(new java.awt.Font("맑은 고딕", 1, 15)); 
        One.setText("1학년");

        buttonGroup1.add(Three);
        Three.setFont(new java.awt.Font("맑은 고딕", 1, 15)); 
        Three.setText("3학년");

        buttonGroup1.add(Four);
        Four.setFont(new java.awt.Font("맑은 고딕", 1, 15));
        Four.setText("4학년");

        comboOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        comboOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOneActionPerformed(evt);
            }
        });

        comboTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        comboTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTwoActionPerformed(evt);
            }
        });

        comboThree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboThreeActionPerformed(evt);
            }
        });

        loadButton.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        loadButton.setText("불러오기");
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameField)
            .addComponent(numberField)
            .addComponent(majorField)
            .addComponent(phoneField)
            .addComponent(addressField)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(pictureField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadButton))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(One)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Two)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Three)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Four)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(comboOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(majorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(One)
                    .addComponent(Two)
                    .addComponent(Three)
                    .addComponent(Four))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pictureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        addButton.setFont(new java.awt.Font("맑은 고딕", 1, 20));
        addButton.setText("추가");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("맑은 고딕", 1, 20));
        closeButton.setText("취소");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout studentInformationInputLayout = new javax.swing.GroupLayout(studentInformationInput);
        studentInformationInput.setLayout(studentInformationInputLayout);
        studentInformationInputLayout.setHorizontalGroup(
            studentInformationInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInformationInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(studentInformationInputLayout.createSequentialGroup()
                        .addComponent(introduceLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(studentInformationInputLayout.createSequentialGroup()
                        .addGroup(studentInformationInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gradeLabel)
                            .addComponent(dateLabel)
                            .addComponent(phoneLabel)
                            .addComponent(addressLabel)
                            .addComponent(pictureLabel)
                            .addComponent(nameLabel)
                            .addComponent(numberLabel)
                            .addComponent(majorLabel))
                        .addGap(16, 16, 16)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(studentInformationInputLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addGap(88, 88, 88))
        );
        studentInformationInputLayout.setVerticalGroup(
            studentInformationInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInformationInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(studentInformationInputLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(majorLabel)
                        .addGap(12, 12, 12)
                        .addComponent(gradeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pictureLabel))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(introduceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentInformationInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        studentInformationSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "학생 정보 검색", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("양재백두체B", 0, 25))); // NOI18N

        gradeCombo.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "학번" }));

        gradeSearchField.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        gradeSearchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SearchButton.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        SearchButton.setText("검색");
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout studentInformationSearchLayout = new javax.swing.GroupLayout(studentInformationSearch);
        studentInformationSearch.setLayout(studentInformationSearchLayout);
        studentInformationSearchLayout.setHorizontalGroup(
            studentInformationSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradeSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchButton)
                .addContainerGap())
        );
        studentInformationSearchLayout.setVerticalGroup(
            studentInformationSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInformationSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        studentInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "학생 정보", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("양재백두체B", 0, 25))); // NOI18N

        informationArea.setColumns(20);
        informationArea.setRows(5);
        jScrollPane3.setViewportView(informationArea);

        ImageLabel.setIconTextGap(0);
        ImageLabel.setMaximumSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout studentInformationLayout = new javax.swing.GroupLayout(studentInformation);
        studentInformation.setLayout(studentInformationLayout);
        studentInformationLayout.setHorizontalGroup(
            studentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentInformationLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3)
                .addGap(3, 3, 3))
            .addGroup(studentInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        studentInformationLayout.setVerticalGroup(
            studentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        studentListText.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "학생 목록", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("양재백두체B", 0, 25))); // NOI18N

        deleteButton.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        deleteButton.setText("삭제");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        modifyButton.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        modifyButton.setText("수정");
        modifyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyButtonMouseClicked(evt);
            }
        });

        studentListArea.setFont(new java.awt.Font("맑은 고딕", 1, 15));
        studentListArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListAreaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentListArea);

        javax.swing.GroupLayout studentListTextLayout = new javax.swing.GroupLayout(studentListText);
        studentListText.setLayout(studentListTextLayout);
        studentListTextLayout.setHorizontalGroup(
            studentListTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(studentListTextLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(modifyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        studentListTextLayout.setVerticalGroup(
            studentListTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentListTextLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentListTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setName("");

        Menu.setText("파일");

        call.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        call.setText("불러오기");
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });
        Menu.add(call);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("저장하기");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        Menu.add(save);

        jMenuBar1.add(Menu);

        jMenu2.setText("도움말");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentInformationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentListText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentInformationSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentInformationInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentInformationSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentListText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(studentInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }                     

    private void callActionPerformed(java.awt.event.ActionEvent evt) {                                     
        JFileChooser fs = new JFileChooser(new File("C:\\"));
        fs.setDialogTitle("불러 오기");
        fs.setFileFilter(new FileTypeFilter(".dat", "Data File"));
        int result = fs.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION) {
            studentList = new ArrayList<Student>();
            listModel = new DefaultListModel<String>();
            try {
                File fi = fs.getSelectedFile();
                BufferedReader br = new BufferedReader(new FileReader(fi.getPath()));
                String line;
                while((line = br.readLine()) != null)
                {
                    StringTokenizer st = new StringTokenizer(line, "\t");
                    String name = st.nextToken();
                    String number = st.nextToken();
                    String major = st.nextToken();
                    String grade = st.nextToken();
                    String date = st.nextToken();
                    String phone = st.nextToken();
                    String address = st.nextToken();
                    String picture = st.nextToken();
                    String profile = st.nextToken();
                    Student student = new Student(name, number, major, grade, date, phone, address, picture, profile);
                    studentList.add(student);
                }
                br.close();
                listUpdate();
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, e2.getMessage());
            }
        }
        inputReset();
    }                                    

    private void comboOneActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        
    private void comboTwoActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        
    private void comboThreeActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                          
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String name = nameField.getText();
        String number = numberField.getText();
        String major = majorField.getText();
        String grade = "";
        if(One.isSelected())
            grade = One.getText();
        else if(Two.isSelected())
            grade = Two.getText();
        else if(Three.isSelected())
            grade = Three.getText();
        else if(Four.isSelected())
            grade = Four.getText();
        String date = comboOne.getSelectedItem() + "년 " + comboTwo.getSelectedItem() + "월 " + comboThree.getSelectedItem() + "일";
        String phone = phoneField.getText();
        String address = addressField.getText();
        String picture = pictureField.getText();
        String profile = introduceArea.getText();
        Student student = new Student(name, number, major, grade, date, phone, address, picture, profile);
        if(addButton.getText().equals("수정 완료"))
        {
            int index = studentListArea.getSelectedIndex();
            studentList.remove(index);
            studentList.add(index, student);
            addButton.setText("추가");
        }
        else
        {
            studentList.add(student);
        }
        inputReset();
    }                                         

    private void studentListAreaMouseClicked(java.awt.event.MouseEvent evt) {                                             
        int index = studentListArea.getSelectedIndex();
        Student student = studentList.get(index);
        informationArea.setText(student.information());
        String image = student.getPicture();
        ImageLabel.setIcon(new javax.swing.ImageIcon(image));
    }                                            

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {                                  

    }                                 

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        JFileChooser fs = new JFileChooser(new File("c:\\"));
        fs.setDialogTitle("파일 저장");
        fs.setFileFilter(new FileTypeFilter(".dat", "Data File"));
        int result = fs.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION) {
            File fi = fs.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(fi.getPath() + ".dat");
                for(int i = 0; i < studentList.size(); i++)
                {
                    String name = studentList.get(i).getName();
                    String number = studentList.get(i).getNumber();
                    String major = studentList.get(i).getMajor();
                    String grade = studentList.get(i).getGrade();
                    String date = studentList.get(i).getDate();
                    String phone = studentList.get(i).getPhone();
                    String address = studentList.get(i).getAddress();
                    String picture = studentList.get(i).getPicture();
                    String profile = studentList.get(i).getProfile();
                    fw.write(name + "\t" + number + "\t" + major + "\t" + grade + "\t" + date + "\t" + phone + "\t" + address + "\t" + picture + "\t" + profile + "\r\n");
                }
                fw.flush();
                fw.close();
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, e2.getMessage());
            }
        }
    }                                    

    private void modifyButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        addButton.setText("수정 완료");
        if(addButton.getText().equals("수정 완료"))
        {
            int index = studentListArea.getSelectedIndex();
            Student student = studentList.get(index);
            nameField.setText(student.getName());
            numberField.setText(student.getNumber());
            majorField.setText(student.getMajor());
            if(student.getGrade().equals("1학년"))
                One.setSelected(true);
            else if(student.getGrade().equals("2학년"))
                Two.setSelected(true);
            else if(student.getGrade().equals("3학년"))
                Three.setSelected(true);
            else
                Four.setSelected(true);
            StringTokenizer st = new StringTokenizer(student.getDate(), "년");
            String first = st.nextToken();
            comboOne.setSelectedItem(first);
            first = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(first, "월");
            String second = st2.nextToken();
            comboTwo.setSelectedItem(second);
            second = st2.nextToken();
            StringTokenizer st3 = new StringTokenizer(second, "일");
            String third = st3.nextToken();
            comboThree.setSelectedItem(third);
            phoneField.setText(student.getPhone());
            addressField.setText(student.getAddress());
            pictureField.setText(student.getPicture());
            introduceArea.setText(student.getProfile());
        }
    }                                         

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        inputReset();
        addButton.setText("추가");
    }                                        

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        int index = studentListArea.getSelectedIndex();
        studentList.remove(index);     
        listUpdate();
    }                                         
    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        String search = gradeSearchField.getText();
        for(int i = 0; i < studentList.size(); i++)
        {

            Student student = studentList.get(i);
            if(student.getNumber().equals(search))
            {
                informationArea.setText(student.information());
                String image = student.getPicture();
                ImageLabel.setIcon(new javax.swing.ImageIcon(image));
            }
        }
    }                                         

    private void loadButtonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        JFileChooser fs = new JFileChooser(new File("C:\\"));
        fs.setDialogTitle("불러 오기");
        fs.setFileFilter(new FileTypeFilter(".png", "Image File"));
        fs.setFileFilter(new FileTypeFilter(".gif", "Image File"));
        fs.setFileFilter(new FileTypeFilter(".jpg", "Image File"));
        int result = fs.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION) {
            try {
                File fi = fs.getSelectedFile();
                String value = fi.getPath();
                pictureField.setText(value);
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, e2.getMessage());
            }
        }
    }                                       

    private void pictureFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             

    }                                            
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentSystem studentSystem = new StudentSystem();
                studentSystem.setTitle("학생 정보 시스템");
                studentSystem.setVisible(true);
            }
        });
    }                  
    private javax.swing.JRadioButton Four;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JMenu Menu;
    private javax.swing.JRadioButton One;
    private javax.swing.JButton SearchButton;
    private javax.swing.JRadioButton Three;
    private javax.swing.JRadioButton Two;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem call;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> comboOne;
    private javax.swing.JComboBox<String> comboThree;
    private javax.swing.JComboBox<String> comboTwo;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> gradeCombo;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JTextField gradeSearchField;
    private javax.swing.JTextArea informationArea;
    private javax.swing.JTextArea introduceArea;
    private javax.swing.JLabel introduceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField majorField;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField pictureField;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JMenuItem save;
    private javax.swing.JPanel studentInformation;
    private javax.swing.JPanel studentInformationInput;
    private javax.swing.JPanel studentInformationSearch;
    private javax.swing.JList<String> studentListArea;
    private javax.swing.JPanel studentListText;                 
}