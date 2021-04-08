import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Ninja extends Applet implements ActionListener{

    FlowLayout f1;
    BorderLayout bl1;
    GridLayout g1;
    Button b1;
    Panel p;
    CardLayout cl;
    

    public void init(){

        f1 = new FlowLayout(FlowLayout.LEADING,45,77);
        bl1 = new BorderLayout();
        g1 = new GridLayout(3,2);
        cl = new CardLayout();
        setLayout( new GridLayout(2,3));
        p = new Panel();
        //p.setLayout( new GridLayout(2,3));
        p.setLayout(cl);
        p.setBackground(Color.gray);
        
        //setLayout(g1);

        
        b1 = new Button("add");
        /*
        add(new Button("sdsd"),BorderLayout.WEST);
        add(new TextField(),BorderLayout.NORTH);
        add(new Label("abcxcfsd"),BorderLayout.EAST);
        add(new TextArea(),BorderLayout.CENTER);
        add(b1,BorderLayout.SOUTH);
        
        */
        //for (int i = 0; i < 10; i++)  
        
        
        b1.addActionListener(this);
        add(b1);    
        p.add(new Button("sub " ) );
        p.add(new Button("subs " ) );
        p.add(new TextArea("s"));
        add(new Button("s"));
        add(new Button("k"));

        setBackground(Color.black);
        add(p);

    }

    public void start(){


    }

    public void actionPerformed(ActionEvent e){

        cl.next(p);
    }




}

/*
<applet code="Ninja.class" width = 700 height=500>
</applet>
*/
