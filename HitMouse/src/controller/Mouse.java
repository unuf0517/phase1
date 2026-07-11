package controller;

import javax.swing.*;
import java.awt.*;

public class Mouse {
    private int mouseX;
    private int mouseY;
    private int mouseHeight;
    private int mouseWidth;
    private Image mouseImage;
    private boolean mouseStatus;

    public Mouse(){
        mouseHeight=69;
        mouseWidth=59;
        mouseImage=new ImageIcon("HitMouse/src/imagesM/dishu.png").getImage();
    }

    public int getMouseX() {
        return mouseX;
    }

    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

    public int getMouseHeight() {
        return mouseHeight;
    }

    public void setMouseHeight(int mouseHeight) {
        this.mouseHeight = mouseHeight;
    }

    public int getMouseWidth() {
        return mouseWidth;
    }

    public void setMouseWidth(int mouseWidth) {
        this.mouseWidth = mouseWidth;
    }

    public Image getMouseImage() {
        return mouseImage;
    }

    public void setMouseImage(Image mouseImage) {
        this.mouseImage = mouseImage;
    }

    public boolean isMouseStatus() {
        return mouseStatus;
    }

    public void setMouseStatus(boolean mouseStatus) {
        this.mouseStatus = mouseStatus;
    }
}
