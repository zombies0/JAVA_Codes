import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Appl extends Applet{
    
    Button sd;
    Button b;
    TextField t;
    TextField t1;
    Button [] l;
    Color[] c ;
    int[] cv = {255,255,255};
    int i = 0;
    Color nc;
    int [][] cn = { { 255, 0, 0 },{107, 58, 30}, { 0, 180, 0 }, { 0, 0, 255}, { 0,255,255 }, { 12, 146, 184},{255,255,0},{255,128,0},{255,0,128},{128,0,255},{158,255,30},{0, 65, 97},{150, 150, 150} ,{255,255,255},{40,40,40}};
    Button b2;
    int size1 = 22;
    int size2 = 22;
    Panel p;
    GridLayout gl;
    
    public void init(){
        b = new Button("CLEAR");
        b2 = new Button("ERASER");
        sd = new Button("SET SIZE");
        p = new Panel();
        gl = new GridLayout(2,12);
        p.setLayout(gl);
        p.setForeground(Color.white);
        p.setBackground(Color.DARK_GRAY);
        add(p);
        t = new TextField(6);
        t1 = new TextField(6);
        l = new Button[15];
        c = new Color[15];
        b.setSize(15, 10);
        b2.setSize(15, 10);
        sd.setSize(15, 10);
        
        p.add(b);
        p.add(b2);
        p.add(t);
        p.add(t1);
        p.add(sd);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                setBackground(Color.white);
                setBackground(Color.black);
                
            }
        });
        sd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                size1 = Integer.parseInt( t.getText() );
                size2 = Integer.parseInt( t1.getText() );
                
            }
        });
        
        
        
        for (i = 0 ;i < l.length;i++){ 

            c[i] = new Color(cn[i][0],cn[i][1],cn[i][2]);
            l[i] = new Button("    ");
            l[i].setBackground(c[i]);
            l[i].setForeground(c[i]);
            l[i].setSize(15, 10);
            

            p.add(l[i]);
        }


        l[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 0;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
                        g.fillOval(me.getX(), me.getY(), size1, size2);
                        
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[1].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 1;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[2].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 2;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[3].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 3;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[4].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 4;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[5].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 5;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[6].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 6;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[7].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 7;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[8].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 8;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[9].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 9;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[10].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 10;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[11].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 11;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[12].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 12;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
                        g.fillOval(me.getX(), me.getY(), size1, size2);
                        
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[13].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 13;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
                        g.fillOval(me.getX(), me.getY(), size1, size2);
                        
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        l[14].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 14;
                        g.setColor(new Color(cn[i][0],cn[i][1],cn[i][2]));
                        g.fillOval(me.getX(), me.getY(), size1, size2);
                        
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });
        
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                addMouseMotionListener(new MouseMotionListener(){  @Override

                    public void mouseDragged(MouseEvent me) {
                        Graphics g = getGraphics();
                        i = 12;
                        g.setColor(Color.black);
        
                        g.fillOval(me.getX(), me.getY(), size1, size2);
         
                    }
                
                    @Override
                    public void mouseMoved(MouseEvent me) {}
                });
                
            }
        });

        
        setBackground(Color.black);

    }

}

/*
<applet code="Appl.class" width=300 height=400>
</applet>
*/
