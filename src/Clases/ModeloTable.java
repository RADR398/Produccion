/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Panda
 */
public class ModeloTable extends DefaultTableModel{
    
    public ModeloTable(){
    
        this.addColumn("Codigo");
        this.addColumn("Nombre");
        this.addColumn("Descripcion");
    
    }
    @Override
    public boolean isCellEditable(int row,int column){
    
        return false;
    
    }
}
