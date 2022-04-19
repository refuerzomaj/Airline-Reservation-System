/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author 63927
 */
public class account_class {
    private JTextField textField;
    private String name,placeholder;
    public account_class(JTextField textField, String name){
        this.textField = textField;
        this.name = name;
    }
    
    public void setTextField(JTextField textField){
        this.textField = textField;
    }
    public JTextField getTextField(){
        return textField;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setColorPlaceholder(){
        textField.setForeground(new Color(153,153,153));
    }
    
    public void setColorText(){
        textField.setForeground(new Color(255,255,255));
    }
    
    public void setFieldClear(){
        textField.setText("");
    }
    public String getPlaceholder(){
        placeholder = "Enter "+name;
        return placeholder;
    }
    public void setPlaceholder(){
        textField.setText(getPlaceholder());
        setColorPlaceholder();
    }
    public void getFieldValue(){
        if("".equals(textField.getText())){
            setPlaceholder();
        }
        else if(getPlaceholder().equals(textField.getText())){
            setFieldClear();
            setColorText();
        }
    }
}
