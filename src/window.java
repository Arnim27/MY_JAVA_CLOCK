import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class window extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font(" ", Font.BOLD, 20);


    window() {
        super.setTitle("My Clock");
        super.setSize(400, 400);
        super.setLocation(300, 50);
        super.setVisible(true);

    }

    public void GUI()
    {
        heading=new JLabel("My Clock");
        clockLabel=new JLabel("CLOCK");
        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }
    public void clock()
    {
    Timer timer=new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           // String dateTime=new Date().toString();
            String dateTime=new Date().toLocaleString();
            Date d=new Date();
            SimpleDateFormat sfd=new SimpleDateFormat("y");
            sfd.format(d);
            clockLabel.setText(dateTime);
        }
    });
    timer.start();
    }
}
