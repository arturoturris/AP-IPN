package view.recibo;

public class RecibosForm extends javax.swing.JPanel {
    public static enum formType {SIGNUP,UPDATE};
    public formType type;
    
    public RecibosForm(formType type) {
        initComponents();
        this.type = type;
        
        switch(type){
            case SIGNUP:{
                setViewToSignUp();
                break;
            }
            case UPDATE:{
                setViewToModify();
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblTitulo = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Cabecera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdRecibo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaEmision = new com.toedter.calendar.JDateChooser();
        btnAgregarConcepto = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        Conceptos = new javax.swing.JPanel();
        Titulos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Total = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        Botones = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnGenerar = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnCancelar = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setOpaque(false);
        Titulo.setLayout(new javax.swing.BoxLayout(Titulo, javax.swing.BoxLayout.LINE_AXIS));
        Titulo.add(filler1);

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTitulo.setText("GENERACIÓN DE RECIBO");
        Titulo.add(lblTitulo);
        Titulo.add(filler2);

        Cabecera.setOpaque(false);
        Cabecera.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jLabel2.setText("ID Recibo:");
        Cabecera.add(jLabel2);

        txtIdRecibo.setEditable(false);
        txtIdRecibo.setOpaque(false);
        Cabecera.add(txtIdRecibo);

        jLabel3.setText("Cliente:");
        Cabecera.add(jLabel3);
        Cabecera.add(txtCliente);

        jLabel4.setText("Fecha de emisión:");
        Cabecera.add(jLabel4);
        Cabecera.add(txtFechaEmision);

        btnAgregarConcepto.setText("Agregar Concepto");

        Scroll.setBorder(javax.swing.BorderFactory.createTitledBorder("Conceptos"));
        Scroll.setOpaque(false);

        Conceptos.setOpaque(false);
        Conceptos.setLayout(new javax.swing.BoxLayout(Conceptos, javax.swing.BoxLayout.Y_AXIS));

        Titulos.setBackground(new java.awt.Color(0, 102, 255));
        Titulos.setOpaque(false);
        Titulos.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID");
        Titulos.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cantidad");
        Titulos.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Concepto");
        Titulos.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Precio U.");
        Titulos.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nue. Precio");
        Titulos.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sub. Total");
        Titulos.add(jLabel10);
        Titulos.add(jLabel11);

        Conceptos.add(Titulos);

        Scroll.setViewportView(Conceptos);

        Total.setOpaque(false);
        Total.setLayout(new javax.swing.BoxLayout(Total, javax.swing.BoxLayout.LINE_AXIS));
        Total.add(filler6);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL   ");
        Total.add(jLabel1);

        txtTotal.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtTotal.setText("$0.00");
        Total.add(txtTotal);

        Botones.setOpaque(false);
        Botones.setLayout(new javax.swing.BoxLayout(Botones, javax.swing.BoxLayout.LINE_AXIS));
        Botones.add(filler3);

        btnGenerar.setText("Generar");
        Botones.add(btnGenerar);
        Botones.add(filler4);

        btnCancelar.setText("Cancelar");
        Botones.add(btnCancelar);
        Botones.add(filler5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Scroll, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarConcepto)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarConcepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setViewToSignUp(){        
        this.lblTitulo.setText("GENERACIÓN DE RECIBO");
        this.btnGenerar.setText("Generar");
    }
    
    private void setViewToModify(){
        this.lblTitulo.setText("MODIFICACIÓN DE RECIBO");
        this.txtCliente.setEnabled(false);
        this.btnGenerar.setText("Modificar");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Cabecera;
    public javax.swing.JPanel Conceptos;
    public javax.swing.JScrollPane Scroll;
    private javax.swing.JPanel Titulo;
    private javax.swing.JPanel Titulos;
    private javax.swing.JPanel Total;
    public javax.swing.JButton btnAgregarConcepto;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnGenerar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtCliente;
    public com.toedter.calendar.JDateChooser txtFechaEmision;
    public javax.swing.JTextField txtIdRecibo;
    public javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
