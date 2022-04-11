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
        textField.setForeground(new Color(204,204,204));
    }
    
    public void setColorText(){
        textField.setForeground(new Color(0,0,0));
    }
    
    public void setFieldClear(){
        textField.setText("");
    }
    
    public void getFieldValue(){
        placeholder = "Enter "+name;
        if("".equals(textField.getText())){
            textField.setText(placeholder);
            setColorPlaceholder();
        }
        else if(placeholder.equals(textField.getText())){
            textField.setText("");
            setColorText();
        }
    }
}
