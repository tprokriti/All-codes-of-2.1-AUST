
import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first Frame");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        
        JButton jb1 = new JButton("Click");
        jb1.setBounds(150,50,100,40);
        frame.add(jb1);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    
}
