package code;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable {
    private boolean rectangular;
    public Colors() {
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                change();
            }
        });
        rectangular=false;
        setSize(200,100);
        change();
    }
    public boolean getRectangular(){
        return rectangular;
    }
    public void setRectangular(boolean flag){
        this.rectangular=flag;
        reprint();
    }
    private Color randomColor(){
        return new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
    }
    public void paint(Graphics graphics){
            Dimension dimension=getSize();
            int height=dimension.height;
            int width=dimension.width;
            if(rectangular){
                graphics.fillRect(0,0,width-1,height-1);
            }
            else graphics.fillOval(0,0,width-1,height-1);
    }
    private void reprint() {

    }
    private void change() {
        Color color = randomColor();
     reprint();
    }

}
