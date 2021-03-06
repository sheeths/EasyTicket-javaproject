package javaprojectswings;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class UserHome extends JFrame {

    private static final long serialVersionUID = 1 ;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHome frame = new UserHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UserHome() {

    }

  
    public UserHome(String userSes) {
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("Add movies");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 39));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              //  int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
              //  JOptionPane.setRootFrame(null);
                
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            moviedb frame = new moviedb();
                            frame.setVisible(true);
                            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                
                });
            }    
            });
        
        btnNewButton.setBounds(247, 118, 491, 114);
        contentPane.add(btnNewButton);
        JButton button = new JButton("Change-password\r\n");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                //JOptionPane.setRootFrame(null);
               ChangePassword bo = new ChangePassword(userSes);
               bo.setTitle("Change Password");
               bo.setVisible(true);           	           	
                   	
           }
        });
        button.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,35));
        button.setBounds(247, 320, 491, 114);
        contentPane.add(button);
    }
}