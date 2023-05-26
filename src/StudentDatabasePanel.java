import javax.swing.*;
import java.awt.*;


public class StudentDatabasePanel extends JPanel {
    private int CALC_WIDTH = 800;
    private int CALC_HEIGHT = 800;
    private JButton addTopicButton, findTopicButton;
    private JComboBox degreeComboBox, gradeComboBox;
    private JPanel panel1, panel2, panel3, studentDetailsWrapperPanel, topicDetailsWrapperPanel, studentDetailsPanel, topicDetailsPanel,
            degreeOptionsWrapperPanel, degreeOptionsPanel, awardPrizesWrapperPanel, awardPrizesPanel;
    private JLabel title, studentNumber;
    private JScrollPane scroll;
    private JTextArea textArea;
    private JTextField studentNumTextField;


    public StudentDatabasePanel(){

        // Set the whole panel size
        setPreferredSize(new Dimension(CALC_WIDTH,CALC_HEIGHT));


        //------------------------------------------------------------------------------
        // Panel 1 contains a title, a student details panel and a topic details panel.
        //------------------------------------------------------------------------------


        // Set up the title for the program
        title = new JLabel("Student Database Program", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        // Set up the student details panel
        studentDetailsPanel = new JPanel(new GridLayout(4, 2));
        studentDetailsPanel.setPreferredSize(new Dimension(350, 150));
        studentDetailsPanel.setBorder(BorderFactory.createTitledBorder("Student Details"));
        studentNumber = new JLabel("Student Number");
        studentNumTextField = new JTextField();
        studentDetailsPanel.add(studentNumber);
        studentDetailsPanel.add(studentNumTextField);
        studentDetailsPanel.add(new JLabel("Family Name"));
        studentDetailsPanel.add(new JTextField());
        studentDetailsPanel.add(new JLabel("Given Name(s)"));
        studentDetailsPanel.add(new JTextField());
        studentDetailsPanel.add(new JLabel("Degree"));
        String[] degreeOptions = {"Arts", "Medicine", "Science"};
        degreeComboBox = new JComboBox(degreeOptions);
        studentDetailsPanel.add(degreeComboBox);

        // Set up a wrapper panel for studentDetailsPanel
        studentDetailsWrapperPanel = new JPanel();
        studentDetailsWrapperPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        studentDetailsWrapperPanel.add(studentDetailsPanel, BorderLayout.CENTER);

        // Set up the topicDetailsPanel
        topicDetailsPanel = new JPanel(new GridLayout(4, 2));
        topicDetailsPanel.setPreferredSize(new Dimension(350, 150));
        topicDetailsPanel.setBorder(BorderFactory.createTitledBorder("Topic Details"));
        topicDetailsPanel.add(new JLabel("Topic Code"));
        topicDetailsPanel.add(new JTextField());
        topicDetailsPanel.add(new JLabel("Grade"));
        String[] gradeOptions = {"HD", "DN", "CR", "PS", "FL"};
        gradeComboBox = new JComboBox(gradeOptions);
        topicDetailsPanel.add(gradeComboBox);
        topicDetailsPanel.add(new JLabel("Mark"));
        topicDetailsPanel.add(new JTextField());
        addTopicButton = new JButton("Add Topic Result");
        findTopicButton = new JButton("Find Topic Result");
        topicDetailsPanel.add(addTopicButton);
        topicDetailsPanel.add(findTopicButton);

        // Set up a wrapper panel for topicDetailsPanel
        topicDetailsWrapperPanel = new JPanel();
        topicDetailsWrapperPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topicDetailsWrapperPanel.add(topicDetailsPanel, BorderLayout.CENTER);

        // Set up the panel 1
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.add(title,BorderLayout.NORTH);
        panel1.add(studentDetailsWrapperPanel, BorderLayout.WEST);
        panel1.add(topicDetailsWrapperPanel, BorderLayout.EAST);

        add(panel1);


        //---------------------------------------------------------------------
        // Panel 2 contains a degree options panel and an award prizes panel.
        //---------------------------------------------------------------------


        degreeOptionsPanel = new JPanel(new GridLayout(3, 2));
        degreeOptionsPanel.setPreferredSize(new Dimension(350, 150));
        degreeOptionsPanel.setBorder(BorderFactory.createTitledBorder("Degree Options"));
        degreeOptionsPanel.add(new JLabel("Arts Major"));
        degreeOptionsPanel.add(new JTextField());
        degreeOptionsPanel.add(new JLabel("Arts Minor"));
        degreeOptionsPanel.add(new JTextField());
        degreeOptionsPanel.add(new JLabel("Medicine Prizes"));

        // Set up a textArea to display prizes
        textArea = new JTextArea(10, 10);
        textArea.setBackground(Color.white);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        // Set up a JScrollPane to contain textArea
        scroll = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        degreeOptionsPanel.add(scroll);

        // Set up a wrapper panel for degreeOptionsPanel
        degreeOptionsWrapperPanel = new JPanel(new BorderLayout());
        degreeOptionsWrapperPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        degreeOptionsWrapperPanel.add(degreeOptionsPanel, BorderLayout.CENTER);

        // Set up the award prize panel
        awardPrizesPanel = new JPanel(new GridLayout(3, 2));
        awardPrizesPanel.setPreferredSize(new Dimension(350, 150));
        awardPrizesPanel.setBorder(BorderFactory.createTitledBorder("Award Prizes"));
        awardPrizesPanel.add(new JLabel("Prize Name"));
        awardPrizesPanel.add(new JTextField());
        awardPrizesPanel.add(new JLabel("Template"));
        awardPrizesPanel.add(new JTextField());
        awardPrizesPanel.add(new JLabel("Numbers of Topics"));
        awardPrizesPanel.add(new JTextField());
        //awardPrizesPanel.add(new JButton("Award Prize"));

        // Set up a wrapper panel for awardPrizesPanel
        awardPrizesWrapperPanel = new JPanel(new BorderLayout());
        awardPrizesWrapperPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        awardPrizesWrapperPanel.add(awardPrizesPanel, BorderLayout.CENTER);

        // Set up the panel 2
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.add(degreeOptionsWrapperPanel, BorderLayout.WEST);
        panel2.add(awardPrizesWrapperPanel, BorderLayout.EAST);
        add(panel2);



        // Panel 3
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT,60,2));
        JButton addStudentButton = new JButton("Add Student");
        JButton findStudentButton = new JButton("Find Student");
        JButton printAllRecordsButton = new JButton("Print All Records");
        JButton clearAllRecordsButton = new JButton("Clear All Records");
        panel3.add(addStudentButton);
        panel3.add(findStudentButton);
        panel3.add(printAllRecordsButton);
        panel3.add(clearAllRecordsButton);

        add(panel3);
    }
}