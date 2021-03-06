/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Clases.ColumnaRenderer;
import Clases.DAO;
import Clases.NewHibernateUtil;
import Hibernate.*;
import javax.swing.table.DefaultTableModel;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import producción.VentanaPrincipal;

/**
 *
 * @author panda
 */
public class PlanAgregado extends javax.swing.JInternalFrame {

    public static DefaultTableModel mimodelo;
    public ProductoInternal productoInternal;
    double total_Persecucion,total_FE,total_FO;
    boolean flag;
    public DatosGenerales dgs;
    
    public PlanAgregado() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datosMes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_materiales = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_mtto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_marginal_subcontratacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_despido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_horas_laborales = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_tiempo_normal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_tiempo_extra = new javax.swing.JTextField();
        txt_contratacion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_inventario_inicial = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_inventario_seguridad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Seleccion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_numero_trabajadores = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_ver = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        datosMes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {{"","","","","","","","","","","",""},
                {"","","","","","","","","","","",""}},
            new String [] {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return true;
            }
        });
        datosMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                datosMesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(datosMes);

        jLabel1.setText("Materiales");

        jLabel11.setText("Cto de Mantenimiento de Inv");

        jLabel13.setText("Cto de Subcontracion");

        jLabel2.setText("Cto de Contratacion y Capacitacion");

        jLabel14.setText("Cto de Despido");

        jLabel15.setText("Horas Laborales Req");

        jLabel16.setText("Cto del Tiempo Normal");

        jLabel17.setText("Cto del Tiempo Extra");

        jLabel18.setText("Inventario Inicial");

        jLabel19.setText("Stock de Seguridad");

        jLabel4.setText("Tipo de Metodo");

        Seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Método", "Persecución", "Fuerza Nivelada y Horas Extras", "Fuerza Nivelada y Outsourcing", " " }));
        Seleccion.setEnabled(false);
        Seleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeleccionMouseClicked(evt);
            }
        });

        jLabel5.setText("Numero de Trabajadores Iniciales");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Persecución", "Fuerza Nivelada HE", "Fuerza Nivelada y O"
            }
        ));
        jScrollPane2.setViewportView(Resultado);

        jPanel1.setBackground(java.awt.Color.darkGray);

        btn_ver.setText("Ver");
        btn_ver.setEnabled(false);
        btn_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verActionPerformed(evt);
            }
        });

        jButton2.setText("Gestionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ver)
                    .addComponent(jButton2))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel4))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_inventario_seguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_marginal_subcontratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mtto, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_inventario_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(52, 52, 52))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel16)
                                                .addComponent(jLabel14))
                                            .addGap(122, 122, 122)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(69, 69, 69)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_numero_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tiempo_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_despido, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_horas_laborales, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tiempo_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_despido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_horas_laborales, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tiempo_normal)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_tiempo_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_numero_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mtto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marginal_subcontratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_inventario_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_inventario_seguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Metodo_Outsourcing(){
    
        DefaultTableModel modelo = (DefaultTableModel)datosMes.getModel();
        mimodelo = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        
        };
        mimodelo.addColumn("Meses", new String[]{
            
            "Requerimiento de Produccion","Horas de Produccion Requeridas",
            "Dias Habiles por mes","Horas al mes por trabajar",
            "Horas Totales Disponibles","Unidades Producidas",
            "Unidades Faltantes","Unidades sobrantes","Costo del Tiempo Normal",
            "Costo de subcontratación","Horas mantenimiento","Total"
        });
        mimodelo.addColumn("Enero");
        mimodelo.addColumn("Febrero");
        mimodelo.addColumn("Marzo");
        mimodelo.addColumn("Abril");
        mimodelo.addColumn("Mayo");
        mimodelo.addColumn("Junio");
        mimodelo.addColumn("Julio");
        mimodelo.addColumn("Agosto");
        mimodelo.addColumn("Septiembre");
        mimodelo.addColumn("Octubre");
        mimodelo.addColumn("Noviembre");
        mimodelo.addColumn("Diciembre");
        
        double btn_inventario_seguridad = Double.parseDouble(txt_inventario_seguridad.getText().trim());
        double btn_inventario_inicial = Double.parseDouble(txt_inventario_inicial.getText().trim());
        double btn_costo_marginal_inventario = Double.parseDouble(txt_horas_laborales.getText().trim());
        double btn_costo_producto = Double.parseDouble(txt_materiales.getText().trim());
        double btn_costo_outsourcing = Double.parseDouble(txt_marginal_subcontratacion.getText().trim());
        double btn_costo_tiempo_normal = Double.parseDouble(txt_tiempo_normal.getText().trim());
        double btn_trabajadores_iniciales = Double.parseDouble(txt_numero_trabajadores.getText().trim());
        double bnt_costo_mantenimiento = Double.parseDouble(txt_mtto.getText().trim());
        double tot = 0;
        double OctabaFila=0;
        
        for(int i=1;
        (i<=modelo.getColumnCount() && (!modelo.getValueAt(0, i-1).toString().equals("") 
        || !modelo.getValueAt(1, i-1).toString().equals("")));i++){
           
           double dato = Double.parseDouble(modelo.getValueAt(0, i-1).toString());
           double dato_1 = dato*btn_inventario_seguridad;
           double PrimeraFila = dato+dato_1-btn_inventario_inicial;
           double SegundaFila = PrimeraFila*btn_costo_marginal_inventario;
           double TerceraFila = Double.parseDouble(modelo.getValueAt(1, i-1).toString());
           double CuartaFila =  8*TerceraFila;
           double QuintaFila = btn_trabajadores_iniciales*8*TerceraFila;
           double SextaFila = QuintaFila/btn_costo_marginal_inventario;
           double SeptimaFila = PrimeraFila-SextaFila;
           
                
                
                if (SeptimaFila >0){
                    
                    SeptimaFila  +=-OctabaFila;
                    OctabaFila = 0;
    
                }
                else {
                     
                     OctabaFila += -SeptimaFila;
                     SeptimaFila = 0;
                 }
           
           double NovenaFila = QuintaFila*btn_costo_tiempo_normal;
           double DecimaFila = SeptimaFila*(btn_costo_outsourcing-btn_costo_producto);
           double OnceabaFila = OctabaFila*bnt_costo_mantenimiento;
           double Doceaba = NovenaFila+DecimaFila+OnceabaFila;
           tot+=Doceaba;
           
           //Hacen falta validaciones en el faltante y en los meses que no se esten evaluando 
           
           mimodelo.setValueAt(PrimeraFila, 0, i);
           mimodelo.setValueAt(SegundaFila, 1, i);
           mimodelo.setValueAt(TerceraFila, 2, i);
           mimodelo.setValueAt(CuartaFila, 3, i);
           mimodelo.setValueAt(QuintaFila, 4, i);
           mimodelo.setValueAt(SextaFila, 5, i);
           mimodelo.setValueAt(SeptimaFila, 6, i);
           mimodelo.setValueAt(OctabaFila, 7, i);
           mimodelo.setValueAt(NovenaFila, 8, i);
           mimodelo.setValueAt(DecimaFila, 9, i);
           mimodelo.setValueAt(OnceabaFila, 10, i);
           btn_inventario_inicial  = dato_1;
           
        }
        
        mimodelo.setValueAt(tot, 11, 1);
        total_FO = tot;
        if(flag){
            Metodo metodo = new Metodo();
            metodo.setVisible(true);
            VentanaPrincipal.fondoInternal.add(metodo);
            metodo.p = this;
            this.setVisible(false);
        }
    
    }
    
    public void Metodo_Fuerza_nivelada() {
       
        DefaultTableModel modelo = (DefaultTableModel)datosMes.getModel();
        mimodelo = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        
        };
        mimodelo.addColumn("Meses", new String[]{
            
            "Produccion requeridas","Horas de Produccion Requeridas",
            "Dias laborables","Horas disponibles / mes",
            "Horas total diponibles","Horas extras requeridas",
            "Horas ociosas","Costo de produccion (Hrs/ normal)","Costo de horas extra",
            "Subtotal","Total"
        });
        mimodelo.addColumn("Enero");
        mimodelo.addColumn("Febrero");
        mimodelo.addColumn("Marzo");
        mimodelo.addColumn("Abril");
        mimodelo.addColumn("Mayo");
        mimodelo.addColumn("Junio");
        mimodelo.addColumn("Julio");
        mimodelo.addColumn("Agosto");
        mimodelo.addColumn("Septiembre");
        mimodelo.addColumn("Octubre");
        mimodelo.addColumn("Noviembre");
        mimodelo.addColumn("Diciembre");
        
        double btn_inventario_seguridad = Double.parseDouble(txt_inventario_seguridad.getText().trim());
        double btn_inventario_inicial = Double.parseDouble(txt_inventario_inicial.getText().trim());
        double btn_costo_inventario_agotado = Double.parseDouble(txt_horas_laborales.getText().trim());
        double btn_costo_capacitacion = Double.parseDouble(txt_contratacion.getText().trim());
        double btn_costo_despido = Double.parseDouble(txt_despido.getText().trim());
        double btn_costo_tiempo_normal = Double.parseDouble(txt_tiempo_normal.getText().trim());
        double btn_costo_tiempo_extra = Double.parseDouble(txt_tiempo_extra.getText().trim());
        double numero_trab =Double.parseDouble(txt_numero_trabajadores.getText().trim());
        double tot = 0;
        
        for(int i=1;
        (i<=modelo.getColumnCount() && (!modelo.getValueAt(0, i-1).toString().equals("") 
        || !modelo.getValueAt(1, i-1).toString().equals("")));i++){
           double dato = Double.parseDouble(modelo.getValueAt(0, i-1).toString());
           double dato_1 = dato*btn_inventario_seguridad;
           double PrimeraFila = dato+dato_1-btn_inventario_inicial;
           double SegundaFila = PrimeraFila*btn_costo_inventario_agotado;
           double TerceraFila = Double.parseDouble(modelo.getValueAt(1, i-1).toString());
           double CuartaFila =  8*TerceraFila;
           double QuintaFila = numero_trab*CuartaFila;
           double SextaFila ;
           double SeptimaFila;
           if(QuintaFila-SegundaFila > 0){
           
            SextaFila = 0;
            SeptimaFila = QuintaFila-SegundaFila;
           }
           else if(QuintaFila-SegundaFila < 0)
           {
          SextaFila = SegundaFila-QuintaFila;
           SeptimaFila = 0;
        }
           else{
           
            SextaFila = 0;
            SeptimaFila = 0;
           }
       
           double OctabaFila = QuintaFila*btn_costo_tiempo_normal;
           double NovenaFila = SextaFila*btn_costo_tiempo_extra;
           double DecimaFila = OctabaFila+NovenaFila;
           tot+=DecimaFila;
           mimodelo.setValueAt(PrimeraFila, 0, i);
           mimodelo.setValueAt(SegundaFila, 1, i);
           mimodelo.setValueAt(TerceraFila, 2, i);
           mimodelo.setValueAt(CuartaFila, 3, i);
           mimodelo.setValueAt(QuintaFila, 4, i);
           mimodelo.setValueAt(SextaFila, 5, i);
           mimodelo.setValueAt(SeptimaFila, 6, i);
           mimodelo.setValueAt(OctabaFila, 7, i);
           mimodelo.setValueAt(NovenaFila, 8, i);
           mimodelo.setValueAt(DecimaFila, 9, i);
          
           btn_inventario_inicial  = dato_1;
           
        }
        
        mimodelo.setValueAt(tot, 10, 1);
        total_FE = tot;
        if(flag){
            Metodo metodo = new Metodo();
            metodo.setVisible(true);
            VentanaPrincipal.fondoInternal.add(metodo);
            metodo.p = this;
            this.setVisible(false);
        }
}

    public void Metodo_Persecucion(){
    
        DefaultTableModel modelo = (DefaultTableModel)datosMes.getModel();
        mimodelo = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        
        };
        mimodelo.addColumn("Meses", new String[]{
            
            "Requerimiento de Produccion","Horas de Produccion Requeridas",
            "Dias Habiles por mes","Horas al mes por trabajar",
            "Trabajadores Requeridos","Nuevo Trabajadores contratados",
            "Costo de contratacion","Despido de Trabajadores","Costo de Despido",
            "Costo del Tiempo Normal","Subtotal","Total"
        });
        mimodelo.addColumn("Enero");
        mimodelo.addColumn("Febrero");
        mimodelo.addColumn("Marzo");
        mimodelo.addColumn("Abril");
        mimodelo.addColumn("Mayo");
        mimodelo.addColumn("Junio");
        mimodelo.addColumn("Julio");
        mimodelo.addColumn("Agosto");
        mimodelo.addColumn("Septiembre");
        mimodelo.addColumn("Octubre");
        mimodelo.addColumn("Noviembre");
        mimodelo.addColumn("Diciembre");
        
        double btn_inventario_seguridad = Double.parseDouble(txt_inventario_seguridad.getText().trim());
        double btn_inventario_inicial = Double.parseDouble(txt_inventario_inicial.getText().trim());
        double btn_horas_laborales = Double.parseDouble(txt_horas_laborales.getText().trim());
        double btn_costo_capacitacion = Double.parseDouble(txt_contratacion.getText().trim());
        double btn_costo_despido = Double.parseDouble(txt_despido.getText().trim());
        double btn_costo_tiempo_normal = Double.parseDouble(txt_tiempo_normal.getText().trim());
        double btn_numero_trabajadores = Double.parseDouble(txt_numero_trabajadores.getText().trim());
        double tot = 0;
        
        for(int i=1;
        (i<=modelo.getColumnCount() && (!modelo.getValueAt(0, i-1).toString().equals("") 
        || !modelo.getValueAt(1, i-1).toString().equals("")));i++){
            
           double dato = Double.parseDouble(modelo.getValueAt(0, i-1).toString());
           double dato_1 = dato*btn_inventario_seguridad;
           double PrimeraFila = dato+dato_1-btn_inventario_inicial;
           double SegundaFila = PrimeraFila*btn_horas_laborales;
           double TerceraFila = Double.parseDouble(modelo.getValueAt(1, i-1).toString());
           double CuartaFila =  8*TerceraFila;
           double QuintaFila = Math.ceil(SegundaFila/CuartaFila);
           double SextaFila = 0;
           double OctabaFila = 0;
           
           if(i>1){
               
               double value = Double.parseDouble((String)mimodelo.getValueAt(4, i-1).toString().trim())-QuintaFila;
               
               if(value>0){
                   
                   OctabaFila = value; 
                   
               }else if(value <0){
                   SextaFila = -value;
           
                }
           
           }else{
           
               double value = QuintaFila-btn_numero_trabajadores;
               
               if(value>0){
               
                   SextaFila = value;
               
               }else{
               
                  OctabaFila = -value;
               
               }
           
           }
           
           double SeptimaFila = SextaFila*btn_costo_capacitacion;
           double NovenaFila = OctabaFila*btn_costo_despido;
           double DecimaFila = SegundaFila*btn_costo_tiempo_normal;
           double OnceabaFila = SeptimaFila+NovenaFila+DecimaFila;
           tot+=OnceabaFila;
           mimodelo.setValueAt(PrimeraFila, 0, i);
           mimodelo.setValueAt(SegundaFila, 1, i);
           mimodelo.setValueAt(TerceraFila, 2, i);
           mimodelo.setValueAt(CuartaFila, 3, i);
           mimodelo.setValueAt(QuintaFila, 4, i);
           mimodelo.setValueAt(SextaFila, 5, i);
           mimodelo.setValueAt(SeptimaFila, 6, i);
           mimodelo.setValueAt(OctabaFila, 7, i);
           mimodelo.setValueAt(NovenaFila, 8, i);
           mimodelo.setValueAt(DecimaFila, 9, i);
           mimodelo.setValueAt(OnceabaFila, 10, i);
           btn_inventario_inicial  = dato_1;
           
        }
        
        mimodelo.setValueAt(tot, 11, 1);
        total_Persecucion = tot;
        if(flag){
            Metodo metodo = new Metodo();
            metodo.setVisible(true);
            VentanaPrincipal.fondoInternal.add(metodo);
            metodo.p = this;
            this.setVisible(false);
        }
    }
    private void datosMesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosMesMousePressed
        
        datosMes.setDefaultRenderer(Object.class,new ColumnaRenderer());
        datosMes.setFocusable(true);
    }//GEN-LAST:event_datosMesMousePressed
   
    private void SeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleccionMouseClicked
      
        
    }//GEN-LAST:event_SeleccionMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        productoInternal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       flag = false;
        Metodo_Fuerza_nivelada();
        Metodo_Outsourcing();
        Metodo_Persecucion();
        Resultado.setValueAt(total_Persecucion, 0, 0);
        Resultado.setValueAt(total_FE, 0, 1);
        Resultado.setValueAt(total_FO, 0, 2);
        
        btn_ver.setEnabled(true);
        Seleccion.setEnabled(true);
        
        DatosGenerales dg = new DatosGenerales();
        dg.setIdDatosGenerales(this.dgs.getIdDatosGenerales());
        dg.setCostoContratacion(Float.parseFloat(txt_contratacion.getText()));
        dg.setCostoDespido(Float.parseFloat(txt_despido.getText()));
        dg.setCostoHoraExtra(Float.parseFloat(txt_tiempo_extra.getText()));
        dg.setCostoHoraNormal(Float.parseFloat(txt_tiempo_normal.getText()));
        dg.setCostoMantenimiento(Float.parseFloat(txt_mtto.getText()));
        dg.setCostoSubcontratacion(Float.parseFloat(txt_marginal_subcontratacion.getText()));
        dg.setHorasRequeridas(Float.parseFloat(txt_horas_laborales.getText()));
        dg.setInversionInicial(Float.parseFloat(txt_inventario_inicial.getText()));
        Session session = NewHibernateUtil.sessionFactory.openSession();
        SQLQuery consulta = session.createSQLQuery(String.format("select IdJornada "
                + "from Jornada "
                + "where Año=year(curdate())"));
        int j = Integer.parseInt(consulta.uniqueResult().toString());
        Jornada jor = new Jornada();
        jor.setIdJornada(j);
        dg.setJornada(jor);
        dg.setMateriales(Float.parseFloat(txt_materiales.getText()));
        dg.setNumeroTrabajadores(Float.parseFloat(txt_numero_trabajadores.getText()));
        dg.setProducto(productoInternal.pr);
        dg.setStockSeguridad(Float.parseFloat(txt_inventario_seguridad.getText()));
        session.close();
        
        DAO.SaveOrUpdate(dg);
        
        DefaultTableModel modelo = (DefaultTableModel)datosMes.getModel();
        session = NewHibernateUtil.sessionFactory.openSession();
        int datos;
        if(dgs.getIdDatosGenerales()==0){
            String query = "select IdDatosGenerales from DatosGenerales group by IdDatosGenerales desc limit 1";
            SQLQuery c = session.createSQLQuery(String.format(query));
        
            datos = Integer.parseInt(c.uniqueResult().toString());
        
        }else{
        
            datos=dgs.getIdDatosGenerales();
        
        }
        
        DatosGenerales dt = new DatosGenerales();
        dt.setIdDatosGenerales(datos);
       
        session = NewHibernateUtil.sessionFactory.openSession();
        Transaction tn = session.beginTransaction();
        
        for(int i=1;
        (i<=modelo.getColumnCount() && (!modelo.getValueAt(0, i-1).toString().equals("") 
        || !modelo.getValueAt(1, i-1).toString().equals("")));i++){
            
            DatosMes dm = new DatosMes();
            if(i<=productoInternal.tamList){
            
                dm.setIdDatosMes(i);
            
            }
            Mes m = new Mes();
            
            m.setIdMes(i);
            dm.setDatosGenerales(dt);
            dm.setMes(m);
            dm.setDemanda(Integer.parseInt(modelo.getValueAt(0, i-1).toString()));
            dm.setDiasHabiles(Integer.parseInt(modelo.getValueAt(1, i-1).toString()));
            
            session.saveOrUpdate(dm);
            
            
        }
        tn.commit();
        session.flush();
        session.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verActionPerformed
        
        flag = true;

        switch(Seleccion.getSelectedIndex()){
            case 1:Metodo_Persecucion();
            break;
            case 2:Metodo_Fuerza_nivelada();
            break;
            case 3: Metodo_Outsourcing();
            break;

        }
    }//GEN-LAST:event_btn_verActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Resultado;
    private javax.swing.JComboBox<String> Seleccion;
    private javax.swing.JButton btn_ver;
    public javax.swing.JTable datosMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txt_contratacion;
    public javax.swing.JTextField txt_despido;
    public javax.swing.JTextField txt_horas_laborales;
    public javax.swing.JTextField txt_inventario_inicial;
    public javax.swing.JTextField txt_inventario_seguridad;
    public javax.swing.JTextField txt_marginal_subcontratacion;
    public javax.swing.JTextField txt_materiales;
    public javax.swing.JTextField txt_mtto;
    public javax.swing.JTextField txt_numero_trabajadores;
    public javax.swing.JTextField txt_tiempo_extra;
    public javax.swing.JTextField txt_tiempo_normal;
    // End of variables declaration//GEN-END:variables
}
