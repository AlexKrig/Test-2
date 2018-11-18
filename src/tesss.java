import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tesss extends JFrame{
    private JPanel sss23;
    private JTextField thisTextField;
    private JTextField hrinTextField;
    private JButton prostoButton;
    private JButton button1;



    public tesss(){
        setContentPane(sss23);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        pack();
        setVisible(true);
        prostoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String log=thisTextField.getText();
                hrinTextField.setText(log);
            }
        });
            }
}
