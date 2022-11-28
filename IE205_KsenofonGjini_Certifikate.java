package IE205_KsenofonGjini_Certifikate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;


public class IE205_KsenofonGjini_Certifikate {
    
    
    
    public static JFrame kryesoFrame;
    public static JTextField emri;
    public static JTextField shkolla;
    public static JLabel notagjuhe;
    public static JLabel notamat;
    public static JLabel notaang;
    public static JLabel notaeko;
    public static JLabel koha;
    public static JLabel mesa;
    public static JLabel emrJLabel;
    public static JLabel shkoLabel;
    public static JTextField gjuha;
    public static JTextField matematika;
    public static JTextField anglisht;
    public static JTextField ekonomi;
    public static JButton mButton;
    public static JButton kohaaButton;
    private static JTextField mesatarjaF;

    
        


    public static void afishoTeDhenaNxenes(){
        
        kryesoFrame = new JFrame("Certifikata e Nxenesit");
        kryesoFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        emri = new JTextField("Ksenofon Gjini");
        emrJLabel = new JLabel("Emri:");
       
        shkoLabel = new JLabel("Shkolla:"); 
        shkolla = new JTextField("Siri Shapllo");
    
        notagjuhe = new JLabel("nota Gjuhe");
        gjuha = new JTextField("9.4");
    
        notamat = new JLabel("nota Matematike");
         matematika = new JTextField("9.2");
    
        notaang = new JLabel("nota Anglisht");
        anglisht = new JTextField("9.6");
    
        notaeko = new JLabel("nota Ekonomi");
         ekonomi = new JTextField("9.8");
    
         mesa = new JLabel("Mesatarja:");
        mesatarjaF = new JTextField(10);
        mButton = new JButton("Llogarit mesataren");
        
        koha = new JLabel("Printo daten");
        JTextField koha = new JTextField(10);
       
        
        // shtohet nje actionlistener(eshte nje  klase pergjegjese per cdo nderveprim kur useri klikon nje komponent)
        mButton.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    String cText = gjuha.getText();
                    float c = Float.parseFloat(cText);
                    String dText = matematika.getText();
                    float d = Float.parseFloat(dText);
                    String gText = anglisht.getText();
                    float g = Float.parseFloat(gText);
                    String fText = ekonomi.getText();
                    float f = Float.parseFloat(fText);
                    
                    llogaritMesataren(c, d, g, f);
                    if (mButton.isEnabled()){
                       kryesoFrame.getContentPane().setBackground(gjener());
                    }
                    
                }
            }
        );
        
        kohaaButton = new JButton("print daten");
        // Add ActionListener
        kohaaButton.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {

                   LocalDate z = java.time.LocalDate.now();
                   
                   koha.setText(String.valueOf(z));
                   if (kohaaButton.isEnabled()){
                    
                    
                    kryesoFrame.getContentPane().setBackground(gjener());
                   }
                }
            }
        );
    
        // ketu shtohen elementet ne nderfaqen e GUI
        kryesoFrame.add(emrJLabel);
        kryesoFrame.add(emri);
        

        kryesoFrame.add(shkoLabel);
        kryesoFrame.add(shkolla);

        kryesoFrame.add(notagjuhe);
        kryesoFrame.add(gjuha);

        kryesoFrame.add(notamat);
        kryesoFrame.add(matematika);

        kryesoFrame.add(notaang);
        kryesoFrame.add(anglisht);

        kryesoFrame.add(notaeko);
        kryesoFrame.add(ekonomi);

        kryesoFrame.add(mesa);
        kryesoFrame.add(mesatarjaF);
        kryesoFrame.add(mButton);

        kryesoFrame.add(koha);
        kryesoFrame.add(kohaaButton);
        kryesoFrame.getContentPane().setBackground(Color.CYAN); //ndikon ne gjithe dritaren... 
        kryesoFrame.pack();
        kryesoFrame.setLocationRelativeTo(null);
        // kjo e ben nderfaqen te dukshme
        kryesoFrame.setVisible(true);
    }
    

   

    static Color gjener(){
        int red = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
        Color c = new Color(red, green, blue);

     return c;
    }

    static void llogaritMesataren(Float a, Float b, Float c, Float d){
    float m = (a+b+c+d)/4;
    mesatarjaF.setText(String.valueOf(m));
    
    
   }


    public static void main(String[] args) {
    afishoTeDhenaNxenes();
    
    }
}