/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import com.placeholder.PlaceHolder;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author lupinthe3rd
 */
public class intro extends JFrame{
    
    public JLabel login,settings,bcg;
    public JTextField uname;
    public JPasswordField pword;
    public JPanel p1;
    public ImageIcon img;
    PlaceHolder holder;
    
    public intro(){
        setLayout(new CardLayout());
        img = new ImageIcon(getClass().getResource("/pack/image/Group.png"));
        bcg = new JLabel(img);
        add(bcg);
        
        uname = new JTextField();
        holder = new PlaceHolder(uname, "Enter your email address");
        uname.setSize(282, 72);
        add(uname);
        
        pword = new JPasswordField();
        holder = new PlaceHolder(pword, "Enter your password");
        pword.setSize(282, 72);
        add(pword);
        
        p1 = new JPanel(null);
        p1.add(uname);
        p1.add(pword);
        
        
        
    }
    
    public static void main(String[] args) {
        intro g = new intro();
        g.setVisible(true);
        g.setTitle("paint-inventory-app");
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setLocationRelativeTo(null);
        g.setSize(1280, 720);
        g.pack();
    }
}
