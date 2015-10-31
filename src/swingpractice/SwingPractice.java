/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package swingpractice;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author Shyam Prasad
 */
public class SwingPractice extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new SwingPractice();
    }
    public SwingPractice(){
        this.setSize(500,500);
        
        Toolkit toolkt= Toolkit.getDefaultToolkit();
        Dimension dimenshn= toolkt.getScreenSize();
        int xpos= (dimenshn.width/2)-(this.getWidth()/2);
        int ypos= (dimenshn.height/2)-(this.getHeight()/2);
        this.setLocation(ypos, ypos);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Swingy");
        
        JPanel panek=new JPanel();
        JLabel lable=new JLabel("Surprise motherf*#ker!!");
        lable.setToolTipText("aww yeahhh");
        panek.add(lable);
        JButton buton=new JButton("Done");
        buton.setToolTipText("click");
        JTextField txtfld=new JTextField("enter text",25);
        txtfld.setColumns(10);
        //txtfld.setText("stryng");
        panek.add(txtfld);
        panek.add(buton);
        
        JTextArea txtarea=new JTextArea(20,20);
        txtarea.setText("hoolalaaaaaa");
        //NEW EDIT HERE !!!
        JScrollPane skrol=new JScrollPane(txtarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        txtarea.setLineWrap(true);
        panek.add(skrol);
        this.add(panek);
        
        this.setVisible(true);
    }
    
}
