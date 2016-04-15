/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author panda
 */
public class ColumnaRendererMiModelo extends DefaultTableCellRenderer implements TableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        
        
        
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        Color c = new Color(200, 200, 200);
        
        if(column==0){
            setBackground(Color.DARK_GRAY);
            setForeground(Color.white);
        }else{
            setForeground(Color.black);
            setBackground(Color.white);
        }
        return this;
        
    }
    
}
