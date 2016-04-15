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
public class ColumnaRenderer extends DefaultTableCellRenderer implements TableCellRenderer{
    
    public static int rows; 
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        
        
        
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        Color c = new Color(200, 200, 200);
        
        if((table.getSelectedRow()==row) && table.getSelectedColumn()==column){
            setBackground(c);
        }else{
        
            setBackground(Color.white);
        }
        return this;
        
    }
    
            
}
