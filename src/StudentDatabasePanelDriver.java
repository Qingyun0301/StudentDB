import javax.swing.*;

public class StudentDatabasePanelDriver {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Database Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveFileAsMenuItem = new JMenuItem("Save File As");
        saveFileAsMenuItem.addActionListener(e -> saveFileAs());
        fileMenu.add(saveFileAsMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        StudentDatabasePanel panel = new StudentDatabasePanel();
        frame.getContentPane().add(panel);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
    }

    private static void saveFileAs() {

    }
}
