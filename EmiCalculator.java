import javax.swing.*;    
import java.awt.event.*; 
import java.applet.*;
import java.awt.*;   
class EmiCalculator extends JFrame implements ActionListener{    
JRadioButton rb1,rb2,rb3;    
JButton b;  
JLabel title,subtitle,p,r,t,ans,tp,inte,note,note1,note2,note3,note4; 
JTextField ptext,rtext,ttext,anstext,tptext,intetext; 

EmiCalculator(){  

    title = new JLabel("EMI Calculator");
    title.setBounds(200,15,400,100);
    title.setForeground(Color.RED);
    Font myFont = new Font("Serif",Font.BOLD,50);
     title.setFont(myFont);
    subtitle = new JLabel("What kind of Loan do you prefer ?");
    subtitle.setBounds(185,50,450,150);
    Font myFont2 = new Font("Serif",Font.BOLD,25);
    subtitle.setFont(myFont2); 
    //Radio Buttons
    Font myFont1 = new Font("Serif",Font.BOLD,20);
    rb1=new JRadioButton("Personal Loan");    
    rb1.setBounds(120,170,200,50); 
    rb1.setFont(myFont1);     
    rb2=new JRadioButton("Home Loan");    
    rb2.setBounds(330,170,190,50); 
    rb2.setFont(myFont1);   
    rb3=new JRadioButton("Car Loan");    
    rb3.setBounds(520,170,200,50);   
    rb3.setFont(myFont1); 
    ButtonGroup bg=new ButtonGroup();    
    bg.add(rb1);bg.add(rb2);bg.add(rb3); 
    //Text labels
    Font myFont3 = new Font("Serif",Font.BOLD,15);
    p=new JLabel("Loan Amount -");
    p.setBounds(220,250,150,20);
    p.setFont(myFont3); 
    ptext=new JTextField(20);
    ptext.setBounds(370,250,150,20);
    ptext.setFont(myFont3); 
    r=new JLabel("Rate of Interest -");
    r.setBounds(220,300,150,20);
    r.setFont(myFont3); 
    rtext=new JTextField(20);
    rtext.setBounds(370,300,150,20);
    rtext.setFont(myFont3); 
    t=new JLabel("Loan Term -");
    t.setBounds(220,350,100,20);
    t.setFont(myFont3); 
    ttext=new JTextField(20);
    ttext.setBounds(370,350,150,20);
    ttext.setFont(myFont3); 
    //Button
    b=new JButton("Calculate");    
    b.setBounds(325,420,100,50);    
    b.addActionListener(this);  
    //Solution TextField and Labels
    ans= new JLabel("Loan EMI");
    ans.setBounds(220,520,100,20);
    ans.setFont(myFont3);
    anstext = new JTextField(30);
    anstext.setBounds(370,520,150,20);
    anstext.setFont(myFont3);
    inte= new JLabel("Total Interest");
    inte.setBounds(220,570,100,20);
    inte.setFont(myFont3);
    intetext = new JTextField(30);
    intetext.setBounds(370,570,150,20);
    intetext.setFont(myFont3);
    tp= new JLabel("Total Payment");
    tp.setBounds(220,620,100,20);
    tp.setFont(myFont3);
    tptext = new JTextField(30);
    tptext.setBounds(370,620,150,20);
    tptext.setFont(myFont3);
    //notes
    note = new JLabel("Note :");
    note.setBounds(30,670,400,50);
    note.setForeground(Color.GRAY);
    note1 = new JLabel("1 - Rate of interest calculated on monthly basis i.e. The input should be in Months.");
    note1.setBounds(30,700,600,50);
    note1.setForeground(Color.GRAY);
    note2 = new JLabel("2 - The Maximum Loan term for Personal Loan is of 5 Years i.e. 60 months.");
    note2.setBounds(30,730,600,50);
    note2.setForeground(Color.GRAY);
    note3 = new JLabel("3 - The Maximum Loan term for Home Loan is of 30 Years i.e. 360 months.");
    note3.setBounds(30,760,600,50);
    note3.setForeground(Color.GRAY);
    note4 = new JLabel("4 - The Maximum Loan term for Car Loan is of 7 Years i.e. 84 months.");
    note4.setBounds(30,790,600,50);
    note4.setForeground(Color.GRAY);
    

    add(title);
    add(subtitle); 
    add(rb1);
    add(rb2);
    add(b);
    add(rb3);
    add(p);
    add(ptext);
    add(r);
    add(rtext);
    add(t);
    add(ttext); 
    add(ans);
    add(anstext);   
    add(inte);
    add(intetext);
    add(tp);
    add(tptext);
    add(note);
    add(note1);
    add(note2);
    add(note3);
    add(note4);

setTitle("EMI Calculator");    
setSize(800,1000);    
setLayout(null);    
setVisible(true);   



}    
public void actionPerformed(ActionEvent e)
{    
    if(e.getSource()==b)
    {
        if(rb1.isSelected())
        {    
             float n1=Integer.parseInt(ptext.getText());
             float n2=Integer.parseInt(rtext.getText());
             float n3=Integer.parseInt(ttext.getText());    
             if((n1>=0 && n1<=1500000) && (n2>=0 && n2<=25) && (n3>=0 && n3<=60))
             {
                n2 = n2/(12*100);
                float sol=  (n1*n2*(float)Math.pow(1+n2,n3))/((float)Math.pow(1+n2,n3)-1);                                            
                anstext.setText(" "+sol);
                tptext.setText(" "+(sol*n3));
                intetext.setText(" "+((sol*n3)-n1));
             }
             else
             {
                JOptionPane.showMessageDialog(this,"Invalid Details"); 
             }    
        }    
        if(rb2.isSelected())
        {    
             float n1=Integer.parseInt(ptext.getText());
             float n2=Integer.parseInt(rtext.getText());
             float n3=Integer.parseInt(ttext.getText());    
             if((n1>=0 && n1<=20000000) && (n2>=0 && n2<=20) && (n3>=0 && n3<=360))
             {
                n2 = n2/(12*100);
                float sol=  (n1*n2*(float)Math.pow(1+n2,n3))/((float)Math.pow(1+n2,n3)-1);                                            
                anstext.setText(" "+sol);
                tptext.setText(" "+(sol*n3));
                intetext.setText(" "+((sol*n3)-n1));
             }
             else
             {
                JOptionPane.showMessageDialog(this,"Invalid Details"); 
             }     
        }    
        if(rb3.isSelected())
        {    
            float n1=Integer.parseInt(ptext.getText());
             float n2=Integer.parseInt(rtext.getText());
             float n3=Integer.parseInt(ttext.getText());    
             if((n1>=0 && n1<=2000000) && (n2>=0 && n2<=20) && (n3>=0 && n3<=84))
             {
                n2 = n2/(12*100);
                float sol=  (n1*n2*(float)Math.pow(1+n2,n3))/((float)Math.pow(1+n2,n3)-1);                                            
                anstext.setText(" "+sol);
                tptext.setText(" "+(sol*n3));
                intetext.setText(" "+((sol*n3)-n1));
             }
             else
             {
                JOptionPane.showMessageDialog(this,"Invalid Details"); 
             }  
        }
         
    }
     
}    
public static void main(String args[])
{    
  new EmiCalculator();    
}
}   