/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 63927
 */
public class controller {
    private JPanel panel, menuButton, board, closeButton, activeButton;
    private JLabel closeLabel;
    public controller(JPanel panel, JPanel menuButton, JPanel board, JPanel closeButton, JLabel closeLabel){
        this.panel = panel;
        this.menuButton = menuButton;
        this.board = board;
        this.closeButton = closeButton;
        this.closeLabel = closeLabel;
    }
    
    /* add panel in the board */
    public void addPanel(){
        this.board.add(panel);
        this.panel.setSize(904, 548);
    }
    /* set panel */
    public void setPanel(JPanel panel){
        this.panel = panel;
    }
    /* get the current panel */
    public JPanel getPanel(){
        return this.panel;
    }
    /* show the panel */
    public void panelSetVisible(){
        this.panel.setVisible(true);
    }
    /* hide the panel */
    public void panelSetNotVisible(){
        this.panel.setVisible(false);
    }
    
    /* set the menu button */
    public void setButton(JPanel menuButton){
        this.menuButton = menuButton;
    }
    /* return active button */
    public void setActiveButton(){
        this.activeButton = menuButton;
    }
    public JPanel getActiveButton(){
        return this.activeButton;
    }
    /* set button color to mouse entered */
    public void buttonMouseEntered(){
        this.menuButton.setBackground(new Color(102,102,102));
    }
    /* set button color to mounse exited*/
    public void buttonMouseExited(){
        this.menuButton.setBackground(new Color(51,51,51));
    }
    
    /* close button set mouse entered */
    public void closeButtonEntered(){
        this.closeButton.setBackground(new Color(255,0,51));
        this.closeLabel.setForeground(new Color(0,0,0));
    }
    /*close button set mouse exited */
    public void closeButtonExited(){
        this.closeButton.setBackground(new Color(51,51,51));
        this.closeLabel.setForeground(new Color(255,255,255));
    }
    
}
